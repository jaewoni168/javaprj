package day05;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodA(){
        System.out.println("A method 실행");
    }
    @Override
    public void methodB(){
        System.out.println("B method 실행");
    }
    @Override
    public void methodC(){
        System.out.println("C method 실행");
    }

    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();
        impl.methodA();
        impl.methodB();
        impl.methodC();

        InterfaceA ia=impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodC();
        ic.methodB();
        ic.methodA();


    }
}
