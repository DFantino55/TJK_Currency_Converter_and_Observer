package ch.zli.tjkcurrencyconverterobserver.view.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ch.zli.tjkcurrencyconverterobserver.R;
import ch.zli.tjkcurrencyconverterobserver.model.ExchangeRate;
import ch.zli.tjkcurrencyconverterobserver.view.RVAdapter;

public class ObserveFragment extends Fragment {

    private RecyclerView recyclerView;
    private RVAdapter myAdapter;

    private ArrayList<ExchangeRate> savedExchangeRates;
    private ArrayList<String> savedExchangeRatesString;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.observe_fragment, container, false);

        savedExchangeRates = new ArrayList<>();
        savedExchangeRatesString = new ArrayList<>();
        ExchangeRate exchangeRate1 = new ExchangeRate("CHF", "EUR");
        ExchangeRate exchangeRate2 = new ExchangeRate("CHF", "EUR");
        exchangeRate1.setMin(1.10f);
        exchangeRate1.setMax(1.20f);
        savedExchangeRates.add(exchangeRate1);
        savedExchangeRates.add(exchangeRate2);


        for (ExchangeRate item:
             savedExchangeRates) {
            savedExchangeRatesString.add(savedExchangeRates.indexOf(item), item.getTo() +
                    " --> " + item.getFrom() +
                    " min: " + item.getMin() +
                    " max: " + item.getMax()
            );
        }


        recyclerView = view.findViewById(R.id.recyclerView);
        myAdapter = new RVAdapter(savedExchangeRatesString);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));






        // Inflate the layout for this fragment
        return view;
    }

}