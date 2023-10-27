package com.example.listviewexemples;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String[] FullName = {"Abdelilah Ait Lhaj", "Mohamed Kaabouch", "Mariame IRSI","Lahcen IRSI" , "ahmed IRSI","mustapha IRSI","mouad IRSI","naima IRSI"};
    String[] PhoneNumber = {"0634234422", "0634560900", "0600000000","0749493393","07346626226","0622222222","848833838","0644382282"};
    int[] images = {R.drawable.avatar1, R.drawable.avatar3, R.drawable.avatar4,R.drawable.avatar2,R.drawable.avatar5,R.drawable.avatar6,R.drawable.avatar7,R.drawable.avatar8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Nous définissons une interface utilisateur (UI) pour cette activité en utilisant le fichier XML 'activity_main'.

        listView = findViewById(R.id.lvprogram);

        // Nous obtenons une référence à la ListView définie dans le fichier XML par son ID 'lvprogram'.

        PhoneAdapter phoneAdapter = new PhoneAdapter(this, FullName, images, PhoneNumber);

        // Nous créons une instance de l'adaptateur personnalisé PhoneAdapter en lui passant le contexte (this), le tableau des noms FullName, le tableau des images images, et le tableau des numéros de téléphone PhoneNumber.

        listView.setAdapter(phoneAdapter);

        // Nous définissons l'adaptateur pour la ListView pour afficher les données en utilisant notre adaptateur personnalisé.
    }
}
