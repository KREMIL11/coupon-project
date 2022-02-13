package com.emil.coupnsproject.exception;

import com.emil.coupnsproject.enums.EntityType;

public class EntityCrudExceptionCrud extends CrudDAOException {
    public EntityCrudExceptionCrud(final EntityType entitytype, String email) {
        super(email + entitytype);

    }
}
