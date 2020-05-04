package interview;

/**
 * @Author:xiang
 * @Date:2020/5/4 22:48
 *  旋转数组的最小数字
 */
public class MinimumNumberOfRotationArray {
    public static void main(String[] args) {
        int[] numbers={2,2,2,0,1};
        System.out.println(minArray(numbers));
    }

    public static int minArray(int[] numbers) {
        int size=numbers.length;
        if (size==0){
            return 0;
        }
        if (size==1){
            return numbers[0];
        }
        int left=0;
        int right=size-1;
        int min=numbers[0];
        while (left<right){
            if ((numbers[left]>numbers[left+1])||(numbers[right]<numbers[right-1])) {
                min = Math.min(min, numbers[left + 1]);
                min = Math.min(min, numbers[right]);
                break;
            }
            left++;
            right--;
            }
        return min;
        }
    }
