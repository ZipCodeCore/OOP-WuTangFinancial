package kozulak.elliott;

public class Currency {
    private double conversionRate;
    private String abbreviation;

    public Currency( String abbreviation,double conversionRate){
        this.conversionRate=conversionRate;
        this.abbreviation=abbreviation;
    }

    public Double convertToDollar(double amount){
        return amount/conversionRate;
    }

    public Double getConversionRate(){
        return conversionRate;
    }
    public String getAbbreviation(){
        return abbreviation;
    }

}
