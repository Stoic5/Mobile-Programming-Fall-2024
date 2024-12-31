package com.example.apptamrin;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class proFileData implements Parcelable {

    private String name;
    private String family;
    private String age;
    private String nummber;
    private String address;
    private String gender;
    private String postal_code;
    private String mail;
    private String country;
    private String city;
    private String date;
    private String time;
    private String major;
    private String univercityName;
    private String proffetional;
    private String ocupation;
    private String iD;

    protected proFileData (Parcel in) {
        name = in.readString();
        family = in.readString();
        age = in.readString();
        nummber = in.readString();
        address = in.readString();
        gender = in.readString();
        postal_code = in.readString();
        mail = in.readString();
        country = in.readString();
        city = in.readString();
        date = in.readString();
        time = in.readString();
        major = in.readString();
        univercityName = in.readString();
        proffetional = in.readString();
        ocupation = in.readString();
        iD = in.readString();
    }
    public proFileData (String name,String family,String age,String nummber,String postal_code,String mail,String country,String city,String date,String time,String major,String univercityName,String proffetional,String ocupation, String iD){
        this.name = name;
        this.family = family;
        this.age = age;
        this.nummber = nummber;
        this.address = address;
        this.gender = gender;
        this.postal_code = postal_code;
        this.mail = mail;
        this.country = country;
        this.city = city;
        this.date = date;
        this.time = time;
        this.major = major;
        this.univercityName = univercityName;
        this.proffetional = proffetional;
        this.ocupation = ocupation;
        this.iD=iD;
    }
    public static final Creator<proFileData> CREATOR=new Creator<proFileData>() {
        @Override
        public proFileData createFromParcel(Parcel in) {
            return new proFileData(in);
        }

        @Override
        public proFileData[] newArray(int size) {
            return new proFileData[size];
        }
    };
    public String toString() {
        return "profileData{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age='" + age + '\'' +
                ", nummber='" + nummber + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", mail='" + mail + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", major='" + major + '\'' +
                ", univercityName='" + univercityName + '\'' +
                ", proffetional='" + proffetional + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", iD='" + iD +'\'' +
                '}';
    }
    public String getName(){return name;}

    public void setName(String name) {this.name = name;}
    public String getFamily(){return family;}
    public void setFamily(String family) {this.family = family;}

    public String getAge(){return age;}
    public void setAge(String age) {this.age = age;}

    public String getNummber(){return nummber;}
    public void setNummber(String nummber) {this.nummber = nummber;}

    public String getAddress(){return address;}
    public void setAddress(String address) {this.address = address;}

    public String getGender(){return gender;}
    public void setGender(String gender) {this.gender = name;}

    public String getPostal_code(){return postal_code;}
    public void setPostal_code(String name) {this.postal_code = postal_code;}

    public String getMail(){return mail;}
    public void setMail(String mail) {this.mail = mail;}

    public String getCountry(){return country;}
    public void setCountry(String country) {this.country = country;}

    public String getCity(){return city;}
    public void setCity(String city) {this.city = city;}

    public String getDate(){return date;}
    public void setDate(String date) {this.date = date;}

    public String getTime(){return time;}
    public void setTime(String time) {this.time = time;}

    public String getMajor(){return major;}
    public void setMajor(String major) {this.major = major;}

    public String getUnivercityName(){return univercityName;}
    public void setUnivercityName(String univercityName) {this.univercityName = univercityName;}
















    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

    }
}
