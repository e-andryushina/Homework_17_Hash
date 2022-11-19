package passport;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private Set<Passport> passportList = new HashSet<>();

    public void addOrUpdatePassport (Passport passport) {
        this.passportList.add(passport);
    }

    public Passport findByNumber (int number) {
        for (Passport passport : passportList) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }
}
