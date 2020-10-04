package day46;
/*
 *@Author:anran
 *@Date:2020/10/4
 *@Version 1.0
 * 二叉搜索树的后序遍历序列
 */

public class Solution1 {
    public static boolean verifyPostorder(int[] postorder) {
        return helper(postorder,0,postorder.length-1);
    }

    public static boolean helper(int[] array,int left,int right){
        if (left>=right){
            return true;
        }
        int p=left;
        int root=array[right];
        while (array[p]<root){
            p++;
        }
        int mid=p;
        while (mid<right){
            if (array[mid++]<root){
                return false;
            }
        }
        return helper(array,left,p-1)&&helper(array,p,right-1);
    }

    public static void main(String[] args) {
        int[] postorder={1,6,3,2,5};
        System.out.println(verifyPostorder(postorder));
    }
}
