package interview;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:xiang
 * @Date:2020/4/18 22:22
 * 快乐数
 */
public class HappinessNumber {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            n=sum(n);
        }
        if (n==1){
            return true;
        }else {
            return false;
        }
    }

    public static int sum(int n){
        int sum=0;
        while (n>0){
            int num=n%10;
            n=n/10;
            sum+=num*num;
        }
        return sum;
    }
}
