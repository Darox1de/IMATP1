package ca.ulaval.ima.tp1;


import android.os.Parcel;
import android.os.Parcelable;


public class Profil implements Parcelable {


    private String name;
    private String firstName;
    private Long birthDate;
    private String IDUL;

    protected Profil(Parcel in) {
        name = in.readString();
        firstName = in.readString();
        birthDate = in.readLong();
        IDUL = in.readString();

    }

    public static final Creator<Profil> CREATOR = new Creator<Profil>() {
        @Override
        public Profil createFromParcel(Parcel in) {
            return new Profil(in);
        }

        @Override
        public Profil[] newArray(int size) {
            return new Profil[size];
        }
    };

    Profil(String name, String firstName, Long date, String IDUL) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = date;
        this.IDUL = IDUL;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(firstName);
        dest.writeLong(birthDate);
        dest.writeString(IDUL);


    }

    public Long getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIDUL() {
        return IDUL;
    }

    public String getName() {
        return name;
    }
}