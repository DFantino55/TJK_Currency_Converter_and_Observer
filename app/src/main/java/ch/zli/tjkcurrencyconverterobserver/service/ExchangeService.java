package ch.zli.tjkcurrencyconverterobserver.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ExchangeService extends Service {
    public ExchangeService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public float exchange(String from, String to, float value) {
        float exchangeRate = 1.2f;

        return value*exchangeRate;
    }
}