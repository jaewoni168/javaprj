package day06;

interface RemoteControl{
    void turnOn();
    void turnOff();
}

public class Anonymous2 {
        // 필드 초기값으로 대입
        RemoteControl field = new RemoteControl(){
            @Override
            public void turnOn() {
                System.out.println("TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV를 끕니다.");
            }
        };

        // 람다식
//        RemoteControl field2 =()-> System.out.println("welcome"); // 이게 함수형 코드
//        field2.turnOn;
        void method1(){
            RemoteControl localVar = new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("Audio를 켭니다.");
                }
                @Override
                public void turnOff() {
                    System.out.println("Audio를 끕니다.");
                }
            };
            // 로컬변수 사용
            localVar.turnOn();
        }
        void method2(RemoteControl rc){
            rc.turnOn();
    }

    public static void main(String[] args) {
        Anonymous2 anony2 = new Anonymous2();
        //익명 객체 필드 사용
        anony2.field.turnOn();
        // 익명 객체 로컬 변수 사용
        anony2.method1();
        // 익명 객체 매개값 사용
        anony2.method2(
            new RemoteControl(){
                @Override
                public void turnOn() {
                    System.out.println("SmartTV를 켭니다.");
                }

                @Override
                public void turnOff() {
                    System.out.println("SmartTV를 끕니다.");
                }
            }
        );
    }
}
