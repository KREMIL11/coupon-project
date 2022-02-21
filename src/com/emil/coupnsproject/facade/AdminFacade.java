package com.emil.coupnsproject.facade;

import com.emil.coupnsproject.beans.Company;
import com.emil.coupnsproject.beans.Customer;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AdminFacade extends UserFacade {

    public void addCompany(Company company) {

    }

    public void updateCompany(Company company) {

    }

    public void deleteCompany(long companyId) {

    }

    public ArrayList<Company> getAllCompanies() {
        return null;
    }

    public Company getOneCompany(long companyId) {
        return null;
    }

    public void addCustomer(Customer customer) {

    }

    public void updateCustomer(Customer customer) {

    }

    public void deleteCustomer(long customerId) {

    }

    public ArrayList<Customer> getAllCustomers() {
        return null;
    }

    public Customer getOneCustomer(long customerId) {
        return null;
    }

    @Override
    public boolean login(String email, long password) {
        final String adminEmail = "admin@admin.com";
        final long adminPassword = 12345678L;
        return email.equals(adminEmail) && password == adminPassword;
    }
}
