package proxy;

public class CalculatorImpl implements ICalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public void notInferfaceMethod(){
        System.out.println("notInferfaceMethod");
    }
}
