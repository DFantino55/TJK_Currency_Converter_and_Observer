package ch.zli.tjkcurrencyconverterobserver.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ch.zli.tjkcurrencyconverterobserver.R;

public class ConvertFragment extends Fragment {

    private Spinner spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.convert_fragment, container, false);


        List<String> spinnerOptions = new ArrayList<>();
        spinnerOptions.add("Option 1");
        spinnerOptions.add("Option 1");
        spinnerOptions.add("Option 1");
        spinnerOptions.add("Option 1");



        // Inflate the layout for this fragment
        return view;
    }

}