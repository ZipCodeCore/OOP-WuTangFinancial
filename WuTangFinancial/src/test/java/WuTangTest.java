/**
 * Created by eugenevendensky on 1/13/17.
 */


import org.junit.Test;


public class WutangTest {

    @Test
    public void WutangTest(){
    WuTang wuTang = new WuTang();
    Double expected = .94;
    Double actual = WuTang.euroToDollar;
}}



/*

public class TurntEngineTest {

    TurntEngine turntEngine;

    @Before
    public void setUp(){
        turntEngine = new TurntEngine();
    }

    @Test
    public void getTurntLevelTest(){
        Double expected = 1.0;
        Double actual = turntEngine.getTurntLevel();
        assertEquals("I expect that the turnt level will be 1.0",expected,actual);
    }

    @Test
    public void setTurntLevelTest(){
        Double expected = 5.0;
        turntEngine.setTurntLevel(5.0);
        Double actual = turntEngine.getTurntLevel();
        assertEquals("I expect that the turnt level will be 5.0",expected,actual);

    }

    @Test
    public void isLitTest(){
        Boolean actual = turntEngine.isLit();
        assertTrue("Should be equal to true", actual);
    }

 */