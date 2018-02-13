import java.text.DecimalFormat;

public class ExchangeMaster {



    public double usDollarRate = 1;
    public double euroRate = 0.94;
    public double britishPoundRate = 0.82;
    public double indianRupeeRate = 68.32;
    public double australianDollarRate = 1.35;
    public double canadianDollarRate = 1.32;
    public double singaporeDollarRate = 1.43;
    public double swissFrancRate = 1.01;
    public double malaysianRinggitRate = 4.47;
    public double japaneseYenRate = 115.84;
    public double chineseYuanRenminbiRate = 6.92;

    public String converter (double originalCurrencyAmount, String typeOfOriginalCurrency, String currencyToConvertTo) {
        double unformatted = (originalCurrencyAmount/rateReturner(typeOfOriginalCurrency))*rateReturner(currencyToConvertTo);
        return formatCurrency(unformatted);
    }

    public double rateReturner (String requestedRate) {
        String formattedInput = requestedRate.toLowerCase();
        if (formattedInput.equals("us dollar")) {
            return usDollarRate;
        } else if (formattedInput.equals("british pound")) {
            return britishPoundRate;
        } else if (formattedInput.equals("euro")) {
            return euroRate;
        } else if (formattedInput.equals("indian rupee")) {
            return indianRupeeRate;
        } else if (formattedInput.equals("australian dollar")) {
            return australianDollarRate;
        } else if (formattedInput.equals("canadian dollar")) {
            return canadianDollarRate;
        } else if (formattedInput.equals("singapore dollar")) {
            return singaporeDollarRate;
        } else if (formattedInput.equals("swiss franc")) {
            return swissFrancRate;
        } else if (formattedInput.equals("malaysian ringgit")) {
            return malaysianRinggitRate;
        } else if (formattedInput.equals("japanese yen")) {
            return japaneseYenRate;
        } else if (formattedInput.equals("chinese yuan renminbi")) {
            return chineseYuanRenminbiRate;
        } else {
            return usDollarRate;
        }
    }

    public String formatCurrency(double value){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formatted = decimalFormat.format(value);
        int length = formatted.length();
        if (formatted.charAt(length - 2) == '.') {
            return formatted + '0';
        } else {
            return formatted;
        }
    }

}
