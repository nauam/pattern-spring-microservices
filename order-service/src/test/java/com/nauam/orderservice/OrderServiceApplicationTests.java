package com.nauam.orderservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nauam.orderservice.dto.OrderLineItemsDto;
import com.nauam.orderservice.dto.OrderRequest;
import com.nauam.orderservice.repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class OrderServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private OrderRepository orderRepository;

	@Container
	static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:5.7.34");

	@DynamicPropertySource
	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
		dynamicPropertyRegistry.add("spring.datasource.url", mySQLContainer::getJdbcUrl);
		dynamicPropertyRegistry.add("spring.datasource.username", mySQLContainer::getUsername);
		dynamicPropertyRegistry.add("spring.datasource.password", mySQLContainer::getPassword);
		dynamicPropertyRegistry.add("spring.datasource.driverClassName", mySQLContainer::getDriverClassName);
	}

	@Test
	void shouldPlaceOrder() throws Exception {
		OrderRequest orderRequest = getOrderRequest();
		String orderRequestString = objectMapper.writeValueAsString(orderRequest);
		mockMvc.perform(MockMvcRequestBuilders
						.post("/api/order")
						.contentType(MediaType.APPLICATION_JSON)
						.content(orderRequestString))
				.andExpect(status().isCreated());
		Assertions.assertEquals(1, orderRepository.findAll().size());
	}

	private OrderRequest getOrderRequest() {
		List<OrderLineItemsDto> orderLineItemsDtoList = new ArrayList<>();
		orderLineItemsDtoList.add(getOrderLineItemsDto());

		return OrderRequest.builder()
				.orderLineItemsDtoList(orderLineItemsDtoList)
				.build();
	}

	private OrderLineItemsDto getOrderLineItemsDto() {
		return OrderLineItemsDto.builder()
				.skuCode("iphone_13")
				.price(BigDecimal.valueOf(1200))
				.quantity(1)
				.build();
	}

}
