package com.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestEmpInAndOut {
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
		
		CallableStatement callstmt = conn.prepareCall("{Call empInAndOut(?,?)}");
		callstmt.setInt(1, 1);
		callstmt.registerOutParameter(2, Types.INTEGER);
		callstmt.execute();
		System.out.println(callstmt.getInt(2));
	}


}
