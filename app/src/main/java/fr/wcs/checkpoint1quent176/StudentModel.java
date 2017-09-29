package fr.wcs.checkpoint1quent176;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentModel implements Parcelable {
    //attributs privés
    private String prenom;
    private String nom;
    private String ecole;
    private String langage;

    public StudentModel (String prenom, String nom, String ecole, String langage){
        //arguments pour initialiser les attributs
        this.prenom = prenom;
        this.nom = nom;
        this.ecole = ecole;
        this.langage = langage;
    }

    //Getter ci-dessous representés par le get*
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEcole() {
        return ecole;
    }

    public String getLangage() {
        return langage;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.prenom);
        dest.writeString(this.nom);
        dest.writeString(this.ecole);
        dest.writeString(this.langage);;
    }

    public static final Parcelable.Creator<StudentModel> CREATOR = new Parcelable.Creator<StudentModel>() {
        @Override
        public StudentModel createFromParcel(Parcel in) {
            return new StudentModel(in);
        }

        @Override
        public StudentModel[] newArray(int size) {
            return new StudentModel[size];
        }
    };

    private StudentModel(Parcel in) {
        this.nom = in.readString();
        this.prenom = in.readString();
        this.ecole = in.readString();
        this.langage = in.readString();

    }
}
