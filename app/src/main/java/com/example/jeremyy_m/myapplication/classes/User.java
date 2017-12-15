package com.example.jeremyy_m.myapplication.classes;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable{
    private String lastName;
    private String firstName;
    private String mail;
    private String birth_date;

    public User(String lastName, String firstName, String mail, String birth_date) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.mail = mail;
        this.birth_date = birth_date;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(lastName);
        dest.writeString(firstName);
        dest.writeString(mail);
        dest.writeString(birth_date);
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>(){
        @Override
        public User createFromParcel(Parcel source){
            return new User(source);
        }

        @Override
        public User[] newArray(int size){
            return new User[size];
        }
    };

    public User(Parcel in){
        super();
        this.lastName = in.readString();
        this.firstName = in.readString();
        this.mail = in.readString();
        this.birth_date = in.readString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public static Creator<User> getCREATOR() {
        return CREATOR;
    }
}