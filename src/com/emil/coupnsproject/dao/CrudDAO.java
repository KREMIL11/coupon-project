package com.emil.coupnsproject.dao;

import java.util.List;

public interface CrudDAO <ID, Entity> {
    ID create(Entity entity);
    Entity read(ID id);
    List<Entity> readAll();
    Void update();
    void delete();
}
