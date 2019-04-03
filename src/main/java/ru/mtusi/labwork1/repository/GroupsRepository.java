package ru.mtusi.labwork1.repository;

import ru.mtusi.labwork1.group;

public class GroupsRepository extends AbstractRepository<group> {
    public GroupsRepository(Class<Group> persistentClass) {
        super(persistentClass);
    }
}
