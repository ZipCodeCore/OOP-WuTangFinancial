public class MainMenu extends Menu {

    private static final MainMenu INSTANCE = new MainMenu();

    protected enum menuSelections {USD, EUR, GBP, INR, AUD, CAD, SGD, CHF, MYR, JPY, CNY, E}

    public int origin;

    public MainMenu() {
        super(menuSelections.values());
    }

    @Override
    public void userSelect(String userInput) {

        switch (menuSelections.valueOf(userInput)) {
            case USD:
                origin = Currency.USD.ordinal();
                break;
            case EUR:
                origin = Currency.EUR.ordinal();
            case GBP:
                origin = Currency.GBP.ordinal();
                break;
            case INR:
                origin = Currency.INR.ordinal();
                break;
            case AUD:
                origin = Currency.AUD.ordinal();
                break;
            case CAD:
                origin = Currency.CAD.ordinal();
                break;
            case SGD:
                origin = Currency.SGD.ordinal();
                break;
            case CHF:
                origin = Currency.CHF.ordinal();
                break;
            case MYR:
                origin = Currency.MYR.ordinal();
                break;
            case JPY:
                origin = Currency.JPY.ordinal();
                break;
            case CNY:
                origin = Currency.CNY.ordinal();
                break;
            default:
                System.out.println("Error");
        }

    }

    @Override
    public void printMenuMessage() {
        System.out.println("Select the type of currency that you would like to convert from: ");
    }

    public static MainMenu getInstance() {
        return INSTANCE;
    }
}
