// LIFO

package day08;

import java.util.Stack;

public class Coin {
    private int value;  // 멤버 필드(private)는 value

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();

        coinBox.push(new Coin(1));
        coinBox.push(new Coin(20));
        coinBox.push(new Coin(300));
        coinBox.push(new Coin(40));
        // Last in First out  (LIFO)


        while(!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }


    }
}
