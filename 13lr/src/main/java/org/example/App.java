package org.example;

public class App
{
    public static void main( String[] args )
    {
        MusicLabel label = new MusicLabel("Новый Русский Лейбл");

        try {
            Musician onda = new Musician("Onda Andar", "вокал", "альтернативный хип-хоп", 2, 8.5);
            Musician pyro = new Musician("Pyrokinesis", "вокал", "рэп", 5, 9.0);
            Musician booker = new Musician("Booker", "вокал", "рэп", 3, 7.5);
            Musician ic3 = new Musician("Icegergert", "вокал", "рэп", 1, 8.0);
            Musician macan = new Musician("Macan", "вокал", "рэп", 4, 7.0);
            label.addMusician(onda);
            label.addMusician(pyro);
            label.addMusician(booker);
            label.addMusician(ic3);
            label.addMusician(macan);
            label.printAllMusicians();
            System.out.println("выпуск альбомов");
            label.releaseAlbumFor("Onda Andar", "KIDSCRY2DAY");
            label.releaseAlbumFor("Pyrokinesis", "mea maxima culpa");
            label.releaseAlbumFor("Booker", "8ballz");
            label.releaseAlbumFor("Icegergert", "Банк");

            System.out.println();

            System.out.println("Обновление рейтингов");
            label.updateRatingFor("Onda Andar", 9.0);
            label.updateRatingFor("Booker", 8.5);

            System.out.println();
            System.out.println("Проверка исключений");

            try {
                new Musician("Bad", "вокал", "рэп", -1, 5);
            } catch (InvalidMusicianDataException e) {
                System.out.println("Ошибка данных: " + e.getMessage());
            }

            try {
                new Musician("Bad2", "вокал", "рэп", 1, 15);
            } catch (InvalidMusicianDataException e) {
                System.out.println("Ошибка данных: " + e.getMessage());
            }

            try {
                label.findMusician("Неизвестный");
            } catch (MusicianNotFoundException e) {
                System.out.println("Не найдено: " + e.getMessage());
            }

            try {
                label.releaseAlbumFor("Onda Andar", "");
            } catch (AlbumException e) {
                System.out.println("Ошибка альбома: " + e.getMessage());
            }
            System.out.println();
            label.printAllMusicians();
        } catch (InvalidMusicianDataException e) {
            System.out.println("Ошибка при создании музыканта: " + e.getMessage());
        } catch (MusicianNotFoundException e) {
            System.out.println("Музыкант не найден: " + e.getMessage());
        } catch (AlbumException e) {
            System.out.println("Ошибка альбома: " + e.getMessage());
        }
    }
}