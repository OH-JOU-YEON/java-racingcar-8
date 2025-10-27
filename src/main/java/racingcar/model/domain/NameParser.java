package racingcar.model.domain;

public class NameParser {

    private final String[] parsedInput;

    public static NameParser getParsedInput(String input) {
        return new NameParser(input);
    }


    private NameParser(String input) {
        this.parsedInput = input.split(",");

    }

    public boolean nameCheck() {

        for(String word : this.parsedInput) {
            if(word.length() > 5)
                return false;
        }

        return true;
    }

    public String[] getParsedInput() {
        return parsedInput;
    }

}
