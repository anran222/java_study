package java0521;

/**
 * @Author:xiang
 * @Date:2020/5/21 21:49
 * 521
 */
class Girl{
    String name;
    String height;
    int weight;
    String habby;
    public Girl(String name, String height, int weight, String habby) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.habby = habby;
    }
    public void say(){
        System.out.println("I LOVE YOU!");
    }
}
class Boy{
    String name;
    String height;
    int weight;
    String habby;

    public Boy(String name, String height, int weight, String habby) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.habby = habby;
    }
    public void say(){
        System.out.println("I LOVE YOU TOO!");
    }
}
public class special {
    public static void main(String[] args) {
        Girl girl=new Girl("xxx","165cm",92,"play");
        Boy boy=new Boy("yyy","172cm",120,"play");
        System.out.println("一个名叫"+girl.name+",体重"+girl.weight+",身高"+girl.height+",喜欢"+girl.habby+"的女孩对男孩说：");
        girl.say();
        System.out.println("一个名叫"+boy.name+",体重"+boy.weight+",身高"+boy.height+",喜欢"+boy.habby+"的男孩回答：");
        boy.say();
    }
}
