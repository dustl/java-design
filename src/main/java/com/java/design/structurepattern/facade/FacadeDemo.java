package com.java.design.structurepattern.facade;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class FacadeDemo {

    public static void main(String[] args) {
        new ServiceFacade().doSomething();

    }


    static class ServiceFacade {

        private ServiceA serviceA;

        private ServiceB serviceB;

        public void doSomething() {
            serviceA.methodA();
            serviceB.methodB();
        }


    }

    static class  ServiceA{
        public void methodA() {
            System.out.println("do A..");
        }
    }

    static class ServiceB{
        public void methodB() {
            System.out.println("do B...");
        }
    }
}
