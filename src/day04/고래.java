package day04;

public class 고래 extends 어류 implements 포유류{
    @Override
    void swim() {
        System.out.println("고래는 헤엄을 치며 움직입니다.");
    }

    @Override
    public void bear(){
        System.out.println("고래는 새끼를 낳습니다.");
    }

    @Override
    public void cure() {
        System.out.println("고래는 젖을 먹입니다.");
    }

    @Override
    void smell() {
        System.out.println("물고기 냄새가 납니다.");
    }

    public void eat(String food){
        System.out.println(food+"를 먹습니다.");
    }

    public static void main(String[] args){
        고래 고래1=new 고래();
        고래1.bear();
        고래1.swim();
        고래1.eat("새우");
        고래1.cure();
        포유류.aging("고래");
        고래1.smell();
    }
}