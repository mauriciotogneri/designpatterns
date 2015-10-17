package com.mauriciotogneri.designpatterns.creational.factorymethod;

public class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing rectangle...");
    }
}