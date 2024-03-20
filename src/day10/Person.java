package day10;

public class Person {
    String name;
    int money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
        System.out.println(name + "님" + money + "원 충전완료");
    }

    public void 스타커피사기(StarCoffee starCoffee, int money) {
        String message = starCoffee.커피제조(money);
        this.money -= money;
        if (this.money < 0) {
            System.out.println("돈이 다 떨어졌습니다.");
            return;
        }
        System.out.println(name + "님이 " + money + "으로 " + message);
        System.out.println(this.money + "원 남았습니다.");
    }

    public void 콩커피사기(BeanCoffee beanCoffee, int money) {
        String message = beanCoffee.커피제조(money);
        this.money -= money;
        if (this.money < 0) {
            System.out.println("돈이 다 떨어졌습니다.");
            return;
        }
        System.out.println(name + "님이 " + money + "으로 " + message);
        System.out.println(this.money + "원 남았습니다.");
    }
}
