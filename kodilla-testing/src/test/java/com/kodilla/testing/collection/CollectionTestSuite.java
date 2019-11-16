package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.hamcrest.CoreMatchers;
import org.junit.*;

import java.util.*;

public class CollectionTestSuite {

    private OddNumbersExterminator numbersExterminator;

    @Before
    public void before() {
        this.numbersExterminator = new OddNumbersExterminator();
        System.out.println("Test case ODD/EVEN begin");
    }

    @After
    public void after() {
        System.out.println("Test case ODD/EVEN stop");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> numbersToBeExaminated = Collections.emptyList();
        List<Integer> exterminate = numbersExterminator.exterminate(numbersToBeExaminated);
        Assert.assertThat(exterminate.size(), CoreMatchers.equalTo(0));
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> numbersToBeExaminated = Arrays.asList(123, 331, 441, 22, 20, 12, 440);
        List<Integer> exterminate = numbersExterminator.exterminate(numbersToBeExaminated);
        Assert.assertThat(exterminate.size(), CoreMatchers.equalTo(4));
        Assert.assertThat(exterminate, CoreMatchers.hasItems(22, 20, 12, 440));
    }

}
