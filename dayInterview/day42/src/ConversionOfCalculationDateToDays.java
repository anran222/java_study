import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/19 21:55
 * 计算日期到天数的转换
 */
public class ConversionOfCalculationDateToDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            System.out.println(iConverDateToDay(year,month,day));
        }
    }

    public static int iConverDateToDay(int year,int month,int day){
        if (year<0||month>12||month<0||day<0||day>31){
            return -1;
        }
        int month2=28;
        if ((year%4==0&&year%100!=0)||(year%400==0)){
            month2=29;
        }
        int num=0;
        switch (month){
            case 1:
                num=day;
                break;
            case 2:
                num=day+31;
                break;
            case 3:
                num=day+month2+31;
                break;
            case 4:
                num=day+month2+31+31;
                break;
            case 5:
                num=day+month2+31+31+30;
                break;
            case 6:
                num=day+month2+31+31+30+31;
                break;
            case 7:
                num=day+month2+31+31+30+31+30;
                break;
            case 8:
                num=day+month2+31+31+30+31+30+31;
                break;
            case 9:
                num=day+month2+31+31+30+31+30+31+31;
                break;
            case 10:
                num=day+month2+31+31+30+31+30+31+31+30;
                break;
            case 11:
                num=day+month2+31+31+30+31+30+31+31+30+31;
                break;
            case 12:
                num=day+month2+31+31+30+31+30+31+31+30+31+30;
                break;
        }
        return num;
    }
}
