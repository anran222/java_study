package interview19;
/*
 *@Author:anran
 *@Date:2020/9/25
 *@Version 1.0
 * 旋转密码
 */

public class Solution2 {
    public static void main(String[] args) {
        String[] s1={"1101","1010","1111","1110"};
        String[] s2={"ABCD","EFGH","IJKL","MNPQ"};
        System.out.println(rotatePassword(s1,s2));

    }

    public static String rotatePassword (String[] s1, String[] s2) {
        int len=s1.length;
        int[][] array=new int[len][len];
        char[][] array1=new char[len][len];
        int num=0;
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len ; j++) {
                    array[i][j] = s1[num].charAt(j)-48;
            }
            num++;
        }
        int num2=0;
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len ; j++) {
                array1[i][j]=s2[num2].charAt(j);
            }
            num2++;
        }
        int count=4;
        StringBuilder sb=new StringBuilder();
        int[][] array2=new int[len][len];
        while (count>0){
            for (int i = 0; i <len ; i++) {
                for (int j = 0; j <len ; j++) {
                    if (array[i][j]==0){
                        sb.append(array1[i][j]);
                    }
                }
            }
            int k=0;
            for (int i = len-1; i >=0 ; i--) {
                for (int j = 0; j <len ; j++) {
                    array2[j][i]=array[k][j];
                }
                k++;
            }
            for (int i = 0; i <len ; i++) {
                for (int j = 0; j <len ; j++) {
                    int temp=array[i][j];
                    array[i][j]=array2[i][j];
                    array2[i][j]=temp;
                }
            }
            count--;
        }
        return new String(sb);
    }
}
