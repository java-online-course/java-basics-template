package com.epam.izh.rd.online.service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Ипотечный займ (упрощенный вариант)
 */
public class Mortgage {

    /**
     * Продукт (например Семейная ипотека)
     */
    private Product product;

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

    /**
     * Список продавцов
     */
    private List<Seller> sellers;


    /**
     * Список заявителей
     */
    private List<Applicant> applicants;

    /**
     * Объект недвижимости
     */
    private Realty realty;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    //.... геттеры и сеттеры для полей

    public Realty getRealty() {
        return realty;
    }

    public void setRealty(Realty realty) {
        this.realty = realty;
    }
}
