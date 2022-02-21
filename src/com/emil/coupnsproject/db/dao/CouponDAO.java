package com.emil.coupnsproject.db.dao;

import com.emil.coupnsproject.beans.Coupon;
import com.emil.coupnsproject.db.connection.ConnectionPool;
import com.emil.coupnsproject.exception.EntityCrudExceptionCrud;
import com.emil.coupnsproject.logging.Logger;

import java.sql.SQLException;
import java.util.List;

public class CouponDAO extends UserDAO<Long, Coupon> {
    public static final CouponDAO instance = new CouponDAO();

    private final ConnectionPool connectionPool;

    private static final Logger logger = Logger.getLogger(CouponDAO.class);

    private CouponDAO() {
        try {
            connectionPool = ConnectionPool.getInstance();
        } catch (SQLException e) {
            throw new RuntimeException("Something went wrong while getting connection pool instance");
        }
    }

    @Override
    public Long create(Coupon coupon) {
        return null;
    }

    @Override
    public Coupon read(Long aLong) {
        return null;
    }

    @Override
    public List readAll() {
        return null;
    }

    @Override
    public Void update() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public Coupon readByEmail(String email) throws EntityCrudExceptionCrud {
        return null;
    }

    public void addCouponPurchase() {

    }

    public void deleteCouponPurchase() {

    }
}
