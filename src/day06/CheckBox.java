package day06;

public class CheckBox {
    OnSelectListener listener;

    void setOnSelectListener(OnSelectListener listener){
        this.listener = listener;
    }

    void select(){
        listener.onSelect();
    }

    interface OnSelectListener{
        void onSelect();
    }

    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
        checkBox.setOnSelectListener(new CheckBox.OnSelectListener(){
                                         @Override
                                         public void onSelect() {
                                             System.out.println("배경을 변경합니다.");
                                         }
                                     }

        );
        checkBox.select();
    }
}
