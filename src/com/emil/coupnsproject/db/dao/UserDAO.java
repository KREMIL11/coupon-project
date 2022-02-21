package com.emil.coupnsproject.db.dao;

import com.emil.coupnsproject.exception.EntityCrudExceptionCrud;

public abstract class UserDAO <ID, Entity> implements CrudDAO <ID, Entity> {
    public abstract Entity readByEmail(final String email) throws EntityCrudExceptionCrud;

    public boolean isExists(final String email) throws EntityCrudExceptionCrud {
        return readByEmail(email) != null;
    }
}
