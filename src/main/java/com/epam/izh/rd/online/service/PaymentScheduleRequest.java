package com.epam.izh.rd.online.service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Запрос для расчета графика платежей
 */
public class PaymentScheduleRequest {

    /**
     * Размер заемных средств
     */
    private BigDecimal amount;

    /**
     * Размер ипотечной ставки
     */
    private BigDecimal interestRate;

    /**
     * Срок кредитования
     */
    private Integer period;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
}
