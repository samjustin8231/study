package com.example.codedesign.wallet.lackblood;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author sunyajun
 * @date 2020/4/28 4:43 下午
 */
@Data
public class VirtualWalletTransactionEntity {

    private BigDecimal amount;

    private Long createTime;

    private Long fromWalletId;

    private Long toWalletId;

    private Status status;
}
