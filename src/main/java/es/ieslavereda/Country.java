package es.ieslavereda;


import java.util.List;

public class Country {
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

        int posicion = (int) (Math.random() * 27);
        List<Integer> posiblesVotaciones = List.of(1, 2, 3, 4, 5, 6, 7, 8, 10, 12);


        int aux = 0;
        while (posiblesVotaciones.size() != 0) {


            countriesList.get(posicion).setScoreReceived(getScoreReceived() + posiblesVotaciones(aux));

            posiblesVotaciones.remove(aux);

        }





    }

    @Override
    public String toString() {
        return "Name: " + name + " | Group: " + group + " | Song: " + song + " | Score " + scoreReceived;
    }

}
