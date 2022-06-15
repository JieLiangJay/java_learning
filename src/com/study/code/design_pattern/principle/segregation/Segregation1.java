package com.study.code.design_pattern.principle.segregation;

/**
 * @ClassName: Segregation1
 * @Description:
 * @Author: jiel
 * @Date: 2022/3/28 20:53
 **/
public class Segregation1 {
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1()");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2()");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3()");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4()");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5()");
    }
}


class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1()");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2()");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3()");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4()");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5()");
    }
}

// A类 通过接口Interface1 依赖使用（依赖）B类，但是只实现1、2、3方法
class A {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

// C类 通过接口Interface1 依赖使用（依赖）D类，但是只实现1、4、5方法
class C {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }
}