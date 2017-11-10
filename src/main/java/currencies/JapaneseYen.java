package currencies;

public class JapaneseYen {

    private double japaneseYenValue = 115.84;

    public JapaneseYen(){}

    public double inUSD(double yen) {
        return yen / japaneseYenValue;
    }

    public double convertToYuanRenminbi(double yen){
        double yenInUSD = inUSD(yen);
        return yenInUSD * 6.92;
    }

    public double getJapaneseYenValue() {
        return japaneseYenValue;
    }
}
