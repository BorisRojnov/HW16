import java.util.Scanner;

public class Main {
    static final String VALID_TEXT ="([А-яё-]+\\s)([А-яё-]+\\s)([А-яё-]+)";
    public static void main(String[] args) {
        //todo ФИО
        System.out.println("Введите ФИО: ");
        String fullName = new Scanner(System.in).nextLine().trim();
        System.out.println(outputFullName(fullName));
    }

    public static String outputFullName(String text) {
        if(text.matches(VALID_TEXT)) {
            String firstName = text.substring(0, text.indexOf(' ')).trim();
            String lastName = text.substring(text.indexOf(' '), text.lastIndexOf(' ')).trim();
            String surName = text.substring(text.lastIndexOf(' ')).trim();

            return "Фамилия: " + firstName + "\n" +
                    "Имя: " + lastName + "\n" +
                    "Отчество : " + surName;

        }
        return "Введенная строка не является ФИО";
    }
}