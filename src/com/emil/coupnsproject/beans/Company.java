package com.emil.coupnsproject.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
public class Company {
    public Company(String companyName, String password, String email) {
        this.companyName = companyName;
        this.password = password.hashCode();
        this.email = email;
    }

    public Company(long id, String companyName, String password, String email) {
        this.id = id;
        this.companyName = companyName;
        this.password = password.hashCode();
        this.email = email;
    }

    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String companyName;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private int password;
    @Getter
    private final ArrayList<Coupon> coupons = new ArrayList<Coupon>();

    public void addCoupons(Coupon coupon) {
        if (coupons.contains(coupon)) {
            return;
        }
        coupons.add(coupon);
    }

    @Override
    public String toString() {
        return "Company [id=" + id +
                ", companyName=" + companyName +
                ", email=" + email
                + "]";
    }
}