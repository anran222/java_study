package zuoye.list3;

/**
 * @Author:xiang
 * @Date:2020/5/13 22:58
 * 将数组分成和相等的三个部分
 */
public class partitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        int[] A={0,2,1,-6,6,7,9,-1,2,0,1};
        System.out.println(canThreePartsEqualSum(A));
    }

    public static boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for (int i = 0; i <A.length ; i++) {
            sum+=A[i];
        }
        int num=0;
        if (sum%3!=0){
            return false;
        }else {
            num=sum/3;
        }
        int left=0;
        int leftsum=A[left];
        int right=A.length-1;
        int rightsum=A[right];
        while (left+1<right){
            if (leftsum==num&&rightsum==num){
                return true;
            }
            if (leftsum!=num){
                leftsum+=A[++left];
            }
            if (rightsum!=num){
                rightsum+=A[--right];
            }
        }
        return false;
    }
}
