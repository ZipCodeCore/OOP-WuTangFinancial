import java.text.DecimalFormat;

public class ConversionCalculator {

    public ConversionCalculator() {}

    public String convert(Double amount, Currency origin, Currency exchange) {
        double rate = exchange.getRate()/origin.getRate();
        return formatDecimals(amount * rate);
    }

    private static String formatDecimals(Double toFormat) {
//        return String.format("%.2d", toFormat.toString());
        DecimalFormat formatter = new DecimalFormat();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        return formatter.format(toFormat);
    }

}
