import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * General personal information class to keep users personal data
 */
public class SignInPersonalInfo {

    /**
     * Private values such as user's name, surname, password
     */
    private String name;
    private  String surname;
    private  String password;


    /**
     * Two parameter constructor
     * @param name user name
     * @param surname user surname
     */
    public SignInPersonalInfo(String name,String surname) {
        this.name = name;
        this.surname = surname;
        this.password =null;
    }

    /**
     * Getter for name
     * @return user name
     */
    public String getName(){
        return name;
    }

    /**
     * Setter for name
     * @param name new name value
     * @throws IllegalArgumentException if new name value includes digits or special characters,
     * it throws an exception.
     */
    public void setName(String name) throws IllegalArgumentException{
        if(checkValidString(name))
            this.name = name;
        else throw new IllegalArgumentException ("Given name value is invalid!") ;
    }

    /**
     * Getter method for user's surname
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Setter method for surname
     * @param surname new surname value
     * @throws IllegalArgumentException if new surname includes digits or special characters,
     * it throws an exception.
     */
    public void setSurname(String surname) throws IllegalArgumentException {
        if(checkValidString(surname))
            this.surname = surname;
        else throw new IllegalArgumentException ("Given surname value is invalid!") ;

    }

    /**
     * Getter method for password
     * @return user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password
     * @param password new password
     * @throws IllegalArgumentException
     * It uses passwordValidation method to check if given password is valid or not
     */
    public void setPassword(String password) throws IllegalArgumentException {
        try{
            if(passwordValidation(password))
                this.password = password;
            else throw new IllegalArgumentException("Given password value is invalid!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    /**
     * Helper method to check if a given string is valid
     * String is valid if all characters in it is letter
     * Name, surname values should include only letters.
     * @param s string
     * @return true if string is valid
     */
    public boolean checkValidString(String s) {
        if (s == null) // checks if the String is null {
            return false;

        for (int i = 0; i < s.length() ; i++) {
            // checks whether the character is not a letter
            // if it is not a letter ,it will return false
            if ((!Character.isLetter(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    /**
     * Helper method for password validation check
     * A password should include at least 8 characters with letter,digit and special characters
     * @param password password value to be check
     * @return true if given password is valid
     */
    public boolean passwordValidation(String password)
    {
        if(password.length()>=8)
        {
            Pattern letter = Pattern.compile("[a-zA-z]");
            Pattern digit = Pattern.compile("[0-9]");
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            
            Matcher hasLetter = letter.matcher(password);
            Matcher hasDigit = digit.matcher(password);
            Matcher hasSpecial = special.matcher(password);

            return hasLetter.find() && hasDigit.find() && hasSpecial.find();
        }
        else
            return false;
    }

} //end of SignInPersonalInfo class.
