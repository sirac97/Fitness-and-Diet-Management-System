/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibrah
 */
public class Customer extends Person {

    private int age;
    private double weight;
    private double height;
    private double BMI;
    private double BMR;
    private String gender;

    public  Customer(String name, String surname, int age,double weight,double height, String gender, double BMI, double BMR)  {
        super(name, surname, age);
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.BMI=BMI;
        this.BMR=BMR;
        this.gender=gender;
    }

    

    /**
     *
     * @return
     */

   public double calculateBodyIndex()
    {
        BMI += weight / (height * height);
        return BMI;
    }

    public double calculateCalorie()
    {
        if(gender.equalsIgnoreCase("M")){
            BMR += 66.4760+(13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
        }
        else {
        BMR = 655.0955 + (9.5634 * weight) + (1.8496 * height)- (4.6756 * age) ;
    }
        return BMR;
    }
    public double gainWeight(){
        
        return BMR+500;
    }
    public double loseWeight(){
        
        return BMR-500;
    }
    

}
