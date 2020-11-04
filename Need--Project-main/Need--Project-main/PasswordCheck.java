/**
 * Class to check if the passwords change correctly
 * Extends SignInPersonalInfo
 */
public class PasswordCheck extends SignInPersonalInfo
{
    //Private Fields
    private String currentPassword ;
    // initial value of the old password is the same as the current password
    // but for the sake of testing it changed to "youshallnotpass10+"
    private String oldPassword = "youshallnotpass10+";


    // Constructor
    public PasswordCheck(String name, String surname) {
        super(name, surname);
        // current password is the super class' password
        currentPassword = super.getPassword();
        //initial value of the old password is the same as the current password
        //oldPassword = super.getPassword();
    }

    //Methods
    /**
     * getter method for the current password
     * @return super class' password
     */
    public String getCurrentPassword()
    {
        return super.getPassword();
    }


    /**
     * getter method for the old password
     * @return the last password
     */
    public String getOldPassword()
    {
        return this.oldPassword;
    }


    /**
     * changes the password
     * @param newPassword is the new value to be the password
     * @param confirmNewPassword is the confirmation password for newPassword
     * @throws IllegalArgumentException if the new and old passwords are the same
     * @throws IllegalArgumentException if the newPassword and its confirmation are not the same
     */
    public void setNewPassword(String newPassword, String confirmNewPassword) throws IllegalArgumentException
    {
        //for initialization
        currentPassword = super.getPassword();

        if(getCurrentPassword().equals(newPassword))
            throw new IllegalArgumentException("New password cannot be the same with the old password!");

        else if (!checkConfirmPassword(newPassword, confirmNewPassword) )
        {
            throw new IllegalArgumentException("Passwords must be the same!");
        }
        else
        {
            super.setPassword(newPassword);
            this.oldPassword = currentPassword;
            this.currentPassword= newPassword;
        }
    }

    /**
     * helper function to check if the given two passwords are equal
     * @param p1 password1
     * @param p2 confirmation password for p1
     * @return true if equal
     */
    protected boolean checkConfirmPassword(String p1, String p2)
    {
        return p1.equals(p2);
    }

}
