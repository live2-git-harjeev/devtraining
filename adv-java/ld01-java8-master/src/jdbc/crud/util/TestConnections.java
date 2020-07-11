package jdbc.crud.util;

public class TestConnections {
public static void main(String[] args) {
	DatabaseUtil.testOracleConnection();
	DatabaseUtil.testMySQLConnection();
}
}
