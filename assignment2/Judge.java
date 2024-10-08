package assignment2;

import java.util.List;

public class Judge {
    Compare compare = new Compare();
    public String judgement(List<Integer> computer, List<Integer> player){
        int total = compare.howMany(computer, player);
        int strike = compare.countStrike(computer, player);
        int ball = total - strike;

        if(total == 0){
            return "일치하는 숫자가 없습니다.";
        }else if(strike == 0){
            return ball + "볼";
        }else if(ball == 0){
            return strike + "스트라이크";
        }
        return ball + "볼" + strike + "스트라이크";
    }
}
