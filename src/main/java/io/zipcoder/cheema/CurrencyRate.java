package io.zipcoder.cheema;

public enum CurrencyRate {

    US_DOLLAR (1.00),
    EURO (0.94),
    BRITISH_POUND (0.82),
    INDIAN_RUPEE (68.32),
    AUSTRALIAN_DOLLAR (1.35),
    CANADIAN_DOLLAR (1.32),
    SINGAPORE_DOLLAR (1.43),
    SWISS_FRANC (1.01),
    MALAYSIAN_RINGGIT (4.47),
    JAPANESE_YEN (115.84),
    CHINESE_YUAN_RENMINBI (6.92);

    public double dollarStandard;

    CurrencyRate(double dollarStandard){

        this.dollarStandard = dollarStandard;
    }

    public double getDollarStandard(){

        return dollarStandard;
    }
}


