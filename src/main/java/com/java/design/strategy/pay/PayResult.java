package com.java.design.strategy.pay;

import lombok.Builder;
import lombok.Data;

/**
 * @author liwy
 * @date 2022/7/15
 */
@Data
@Builder
public class PayResult {

    private String msg;

    private Integer code;

}
