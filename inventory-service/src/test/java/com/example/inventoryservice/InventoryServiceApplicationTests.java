package com.example.inventoryservice;

import com.example.inventoryservice.repository.InventoryRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.stream.Collectors;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class InventoryServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private InventoryRepository inventoryRepository;

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
	void shouldIsInStock() throws Exception {
		Assertions.assertTrue(isInStockResponse("iphone_13"));
		Assertions.assertFalse(isInStockResponse("iphone_13_red"));
	}

	private Boolean isInStockResponse(String skuCode) throws Exception {
		String jsonResponse = mockMvc.perform(MockMvcRequestBuilders
				.get("/api/inventory/" + skuCode))
				.andExpect(status().isOk())
				.andReturn()
				.getResponse()
				.getContentAsString();

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(jsonResponse, new TypeReference<Boolean>() {});
	}

}
