package ch.zli.tjkcurrencyconverterobserver.model;
import ch.zli.tjkcurrencyconverterobserver.service.ExchangeService;

public class ExchangeRate {
    private String from;
    private String to;

    private float min;
    private float max;

    public ExchangeRate(String from, String to){
        this.from = from;
        this.to = to;
    }

    public float getExchangeRate() {
        ExchangeService exchangeService = new ExchangeService();
        return exchangeService.exchange(from, to, 1);
    }

    public boolean checkMinPassed(){
        if (min > getExchangeRate()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMaxPassed(){
        if (max < getExchangeRate()) {
            return true;
        } else {
            return false;
        }
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }
}
