package com.emil.coupnsproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Company {

    public Company(String companyName, String password, String email) {
        this.companyName = companyName;
        this.password = password;
        this.email = email;
    }

    public Company(long id, String companyName, String password, String email) {
        this.id = id;
        this.companyName = companyName;
        this.password = password;
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
    private String password;
    @Getter
    @Setter
    private String email;

    @Override
    public String toString() {
        return "Company [id=" + id +
                ", companyName=" + companyName +
                ", password=" + password +
                ", email=" + email
                + "]";
    }
}