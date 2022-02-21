package com.emil.coupnsproject.facade;

import com.emil.coupnsproject.enums.CouponCategory;
import com.emil.coupnsproject.beans.Company;
import com.emil.coupnsproject.beans.Coupon;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;

@RequiredArgsConstructor
public class CompanyFacade extends UserFacade {

    private final int companyId;

    public void addCoupon(Coupon coupon) {

    }

    public void updateCoupon(Coupon coupon) {

    }

    public void deleteCoupon(long couponId) {

    }

    public ArrayList<Coupon> getCompanyCoupons() {
        return null;
    }

    public ArrayList<Coupon> getCompanyCoupons(CouponCategory couponCategory) {
        return null;
    }

    public ArrayList<Coupon> getCompanyCoupons(double maxPrice) {
        return null;
    }

    public Company getCompanyDetails() {
        return null;
    }

    @Override
    public boolean login(String email, long password) {
        return false;
    }
}
