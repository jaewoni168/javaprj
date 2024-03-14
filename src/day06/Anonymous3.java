package day06;

class Worker{
    void start(){
        System.out.println("쉬고 있습니다.");
    }
}

public class Anonymous3 {
    Worker field = new Worker(){
        @Override
        void start() {
            System.out.println("디자인을 합니다.");
        }
    };
    void method1() {
        Worker localVar = new Worker(){
            @Override
            void start() {
                System.out.println("개발을 합니다.");
            }
        };
        localVar.start();
    }
    void method2(Worker worker){
        worker.start();
    }

    public static void main(String[] args) {
        Anonymous3 anony3 = new Anonymous3();
        // 익명 객체 필드 사용
        anony3.field.start();
        // 익명 객체 로컬변수 사용
        anony3.method1();

        // 익명 객체 매개값 사용
        anony3.method2(
                new Worker(){
                    @Override
                    void start() {
                        System.out.println("테스트를 합니다.");
                    }
                }
        );
    }
}
