package day06;

public class Window {
    Button btn1 = new Button();
    Button btn2 = new Button();

    // 필드초기값으로 대입
    Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    Window(){
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });

    }

    public static void main(String[] args) {
        Window w = new Window();
        w.btn1.touch();
        w.btn2.touch();

    }
}
