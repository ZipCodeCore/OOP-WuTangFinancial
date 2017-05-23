package com.zipcode;

/**
 * Created by vidyachandasekhar on 5/22/17.
 */

/*
 Us Dollar| 1.00 |
| Euro                  | 0.94 |
| British Pound         | 0.82  |
| Indian Rupee          | 68.32 |
| Australian Dollar	    |	1.35|
| Canadian Dollar       | 1.32 |
| Singapore Dollar      | 1.43 |
| Swiss Franc           | 1.01 |
| Malaysian Ringgit     | 4.47  |
| Japanese Yen          | 115.84 |
| Chinese Yuan Renminbi | 6.92   |
 */
public enum CurrencyEnum {
    USD(1),
    EURO(0.94),
    POUND(0.82),
    RUPEE(68.32),
    AUSTRALIAN_DOLLAR(1.35),
    CAD_DOLLAR(1.32),
    SINGAPORE_DOLLAR(1.43),
    SWISS_FRANK(1.01),
    RINGGIT(4.47),
    JAPANESE_YEN(115.84),
    CHINESE_YUAN(6.92);

    private double conversionRate;

    CurrencyEnum(double conversionRate) {
        this.conversionRate = conversionRate;
    }


    public double getConversionRate() {
        return conversionRate;
    }

}
