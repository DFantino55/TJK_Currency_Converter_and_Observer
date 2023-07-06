package ch.zli.tjkcurrencyconverterobserver.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ch.zli.tjkcurrencyconverterobserver.R;
import ch.zli.tjkcurrencyconverterobserver.view.MainActivity;

public class ConvertFragment extends Fragment {

    private Spinner spinnerFrom;
    private Spinner spinnerTo;
    private Button buttonCalculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.convert_fragment, container, false);

        spinnerFrom = view.findViewById(R.id.spinnerFrom);
        ArrayList<String> spinnerFromItems = new ArrayList<>();
        spinnerFromItems.add("element 1");
        spinnerFromItems.add("element 2");
        ArrayAdapter<String> adapterFrom = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_spinner_item, spinnerFromItems);
        spinnerFrom.setAdapter(adapterFrom);

        spinnerTo = view.findViewById(R.id.spinnerTo);
        ArrayList<String> spinnerToItems = new ArrayList<>();
        spinnerToItems.add("element 1");
        spinnerToItems.add("element 2");
        ArrayAdapter<String> adapterTo = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_spinner_item, spinnerToItems);
        spinnerTo.setAdapter(adapterTo);

        buttonCalculate = view.findViewById(R.id.ButtonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






        // Inflate the layout for this fragment
        return view;
    }

}