package racingcar.model.domain;

public class InputParser {

    private final String[] parsedInput;

    public static InputParser getParsedInput(String input) {
        return new InputParser(input);
    }


    private InputParser(String input) {
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
