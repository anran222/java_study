package interview;

/**
 * @Author:xiang
 * @Date:2020/5/24 22:39
 * 在既定时间做作业的学生人数
 */
public class NumbersOfStudentDoingHomework {
    public static void main(String[] args) {
        int[] startTime={1,2,3};
        int[] endTime={3,2,7};
        System.out.println(busyStudent(startTime,endTime,4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for (int i = 0; i <startTime.length ; i++) {
            if (startTime[i]<=queryTime&&endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }
}
