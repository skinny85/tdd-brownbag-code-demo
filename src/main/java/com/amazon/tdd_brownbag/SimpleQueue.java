package com.amazon.tdd_brownbag;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class SimpleQueue<T> {
    private Queue<T> queue = new LinkedList<>();

    public SimpleQueue<T> enqueue(T t) {
        queue.offer(t);
        return this;
    }

    public T dequeue() {
        return queue.remove();
    }
}
