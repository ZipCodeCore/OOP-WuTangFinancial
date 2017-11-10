package kozulak.elliott;


public enum CurrencyNames {
    US_DOLLAR("USD"), EURO("EUR"), BRITISH_POUND("GBP"),INDIAN_RUPEE("INR"), AUSTRALIAN_DOLLAR("AUD"), CANADIAN_DOLLAR("CAD"),
    SINGAPORE_DOLLAR("SGD"), SWISS_FRANC("CHF"), MALAYSIAN_RINGGIT("MYR"),JAPANESE_YEN("JPY"), CHINESE_YUAN_RENMINBI("CNY");

    private String abbreviation;

    CurrencyNames(String abbreviation){
        this.abbreviation=abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

}
