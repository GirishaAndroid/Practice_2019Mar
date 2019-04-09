package andorid.sample.practice_2019mar.ParcelableDemo;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    String name;
    int age;

    /**
     * Retrieving Student data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    protected Student(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
}
