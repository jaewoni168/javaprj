package day03;

public class Teran {
    private String unit; // 마린, 메딕, 탱크
    private int life = 10;
    private int level = 1;

    public Teran(String unit) {
        this.unit = unit;
        System.out.println(unit+"이 생성되었습니다.");
    }

    public void attack(String enemy){
        System.out.println(unit+"이 " + enemy + "를 공격합니다.");
        level+=1;
        if(level>=3){
            System.out.println(unit + "이 업그레이드되었습니다. 이제 스팀백기능이 가능합니다.");
        }
    }

    public void cure(String unit) {
        System.out.println(unit + "을 치료합니다.");
        life +=1;
    }

    public void defend(String enemy) {
        System.out.println(unit + "이 " + enemy + "한테 공격당한다");
        life -=5;
        if(life == 0){
            System.out.println(unit + "이 사망했습니다.");
            unit=null; // 사망처리
        }




    }
}
