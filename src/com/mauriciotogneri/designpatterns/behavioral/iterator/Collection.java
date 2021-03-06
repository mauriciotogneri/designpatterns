package com.mauriciotogneri.designpatterns.behavioral.iterator;

public interface Collection<Type>
{
    void add(Type student);

    Iterator<Type> iterator();
}