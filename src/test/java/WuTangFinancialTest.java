import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WuTangFinancialTest {
    double initial;

    @Before
    public void setup(){
       initial = 10.00;
    }


    @Test
    public void DollarToEuro(){

        double expected = 9.40;
        double actual = (WuTangFinancial.multiplyByCurrencyWanted(initial, "USD", "Euro"));
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void EuroToDollar(){

        double expected = 10.63;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "Euro", "USD");
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void EuroToBritishPound(){

        double expected = 8.72;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "Euro", "Pound");
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void BritishPoundToIndianRupee(){

        double expected = 833.17;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "Pound", "Rupee");
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void RupeeToCanadianDollar(){

        double expected = 0.193;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "Rupee", "CAD");
        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void CanadianDollarToSingaporeDollar(){

        double expected = 10.83;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "CAD", "SingaporeDollar");
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void SingaporeDollarToSwissFranc(){

        double expected = 7.06;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "SingaporeDollar", "SwissFranc");
        Assert.assertEquals(expected, actual, 0.01);
    }
     @Test
    public void SwissFrancToMalaysianRinggit(){

        double expected = 44.25;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "SwissFranc", "MalaysianRinggit");
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void MalaysianRinggitToJapaneseYen(){

        double expected = 259.14;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "MalaysianRinggit", "Yen");
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbi(){

        double expected = 0.59;
        double actual = WuTangFinancial.multiplyByCurrencyWanted(initial, "Yen", "ChineseYuanRenminbi");
        Assert.assertEquals(expected, actual, 0.01);
    }


}
