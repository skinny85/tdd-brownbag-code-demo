package com.amazon.tdd_brownbag;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleQueueTest {
    private SimpleQueue<Integer> queue;

    @Before
    public void createEmptyQueue() {
        queue = new SimpleQueue<>();
    }

    @Test
    public void dequeue_on_empty_queue_throws_no_such_el() throws Exception {
        catchException(queue).dequeue();

        Exception exception = caughtException();
        assertThat(exception).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void dequeue_on_1_el_queue_returns_that_el() throws Exception {
        int element = 123;

        queue.enqueue(element);

        assertThat(queue.dequeue()).isEqualTo(element);
    }

    @Test
    public void simple_queue_is_fifo_for_2_el() throws Exception {
        queue.enqueue(1)
            .enqueue(2);

        List<Integer> result = new ArrayList<>(2);
        result.add(queue.dequeue());
        result.add(queue.dequeue());

        assertThat(result).containsExactly(1, 2);
    }

    @Test
    public void queue_drains_elements_correctly() throws Exception {
        queue.enqueue(1);
        queue.dequeue();

        queue.enqueue(1)
                .enqueue(2);

        List<Integer> result = new ArrayList<>(2);
        result.add(queue.dequeue());
        result.add(queue.dequeue());

        assertThat(result).containsExactly(1, 2);
    }
}
