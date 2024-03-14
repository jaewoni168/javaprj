package day06;

public class Button {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }
    void touch(){
        listener.onClick();
    }

    // 클래스 안에 인터페이스가 있는 것을 "중첩인터페이스" 라고 한다.
    interface OnClickListener{
        void onClick();
    }
}

