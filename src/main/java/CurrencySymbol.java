public enum CurrencySymbol {
    US_DOLLAR("$"),
    EURO("€"),
    BRITISH_POUND("£"),
    INDIAN_RUPEE("₹"),
    AUSTRALIAN_DOLLAR("AUD"),
    CANADIAN_DOLLAR("CAD"),
    SINGAPORE_DOLLAR("SGD"),
    SWISS_FRANC("CHF"),
    MALAYSIAN_RINGGIT("RM"),
    JAPANESE_YEN("¥"),
    CHINESE_YUAN_RENMINBI("CNY");

    private final String symbol;

    CurrencySymbol(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
