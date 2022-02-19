package com.emil.coupnsproject.model;

import com.emil.coupnsproject.enums.CouponCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Coupon {
    public Coupon(String title, String motherCompany, String startDate, String endDate, int amount, CouponCategory type, String message,
                  double price, String image) {
        this.title = title;
        this.motherCompany = motherCompany;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.couponCategory = type;
        this.message = message;
        this.price = price;
        this.image = image;
    }

    public Coupon(Long id, String title, String motherCompany, String startDate, String endDate, int amount, CouponCategory type, String message,
                  double price, String image) {
        this.id = id;
        this.title = title;
        this.motherCompany = motherCompany;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.couponCategory = type;
        this.message = message;
        this.price = price;
        this.image = image;
    }

    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String motherCompany;
    @Getter
    @Setter
    private String startDate;
    @Getter
    @Setter
    private String endDate;
    @Getter
    @Setter
    private int amount;
    @Getter
    @Setter
    private CouponCategory couponCategory;
    @Getter
    @Setter
    private String message;
    @Getter
    @Setter
    private double price;
    @Getter
    @Setter
    private String image;

    @Override
    public String toString() {
        return "Coupon [id=" + id +
                ", title=" + title +
                ", motherCompany=" + motherCompany +
                ", startDate=" + startDate +
                ", endDate=" + endDate
                + ", amount=" + amount +
                ", couponType=" + couponCategory +
                ", message=" + message +
                ", price=" + price
                + ", image=" + image +
                "]";
    }
}