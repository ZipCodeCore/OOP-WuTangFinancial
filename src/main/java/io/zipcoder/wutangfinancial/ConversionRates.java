package io.zipcoder.wutangfinancial;

public enum ConversionRates {
    USDOLLAR(1, "US Dollar"),
    EURO(0.94, "Euro"),
    BRITISHPOUND(0.82, "British Pound"),
    INDIANRUPEE(68.32, "Indian Rupee"),
    AUSTRALIANDOLLAR(1.35, "Australian Dollar"),
    CANADIANDOLLAR(1.32, "Canadian Dollar"),
    SINGAPOREDOLLAR(1.43, "Singapore Dollar"),
    SWISSFRANC(1.01, "Swiss Franc"),
    MALAYSIANRINGGIT(4.47, "Malaysian Ringgit"),
    JAPANESEYEN(115.84, "Japanese Yen"),
    CHINESEYUANRENMINIBI(6.92, "Chinese Yuan Renminbi");


    private final double conversionRate;
    private final String name;

    ConversionRates(double conversionRate, String name){
        this.conversionRate = conversionRate;
        this.name = name;
    }

    public double getConversionRate(){
        return this.conversionRate;
    }

    public String getName() {
        return name;
    }
}
