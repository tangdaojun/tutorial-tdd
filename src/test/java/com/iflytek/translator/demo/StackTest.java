package com.iflytek.translator.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void newStack_IsEmpty() {
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_WillNotBeEmpty() {
        stack.push(0);
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void pop() {
        Assertions.assertThrows(RuntimeException.class, () -> {stack.pop();});
    }

    @Test
    public void afterOnePushAndOnPop_WillBeEmpty() {
        stack.push(0);
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushesAndOnePop_WillNotBeEmpty() {
        stack.push(0);
        stack.push(0);
        stack.pop();
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingXThenPopX() {
        stack.push(99);
        Assertions.assertEquals(99, stack.pop());
        stack.push(88);
        Assertions.assertEquals(88, stack.pop());
    }

    @Test
    public void afterPushingXAndY_ThenPopYAndX() {
        stack.push(88);
        stack.push(99);
        Assertions.assertEquals(99, stack.pop());
        Assertions.assertEquals(88, stack.pop());
    }

}
