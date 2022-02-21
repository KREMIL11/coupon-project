package com.emil.coupnsproject.db.dao;

import com.emil.coupnsproject.beans.Customer;
import com.emil.coupnsproject.db.connection.ConnectionPool;
import com.emil.coupnsproject.exception.EntityCrudExceptionCrud;
import com.emil.coupnsproject.logging.Logger;

import java.sql.SQLException;
import java.util.List;

public class CustomerDAO extends UserDAO<Long, Customer> {
    public static final CustomerDAO instance = new CustomerDAO();

    private final ConnectionPool connectionPool;

    private static final Logger logger = Logger.getLogger(CustomerDAO.class);

    private CustomerDAO() {
        try {
            connectionPool = ConnectionPool.getInstance();
        } catch (SQLException e) {
            throw new RuntimeException("Something went wrong while getting connection pool instance");
        }
    }
    @Override
    public Long create(Customer customer) {
        return null;
    }

    @Override
    public Customer read(Long aLong) {
        return null;
    }

    @Override
    public List<Customer> readAll() {
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
    public Customer readByEmail(final String email) throws EntityCrudExceptionCrud {
        return null;
    }

    @Override
    public boolean isExists(final String email) throws EntityCrudExceptionCrud {
        return readByEmail(email) != null;
    }
}
