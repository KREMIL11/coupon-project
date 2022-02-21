package com.emil.coupnsproject.facade;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class UserFacade {

    public abstract boolean login(String email, long password);
}
