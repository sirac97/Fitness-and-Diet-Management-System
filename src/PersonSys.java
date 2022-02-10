
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ibrah
 */
public class PersonSys {

    public static ArrayList<Person> parr = new ArrayList<Person>();


    public static String display() {
        Customer customer;

        String out = "";
        for (int i = 0; i < parr.size(); i++) {
            if (parr.get(i) instanceof Customer) {
                customer = (Customer) parr.get(i);
                out += customer.toString();

            }
            
        }
        return out;
    }
}