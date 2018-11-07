package com.javaman.chain.template;

/**
 * @author pengzhe
 * @date 2018/11/7 14:51
 */
public class Client {
    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Response response = handler1.handleMessage(new Request());

    }
}
