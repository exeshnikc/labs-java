package org.example;
import java.time.LocalDate;

public interface Maintainable {
    void maintain();
    LocalDate getServiceDate();
}
