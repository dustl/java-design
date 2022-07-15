package com.java.design.strategy.pay;

/**
 * @author liwy
 * @date 2022/7/15
 */
public enum PayEnum {

    /**
     * 支付策略
     * */
    WX_PAY(new WxPay()),

    ALI_PAY(new AliPay()),

    ;


    private Payment payment;

    private PayEnum(Payment payment) {
        this.payment =payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
