package com.amazon.tdd_brownbag;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    public void enqueue(T t) {
        throw new UnsupportedOperationException();
    }

    public T dequeue() {
        throw new NoSuchElementException();
    }
}
