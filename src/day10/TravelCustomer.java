package day10;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomer {
    private String name; // 이름
    private int age; // 나이
    private int price; // 가격

    public TravelCustomer(String name, int age, int price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name= " + name + "age= " + age + "price= " + price;
    }

    public static void main(String[] args) {
        TravelCustomer customer1 = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customer2 = new TravelCustomer("강감찬", 40, 100);
        TravelCustomer customer3 = new TravelCustomer("장보고", 50, 100);
        TravelCustomer customer4 = new TravelCustomer("원균", 10, 50);
        TravelCustomer customer5 = new TravelCustomer("안중근", 14, 50);

        List<TravelCustomer> cus = new ArrayList<>();
        cus.add(customer1);
        cus.add(customer2);
        cus.add(customer3);
        cus.add(customer4);
        cus.add(customer5);

        System.out.println("명단출력");
        cus.stream().map(c->c.getName()).forEach(s-> System.out.print(s +" "));
        System.out.println();

        System.out.print("총비용은? ");
        int total = cus.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println(total);

        System.out.println("20세 이상 고객 명단 출력");
        cus.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s-> System.out.print(s+" "));
        
    }
}
