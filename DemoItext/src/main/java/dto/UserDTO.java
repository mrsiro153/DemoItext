package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by huydoan on 31/07/2017.
 */
public class UserDTO {
    //thong tin ca nhan
    private String name;
    private String gender;
    private String otherName;
    private String dob;
    private String cmnd;
    private String numberCMND;
    private String dateCreateCMND;
    private String placeCreateCMND;
    private String address;
    private String phoneNumber;
    private String email;
    private String occupation;
    private String positionOccupation;

    //loai tai khoan
    private boolean thanhtoan;
    private boolean gdck;
    private boolean equalUser;
    private boolean otherType;

    //money type
    private boolean VND;
    private boolean USD;
    private boolean otherMoneyType;

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
    public UserDTO createDefaultUserDTO(){
        UserDTO us = new UserDTO();
        Date date = new Date();
        us.setName("Nguyen Hoang Nam")
                .setGender("Nam")
                .setOtherName("KiKi")
                .setDob("22-1-1990")
                .setNumberCMND("235415498")
                .setDateCreateCMND(date.toString())
                .setPlaceCreateCMND("HCM City")
                .setAddress("155 Hoang Van Thu, HCM city")
                .setPhoneNumber("0215222325")
                .setEmail("abc@gmail.com")
                .setOccupation("gamer Dota2")
                .setPositionOccupation("mid lane")
                .setThanhtoan(true)
                .setGdck(false)
                .setEqualUser(false)
                .setOtherType(false)
                .setVND(true)
                .setUSD(false)
                .setOtherMoneyType(false);
        return us;
    }
    //
    public List<UserDTO> defaultListUser(){
        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        for(int i = 0; i<9;i++){
            UserDTO userDTO = new UserDTO();
            userDTO.setName("Nguyen Huy Doan");
            userDTO.setGender("Nam");
            userDTO.setOtherName("siro");
            userDTO.setDob("11-12-1995");
            userDTO.setThanhtoan(true);
            userDTO.setGdck(false);
            userDTO.setEqualUser(false);
            userDTO.setOtherType(false);
            if(i%2==0){
                userDTO.setName("Hoang Van Nam");
                userDTO.setDob("02-02-2598");
                userDTO.setEqualUser(true);
                userDTO.setThanhtoan(false);
                userDTO.setOtherType(true);
            }
            userDTOS.add(userDTO);
        }
        return userDTOS;
    }
    //


    public String getName() {
        return name;
    }

    public UserDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public UserDTO setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getOtherName() {
        return otherName;
    }

    public UserDTO setOtherName(String otherName) {
        this.otherName = otherName;
        return this;
    }

    public String getDob() {
        return dob;
    }

    public UserDTO setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public String getCmnd() {
        return cmnd;
    }

    public UserDTO setCmnd(String cmnd) {
        this.cmnd = cmnd;
        return this;
    }

    public String getNumberCMND() {
        return numberCMND;
    }

    public UserDTO setNumberCMND(String numberCMND) {
        this.numberCMND = numberCMND;
        return this;
    }

    public String getDateCreateCMND() {
        return dateCreateCMND;
    }

    public UserDTO setDateCreateCMND(String dateCreateCMND) {
        this.dateCreateCMND = dateCreateCMND;
        return this;
    }

    public String getPlaceCreateCMND() {
        return placeCreateCMND;
    }

    public UserDTO setPlaceCreateCMND(String placeCreateCMND) {
        this.placeCreateCMND = placeCreateCMND;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserDTO setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserDTO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getOccupation() {
        return occupation;
    }

    public UserDTO setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    public String getPositionOccupation() {
        return positionOccupation;
    }

    public UserDTO setPositionOccupation(String positionOccupation) {
        this.positionOccupation = positionOccupation;
        return this;
    }

    public boolean isThanhtoan() {
        return thanhtoan;
    }

    public UserDTO setThanhtoan(boolean thanhtoan) {
        this.thanhtoan = thanhtoan;
        return this;
    }

    public boolean isGdck() {
        return gdck;
    }

    public UserDTO setGdck(boolean gdck) {
        this.gdck = gdck;
        return this;
    }

    public boolean isEqualUser() {
        return equalUser;
    }

    public UserDTO setEqualUser(boolean equalUser) {
        this.equalUser = equalUser;
        return this;
    }

    public boolean isOtherType() {
        return otherType;
    }

    public UserDTO setOtherType(boolean otherType) {
        this.otherType = otherType;
        return this;
    }

    public boolean isVND() {
        return VND;
    }

    public UserDTO setVND(boolean VND) {
        this.VND = VND;
        return this;
    }

    public boolean isUSD() {
        return USD;
    }

    public UserDTO setUSD(boolean USD) {
        this.USD = USD;
        return this;
    }

    public boolean isOtherMoneyType() {
        return otherMoneyType;
    }

    public UserDTO setOtherMoneyType(boolean otherMoneyType) {
        this.otherMoneyType = otherMoneyType;
        return this;
    }

    public String toStringUser() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", otherName='" + otherName + '\'' +
                ", dob='" + dob + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", numberCMND='" + numberCMND + '\'' +
                ", dateCreateCMND='" + dateCreateCMND + '\'' +
                ", placeCreateCMND='" + placeCreateCMND + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", occupation='" + occupation + '\'' +
                ", positionOccupation='" + positionOccupation + '\'' +
                ", thanhtoan=" + thanhtoan +
                ", gdck=" + gdck +
                ", equalUser=" + equalUser +
                ", otherType=" + otherType +
                ", VND=" + VND +
                ", USD=" + USD +
                ", otherMoneyType=" + otherMoneyType +
                '}';
    }
}
