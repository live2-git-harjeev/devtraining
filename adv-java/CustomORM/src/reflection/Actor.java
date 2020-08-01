package reflection;

import lombok.Data;

import java.util.Date;

@Data
public class Actor {
  //later change to private fields and have some fun!
    @TableColumn(columnName = "actor_id")
  //later use int
  public Integer filmId;
    @TableColumn(columnName = "first_name")
  public String firstName;
    @TableColumn(columnName = "last_update")
    public Date lastUpdate;
  //public String lastUpdate;
    //public String nonPersistenField;
//    public String transientField;
}
