package dto;

import java.util.*;

/**
 * Created by DoanNH on 7/28/2017.
 */
public class TestDTO {
    private String userName;
    private String password;
    private String name;
    private HashMap hss;
    private List<String> haha;

    public TestDTO() {
        this.userName = "Songoku";
        this.password = "My password";
        this.name = "Nguyen Hoang Nam";
        setHashMap();
        setListHaha();
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

    public String getABC(){
        return "My name is abvc";
    }
    //
    public void setHashMap(){
        hss=new HashMap();
        hss.put("namename",this.userName);
        hss.put("pass",this.password);
        hss.put("abc",this.getABC());
    }
    //

    public HashMap getHss() {
        return hss;
    }
    public void setListHaha(){
        this.haha = Arrays.asList("Nguyen"," Huy"," Doan");
    }

    public List<String> getHaha() {
        return haha;
    }
}
