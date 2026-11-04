import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1");

        String str1 = "Hello";
        String str2 = "World";

        String concatenated = str1 + " " + str2;
        System.out.println("Результат склейки: " + concatenated);
        System.out.println("\n2");

        String sentence = "Я иду домой в красивый лес";
        System.out.println("Исходное предложение: " + sentence);

        String[] words = sentence.split("\\s+");

        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() >= 3) {
                filtered.append(word).append(" ");
            }
        }

        System.out.println("После удаления слов короче 3 символов: "
                + filtered.toString().trim());

        System.out.println("\n3");

        Employee[] employees = new Employee[] {
                new Employee("Садковская",   1250.5),
                new Employee("Вересова",    980.75),
                new Employee("Гаманович", 3120.0),
                new Employee("Гросул",  540.25)
        };
        Report.generateReport(employees);

        System.out.println("\n4");

        String task4 = "a1a a2a a33a a4a a555a a6a a7a a38a a9a";
        System.out.println("Исходная строка: " + task4);

        String regex = "\\ba[1-5]{2,3}a\\b";

        System.out.println("Найденные строки:");
        for (String w : task4.split("\\s+")) {
            if (w.matches(regex)) {
                System.out.println(w);
            }
        }
    }
}