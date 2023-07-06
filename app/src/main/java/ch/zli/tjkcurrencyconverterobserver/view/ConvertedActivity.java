package ch.zli.tjkcurrencyconverterobserver.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ch.zli.tjkcurrencyconverterobserver.R;

public class ConvertedActivity extends AppCompatActivity {
    private TextView valueFrom;
    private TextView valueTo;

    private Button backToConverter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converted);

        valueFrom =  findViewById(R.id.valueFrom);
        valueTo = findViewById(R.id.valueTo);
        backToConverter = findViewById(R.id.backToConverter);

        backToConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        intent = getIntent();

        valueFrom.setText(intent.getStringExtra("value") + " " + intent.getStringExtra("from"));
        valueTo.setText("y" + " " + intent.getStringExtra("to"));


    }
}