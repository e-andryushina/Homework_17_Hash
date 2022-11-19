package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final LocalDate dateOfBirth;

    public Passport(int number, String surname, String name, String patronymic, LocalDate dateOfBirth) {
        if (number < 0 || surname == null || surname.isBlank() ||
                name == null || name.isBlank() || surname == null || dateOfBirth == null) {
           throw new IllegalArgumentException("Пожалуйста, заполните все обязательные поля.");
        }
        this.number = number;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}





