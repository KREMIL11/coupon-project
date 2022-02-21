package com.emil.coupnsproject;

import com.emil.coupnsproject.exception.ApplicationException;
import com.emil.coupnsproject.facade.CrudFacade;
import com.emil.coupnsproject.logging.Logger;

public class CouponsSystem {
    private final Logger logger = Logger.getLogger(CouponsSystem.class);

    private CouponsSystem() {
        task = new Thread(() -> {
            while (true) {
                System.out.println("This is a task");
            }
        });
    }

    private final Thread task;

    public <ENTITY> Long executeCommand(final ENTITY entity, final CrudOperation operation) throws Exception {
        final CrudFacade facade = determineFacade(entity.getClass());
        switch (operation) {
            case CREATE:
                facade.create(entity);
                break;

            default:
                logger.error("No mapping for operation of type: " + operation);
                throw new ApplicationException("No mapping for operation of type: " + operation);
        }
    }

    private CrudFacade determineFacade(Class<?> aClass) {
        return null;
    }
}
