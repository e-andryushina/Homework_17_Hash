package passport;

import java.time.LocalDate;

public class HWSets {
    public static void main(String[] args) {
        System.out.println("Урок Хеш и Хеш-коллекции. ДЗ3. Задание 3");
        Passport passport = new Passport(12354657, "Сергеев",
                "Сергей", "Сергеевич", LocalDate.of(2000, 02, 02));

        PassportList passportList = new PassportList();
        passportList.addOrUpdatePassport(passport);
        System.out.println(passport);
    }
}
