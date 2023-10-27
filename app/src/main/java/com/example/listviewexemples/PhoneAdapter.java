package com.example.listviewexemples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PhoneAdapter extends ArrayAdapter<String> {
    Context context;
    int[] images;
    String[] FullName;
    String[] NumberPhone;

    // Constructeur de l'adaptateur
    public PhoneAdapter(Context context, String[] Fullname, int[] images, String[] numberPhone) {
        super(context, R.layout.single_item, Fullname);

        // Le constructeur reçoit le contexte, les tableaux de noms, d'images et de numéros de téléphone.
        this.context = context;
        this.FullName = Fullname;
        this.NumberPhone = numberPhone;
        this.images = images;
    }

    // Méthode pour créer la vue de chaque élément de la liste
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View singleItem = convertView;
        PhoneViewHolder holder = null;

        // Vérifier si la vue d'un élément a déjà été créée (réutilisation de vues pour l'efficacité)
        if (singleItem == null) {
            // Si la vue n'existe pas encore, nous la créons à partir du fichier de mise en page 'single_item'.
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.single_item, parent, false);

            // Nous utilisons un ViewHolder pour stocker les vues des éléments et éviter de les rechercher à chaque fois.
            holder = new PhoneViewHolder(singleItem);
            singleItem.setTag(holder); // Stocker le ViewHolder dans la vue pour une récupération ultérieure.
        } else {
            holder = (PhoneViewHolder) singleItem.getTag(); // Récupérer le ViewHolder de la vue réutilisée.
        }

        // Remplir les vues de l'élément avec les données appropriées.
        holder.itemImage.setImageResource(images[position]); // Définit l'image de profil.
        holder.PhoneNumber.setText(NumberPhone[position]); // Définit le numéro de téléphone.
        holder.FullName.setText(FullName[position]); // Définit le nom.

        // Définir un gestionnaire de clic pour l'élément de la liste.
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Afficher un message contextuel (Toast) lorsque l'élément est cliqué.
                Toast.makeText(getContext(), "Vous avez cliqué sur " + FullName[position], Toast.LENGTH_SHORT).show();
            }
        });

        return singleItem; // Retourne la vue de l'élément de la liste.
    }
}
