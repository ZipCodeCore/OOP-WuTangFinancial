public class Main {
    public static void main(String[] args){
        Selector start = new Selector();
        start.initialCurrencySelector();
        start.secondCurrencySelector();
        start.currencyAmout();
        System.out.println(start.convertCurrencies());
    }
}
