package ch.zli.tjkcurrencyconverterobserver.view.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import ch.zli.tjkcurrencyconverterobserver.R;
import ch.zli.tjkcurrencyconverterobserver.view.ConvertedActivity;

public class ConvertFragment extends Fragment {

    private Spinner spinnerFrom;
    private String spinnerFromSelected;
    private Spinner spinnerTo;

    private String spinnerToSelected;

    private EditText value;
    private Button buttonCalculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.convert_fragment, container, false);

        spinnerFrom = view.findViewById(R.id.spinnerFrom);
        ArrayList<String> spinnerFromItems = new ArrayList<>();
        spinnerFromItems.add("CHF");
        spinnerFromItems.add("EUR");
        spinnerFromItems.add("USD");
        spinnerFromItems.add("Pfund");
        ArrayAdapter<String> adapterFrom = new ArrayAdapter<String>
                (view.getContext(), android.R.layout.simple_spinner_item, spinnerFromItems);
        spinnerFrom.setAdapter(adapterFrom);
        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinnerFromSelected = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerTo = view.findViewById(R.id.spinnerTo);
        ArrayList<String> spinnerToItems = new ArrayList<>();
        spinnerToItems.add("CHF");
        spinnerToItems.add("EUR");
        spinnerToItems.add("USD");
        spinnerToItems.add("Pfund");
        ArrayAdapter<String> adapterTo = new ArrayAdapter<String>
                (view.getContext(), android.R.layout.simple_spinner_item, spinnerToItems);
        spinnerTo.setAdapter(adapterTo);
        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinnerToSelected = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        value = view.findViewById(R.id.value);

        buttonCalculate = view.findViewById(R.id.ButtonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ConvertedActivity.class);
                intent.putExtra("from", spinnerFromSelected);
                intent.putExtra("to", spinnerToSelected);
                intent.putExtra("value", Float.valueOf(value.getText().toString()));
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}