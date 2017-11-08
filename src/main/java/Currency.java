public enum Currency {
    USD(1.00,"US Dollar"),EUR(.94,"Euro"),GBP(.82,"British Pound"),
    INR(68.32,"Indian Rupee"),AUD(1.35,"Australian Dollar"),
    CAD(1.32,"Canadian Dollar"),SGD(1.43,"Singapore Dollar"),
    CHF(1.01,"Swiss Franc"),MYR(4.47,"Malaysian Ringgit"),
    JPY(115.84,"Japanese Yen"),CNY(6.92,"Chinese Yuan Renminbi");

    private double rate;
    private String fullName;

    Currency(double rate, String name){
        this.rate = rate;
        this.fullName = name;
    }

    public String getFullName(){
        return fullName;
    }

    public double getRate(){
        return rate;
    }
}
