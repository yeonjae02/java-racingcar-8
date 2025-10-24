package racingcar.validation;

import java.util.List;

public class RacingCarInputChecker {
    public List<String> getPlayerNames(String input) {
        String[] names = splitString(input);
        validatePlayerNames(names);
        return List.of(names);
    }

    private void validatePlayerNames(String[] strings) {
        for (String name : strings) {
            validateName(name);
        }
    }

    private void validateName(String name) {
        if (name.trim().isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("이름이 존재하지 않거나 이름의 길이가 5를 초과합니다.");
        }
    }

    private String[] splitString(String input) {
        return input.split(",");
    }
}
