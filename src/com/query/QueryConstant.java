package com.query;

public interface QueryConstant {
	String insert_query = "insert into employee values(?,?,?)";
	String update_query = "update employee set empname=?,empaddress=? where empno=? ";
	String delete_query = "delete from employee where empno=?";
	String retrive_query = "select * from employee where empno=?";
}
