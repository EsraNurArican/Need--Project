import java.util.ArrayList;

/**
 * City class in which I keep districts
 */
public class City {
    /**
     * name of the city
     */
    String nameOfCity;

    /**
     * an array list that contains name of the districts of the city
     */
    ArrayList<String> districtsOfCity = new ArrayList<String>();

    /**
     * a one parameter constructor
     * @param name city name
     */
    public City(String name){
        nameOfCity = name;
    }
}
