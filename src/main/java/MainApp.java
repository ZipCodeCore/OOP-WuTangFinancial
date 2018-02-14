public class MainApp {
    public static String s;
    public static String o;

    public static void main(String[] args) {
        Exchange convert = new Exchange(50);
      float s = convert.getAmount();
        convert.printConvertedMoney(convert.conversion(s,convert.US_DOLLAR, convert.EURO));
        convert.printConvertedMoney(convert.conversion(s,convert.EURO, convert.US_DOLLAR));
        convert.printConvertedMoney(convert.conversion(s,convert.EURO, convert.BRITISH_POUND));
        convert.printConvertedMoney(convert.conversion(s,convert.BRITISH_POUND, convert.INDIAN_RUPEE));
        convert.printConvertedMoney(convert.conversion(s,convert.INDIAN_RUPEE, convert.CANADIAN_DOLLAR));
        convert.printConvertedMoney(convert.conversion(s,convert.SINGAPORE_DOLLAR, convert.Swiss_FRANC));
        convert.printConvertedMoney(convert.conversion(s,convert.MALAYSIAN_RINGGIT, convert.JAPANESE_YEN));
        convert.printConvertedMoney(convert.conversion(s,convert.JAPANESE_YEN, convert.CHINESE_YUAN_RENMINBI));
        convert.printConvertedMoney(convert.conversion(s,convert.JAPANESE_YEN, convert.CHINESE_YUAN_RENMINBI));

    }
}
