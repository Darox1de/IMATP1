package ca.ulaval.ima.tp1;

import java.time.LocalDate;

public class Parcelable {
    Parcelable(String name, String firstName, LocalDate birthDate, String IDUL) {

        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.IDUL = IDUL;
    }
    String name;
    String firstName;
    LocalDate birthDate;
    String IDUL;
}