package racingcar.controller;

import java.util.ArrayList;
import racingcar.domain.Car;
import racingcar.domain.RacingCarGame;
import racingcar.validation.RacingCarInputChecker;
import racingcar.view.RacingCarInput;
import java.util.List;
import racingcar.view.RacingCarOutput;

public class RacingGameController {
    private final RacingCarInputChecker checker;

    public RacingGameController() {
        this.checker = new RacingCarInputChecker();
    }

    public void run() {
        List<String> carNames = getValidatedNames();
        int playCount = getValidatedPlayCount();
        RacingCarGame game = createGame(carNames);
        runGame(game, playCount);
    }

    private List<String> getValidatedNames() {
        String nameInput = RacingCarInput.getPlayerNames();
        return checker.getPlayerNames(nameInput);
    }

    private int getValidatedPlayCount() {
        String countInput = RacingCarInput.getPlayCount();
        return checker.getPlayCount(countInput);
    }

    private RacingCarGame createGame(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name, 0));
        }
        return new RacingCarGame(cars);
    }

    private static void runGame(RacingCarGame game, int playCount) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < playCount; i++) {
            game.playRound();
            RacingCarOutput.printRoundResult(game.getCars());
            System.out.println();
        }
        RacingCarOutput.printWinners(game.getWinners());
    }
}