package fr.wcs.checkpoint1quent176;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputPrenom = (EditText) findViewById(R.id.inputPrenom);
        final EditText inputNom = (EditText) findViewById(R.id.inputNom);
        final EditText inputEcole = (EditText) findViewById(R.id.inputEcole);
        final EditText inputLangage = (EditText) findViewById(R.id.inputLangage);
        Button buttonSend = (Button) findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputPrenom.getText().toString().trim().length() == 0 || inputNom.getText().toString().trim().length() == 0  ||
                        inputEcole.getText().toString().trim().length() == 0 || inputLangage.getText().toString().trim().length() == 0) {
                    Toast.makeText(MainActivity.this, "Merci de renseigner tous les champs du formulaire", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    StudentModel etudiant = new StudentModel(inputPrenom.getText().toString(), inputNom.getText().toString(), inputEcole.getText().toString(), inputLangage.getText().toString());
                    Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                    intent.putExtra("etudiant", etudiant);
                    startActivity(intent);
                }

            }
        });
    }
}