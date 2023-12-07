package org.schoolmanagement.school.services;
@FunctionalInterface
public interface BookInterface <T,U>{
    void initialize(T t, U u);
}
