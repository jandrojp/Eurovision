package es.ieslavereda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Country> countriesList = new ArrayList<>();
        countriesList.addAll(List.of(
                new Country("Sweden", "", ""),
                new Country("Israel", "", ""),
                new Country("Italy", "", ""),
                new Country("Finland", "", ""),
                new Country("Estonia", "", ""),
                new Country("Australia", "", ""),
                new Country("Belgium", "", ""),
                new Country("Austria", "", ""),
                new Country("Spain", "", ""),
                new Country("Czech Republic", "", ""),
                new Country("Lituania ", "", ""),
                new Country("Armenia", "", ""),
                new Country("Cyprus", "", ""),
                new Country("Swiss", "", ""),
                new Country("Ukraine", "", ""),
                new Country("France", "", ""),
                new Country("Norway", "", ""),
                new Country("Portugal", "", ""),
                new Country("Slovenia", "", ""),
                new Country("Moldova", "", ""),
                new Country("Albania", "", ""),
                new Country("United Kingdom", "", ""),
                new Country("Serbia", "", ""),
                new Country("Poland", "", ""),
                new Country("Croatia", "", ""),
                new Country("Germany", "", "")));


        for (int i = 0; i < 100; i++) {
            System.out.println((int) (Math.random() * 27));
        }
        System.out.println((int) (Math.random() * 27));


    }
}
