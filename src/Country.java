public class Country {
    private String name;
    private double population;
    private double area;
    private String language;

    public Country(){}

    public Country(String name, double population, double area, String language) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void print(){
        System.out.println("Country name : "+name+
                           "\nPopulation : "+population+" million"+
                           "\nArea       : "+area+"*1000 km^2"+
                           "\nLanguage   : "+language
                );
    }
}
