import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing class for PasswordCheck
 */
class PasswordCheckTest {

    @Test
    void getCurrentPassword()
    {
        PasswordCheck obj= new PasswordCheck("Need","Team");
        obj.setPassword("need++123");

        assertEquals("need++123",obj.getCurrentPassword());
    }


    @Test
    void setNewPassword()
    {
        PasswordCheck obj= new PasswordCheck("Need","Team");
        obj.setPassword("need++123");
        obj.setNewPassword("newPassword1+", "newPassword1+");

        assertEquals("newPassword1+", obj.getCurrentPassword());
    }

    @Test
    void getOldPassword()
    {
        PasswordCheck obj= new PasswordCheck("Need","Team");
        obj.setPassword("need++123");

        assertEquals("youshallnotpass10+", obj.getOldPassword());
    }

    @Test
    void checkConfirmPassword()
    {
        PasswordCheck obj= new PasswordCheck("Need","Team");
        obj.setPassword("need++123");

        //different entries
        assertEquals(false, obj.checkConfirmPassword("newPassword1+", "newPassword2+"));
    }
}