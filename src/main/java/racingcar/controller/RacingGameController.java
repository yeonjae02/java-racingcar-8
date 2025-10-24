package racingcar.controller;

import racingcar.validation.RacingCarInputChecker;
import racingcar.view.RacingCarInput;
import java.util.List;

public class RacingGameController {
    private final RacingCarInputChecker checker;

    public RacingGameController() {
        this.checker = new RacingCarInputChecker();
    }

    public void run() {
        List<String> carNames = getValidatedNames();
        int playCount = getValidatedPlayCount();
    }

    private List<String> getValidatedNames() {
        String nameInput = RacingCarInput.getPlayerNames();
        return checker.getPlayerNames(nameInput);
    }

    private int getValidatedPlayCount() {
        String countInput = RacingCarInput.getPlayCount();
        return checker.getPlayCount(countInput);
    }

}