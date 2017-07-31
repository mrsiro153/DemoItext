package dto;

/**
 * Created by huydoan on 31/07/2017.
 */
public class UserDTO {
    private String name;
    private String gender;
    private String otherName;
    private String dob;
    private boolean thanhtoan;
    private boolean gdck;
    private boolean equalUser;
    private boolean otherType;
    //

    public UserDTO(String name, String gender, String otherName, String dob, boolean thanhtoan, boolean gdck, boolean equalUser, boolean otherType) {
        this.setName(name);
        this.setGender(gender);
        this.setOtherName(otherName);
        this.setDob(dob);
        this.setThanhtoan(thanhtoan);
        this.setGdck(gdck);
        this.setEqualUser(equalUser);
        this.setOtherType(otherType);
    }
    //
    public UserDTO(){
    }
    //
    public UserDTO defaultUserDTO(){
        this.name="Nguyen Huy Doan";
        this.gender="Nam";
        this.otherName= "siro";
        this.dob="11-12-1555";
        thanhtoan = true;
        gdck=false;
        equalUser=false;
        otherType=false;
        return this;
    }
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(boolean thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public boolean isGdck() {
        return gdck;
    }

    public void setGdck(boolean gdck) {
        this.gdck = gdck;
    }

    public boolean isEqualUser() {
        return equalUser;
    }

    public void setEqualUser(boolean equalUser) {
        this.equalUser = equalUser;
    }

    public boolean isOtherType() {
        return otherType;
    }

    public void setOtherType(boolean otherType) {
        this.otherType = otherType;
    }
    //

}
