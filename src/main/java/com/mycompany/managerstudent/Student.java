package com.mycompany.managerstudent;

public class Student extends Person {
    private static Person[] myStudentList=new Person[10];
    protected int nbPeople;
    public Student(){
        nbPeople=0;
    }
    public Student(String name, String idPerson, String birthday, String email, int phoneNumber, String sex, String address) {
        super(name, idPerson, birthday, email, phoneNumber, sex, address);
    }


    public void add(Person person){
        if (nbPeople>myStudentList.length){
            System.out.println("List is full! Can not add");
        }
        else {
            myStudentList[nbPeople]=person;
            nbPeople++;
        }
    }
    public void remove(String idPerson){
        int index=-1;
        for (int i = 0; i < nbPeople; i++) {
            if (myStudentList[i].getIdPerson()==idPerson){
                index=i;
            }
        }
        if (index==-1){
            System.out.println("There is no people in the list with the code "+idPerson);
        }else{
            for (int i = 0; i < nbPeople-1; i++) {
                myStudentList[i]=myStudentList[i+1];
            }
            System.out.println("removed success");
            nbPeople--;
        }
    }
    public  void displayAll(){
        for (int i =0;i<nbPeople;i++){
            myStudentList[i].display();
        }
    }

    public  void searchId(String idPerson){
        for (int i = 0; i < nbPeople; i++) {
            if (myStudentList[i].getIdPerson()==idPerson){
                myStudentList[i].display();

            }
        }
    }
    public  void searchName(String name){
        for (int i = 0; i < nbPeople; i++) {
            if (myStudentList[i].getName()==name){
                myStudentList[i].display();
            }
            else {
                System.out.println("Not found!!!");
            }
        }
    }

    public static void main(String[] args) {
        Student myPersonList=new Student();
        Person person1=new Person("nguuen","gcd201888","07/12/2002",
                "nguyentb@gmail.com",395909420,"male","K48/11 truong son");
        Person person2=new Person("nguyen","gcd201889","07/12/2002",
                "nguyentb@gmail.com",395909421,"female","K48/11 truong son");
        myPersonList.add(person1);
        myPersonList.add(person2);
        myPersonList.displayAll();
        myPersonList.remove("gcd201888");
        System.out.println("------------");
        myPersonList.displayAll();
        System.out.println("------------");
        myPersonList.searchId("gcd201889");
        System.out.println("------------");
        myPersonList.searchName("nguyen");

    }

}
