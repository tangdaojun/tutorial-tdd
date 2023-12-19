package com.iflytek.translator.demo;

public class Stack {

    private final int[] elements = new int[2];
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        this.elements[size++] = element;
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("stack is empty");
        return this.elements[--size];
    }

}
