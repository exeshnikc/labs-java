package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class App
{
    public static void main( String[] args )
    {
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor(1, "Вересова", "Терапевт", 3, Arrays.asList(4, 5, 2)));
        doctors.add(new Doctor(2, "Гаманович", "Хирург", 5, Arrays.asList(5, 4, 5)));
        doctors.add(new Doctor(3, "Гершончик", "Окулист", 2, Arrays.asList(1, 2, 3)));
        doctors.add(new Doctor(4, "Гросул", "Кардиолог", 4, Arrays.asList(4, 5, 5)));
        doctors.add(new Doctor(5, "Хлебко", "Невролог", 3, Arrays.asList(2, 3, 2)));

        DoctorService service = new DoctorService();

        service.printDoctorsBelowRating(doctors);
        System.out.println();
        service.increaseRatingForTopDoctors(doctors);
        System.out.println();
        service.printDoctors(doctors, 4);
        System.out.println();
        service.printSortedDoctors(doctors);
    }
}