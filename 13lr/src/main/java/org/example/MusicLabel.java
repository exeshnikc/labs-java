package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicLabel {
    String labelName;
    List<Musician> musicians;

    public MusicLabel(String labelName) {
        this.labelName = labelName;
        this.musicians = new ArrayList<>();
    }

    public void addMusician(Musician m) {
        musicians.add(m);
        System.out.println("На лейбл " + labelName + " добавлен: " + m.name);
    }

    public Musician findMusician(String name) throws MusicianNotFoundException {
        for (Musician m : musicians) {
            if (m.name.equalsIgnoreCase(name)) {
                return m;
            }
        }
        throw new MusicianNotFoundException("Музыкант с именем '" + name + "' не найден на лейбле");
    }

    public void releaseAlbumFor(String name, String title) throws MusicianNotFoundException, AlbumException {
        Musician m = findMusician(name);
        m.releaseAlbum(title);
    }

    public void updateRatingFor(String name, double newRating)
            throws MusicianNotFoundException, InvalidMusicianDataException {
        Musician m = findMusician(name);
        m.updateRating(newRating);
    }

    public void printAllMusicians() {
        System.out.println("\nМузыканты лейбла " + labelName);
        for (Musician m : musicians) {
            System.out.println(m);
        }
        System.out.println();
    }
}