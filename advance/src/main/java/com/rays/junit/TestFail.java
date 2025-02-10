package com.rays.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestFail {

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(34);
		bean.setName("ajay");
		bean.setSalary(8000);

		UserModel.add(bean);

		bean = UserModel.findByPk(34);

		assertTrue(bean == null);
		//assertTrue(bean != null);

	}

}
