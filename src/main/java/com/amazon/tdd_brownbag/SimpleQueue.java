package com.amazon.tdd_brownbag;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private SimpleQueueNode<T> first;

    public void enqueue(T t) {
        SimpleQueueNode<T> newNode = new SimpleQueueNode<>();
        newNode.value = t;
        first = newNode;
    }

    public T dequeue() {
        if (first == null)
            throw new NoSuchElementException();
        return first.value;
    }

    private static final class SimpleQueueNode<E> {
        E value;
    }
}
