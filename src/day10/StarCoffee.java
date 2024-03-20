package day10;

public class StarCoffee {
    int money;

    public String 커피제조(int money){
        this.money += money;
        if(money == Menu.STARAMERICANO) {
            return "스타 아메리카노를 구입했습니다.";
        }
        else if(money == Menu.STARLATTE) {
            return "스타 라테를 구입했습니다.";
        }
        else return null;
    }
}
