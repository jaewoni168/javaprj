// 중첩인터페이스
package day05;
public class Button {
    OnClickListener listener;  // 인터페이스 타입 필드 선언

    static interface OnClickListener {
        void onClick();    // 오버라이딩
    }

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick(); // 구현 객체의 onClick() 메소드 호출
    }
} // Button
    class CallListener implements Button.OnClickListener{
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    }
    class MessageListener implements Button.OnClickListener{
        @Override
        public void onClick() {
            System.out.println("메시지를 보냅니다.");
        }

        public static void main(String[] args) {
            Button btn = new Button();

            btn.setOnClickListener(new CallListener());
            btn.touch();

            btn.setOnClickListener(new MessageListener());
            btn.touch();
        }
    }

