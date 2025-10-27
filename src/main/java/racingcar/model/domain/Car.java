package racingcar.model.domain;

public class Car {

    private final String name;

    private int moveCount;

    public static Car createCar(String name) {

        return new Car(name);
    }

    private Car(String name) {

        this.name = name;
    }

   public int getMaxMoveCount(int max) {

        if(max <= this.moveCount)
            max = this.moveCount;

        return max;
    }

    public String getWinnerName(int winnersMoveCount) {

        if(this.moveCount == winnersMoveCount)
            return this.name;
        else
            return "";
    }

    private String printMoveCount() {

        StringBuilder nameAndMoveCount = new StringBuilder(name + " : ");

        nameAndMoveCount.append("-".repeat(Math.max(0, moveCount)));

        return nameAndMoveCount.toString();
    }

    public void carMove() {

        if(RandomNumberGenerate.generateRandomNumZeroToTen() >= 4 )
            ++this.moveCount;
    }

    @Override
    public String toString() {

        return this.printMoveCount();
    }

}
