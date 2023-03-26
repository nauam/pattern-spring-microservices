package com.nauam.productservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nauam.productservice.dto.ProductRequest;
import com.nauam.productservice.dto.ProductResponse;
import com.nauam.productservice.model.Product;
import com.nauam.productservice.repository.ProductRepository;
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
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@Autowired
//	private ProductRepository productRepository;
//
//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.8.2");
//
//	@DynamicPropertySource
//	static  void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders
//						.post("/api/product")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(productRequestString))
//						.andExpect(status().isCreated());
//		Assertions.assertEquals(1, productRepository.findAll().size());
//	}
//
//	@Test
//	void shouldGetAllProducts() throws Exception {
//		String jsonResponse = mockMvc.perform(MockMvcRequestBuilders
//										.get("/api/product"))
//										.andExpect(status().isOk())
//										.andReturn()
//										.getResponse()
//										.getContentAsString();
//
//		ObjectMapper objectMapper = new ObjectMapper();
//		List<ProductResponse> productResponses = objectMapper.readValue(jsonResponse, new TypeReference<List<ProductResponse>>() {});
//
//		List<Product> products = productRepository.findAll();
//		List<ProductResponse> expectedProductResponses = products.stream()
//				.map(this::getProductResponse)
//				.collect(Collectors.toList());
//
//		Assertions.assertEquals(expectedProductResponses, productResponses);
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("iPhone 13")
//				.description("iPhone 13")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}
//
//	private ProductResponse getProductResponse(Product product) {
//		return ProductResponse.builder()
//				.id(product.getId())
//				.name(product.getName())
//				.description(product.getDescription())
//				.price(product.getPrice())
//				.build();
//	}

}
