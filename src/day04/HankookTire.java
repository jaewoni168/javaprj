package day04;

public class HankookTire extends Tire{
    // 필드
    // 생성자
    public HankookTire(String location, int maxRotation) {
        super(maxRotation, location);
    }

    //메소드

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        }else{
            System.out.println("***" + location + "HankookTire 펑크***");
            return false;
        }
    }
}
