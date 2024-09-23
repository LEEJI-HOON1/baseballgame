package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Error {
    private Scanner scanner = new Scanner(System.in);

    public List<Integer> playerNumber() {
        String input = "";
        boolean isValid = false;

        // 유효한 입력값이 나올 때까지 반복
        while (!isValid) {
            try {
                System.out.println("숫자를 입력하세요 (서로 다른 3자리 숫자):");
                input = scanner.nextLine();

                // 입력 길이가 3이 아닌 경우 예외 발생
                if (input.length() != 3) {
                    throw new IllegalArgumentException("3자리 숫자가 아닙니다.");
                }

                // 입력에 숫자가 아닌 문자가 포함되어 있으면 예외 발생
                for (char c : input.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        throw new IllegalArgumentException("숫자가 아닌 문자가 포함되어 있습니다.");
                    }
                }

                // 유효한 입력이면 플래그 변경
                isValid = true;

            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 문자를 입력하셨습니다. 다시 입력해주세요.");
            }
        }

        // 입력된 문자열을 정수 리스트로 변환해서 반환
        return convertStringToList(input);
    }

    // 문자열을 List<Integer>로 변환하는 메서드
    private List<Integer> convertStringToList(String input) {
        List<Integer> numbers = new ArrayList<>();
        for (char c : input.toCharArray()) {
            numbers.add(Character.getNumericValue(c));  // 문자형 숫자를 정수로 변환 후 리스트에 추가
        }
        return numbers;
    }
}
