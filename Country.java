public class Country {

    private String ID;
    private String country;
    private long population;


    //Polska (PL) ma 38000000 ludności.
    @Override
    public String toString() {
        return country + "(" + ID + ")" + " ma " + population + " ludności.";
    }

    public Country(String ID, String country, long population) {
        this.ID = ID;
        this.country = country;
        this.population = population;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
