package assignment2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomNum randomNum = new RandomNum();
        Judge judge = new Judge();
        Playagain playagain = new Playagain();
        boolean again = true;

        // Error 객체를 생성
        Error error = new Error();

        while (again) {
            List<Integer> computer = randomNum.create();
            String result = "";

            // Error 클래스의 playerNumber() 메서드를 사용하여 올바른 숫자를 입력받음
            while (!result.equals("3스트라이크")) {
                result = judge.judgement(computer, error.playerNumber());
                System.out.println(result);
            }

            again = playagain.playagain();
        }
    }
}
