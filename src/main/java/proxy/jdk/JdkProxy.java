package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    private Object targetObject;

    public Object bind(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        before();
        Object ret = method.invoke(targetObject, args);
        after();
        return ret;
    }

    private void before() {
        System.out.println("before...");
    }

    private void after() {
        System.out.println("after...");
    }
}
