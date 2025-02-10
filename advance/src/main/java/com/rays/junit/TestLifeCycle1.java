package com.rays.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLifeCycle1 {
	
		private List<String> dataList;

		@BeforeClass
		public static void setupOnce() {
			System.out.println(" @BeforeClass ");
		}

		@Before
		public void setup() {
			System.out.println(" @Before ");
			dataList = new ArrayList(); // Initialize before each test
		}

		@Test
		public void testAddItem() {
			dataList.add("Item1");
			assertEquals(1, dataList.size());
			System.out.println(" test 01");
		}

		@Test
		public void testRemoveItem() {
			dataList.add("Item1");
			dataList.remove("Item1");
			assertTrue(dataList.isEmpty());
			System.out.println(" test 02");
		}

		@After
		public void tearDown() {
			System.out.println(" @After ");
			dataList.clear(); // Cleanup after each test
		}

		@AfterClass
		public static void tearDownOnce() {
			System.out.println(" @AfterClass ");
		}
	}



