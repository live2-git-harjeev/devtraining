package jdbc.crud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.DatabaseType;
import jdbc.util.DatabaseUtil;

public class UpdatePreparedStatement {
	public static void main(String[] args) {
		Connection connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB);
		
		int employeeId = 1011;
		String employeeName = "Great";
		Date hireDate = Date.valueOf("2020-3-21");
		double salary = 55.5d;	
		
		String queryString = "delete from employee1  where employee_id = ?";
		System.out.println(queryString);
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(queryString);
			
			//ASSIGN VALUES FOR THE PARAMETERS

			preparedStatement.setInt(1, 1015);

			int noOfRowsInserted = preparedStatement.executeUpdate();
			System.out.println("Rows Updated :> " + 1);

		} catch (SQLException e) {
			System.out.println("EXCEPTION :>> " + e);
		}

	}
}
