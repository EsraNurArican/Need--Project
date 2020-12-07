import java.util.ArrayList;

/**
 * The class for a country that contains the cities are kept and manipulated.
 */
public class Country {
    /**
     * name of the country
     */
    String nameOfCountry;

    /**
     * an array list that contains name of the cities of the country
     */
    ArrayList<City> cities = new ArrayList<City>();


    /**
     * a one parameter constructor
     * @param name country name
     */
    public Country(String name){
        nameOfCountry = name;
    }

    /**
     * The method that checks whether the country, city and district(so location) are valid, respectively.
     * @param enteredCountry entered country
     * @param enteredCity   entered city
     * @param enteredDistrict   entered district
     * @return true if location is valid, otherwise false
     */
    public boolean checkLocation(String enteredCountry, String enteredCity, String enteredDistrict) {
        if (checkCountry(enteredCountry)) {
            if (checkCity(enteredCountry, enteredCity)) {
                if(checkDistrict(enteredCountry, enteredCity, enteredDistrict))
                   return true;
            }
        }
        return false;
    }

    /**
     * The method that checks if such an active country exists.
     * @param enteredCountry entered country
     * @return true if country is valid, otherwise false
     */
    public boolean checkCountry(String enteredCountry){

        for(int i = 0; i< Location.countries.size(); ++i)
        {
            if(Location.countries.get(i).nameOfCountry.	equalsIgnoreCase(enteredCountry))
                return true;
        }

        System.out.println("there is no such country active!");
        return false;
    }

    /**
     * The method that checks if such an city in entered country.
     * @param enteredCountry entered country
     * @param enteredCity entered city
     * @return true if city is valid, otherwise false
     */
    public boolean checkCity(String enteredCountry, String enteredCity){
        for(int i = 0; i< Location.countries.size(); ++i) {
            if(Location.countries.get(i).nameOfCountry.equalsIgnoreCase(enteredCountry)){
                for(int j=0; j< Location.countries.get(i).cities.size(); ++j){
                    if (Location.countries.get(i).cities.get(j).nameOfCity.	equalsIgnoreCase(enteredCity)) {
                        return true;
                    }
                }
            }
        }
        System.out.println("there is no such city in this country!");
        return false;
    }

    /**
     * The method that checks if such an district in entered city.
     * @param enteredCountry entered country
     * @param enteredCity   entered city
     * @param enteredDistrict   entered district
     * @return  true if district is valid, otherwise false
     */
    public boolean checkDistrict(String enteredCountry, String enteredCity, String enteredDistrict){
        for(int i = 0; i< Location.countries.size(); ++i) {
            if(Location.countries.get(i).nameOfCountry.equalsIgnoreCase(enteredCountry)){
                for(int j=0; j< Location.countries.get(i).cities.size(); ++j){
                    if (Location.countries.get(i).cities.get(j).nameOfCity.equalsIgnoreCase(enteredCity)) {
                        for(int k=0; k< Location.countries.get(i).cities.get(j).districtsOfCity.size(); ++k)
                        {
                            if (Location.countries.get(i).cities.get(j).districtsOfCity.get(k).	equalsIgnoreCase(enteredDistrict)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("there is no such district in this city!");
        return false;
    }
}
