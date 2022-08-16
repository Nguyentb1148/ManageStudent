package com.mycompany.managerstudent;

public  class Person {
    protected String name;
    protected String idPerson;
    protected String birthday;
    protected String email;
    protected long phoneNumber;
    protected String sex;
    protected String address;

    public  Person(String name,String idPerson,String birthday, String email, long phoneNumber,String sex, String address){
        this.address=address;
        this.idPerson=idPerson;
        this.name=name;
        this.birthday=birthday;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.sex=sex;
    }

    protected Person() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdPerson() {
        return idPerson;
    }
    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
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
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println(name+" "+idPerson+" "+birthday+" " +email+" 0"+phoneNumber+" "+sex+" "+address);
    }
}
