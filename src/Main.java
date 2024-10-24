//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Country country1=new Country("Kyrgyzstan",7.1,199.951,"Kyrgyz, Russian");
        Country country2=new Country("Kazakhstan",19.6,2724.9,"Kazakh,Russian");
        Country country3=new Country("Uzbekistan",36.5,448.978,"Uzbek");

        Country []countries={country1,country2,country3};

        country1.print();
        System.out.println("==============================");
        country2.print();
        System.out.println("==============================");
        country3.print();

        System.out.println("==============================");
        System.out.println("===COUNTRY WITH BIGGEST AREA==");
        getBiggestArea(countries).print();

    }
    static Country getBiggestArea(Country[]countries){
        Country biggestArea=new Country();
        biggestArea=countries[0];
        for (int i = 0; i < countries.length-1; i++) {
            if(countries[i].getArea()>countries[i+1].getArea()){
                biggestArea=countries[i];
            }
        }
        return biggestArea;
    }
}