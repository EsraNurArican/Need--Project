import java.util.ArrayList;

/**
 * This class for to generate and store data.
 */
public class Location {
    /**
     * An array list that contains names of countries are kept
     */
    public static ArrayList<Country> countries = new ArrayList<Country>();

    /**
     * this method for generating for the data that contains the countries, their cities and their districts.
     */
    public static void generateLocations(){
        Country country1 = new Country("Turkey");
        Location.addNewCountryToList(country1);
        Location.addCitiesToCountry1(countries.get(0));
        Location.addDistrictToIstanbul(countries.get(0));
    }

    /**
     * method for adding a new country
     * @param country1 country to add
     */
    public static void addNewCountryToList(Country country1) {
       countries.add(country1);
    }

    /**
     * cities to be added to the country (we chose Turkey as an example here).
     * @param country1 country to which cities will be added
     */
    public static void addCitiesToCountry1(Country country1){
        country1.cities.add(new City("Adana"));
        country1.cities.add(new City("Adıyaman"));
        country1.cities.add(new City("Afyon"));
        country1.cities.add(new City("Ağrı"));
        country1.cities.add(new City("Amasya"));
        country1.cities.add(new City("Ankara"));
        country1.cities.add(new City("Antalya"));
        country1.cities.add(new City("Artvin"));
        country1.cities.add(new City("Aydın"));
        country1.cities.add(new City("Balıkesir"));
        country1.cities.add(new City("Bilecik"));
        country1.cities.add(new City("Bingöl"));
        country1.cities.add(new City("Bitlis"));
        country1.cities.add(new City("Bolu"));
        country1.cities.add(new City("Burdur"));
        country1.cities.add(new City("Bursa"));
        country1.cities.add(new City("Çanakkale"));
        country1.cities.add(new City("Çankırı"));
        country1.cities.add(new City("Çorum"));
        country1.cities.add(new City("Denizli"));
        country1.cities.add(new City("Diyarbakır"));
        country1.cities.add(new City("Edirne"));
        country1.cities.add(new City("Elazığ"));
        country1.cities.add(new City("Erzincan"));
        country1.cities.add(new City("Erzurum"));
        country1.cities.add(new City("Eskişehir"));
        country1.cities.add(new City("Gaziantep"));
        country1.cities.add(new City("Giresun"));
        country1.cities.add(new City("Gümüşhane"));
        country1.cities.add(new City("Hakkari"));
        country1.cities.add(new City("Hatay"));
        country1.cities.add(new City("Isparta"));
        country1.cities.add(new City("Mersin"));
        country1.cities.add(new City("İstanbul"));
        country1.cities.add(new City("İzmir"));
        country1.cities.add(new City("Kars"));
        country1.cities.add(new City("Kastamonu"));
        country1.cities.add(new City("Kayseri"));
        country1.cities.add(new City("Kırklareli"));
        country1.cities.add(new City("Kırşehir"));
        country1.cities.add(new City("Kocaeli"));
        country1.cities.add(new City("Konya"));
        country1.cities.add(new City("Kütahya"));
        country1.cities.add(new City("Malatya"));
        country1.cities.add(new City("Manisa"));
        country1.cities.add(new City("Kahramanmaraş"));
        country1.cities.add(new City("Mardin"));
        country1.cities.add(new City("Muğla"));
        country1.cities.add(new City("Muş"));
        country1.cities.add(new City("Nevşehir"));
        country1.cities.add(new City("Niğde"));
        country1.cities.add(new City("Ordu"));
        country1.cities.add(new City("Rize"));
        country1.cities.add(new City("Sakarya"));
        country1.cities.add(new City("Samsun"));
        country1.cities.add(new City("Siirt"));
        country1.cities.add(new City("Sinop"));
        country1.cities.add(new City("Sivas"));
        country1.cities.add(new City("Tekirdağ"));
        country1.cities.add(new City("Tokat"));
        country1.cities.add(new City("Trabzon"));
        country1.cities.add(new City("Tunceli"));
        country1.cities.add(new City("Şanlıurfa"));
        country1.cities.add(new City("Uşak"));
        country1.cities.add(new City("Van"));
        country1.cities.add(new City("Yozgat"));
        country1.cities.add(new City("Zonguldak"));
        country1.cities.add(new City("Aksaray"));
        country1.cities.add(new City("Bayburt"));
        country1.cities.add(new City("Karaman"));
        country1.cities.add(new City("Kırıkkale"));
        country1.cities.add(new City("Batman"));
        country1.cities.add(new City("Şırnak"));
        country1.cities.add(new City("Bartın"));
        country1.cities.add(new City("Ardahan"));
        country1.cities.add(new City("Iğdır"));
        country1.cities.add(new City("Yalova"));
        country1.cities.add(new City("Karabük"));
        country1.cities.add(new City("Kilis"));
        country1.cities.add(new City("Osmaniye"));
        country1.cities.add(new City("Düzce"));

    }

