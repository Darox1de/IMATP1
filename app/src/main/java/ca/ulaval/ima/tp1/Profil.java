package ca.ulaval.ima.tp1;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Profil implements Parcelable {
    public Profil(String name, String firstName, List birthDate, String IDUL) {

        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.IDUL = IDUL;
    }
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Profil> CREATOR
            = new Parcelable.Creator<Profil>() {
        public Profil createFromParcel(Parcel in) {
            return new Profil(in);
        }

        public Profil[] newArray(int size) {
            return new Prfil[size];
        }
    };

    public void writeToParcel(Parcel out, int flags) {
        out.writeString(name);
        out.writeString(firstName);
        out.writeList(birthDate);
        out.writeString(IDUL);
    }

    String name;
    String firstName;
    List birthDate;
    String IDUL;
}