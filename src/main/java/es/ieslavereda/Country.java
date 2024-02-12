package es.ieslavereda;

import java.util.*;

public class Country implements Comparable<Country> {
    private String name;
    private String group;
    private String song;
    private Integer scoreReceived;
    private Map<Integer, Country> votes;

    public Country(String name, String group, String song) {
        this.name = name;
        this.group = group;
        this.song = song;
        scoreReceived = 0;
        votes = new TreeMap<>(Comparator.reverseOrder());
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public String getSong() { return song; }
    public Integer getScoreReceived() { return scoreReceived; }
    public String getVotes() {
        String allVotes = "";

        for (Integer i : votes.keySet()) {
            System.out.print(i + " -> " + votes.get(i).getName() + "   ");
        }

        return allVotes;
    }
    public void setScoreReceived(Integer scoreReceived) { this.scoreReceived = scoreReceived; }

    public void vote(List<Country> countriesList) {

        Integer[] posiblesVotaciones = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
        List<Country> countries = new ArrayList<>();
        int aux = 0;

        while (aux != 10) {

            Country country = countriesList.get((int) (Math.random() * 26));

            if (!(country.getName().equals(name)) && !(countries.contains(country))) {
                country.setScoreReceived(scoreReceived + posiblesVotaciones[aux]);
                votes.put(posiblesVotaciones[aux], country);
                countries.add(country);
                aux++;
            }

        }
    }

    @Override
    public int compareTo(Country country) {
        return getName().compareTo(country.getName());
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || !(o instanceof Country)) return false;

        Country country = (Country) o;

        return name.equals(country.getName()) && group.equals(country.getGroup()) && song.equals(country.getSong());
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Group: " + group + " | Song: " + song + " | Score " + scoreReceived;
    }

}
