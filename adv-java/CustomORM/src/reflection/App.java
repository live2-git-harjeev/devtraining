package reflection;

import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
EntitySelector entitySelector = new EntitySelector();
        try {
            List<Actor> actorList = entitySelector.selectQuery(Actor.class, "select actor_id, first_name, last_update from actor");
actorList.forEach(System.out::println);
         // System.out.println(actorList.get(0).getFirstName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
