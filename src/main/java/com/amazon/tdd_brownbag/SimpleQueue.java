package com.amazon.tdd_brownbag;

import java.util.NoSuchElementException;

public class SimpleQueue<T> {
    private SimpleQueueNode<T> first, last;

    public SimpleQueue<T> enqueue(T t) {
        SimpleQueueNode<T> newNode = new SimpleQueueNode<>(t);
        if (first != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        return this;
    }

    public T dequeue() {
        if (first == null)
            throw new NoSuchElementException();

        T result = first.value;
        first = first.next;
        return result;
    }

    private static final class SimpleQueueNode<E> {
        final E value;
        SimpleQueueNode<E> next;

        public SimpleQueueNode(E value) {
            this.value = value;
        }
    }
}
