package day06;

// 익명 자식 객체
public class Anonymous {
    // 필드 초기값으로 대입
    Person field = new Person() {
      void work(){
          System.out.println("출근합니다.");
      }
        @Override
        void wake() {
            System.out.println("6시에 일어난다.");
            work();
        }
    };

    void method1(){
        // 로컬변수에 대입
        Person localVar = new Person(){
            // 자식객체 생성
            void walk(){
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어난다.");
                walk();
            }
        };
        localVar.wake();
    }

    void method2(Person person){
        person.wake();
    }

    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.wake();
//        anonymous.field.work(); // 이건 안된다. work 를 쓰고싶으면 override 에 wake 에 work 를 넣는다.
        anonymous.method1();

        Person p = new Person();
        anonymous.method2(p);  // 이건 person 이 들어가야해서 위 코드를 넣는다.

        // 익명 객체 매개값 사용
        anonymous.method2(new Person(){
            void study(){
                System.out.println("공부합니다.");
            }

            @Override
            void wake() {
                study();
                System.out.println("9시에 일어납니다.");
            }
        });  // 이렇게 해도 됨

    }
}
