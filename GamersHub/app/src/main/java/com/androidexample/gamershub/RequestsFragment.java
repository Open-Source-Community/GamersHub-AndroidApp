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
public class RequestsFragment extends Fragment {


    public RequestsFragment() {
        // Required empty public constructor
    }
    public static RequestsFragment newInstance() {
        RequestsFragment fragment = new RequestsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.abohosaam,container,false);
        //delete when implenting
        ImageView image=(ImageView)rootView.findViewById(R.id.disImage);
        image.setImageResource(R.drawable.ic_notifications_white_24dp);
        TextView view = (TextView) rootView.findViewById(R.id.textt);
        view.setText("Requests");
        return rootView;
    }

}
