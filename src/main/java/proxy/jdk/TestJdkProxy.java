package proxy.jdk;

import proxy.CalculatorImpl;
import proxy.ICalculator;

public class TestJdkProxy {
    public static void main(String[] args) {
        JdkProxy proxy = new JdkProxy();
        ICalculator calculator = (ICalculator) proxy.bind(new CalculatorImpl());

        System.out.println(calculator.getClass());
        System.out.println("ret = " + calculator.add(1, 2));
    }
}
