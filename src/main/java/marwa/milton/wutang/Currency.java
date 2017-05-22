package marwa.milton.wutang;

/**
 * Created by mkulima on 1/12/17.
 */
public class Currency {

    public String currencyType;
    public double currencyValue;

    public Currency(String name, double value){
        this.currencyType = name;
        this.currencyValue = value;
    }
}
