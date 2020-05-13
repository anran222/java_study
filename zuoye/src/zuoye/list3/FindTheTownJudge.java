package zuoye.list3;

/**
 * @Author:xiang
 * @Date:2020/5/9 21:49
 * 找到小镇的法官
 */
public class FindTheTownJudge {
    public static void main(String[] args) {
        int[][] trust={{1,3},{2,3}};
        System.out.println(findJudge(3,trust));
    }

    public static int findJudge(int N, int[][] trust) {
        int[] num1=new int[N+2];
        int[] num2=new int[N+2];
        for (int i = 1; i <=N ; i++) {
            num1[i]=0;
            num2[i]=0;
        }
        for (int[] a:trust) {
            num1[a[0]]++;
        }
        for (int[] b:trust) {
            num2[b[1]]++;
        }
        for (int i = 1; i <=N ; i++) {
            if (num1[i]==0&&num2[i]==N-1){
                return i;
            }
        }
        return -1;
    }
}
