package dto;

/**
 * Created by DoanNH on 7/28/2017.
 */
public class TestDTO {
    private String userName;
    private String password;
    private String name;

    public TestDTO() {
        this.userName = "Songoku";
        this.password = "My password";
        this.name = "Nguyen Hoang Nam";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
