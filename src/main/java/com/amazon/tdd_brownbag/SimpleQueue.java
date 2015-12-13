package com.amazon.tdd_brownbag;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private SimpleQueueNode<T> first;

    public void enqueue(T t) {
        first = new SimpleQueueNode<>(t);
    }

    public T dequeue() {
        if (first == null)
            throw new NoSuchElementException();
        return first.value;
    }

    private static final class SimpleQueueNode<E> {
        final E value;

        public SimpleQueueNode(E value) {
            this.value = value;
        }
    }
}
