package qiu.linda.wutangfinancial;

public enum Currency {

    USA_DOLLAR(1.00),
    EU_EURO(.94),
    BRITISH_POUND(.82),
    INDIAN_RUPEE(68.32),
    AUSTRALIAN_DOLLAR(1.35),
    CANADIAN_DOLLAR(1.32),
    SINGAPORE_DOLLAR(1.43),
    SWISS_FRANC(1.01),
    MALAYSIAN_RINGGIT(115.84),
    JAPANESE_YEN(115.84),
    CHINESE_YUAN_RENMINBI(6.92);

    private final Double rateToDollar;

    Currency(Double rateToDollar){

        this.rateToDollar = rateToDollar;
    }

    //methods

    public double toDollar(double amount){
        return amount/rateToDollar;
    }

    public double getConversionRate(){
        return rateToDollar;
}


}