    /**
     * As an example, the method to which the districts of only Istanbul are added.
     * @param country1 country that we have chosen Turkey
     */
    public static void addDistrictToIstanbul(Country country1){
        country1.cities.get(33).districtsOfCity.add("Adalar");
        country1.cities.get(33).districtsOfCity.add("Arnavutköy");
        country1.cities.get(33).districtsOfCity.add("Ataşehir");
        country1.cities.get(33).districtsOfCity.add("Avcılar");
        country1.cities.get(33).districtsOfCity.add("Bağcılar");
        country1.cities.get(33).districtsOfCity.add("Bahçelievler");
        country1.cities.get(33).districtsOfCity.add("Bakırköy");
        country1.cities.get(33).districtsOfCity.add("Başakşehir");
        country1.cities.get(33).districtsOfCity.add("Bayrampaşa");
        country1.cities.get(33).districtsOfCity.add("Beşiktaş");
        country1.cities.get(33).districtsOfCity.add("Beykoz");
        country1.cities.get(33).districtsOfCity.add("Beylikdüzü");
        country1.cities.get(33).districtsOfCity.add("Beyoğlu");
        country1.cities.get(33).districtsOfCity.add("Büyükçekmece");
        country1.cities.get(33).districtsOfCity.add("Çatalca");
        country1.cities.get(33).districtsOfCity.add("Çekmeköy");
        country1.cities.get(33).districtsOfCity.add("Esenler");
        country1.cities.get(33).districtsOfCity.add("Esenyurt");
        country1.cities.get(33).districtsOfCity.add("Eyüpsultan");
        country1.cities.get(33).districtsOfCity.add("Fatih");
        country1.cities.get(33).districtsOfCity.add("Gaziosmanpaşa");
        country1.cities.get(33).districtsOfCity.add("Güngören");
        country1.cities.get(33).districtsOfCity.add("Kadıköy");
        country1.cities.get(33).districtsOfCity.add("Kâğıthane");
        country1.cities.get(33).districtsOfCity.add("Kartal");
        country1.cities.get(33).districtsOfCity.add("Küçükçekmece");
        country1.cities.get(33).districtsOfCity.add("Maltepe");
        country1.cities.get(33).districtsOfCity.add("Pendik");
        country1.cities.get(33).districtsOfCity.add("Sancaktepe");
        country1.cities.get(33).districtsOfCity.add("Sarıyer");
        country1.cities.get(33).districtsOfCity.add("Silivri");
        country1.cities.get(33).districtsOfCity.add("Sultanbeyli");
        country1.cities.get(33).districtsOfCity.add("Sultangazi");
        country1.cities.get(33).districtsOfCity.add("Şile");
        country1.cities.get(33).districtsOfCity.add("Şişli");
        country1.cities.get(33).districtsOfCity.add("Tuzla");
        country1.cities.get(33).districtsOfCity.add("Ümraniye");
        country1.cities.get(33).districtsOfCity.add("Üsküdar");
        country1.cities.get(33).districtsOfCity.add("Zeytinburnu");
    }
}
