package com.mauriciotogneri.designpatterns.creational.abstractfactory;

public class Main
{
    public static void main(String[] args)
    {
        GuiBuilder builder = new GuiBuilder();
        AbstractWindowFactory windowFactory;
        String platform = System.getProperty("os.name").toLowerCase();

        if (platform.startsWith("mac"))
        {
            windowFactory = new MacWindowFactory();
        }
        else
        {
            windowFactory = new LinuxWindowFactory();
        }

        builder.buildWindow(windowFactory);
    }
}