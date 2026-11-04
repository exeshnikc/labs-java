package org.example;
import java.util.Comparator;
import java.util.List;
public class DoctorService {

    public void printDoctorsBelowRating(List<Doctor> doctors) {
        System.out.println("Врачи со средним рейтингом < 3:");
        for (Doctor d : doctors) {
            if (d.getAverageRating() < 3) {
                System.out.println(d);
            }
        }
    }
    public void increaseRatingForTopDoctors(List<Doctor> doctors) {
        for (Doctor d : doctors) {
            if (d.getAverageRating() >= 4) {
                d.setRating(d.getRating() + 1);
            }
        }
        System.out.println("Рейтинг лучших врачей повышен.");
    }
    public void printDoctors(List<Doctor> doctors, int rating) {
        System.out.println("Врачи со средним рейтингом >= " + rating + ":");
        for (Doctor d : doctors) {
            if (d.getAverageRating() >= rating) {
                System.out.println(d);
            }
        }
    }
    public void printSortedDoctors(List<Doctor> doctors) {
        doctors.sort(
                Comparator.comparingDouble(Doctor::getAverageRating).reversed()
                        .thenComparing(d -> d.name)
        );
        System.out.println("Врачи, отсортированные по убыванию среднего рейтинга:");
        for (Doctor d : doctors) {
            System.out.println("ID: " + d.id + ", имя: " + d.name
                    + ", средний рейтинг: " + d.getAverageRating());
        }
    }
}