package java15_0325;
/*
 *@Author:anran
 *@Date:2020/8/25
 *@Version 1.0
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//这是一张牌
class Card{
    private String rank;//点数
    private String suit;//花色

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "["+this.suit+this.rank+"]";
    }
}

public class Poker {
    public static void main(String[] args) {
        //1、创建一副牌
        List<Card> poker=buyPoker();
        //2、洗牌，最简单的方法，直接使用Collections.shuffle方法
        //把poker中的顺序打乱
        Collections.shuffle(poker);
        //3、发牌，假设有三个玩家，没人发5张牌
        //每个玩家就是一个list，就可以把每个人的手牌放到List中
        //可以把这个玩家的信息放到一个List中、
        List<List<Card>> players=new ArrayList<>();
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        //给三个玩家发牌，每人发5张牌
        //i表示牌的编号，j表示玩家编号
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                List<Card> player=players.get(j);
                //remove表示删除List中制定下标的元素
                //remove返回表示删除的这个元素是什么
                player.add(poker.remove(0));
            }
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println("玩家"+i+":"+players.get(i));
        }
    }

    private static List<Card> buyPoker(){
        List<Card> poker=new ArrayList<>();

        String[] suits={"♥","♠","♣","♦"};

        for (int i = 0; i <4 ; i++) {
            //这个循环处理四种花色
            //每种花色又有13张牌
            for (int j = 2; j <=10 ; j++) {
                //String.value将整数转换为字符串
                poker.add(new Card(String.valueOf(j),suits[i]));
            }
            poker.add(new Card("J",suits[i]));
            poker.add(new Card("Q",suits[i]));
            poker.add(new Card("K",suits[i]));
            poker.add(new Card("A",suits[i]));
        }
        return poker;
    }
}
