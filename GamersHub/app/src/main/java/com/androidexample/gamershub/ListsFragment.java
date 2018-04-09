package com.androidexample.gamershub;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListsFragment extends Fragment {


    public ListsFragment() {
        // Required empty public constructor
    }
    public static ListsFragment newInstance() {
        ListsFragment fragment = new ListsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.abohosaam,container,false);
        TextView view = (TextView) rootView.findViewById(R.id.textt);
        view.setText("List");
        return rootView;
    }

}
