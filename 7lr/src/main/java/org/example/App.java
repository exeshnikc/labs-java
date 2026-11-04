package org.example;

public class App
{
    public static void main( String[] args )
    {
        Singer singer1 = new Singer("Michael Jackson", "Pop", 10);
        Singer singer2 = new Singer("BOOKER", "Rap", 15);
        Singer singer3 = new Singer("Pyrokinesis", "Rap", 11);
        Singer singer4 = new Singer("Adele", "Soul", 4);
        Singer singer5 = new Singer("Onda andar", "Эмбиент", 3);
        System.out.println("Всего певцов: " + Singer.getTotalSingers());
        System.out.println("Всего альбомов: " + Singer.getTotalAlbums());
        System.out.println("Среднее число альбомов: " + Singer.getAverageAlbums());
    }
}