package reflection;

import lombok.Data;

import java.util.Date;

//@Data
public class Actor {
  public Integer getFilmId() {
    return filmId;
  }

  public void setFilmId(Integer filmId) {
    this.filmId = filmId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  //later change to private fields and have some fun!
    @TableColumn(columnName = "actor_id")
  //later use int
  public Integer filmId;
    @TableColumn(columnName = "first_name")
  public String firstName;
    @TableColumn(columnName = "last_update")
    public Date lastUpdate;

  @Override
  public String toString() {
    return "Actor{" +
            "filmId=" + filmId +
            ", firstName='" + firstName + '\'' +
            ", lastUpdate=" + lastUpdate +
            '}';
  }
  //public String lastUpdate;
    //public String nonPersistenField;
//    public String transientField;
}
