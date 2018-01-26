package proxy.jdk;

import proxy.CalculatorImpl;
import proxy.ICalculator;

public class TestProxy {
    public static void main(String[] args) {
        TestHandler proxy = new TestHandler();
        ICalculator calculator = (ICalculator) proxy.bind(new CalculatorImpl());

        System.out.println(calculator.getClass());
        System.out.println("ret = " + calculator.add(1, 2));
    }
}
