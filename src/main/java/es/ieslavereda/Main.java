package es.ieslavereda;

import java.util.*;

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

        // - Listado de todos los países participantes
        System.out.println("LIST OF ALL PARTICIPATING COUNTRIES");
        System.out.println("------------------------------------");

        for (Country c : countriesList) {
            System.out.println(c.getName());
        }
        System.out.println();

        // - Listado de todos los países por orden alfabético junto con las votaciones realizadas ordenadas de mayor a menor.
        List<Country> orderedAlphabeticList = new ArrayList<>(countriesList);
        Collections.sort(orderedAlphabeticList);

        System.out.println("LIST OF ALL COUNTRIES IN ALPHABETICAL ORDER ALONG WITH THE VOTES TAKEN ORDERED FROM HIGHEST TO LOWEST");
        System.out.println("------------------------------------------------------------------------------------------------------");

        for (Country c : orderedAlphabeticList) {
            System.out.println(c.getName().toUpperCase());
            System.out.println(c.getVotesString());
        }
        System.out.println();

        // - Listado de los países ordenados por puntuaciones recibidas.
        System.out.println("LIST OF COUNTRIES ORDERED BY SCORES RECEIVED");
        System.out.println("---------------------------------------------");
        List<Country> orderedScoreList = new ArrayList<>(countriesList);
        orderedScoreList.sort(Country.SORT_BY_SCORE);

        for (Country c : orderedScoreList) {
            System.out.println(c.getName() + " " + c.getScoreReceived());
        }
        System.out.println();

        // - Nombre del país ganador y países que le votaron junto con los puntos así que le han votado junto con los puntos asignados por cada uno de ellos.
        Country winCountry = orderedScoreList.get(0);
        System.out.println("WINNING COUNTRY --> " + winCountry);

        for (Country c : orderedScoreList) {
            if (c.getVotes().containsValue(winCountry)) {
                System.out.println(c.getName() + " " + getKeyByValue(c.getVotes(), winCountry));
            }
        }
        System.out.println();

        // - Listado de canciones ordenadas por nombre.
        System.out.println("LIST OF SONGS ORDERED BY NAME");
        System.out.println("------------------------------");
        List<Country> nameSongOrderedList = new ArrayList<>(countriesList);
        nameSongOrderedList.sort(Country.SORT_BY_SONG);

        for (Country c : nameSongOrderedList) {
            System.out.println(c.getSong());
        }
        System.out.println();

        // - Listado de las 3 canciones más votadas junto con su puntuación.
        System.out.println("LIST OF THE 3 MOST VOTED SONGS ALONG WITH THEIR SCORE");
        System.out.println("------------------------------------------------------");
        List<Country> songsMostVotedList = new ArrayList<>(orderedScoreList);

        for (int i = 0; i < 3; i++) {
            System.out.println(songsMostVotedList.get(i).getSong() + " -> " + songsMostVotedList.get(i).getScoreReceived());
        }
        System.out.println();

        // - Listado de cantantes ordenados por nombre.
        System.out.println("LIST OF SINGERS ORDERED BY NAME");
        System.out.println("--------------------------------");
        List<Country> nameSingerOrderedList = new ArrayList<>(countriesList);
        nameSingerOrderedList.sort(Country.SORT_BY_SINGER);

        for (Country c : nameSingerOrderedList) {
            System.out.println(c.getGroup());
        }
        System.out.println();

    }

    public static <K, V> K getKeyByValue(Map<K, V> map, V searchedValue) {

        for (Map.Entry<K, V> entry : map.entrySet()) {

            if (searchedValue.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
