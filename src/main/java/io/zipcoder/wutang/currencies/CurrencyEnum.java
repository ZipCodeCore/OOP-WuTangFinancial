package io.zipcoder.wutang.currencies;

public enum CurrencyEnum {
    AUD,
    CAD,
    CHF,
    CNY,
    EUR,
    GBP,
    INR,
    JPY,
    SGD,
    USD;

    public Currency getCurrencyOfType(){

        switch(this){
            case AUD: return new AUD();
            case CAD: return new CAD();
            case CHF: return new CHF();
            case CNY: return new CNY();
            case EUR: return new EUR();
            case GBP: return new GBP();
            case INR: return new INR();
            case JPY: return new JPY();
            case SGD: return new SGD();
            case USD: return new USD();
        }
        return null;
    }




}
