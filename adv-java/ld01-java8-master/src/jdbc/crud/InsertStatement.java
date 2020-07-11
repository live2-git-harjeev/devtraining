package jdbc.crud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.util.DatabaseType;
import jdbc.util.DatabaseUtil;

public class InsertStatement {
public static void main(String[] args) {
	Connection connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB);
	
	
	int employeeId = 101;
	String employeeName = "Great";
	double salary = 55.5d;	
	//String queryString = "insert into employee1 (EMPLOYEE_ID, EMPLOYEE_NAME, SALARY) values (" + employeeId + ",'" + employeeName + "',"  + salary + ")";
	
	Date hireDate = Date.valueOf("2020-3-21");
	//String queryString = "insert into employee1  values (" + employeeId + ",'" + employeeName + "','" +hireDate + "'," + salary + ")";
	//String queryString = "insert into employee1  values (" + employeeId + ",'" + employeeName + "','11-07-20'," + salary + ")";
	String queryString = "insert into employee1  values (" + employeeId + ",'" + employeeName + "',to_date('" + hireDate + "','YY-MM-DD')," + salary + ")";
	System.out.println(queryString);
	Statement statement;
	try {
		statement = connection.createStatement();
		int noOfRowsInserted = statement.executeUpdate(queryString);
		System.out.println("Rows Inserted :> " + 1);
	} catch (SQLException e) {
		System.out.println("EXCEPTION :>> " + e);
	}

}
}
