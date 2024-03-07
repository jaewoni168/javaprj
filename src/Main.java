public class Main {
    public static void main(String[] args) {
//        public, private: 접근제어지시자
//        void: return값 즉 반환값이 없는 형
//        static: 정적인 메모리 영역에 있음
//            String[] args: 문자열 배열

        System.out.printf("Hello and welcome!");
//        나중에는 위에 코드를 잘 안쓰고 log.info를 사용하게 된다.
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println();
            System.out.println();
        }
    }
}