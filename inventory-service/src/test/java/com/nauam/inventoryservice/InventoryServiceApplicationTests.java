package com.nauam.inventoryservice;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;


@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class InventoryServiceApplicationTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@Autowired
//	private InventoryRepository inventoryRepository;
//
//	@Container
//	static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:5.7.34");
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.datasource.url", mySQLContainer::getJdbcUrl);
//		dynamicPropertyRegistry.add("spring.datasource.username", mySQLContainer::getUsername);
//		dynamicPropertyRegistry.add("spring.datasource.password", mySQLContainer::getPassword);
//		dynamicPropertyRegistry.add("spring.datasource.driverClassName", mySQLContainer::getDriverClassName);
//	}
//
//	@Test
//	void shouldIsInStock() throws Exception {
//		Assertions.assertTrue(isInStockResponse("iphone_13"));
//		Assertions.assertFalse(isInStockResponse("iphone_13_red"));
//	}
//
//	private Boolean isInStockResponse(String skuCode) throws Exception {
//		String jsonResponse = mockMvc.perform(MockMvcRequestBuilders
//				.get("/api/inventory/" + skuCode))
//				.andExpect(status().isOk())
//				.andReturn()
//				.getResponse()
//				.getContentAsString();
//
//		ObjectMapper objectMapper = new ObjectMapper();
//		return objectMapper.readValue(jsonResponse, new TypeReference<Boolean>() {});
//	}

}
