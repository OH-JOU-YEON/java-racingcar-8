package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String getCarName() {
        //입력을 받음
        String carNameComment = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
        System.out.println(carNameComment);
        return Console.readLine();
    }

    public Integer getRacingCount() {
        String racingCountComment = "시도할 횟수는 몇 회인가요?";
        System.out.println(racingCountComment);
        return Integer.parseInt(Console.readLine());
    }

}
