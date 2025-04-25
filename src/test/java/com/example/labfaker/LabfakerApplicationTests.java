package com.example.labfaker;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class LabfakerApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("Health Check OK", dataController.healthCheck());
	}

	@Test
	void version() {
		assertEquals("Version 1.0.0", dataController.version());
	}

	@Test
	void nationLength() {
		Integer  nationsLenght = dataController.getRandomNations().size();
		assertEquals(10, nationsLenght);
	}

	@Test
	void currenciesLength() {
		Integer  currenciesLenght = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLenght);
	}

	@Test
	public void testRandomCurrenciesCodeFormat() {
		DataController controller = new DataController();
		JsonNode response = controller.getRandomCurrencies();
		for (int i=0; i<response.size(); i++) {
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();
			assertTrue(code.matches("[A-Z]{3}"));
		}
	}

	@Test
	public void testRandomNationsPerformance() {
		DataController controller = new DataController();
		JsonNode response = controller.getRandomCurrencies();
		long startTime = System.currentTimeMillis();

		controller.getRandomNations();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		assertTrue(executionTime < 2000);
	}

	@Test
	void aviationsLength() {
		Integer  aviationsLenght = dataController.getRandomAviation().size();
		assertEquals(20, aviationsLenght);
	}



}
