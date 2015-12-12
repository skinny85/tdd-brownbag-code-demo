package com.amazon.tdd_brownbag;

import org.junit.Test;

import java.util.NoSuchElementException;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleQueueTest {
    @Test
    public void dequeue_on_empty_queue_throws_no_such_el() throws Exception {
        SimpleQueue<Integer> queue = new SimpleQueue<>();

        catchException(queue).dequeue();

        Exception exception = caughtException();
        assertThat(exception).isInstanceOf(NoSuchElementException.class);
    }
}
