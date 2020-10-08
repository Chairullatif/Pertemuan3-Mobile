package com.example.cerc_materialdesign.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.cerc_materialdesign.Activity.MainActivity;
import com.example.cerc_materialdesign.R;
import com.google.android.material.button.MaterialButton;

public class RatingFragment extends Fragment {

    // Method onCreateView dipanggil saat Fragment harus menampilkan layoutnya      // dengan membuat layout tersebut secara manual lewat objek View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Layout tampilan untuk fragment ini
        View view = inflater.inflate(R.layout.fragment_rating, container, false);

        final RatingBar ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
        MaterialButton btnRating = (MaterialButton) view.findViewById(R.id.btnRating);
        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = "Rating yang anda berikan adalah " + ratingBar.getRating() + "\nTerima kasih telah memberikan review pada mentor kami.";
                Intent intent = new Intent(getActivity(), MainActivity.class);
                getActivity().startActivity(intent);
                Toast.makeText(getActivity(), rating, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}
