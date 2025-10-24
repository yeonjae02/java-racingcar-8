package racingcar.validation;

import java.util.List;

public class RacingCarInputChecker {
    public List<String> getPlayerNames(String input) {
        String[] names = splitString(input);
        validatePlayerNames(names);
        return List.of(names);
    }

    public int getPlayCount(String input) {
        int playCount = parsePlayCount(input);
        validatePlayCount(playCount);
        return playCount;
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

    private int parsePlayCount(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력된 시도 횟수가 정수가 아닙니다.");
        }
    }

    private void validatePlayCount(int playCount) {
        if (playCount <= 0) {
            throw new IllegalArgumentException("시도 횟수는 0 이하일 수 없습니다.");
        }
    }
}
