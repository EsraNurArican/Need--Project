import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateAndImageTest {

    @Test
    void getImage() {
        DateAndImage obj= new DateAndImage();
        assertEquals(null,obj.getImage());
    }

    @Test
    void setImage() {
        DateAndImage obj= new DateAndImage();
        obj.setImage("image.jpeg");
        assertEquals("image.jpeg",obj.getImage());
    }

    @Test
    void checkValidExtension() {
        DateAndImage obj = new DateAndImage();
        boolean result = obj.checkValidExtension("falseextension.xlsx");
        assertEquals(false, result);
    }

    @Test
    void isValidExtension() {
        DateAndImage obj = new DateAndImage();
        boolean result = obj.isValidExtension(".png",".jpeg");
        assertEquals(true, result);
    }

    @Test
    void getDateOfBirth() {
        DateAndImage obj= new DateAndImage();
        assertEquals(null,obj.getDateOfBirth());
    }

    @Test
    void setDateOfBirth() {
        DateAndImage obj= new DateAndImage();
        obj.setDateOfBirth("12-07-1998");
        assertEquals("12-07-1998",obj.getDateOfBirth());
    }

    @Test
    void checkValidDateOfBirth() {
        DateAndImage obj = new DateAndImage();
        boolean result = obj.checkValidDateOfBirth("11.08.1997");
        assertEquals(false, result);
    }

}