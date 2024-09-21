package org.example;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    private static Node<Integer> list;
    private HomeWork homeWork = new HomeWork();

    @BeforeAll
    static void setUp() {
        list = new Node<>(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }

    @Test
    void partitionBy() {
        assertEquals(3, homeWork.partitionBy(list, x -> x < 4));
        assertEquals(0, homeWork.partitionBy(list, x -> x < 0));
    }

    @Test
    void findNthElement() {
        assertEquals(3, homeWork.findNthElement(list, 3));
        assertEquals(1, homeWork.findNthElement(list, 1));
        assertThrows(IllegalArgumentException.class, () -> homeWork.findNthElement(list, 8));
    }
}