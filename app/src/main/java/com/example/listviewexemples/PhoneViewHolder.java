package com.example.listviewexemples;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PhoneViewHolder {
    ImageView itemImage;
    TextView FullName;
    TextView PhoneNumber;

    // Constructeur de la classe PhoneViewHolder
    PhoneViewHolder(View v) {
        // Ce constructeur reçoit une vue (View) en tant que paramètre.

        // Associer les éléments de la vue aux variables de classe.
        itemImage = v.findViewById(R.id.imageView);     // L'ImageView pour l'image de profil.
        FullName = v.findViewById(R.id.textView1);       // Le TextView pour le nom.
        PhoneNumber = v.findViewById(R.id.textView2);    // Le TextView pour le numéro de téléphone.
    }
}
