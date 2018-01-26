package proxy.cglib;

import proxy.CalculatorImpl;

public class TestCglibProxy {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        CalculatorImpl calculator = (CalculatorImpl) cglibProxy.getInstance(new CalculatorImpl());

        System.out.println(calculator.getClass());
        System.out.println("ret = " + calculator.add(1, 2));
        calculator.notInferfaceMethod();
    }
}
