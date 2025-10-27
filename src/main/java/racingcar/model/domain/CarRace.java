package racingcar.model.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CarRace {

    private final List<Car> contestantList;

    private String winnersName;

    public static CarRace holdCarRacing(String[] contestantNames, int racingMoveCount) {
        return new CarRace(contestantNames,racingMoveCount);
    }


    private CarRace(String[] contestantNames,int racingMoveCount) {

        this.contestantList = getContestantListByName(contestantNames);

        for(int i = 0; i < racingMoveCount; i++) {

            racingProgress();
        }

        System.out.println(this);

    }


    private void racingProgress() {

        for(Car car : this.contestantList) {
            car.carMove();
            System.out.println(car);
        }
        System.out.println();
    }

    private List<Car> getContestantListByName(String[] contestantNames) {

        List<Car> carList = new ArrayList<>();

        for(String name : contestantNames) {
            carList.add(Car.createCar(name));
        }

        return carList;
    }

    private int winnersMoveCount() {

        int max = 0;

        for(Car car : contestantList) {
            max = car.getMaxMoveCount(max);
        }

        return max;
    }


    private String getWinnersName(int winnersMoveCount) {

        StringJoiner winnerNames = new StringJoiner(",");

        for(Car car : contestantList) {

            if(!car.getWinnerName(winnersMoveCount).isEmpty())
                winnerNames.add(car.getWinnerName(winnersMoveCount));
        }

        return winnerNames.toString();

    }

    @Override
    public String toString(){

        return "최종 우승자 : " + getWinnersName(this.winnersMoveCount());
    }

}
