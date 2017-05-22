package holland.andres.currencyconverter;

//Idea inspired from a StackOverflow post

public class RoundedResult {

    public double round (double unRoundedResult) {
        double unRoundedTimesHundred = unRoundedResult * 100;
        double roundedTimesHundred = Math.round(unRoundedTimesHundred);
        return roundedTimesHundred / 100;
    }
}
