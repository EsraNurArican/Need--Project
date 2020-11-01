import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignInPersonalInfo {

    private String name;
    private  String surname;
    private  String password;


    public SignInPersonalInfo(String name,String surname) {
        this.name = name;
        this.surname = surname;
        this.password =null;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) throws IllegalArgumentException{
        if(checkValidString(name))
            this.name = name;
        else throw new IllegalArgumentException ("Given name value is invalid!") ;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws IllegalArgumentException {
        if(checkValidString(surname))
            this.surname = surname;
        else throw new IllegalArgumentException ("Given surname value is invalid!") ;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if(passwordValidation(password))
            this.password = password;
        else throw new IllegalArgumentException("Given password value is invalid!");
    }

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


}
