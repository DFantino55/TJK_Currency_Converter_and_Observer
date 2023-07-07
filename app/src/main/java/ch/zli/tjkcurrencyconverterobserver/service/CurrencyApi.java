package ch.zli.tjkcurrencyconverterobserver.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class CurrencyApi extends Service {
    public CurrencyApi() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public float getExchangerate(String from) throws IOException {

        /* Doesnt Work

        String apiKey = "58a512c9dae9cc8dd8e78512";

        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+from;

        // Making Request
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

// Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

// Accessing object
        String req_result = jsonobj.get("result").getAsString();
    }
         */

        int min = 1;
        int max = 2;

        Random r = new Random();
        double random = min + r.nextDouble() * (max - min);

        float exchangeRate = min + r.nextFloat() * (max - min);

        return exchangeRate;
    }
}