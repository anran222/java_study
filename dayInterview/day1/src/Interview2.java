/**
 * @Author:xiang
 * @Date:2020/6/1 18:41
 * 寻找第k大
 */
public class Interview2 {
    public static void main(String[] args) {
    }

    public static int findKth(int[] a, int n, int K) {
        int temp=n-quick_sort(a)+1;
        if (K==temp){
            return a[temp];
        }else if (K<temp){
            return findKth(a,temp-1,K);
        }else {
            return findKth(a,temp+1,K);
        }
    }

    public static int quick_sort(int[] a){
        int low=0;
        int right=a.length-1;
        int key=low;
        while (low<right){
            while (low<right&&a[low]<=key){
                low++;
                a[right]=a[low];
            }
            while (low<right&&a[right]>=key){
                right--;
                a[low]=a[right];
            }
            a[low]=key;
        }
        return low;
    }
}
