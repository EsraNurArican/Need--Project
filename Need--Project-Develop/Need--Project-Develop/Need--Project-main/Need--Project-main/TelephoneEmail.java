/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephoneemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Merve
 */
public class TelephoneEmail {

     /**
     * @param args the command line arguments
     */
    
    private  String telephone;
    private  String email;

    public TelephoneEmail(String string) {
        telephone=string;
    }
    public TelephoneEmail(String string,String string1) {
        telephone=string;
        email=string1;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        if(checkValidString(telephone) && telephoneValidation(telephone))
            this.telephone = telephone;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public boolean telephoneValidation(String num)
    {
        if(num.length()==11)
        {
            Pattern digit = Pattern.compile("[0-9]");
            Matcher hasDigit = digit.matcher(num);
            return  hasDigit.find();
        }
        else
            return false;
    }
    public boolean checkValidString(String s) {
        if (s == null) // checks if the String is null {
            return false;
        for (int i = 0; i < s.length() ; i++) {
            // checks whether the character is not a letter
            // if it is not a letter ,it will return false
            if ((!Character.isDigit(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String emailAddress) {
        if(isValidEmailAddress(emailAddress))
            this.email = emailAddress;
    }
    public boolean isValidEmailAddress(String emailAddress)
    {
        // a null string is invalid
        if( emailAddress == null )
           return false;
        // a string without a "@" is an invalid email address
        if (!emailAddress.contains("@") )
            return false;
        // a string without a "."  is an invalid email address
        if( !emailAddress.contains(".") )
            return false;
        return true;
    }
    
}
