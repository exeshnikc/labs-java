package org.example;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    int id;
    String name;
    String specialization;
    int rating;
    List<Integer> patientRatings;
    public Doctor(int id, String name, String specialization, int rating, List<Integer> patientRatings) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
        this.patientRatings = patientRatings;
    }
    public double getAverageRating() {
        int sum = rating;
        for (int i = 0; i < patientRatings.size(); i++) {
            sum = sum + patientRatings.get(i);
        }
        return (double) sum / (patientRatings.size() + 1);
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String toString() {
        return "ID: " + id + ", имя: " + name + ", средний рейтинг: " + getAverageRating();
    }
}