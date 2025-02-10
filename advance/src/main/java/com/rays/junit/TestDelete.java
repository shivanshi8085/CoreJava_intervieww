package com.rays.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDelete {

	@Test
	public void delete() throws Exception {

		UserModel.delete(31);

		UserBean bean = UserModel.findByPk(31);

		// assertNull(bean);
		// assertNotNull(bean);
		assertTrue(bean == null);
		assertTrue(bean != null);

	}
}
