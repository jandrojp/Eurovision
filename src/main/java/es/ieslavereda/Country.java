package es.ieslavereda;

import java.util.Comparator;
import java.util.List;

public class Country {

    private static final Comparator<Country> SORT_BY_ALPHABETICALLY = Comparator.comparing(Country::getName);
    private String name;
    private String group;
    private String song;
    private Integer scoreReceived;

    public Country(String name, String group, String song) {
        this.name = name;
        this.group = group;
        this.song = song;
        scoreReceived = 0;
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public String getSong() { return song; }
    public Integer getScoreReceived() { return scoreReceived; }
    public void setScoreReceived(Integer scoreReceived) { this.scoreReceived = scoreReceived; }

    public void vote(List<Country> countriesList) {

        Integer[] posiblesVotaciones = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
        int aux = 0;

        while (aux != 10) {

            Country country = countriesList.get((int) (Math.random() * 26));

            if (!(country.getName().equals(name))) {
                country.setScoreReceived(scoreReceived + posiblesVotaciones[aux]);
                aux++;
            }

        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Group: " + group + " | Song: " + song + " | Score " + scoreReceived;
    }

}
