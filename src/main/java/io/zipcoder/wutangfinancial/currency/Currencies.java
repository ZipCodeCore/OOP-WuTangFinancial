package io.zipcoder.wutangfinancial.currency;

public enum Currencies {
    USD ("United States Dollar"),
    EUR ("Euro"),
    GBP ("British Pound"),
    INR ("Indian Rupee"),
    AUD ("Australian Dollar"),
    CAD ("Canadian Dollar"),
    SGD ("Singapore Dollar"),
    CHF ("Swiss Franc"),
    MYR ("Malaysian Ringgit"),
    JPY ("Japanese Yen"),
    CNY ("Chinese Yuan");

    private final String nameOfCurrency;

    Currencies(String nameOfCurrency)
    {
        this.nameOfCurrency=nameOfCurrency;
    }

    public String nameOfCurrency(){
        return nameOfCurrency;
    }

}
