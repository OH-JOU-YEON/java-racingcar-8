package racingcar.controller;

import racingcar.model.domain.CarRace;
import racingcar.model.domain.NameParser;
import racingcar.view.NameView;

public class RacingCarController {

    //전체적인 흐름 제어. 메인에 프로그램 노출

    public void RacingCar() {

        NameView nameView = new NameView();

        String input = nameView.getCarName();

        NameParser carNames = NameParser.getParsedInput(input);

        boolean namesFormatRightOrNot = carNames.nameCheck();


        if(!namesFormatRightOrNot) {
            throw  new IllegalArgumentException("이름 입력이 잘못됐습니다.");
        }

        int racingCount = nameView.getRacingCount();

        CarRace.holdCarRacing(carNames.getParsedInput(), racingCount);

    }

}
