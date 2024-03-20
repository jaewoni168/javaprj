package day10;

public class CoffeeTest {
    public static void main(String[] args) {

        Person kim = new Person("Kim", 10000);
        Person lee = new Person("Lee", 20000);

        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        kim.스타커피사기(starCoffee, Menu.STARAMERICANO);
        lee.콩커피사기(beanCoffee, Menu.BEANAMERICANO);

        kim.콩커피사기(beanCoffee, Menu.BEANLATTE);
        lee.스타커피사기(starCoffee, Menu.STARLATTE);

        kim.money = 5000;
        kim.스타커피사기(starCoffee, Menu.STARAMERICANO);
        lee.콩커피사기(beanCoffee, Menu.BEANAMERICANO);
    }
}
