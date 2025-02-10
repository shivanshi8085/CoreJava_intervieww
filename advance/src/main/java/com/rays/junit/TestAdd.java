package com.rays.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestAdd {
	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(26);
		bean.setName("sujeet");
		bean.setSalary(7000);

		UserModel model = new UserModel();

		model.add(bean);

		bean = model.findByPk(25);
		
		//assertNotNull(bean);

		if (bean == null) {

			fail("Record is not added...!!!");

		} else {

			System.out.println("Record is  added...!!!");

		}

	}


}
