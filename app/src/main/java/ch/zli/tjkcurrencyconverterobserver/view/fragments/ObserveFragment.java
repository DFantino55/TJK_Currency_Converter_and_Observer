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

        // Hardcoded the Saved Exchange Rates
        ExchangeRate exchangeRate1 = new ExchangeRate
                ("CHF", "EUR", 1.2f, 1.4f);
        ExchangeRate exchangeRate2 = new ExchangeRate
                ("CHF", "USD", 1.3f, 1.5f);
        ExchangeRate exchangeRate3 = new ExchangeRate
                ("CHF", "Pfund", 1.1f, 1.6f);
        ExchangeRate exchangeRate4 = new ExchangeRate
                ("EUR", "CHF", 1.4f, 1.9f);
        ExchangeRate exchangeRate5 = new ExchangeRate
                ("EUR", "USD", 1.3f, 1.8f);
        ExchangeRate exchangeRate6 = new ExchangeRate
                ("EUR", "Pfund", 1.2f, 1.7f);
        ExchangeRate exchangeRate7 = new ExchangeRate
                ("USD", "CHF", 1.1f, 1.8f);
        ExchangeRate exchangeRate8 = new ExchangeRate
                ("USD", "EUR", 1.4f, 1.6f);
        ExchangeRate exchangeRate9 = new ExchangeRate
                ("USD", "Pfund", 1.2f, 1.7f);
        savedExchangeRates.add(exchangeRate1);
        savedExchangeRates.add(exchangeRate2);
        savedExchangeRates.add(exchangeRate3);
        savedExchangeRates.add(exchangeRate4);
        savedExchangeRates.add(exchangeRate5);
        savedExchangeRates.add(exchangeRate6);
        savedExchangeRates.add(exchangeRate7);
        savedExchangeRates.add(exchangeRate8);
        savedExchangeRates.add(exchangeRate9);

        for (ExchangeRate item:
             savedExchangeRates) {
            savedExchangeRatesString.add(savedExchangeRates.indexOf(item), item.getFrom() +
                    " --> " + item.getTo() +
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