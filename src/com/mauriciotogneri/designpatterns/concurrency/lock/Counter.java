package com.mauriciotogneri.designpatterns.concurrency.lock;

public class Counter
{
    private final Lock lock = new Lock();
    private int count = 0;

    public int getCount()
    {
        this.lock.lock();

        int result = this.count;

        this.lock.unlock();

        return result;
    }

    public void increment()
    {
        this.lock.lock();

        this.count++;

        this.lock.unlock();
    }

    public void decrement()
    {
        this.lock.lock();

        this.count--;

        this.lock.unlock();
    }
}