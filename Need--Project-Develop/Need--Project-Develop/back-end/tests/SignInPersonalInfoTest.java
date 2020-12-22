import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignInPersonalInfoTest {

    @Test
    void getName() {
        SignInPersonalInfo obj= new SignInPersonalInfo ("Esra","Arican");
        assertEquals("Esra",obj.getName());
    }


    @Test
    void setName() {
        SignInPersonalInfo obj= new SignInPersonalInfo ("Esra","Arican");
        obj.setName("EsraNur");
        assertEquals("EsraNur",obj.getName());
    }

    @Test
    void getSurname() {
        SignInPersonalInfo obj= new SignInPersonalInfo ("Esra","Arican");
        assertEquals("Arican",obj.getSurname());
    }

    @Test
    void setSurname() {
        SignInPersonalInfo obj= new SignInPersonalInfo ("Esra","Arican");
        obj.setSurname("Arıcan");
        assertEquals("Arıcan",obj.getSurname());
    }

    @Test
    void checkValidString() {
        SignInPersonalInfo obj= new SignInPersonalInfo ("Esra","Arican");
        boolean result= obj.checkValidString("@aa12c");
        assertEquals(false,result);
    }

    @Test
    void getPassword() {
        SignInPersonalInfo obj= new SignInPersonalInfo("Esra","Arican");
        assertEquals(null,obj.getPassword());
    }

    @Test
    void setPassword() {
        SignInPersonalInfo obj = new SignInPersonalInfo("Need","Team");
        obj.setPassword("need++123");
        assertEquals("need++123",obj.getPassword());
    }

    @Test
    void passwordValidation() {
        SignInPersonalInfo obj = new SignInPersonalInfo("Need","Team");
        boolean result = obj.passwordValidation("wrongpassw");
        assertEquals(false,result);
    }
}