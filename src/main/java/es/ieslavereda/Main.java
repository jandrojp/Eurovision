package es.ieslavereda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Country> countriesList = new ArrayList<>();
        countriesList.addAll(List.of(
                new Country("Sweden", "Loreen", "Tattoo"),
                new Country("Israel", "Noa Kirel", "Unicorn"),
                new Country("Italy", "Marco Mengoni", "Due Vite"),
                new Country("Finland", "Käärijä", "Cha Cha Cha"),
                new Country("Estonia", "Alika", "Bridges"),
                new Country("Australia", "Voyager", "Promise"),
                new Country("Belgium", "Gustaph", "Because of You"),
                new Country("Austria", "Teya & Salena", "Who the Hell Is Edgar?"),
                new Country("Spain", "Blanca Paloma", "Eaea"),
                new Country("Czech Republic", "Vesna", "My Sister's Crown"),
                new Country("Lituania ", "Monika Linkytė", "Stay"),
                new Country("Armenia", "Brunette", "Future Lover"),
                new Country("Cyprus", "Andrew Lambrou", "Break a Broken Heart"),
                new Country("Swiss", "Remo Forrer", "Watergun"),
                new Country("Ukraine", "Tvorchi", "Heart of Steel"),
                new Country("France", "La Zarra", "Évidemment"),
                new Country("Norway", "Alessandra", "Queen of Kings"),
                new Country("Portugal", "Mimicat", "Ai Coração"),
                new Country("Slovenia", "Joker Out", "Carpe Diem"),
                new Country("Moldova", "Pasha Parfeni", "Soarele şi Luna"),
                new Country("Albania", "Albina & Familja Kelmendi", "Duje"),
                new Country("United Kingdom", "Mae Muller", "I Wrote a Song"),
                new Country("Serbia", "Luke Black", "Samo mi se spava"),
                new Country("Poland", "Blanka", "Solo"),
                new Country("Croatia", "Let 3", "Mama ŠČ!"),
                new Country("Germany", "Lord of the Lost", "Blood & Glitter")));


        for (Country c : countriesList) {
            c.vote(countriesList);
        }



        for (Country c : countriesList) {
            System.out.println(c);
        }

        System.out.println();

    }
}
