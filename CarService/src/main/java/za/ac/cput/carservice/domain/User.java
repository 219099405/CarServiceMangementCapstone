package za.ac.cput.carservice.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Userid;
    private String Username;
    private String Password;
    private String Email;
    private String Phone;
    private String Role;

    public User() {
    }

    public int getUserid() {
        return Userid;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getRole() {
        return Role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + getUserid() + ","
                + "username=" + getUsername() + ","
                + "password=" + getPassword() + ","
                + "email=" + getEmail() + ","
                + "phone=" + getPhone() + ","
                + "role=" + getRole() + "}";
    }
}
