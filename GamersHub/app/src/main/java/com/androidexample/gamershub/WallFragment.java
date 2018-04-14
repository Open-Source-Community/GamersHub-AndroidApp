package com.androidexample.gamershub;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WallFragment extends Fragment {


    public WallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.abohosaam,container,false);
        TextView view = (TextView) rootView.findViewById(R.id.textt);
        ImageView image=(ImageView)rootView.findViewById(R.id.disImage);
        image.setImageResource(R.drawable.ic_home_white_24dp);
        view.setText("Home");
        return rootView;
    }

}
