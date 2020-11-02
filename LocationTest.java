import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LocationTest {

    @Test
    void checkCountry() {
        Location.generateLocations();
        Country enteredCountry = new Country("Turkey");
        boolean isCountryValid = enteredCountry.checkCountry(enteredCountry.nameOfCountry);
        assertEquals(true, isCountryValid);
    }

    @Test
    void checkCity(){
        Location.generateLocations();
        Country enteredCountry = new Country("Turkey");
        City enteredCity = new City("İstanbul");
        boolean isCityValid = enteredCountry.checkCity(enteredCountry.nameOfCountry, enteredCity.nameOfCity);
        assertEquals(true, isCityValid);
    }
    @Test
    void checkDistrict(){
        Location.generateLocations();
        Country enteredCountry = new Country("Turkey");
        City enteredCity = new City("İstanbul");
        String enteredDistrict = new String("Adalar");
        boolean isDistrictValid = enteredCountry.checkDistrict(enteredCountry.nameOfCountry, enteredCity.nameOfCity, enteredDistrict);
        assertEquals(true, isDistrictValid);
    }
    @Test
    void checkLocation(){
        Location.generateLocations();
        Country enteredCountry = new Country("TURKEY");
        City enteredCity = new City("İSTANBUL");
        String enteredDistrict = new String("ADALAR");
        boolean isLocationValid = enteredCountry.checkLocation(enteredCountry.nameOfCountry, enteredCity.nameOfCity, enteredDistrict);
        assertEquals(true, isLocationValid);
    }

}