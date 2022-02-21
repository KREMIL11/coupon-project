package com.emil.coupnsproject.db.dao;

import com.emil.coupnsproject.db.connection.ConnectionPool;
import com.emil.coupnsproject.exception.EntityCrudExceptionCrud;
import com.emil.coupnsproject.logging.Logger;
import com.emil.coupnsproject.beans.Company;

import java.sql.SQLException;
import java.util.List;

public class CompanyDAO extends UserDAO<Long, Company> {
    public static final CompanyDAO instance = new CompanyDAO();

    private final ConnectionPool connectionPool;

    private static final Logger logger = Logger.getLogger(CompanyDAO.class);

    private CompanyDAO() {
        try {
            connectionPool = ConnectionPool.getInstance();
        } catch (SQLException e) {
            throw new RuntimeException("Something went wrong while getting connection pool instance");
        }
    }

    @Override
    public Long create(Company company) {
        return null;
    }

    @Override
    public Company read(Long aLong) {
        return null;
    }

    @Override
    public List<Company> readAll() {
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
    public Company readByEmail(String email) throws EntityCrudExceptionCrud {
        return null;
    }
}
