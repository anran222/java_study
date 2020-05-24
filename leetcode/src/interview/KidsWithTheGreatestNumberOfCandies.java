package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/5/24 22:22
 * 拥有最多糖果的孩子
 */
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for (int i = 0; i <candies.length ; i++) {
            if (candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> result=new ArrayList<>();
        for (int i = 0; i <candies.length ; i++) {
            if (candies[i]+extraCandies>=max){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}
