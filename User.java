package cccccccccc;

import java.util.Date;

public class User extends Entity {
      String firstName;
      String lastName;
      String email;

      //gettere
    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public String getEmail(){return email;}

      //settere
    public void setFirstName(String firstName){this.firstName=firstName;}

    public void setLastName(String firstName){this.firstName=firstName;}

    public void setEmail(String firstName){this.firstName=firstName;}

    public void addUser(String firstName, String lastName, String email)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

}
