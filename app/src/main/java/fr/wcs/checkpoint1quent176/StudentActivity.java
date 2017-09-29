package fr.wcs.checkpoint1quent176;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        //récupération de l'objet via Intent
        StudentModel etudiant = getIntent().getExtras().getParcelable("etudiant");

        //déclaration variable et récupération données via getter
        String prenom = etudiant.getPrenom();
        String nom = etudiant.getNom();
        String ecole = etudiant.getEcole();
        String langage = etudiant.getLangage();

        TextView showPrenom = (TextView) findViewById(R.id.showPrenom);
        TextView showNom = (TextView) findViewById(R.id.showNom);
        TextView showEcole = (TextView) findViewById(R.id.showEcole);
        TextView showLangage = (TextView) findViewById(R.id.showLangage);

        showPrenom.setText(prenom);
        showNom.setText(nom);
        showEcole.setText(ecole);
        showLangage.setText(langage);
    }
}
