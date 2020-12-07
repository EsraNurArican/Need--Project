public class DateAndImage {

    /**
     * Keeps name of image file.
     */
    private String image;
    /**
     * Keeps user's date of birth.
     */
    private String dateOfBirth;

    /**
     * No parameter constructor.
     */
    public DateAndImage() {
        this.image = null;
        this.dateOfBirth = null;
    }

    /**
     * Getter method of dateOfBirth.
     * @return date of birth of user.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter method of dateOfBirth.
     * @param dateOfBirth is the date of birth of user.
     * @throws IllegalArgumentException when date is invalid.
     */
    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
        if(checkValidDateOfBirth(dateOfBirth))
            this.dateOfBirth = dateOfBirth;
        else throw new IllegalArgumentException ("This date of birth is not valid.");
    }

    /**
     * Date format should be 12-07-1998.
     * This method splits date according to '-' character.
     * @param s is date of birth of user.
     * @return true if date is valid otherwise return false.
     */
    public boolean checkValidDateOfBirth(String s) {

        if(s.length() != 10)
            return false;
        if(s.charAt(2) != '-' || s.charAt(5) != '-')
            return false;

        String[] date = s.split("-");

        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        if(day < 0 || day > 31)
            return false;
        if(month < 0 || month > 12)
            return false;
        if(year < 1920 || year > 2020)
            return false;

        //February can not be greater than or equal to 29 days except for leap years.
        if(month == 2 && day > 29)
            return false;
        else if(month == 2 && day == 29 && year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
            return false;
        //April can not be 31 days.
        else if(month == 4 && day > 30 )
            return false;
        //June can not be 31 days.
        else if(month == 6 && day > 30 )
            return false;
        //September can not be 31 days.
        else if(month == 9 && day > 30 )
            return false;
        //November can not be 31 days.
        else if(month == 11 && day > 30 )
            return false;
        else
            return true;
    }

    /**
     * Getter method of image.
     * @return name of the image file.
     */
    public String getImage() {
        return image;
    }

    /**
     * Setter method of image.
     * @param image is the name of image file.
     * @throws IllegalArgumentException when image extension is not valid.
     */
    public void setImage(String image) throws IllegalArgumentException {
        if(checkValidExtension(image))
            this.image = image;
        else throw new IllegalArgumentException ("This file extension is not supported.");
    }

    /**
     * Checks the image name extension is valid or not according to their last five or five characters.
     * @param s is the name of image file.
     * @return true if extension is valid otherwise returns false.
     */
    public boolean checkValidExtension(String s) {

        if (s == null)
            return false;

        String lastFourDigits = "";
        String lastFiveDigits = "";

        lastFourDigits = s.substring(s.length() - 4);
        lastFiveDigits = s.substring(s.length() - 5);

        if(isValidExtension(lastFourDigits, lastFiveDigits))
            return true;
        else
            return false;
    }

    /**
     * Checks image names last five or four characters are valid or not.
     * @param lastFourDigits is last four digits of name of image file.
     * @param lastFiveDigits is last five digits of name of image file.
     * @return true if file extension is valid otherwise returns false.
     */
    public boolean isValidExtension(String lastFourDigits, String lastFiveDigits ){

        String[] validExtensions = {".jpg", ".gif", ".eps", ".bmp", ".raw", ".psd", ".png",".jpeg", ".tiff"};

        for(int i=0; i < validExtensions.length; i++){
            if(lastFourDigits.compareTo(validExtensions[i]) == 0 || lastFiveDigits.compareTo(validExtensions[i]) == 0)
                return true;
        }

        return false;
    }

}
