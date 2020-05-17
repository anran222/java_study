package zuoye.list3;

import java.util.Stack;

/**
 * @Author:xiang
 * @Date:2020/5/17 22:30
 * 股票价格跨度
 */
public class OnlineStockSpan {
    public static void main(String[] args) {

    }

}

class StockSpanner {
    private Stack<Integer> prices;
    private Stack<Integer> weight;
    public StockSpanner() {
        prices=new Stack<>();
        weight=new Stack<>();
    }

    public int next(int price) {
        int count=1;
        while (!prices.empty()&&prices.peek()<=price){
            prices.pop();
            count+=weight.pop();
        }
        prices.push(price);
        weight.push(count);
        return count;
    }
}
