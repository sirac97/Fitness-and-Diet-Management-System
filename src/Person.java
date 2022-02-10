/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrah
 */
public abstract class Person implements Interface {

    protected String name;
    protected String surname;
    protected int age;


    public Person( String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    

    public String toString() {
        return "\nName= " + name
                + "\nSurname= " + surname
                + "\nAge = " + age;

    }

   

}
