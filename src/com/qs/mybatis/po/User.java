package com.qs.mybatis.po;

public class User {
    private int id;
    private String name;
    private int QQ;
    private String Classes;
    private String birthday;
    private String email;
    private String phone;
    private String joinSwear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQQ() {
        return QQ;
    }

    public void setQQ(int QQ) {
        this.QQ = QQ;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String classes) {
        Classes = classes;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJoinSwear() {
        return joinSwear;
    }

    public void setJoinSwear(String joinSwear) {
        this.joinSwear = joinSwear;
    }

    /*toString（）*/

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", QQ=" + QQ +
                ", Classes='" + Classes + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", joinSwear='" + joinSwear + '\'' +
                '}';
    }
}
