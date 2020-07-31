package reflection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//Technically you can name it a Metamodel
//
public class EntitySelector {
    //The selectQuery method takes any query (select * from Actor, select * from Film
    //returns List<Actor>, List<Film>
     public <T> List<T> selectQuery(Class<T> pType, String selectQuery) throws SQLException {
         //Model Container to collect the records
         List<T> list = new ArrayList<>();
//         Try with resources
         try(Connection connection = DatabaseUtil.getConnection(DatabaseType.MYSQLDB)){
            try(Statement statement = connection.createStatement() ){
                try(ResultSet resultSet = statement.executeQuery(selectQuery)){
                    while(resultSet.next()){
                        //Create an instance of the type
                        T type = pType.newInstance();
                        //Populate the type instance with data from the resultSet (ORM)
                        transferResultSetToListOfObjects(resultSet,type);
                        list.add(type);
                    }
                }
            } catch(InstantiationException | IllegalAccessException exception){
            throw new RuntimeException("LOG : Unable to process the database operation " + exception.getMessage());
            }
         }
        return list;
    }

    public <T> void transferResultSetToListOfObjects(ResultSet resultSet, Object object) throws SQLException, IllegalAccessException {
         Class<?> cClass = object.getClass();
         //Iterate through the rows in the resultSet
        //Fetch each column
        //Load it into the Model object
        for(Field field:cClass.getDeclaredFields()){
            //Get all fields in the model which are annotated with the @TableColumn annotation
        TableColumn tableColumn = field.getAnnotation(TableColumn.class);
        //Get the element (columnName) specified in the @TableColumn annotation.
        String columnName = tableColumn.columnName();
        //Fetch the column from the resultSet into the field
        Object value = resultSet.getObject(columnName);
        Class<?> fieldType = field.getType();
        //Sets the field represented by this Field object on the specified object argument to the specified new value.// The new value is automatically unwrapped if the underlying field has a primitive type.
        field.set(object,value);
        }
    }
}
