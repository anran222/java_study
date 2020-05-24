package interview;

/**
 * @Author:xiang
 * @Date:2020/5/24 22:46
 * 猜数字
 */
public class GuessNumber {
    public static void main(String[] args) {
        int[] guess={1,2,3};
        int[] answer={3,2,1};
        System.out.println(game(guess,answer));
    }

    public static int game(int[] guess, int[] answer) {
        int count=0;
        for (int i = 0; i <guess.length ; i++) {
            if (guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }
}
