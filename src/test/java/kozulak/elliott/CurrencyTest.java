package kozulak.elliott;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyTest {

    @Test
    public void EurosTest() throws Exception {
        double expected =1.00;
        double actual =Currency.EURO.toDollar(.94);
    }

    @Test
    public void BRITISH_POUNDTest() throws Exception {
        double expected =1.00;
        double actual =Currency.BRITISH_POUND.toDollar(0.82);
    }
    @Test
    public void INDIAN_RUPEETest() throws Exception {
        double expected =1.00;
        double actual =Currency.INDIAN_RUPEE.toDollar(68.32);
    }
    @Test
    public void AUSTRALIAN_DOLLARTest() throws Exception {
        double expected =1.00;
        double actual =Currency.AUSTRALIAN_DOLLAR.toDollar(1.35);
    }
    @Test
    public void CANADIAN_DOLLARTest() throws Exception {
        double expected =1.00;
        double actual =Currency.CANADIAN_DOLLAR.toDollar(1.32);
    }
    @Test
    public void SINGAPORE_DOLLARTest() throws Exception {
        double expected =1.00;
        double actual =Currency.SINGAPORE_DOLLAR.toDollar(1.43);
    }
    @Test
    public void SWISS_FRANCTest() throws Exception {
        double expected =1.00;
        double actual =Currency.SWISS_FRANC.toDollar(1.01);
    }
    @Test
    public void MALAYSIAN_RINGGITTest() throws Exception {
        double expected =1.00;
        double actual = Currency.MALAYSIAN_RINGGIT.toDollar(4.47);
    }
    @Test
    public void JAPANESE_YENTest() throws Exception {
        double expected =1.00;
        double actual = Currency.JAPANESE_YEN.toDollar(115.84);
    }
    @Test
    public void CHINESE_YUAN_RENMINBITest() throws Exception {
        double expected =1.00;
        double actual = Currency.CHINESE_YUAN_RENMINBI.toDollar(6.92);
    }

}