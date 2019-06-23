package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void singlyLinkedListAddTest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(2);
        test.add(2);
        test.add(3);

        Integer expected = 3;

        Integer actual = test.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singlyLinkedListRemoveTest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(52);
        test.add(13);
        test.add(351);
        test.remove(2);

        Integer expected = 2;
        Integer actual = test.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singlyLinkedListContainsTest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(53);
        test.add(919);
        test.add(15);
        test.add(1351);

        Assert.assertTrue(test.contains(15));
    }

    @Test
    public void singlyLinkedListFindTest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(53);
        test.add(919);
        test.add(15);
        test.add(1351);

        Integer expected = 2;
        Integer actual = test.find(919);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singlyLinkedListSizeTest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(53);
        test.add(919);
        test.add(15);
        test.add(1351);

        Integer expected = 4;
        Integer actual = test.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singlyLinkedListGetTest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(53);
        test.add(919);
        test.add(15);
        test.add(1351);

        Integer expected = 15;
        Integer actual = test.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void singlyLinkedListCopytest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(53);
        test.add(919);
        test.add(15);
        test.add(1351);

        ;

        Assert.assertEquals(test, test.copy());
    }

    @Test
    public void singlyLinkedListCopyTest(){
        SinglyLinkedList<Integer> test = new SinglyLinkedList<>();
        test.add(53);
        test.add(919);
        test.add(15);
        test.add(1351);

        test.sort();
        Integer expected = 919;
        Integer actual =  test.get(2);
        Assert.assertEquals(expected, actual);
    }
}
