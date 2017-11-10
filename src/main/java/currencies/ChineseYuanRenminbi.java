package currencies;

public class ChineseYuanRenminbi {
    private double yuanRenminbiValue = 6.92;

    public ChineseYuanRenminbi(){}

    public double inUSD(double yen) {
        return yen / yuanRenminbiValue;
    }

}
