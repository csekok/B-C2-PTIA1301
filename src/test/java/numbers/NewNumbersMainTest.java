package numbers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class NewNumbersMainTest {
    private static final Random RANDOM_GENERATOR = new Random(50);
    //TODO Before doing a task remove "/*" and "*/" in its test class (Shortcut: Crtl + Shift + /).

    /**
     @Test
     public void testGenerateArrayWithoutParameter() {
     int[] expected = new int[]{1, 2, 3, 4, 5};
     int[] actual = NewNumbersMain.generateArray();

     assertEquals(expected.length, actual.length);

     for (int i = 0; i < expected.length; i++) {
     assertEquals(expected[i], actual[i]);
     }
     }

     @Test
     public void testGenerateArrayTrue() {
     int[] expected = new int[5];
     for (int i = 0; i < expected.length; i++) {
     expected[i] = RANDOM_GENERATOR.nextInt(100) - 50;
     }

     int[] actual = NewNumbersMain.generateArray(true);

     assertEquals(expected.length, actual.length);

     for (int i = 0; i < expected.length; i++) {
     assertEquals(expected[i], actual[i]);
     }
     }

     @Test
     public void testGenerateArrayFalse() {
     int[] expected = new int[]{1, 2, 3, 4, 5};
     int[] actual = NewNumbersMain.generateArray(false);

     assertEquals(expected.length, actual.length);

     for (int i = 0; i < expected.length; i++) {
     assertEquals(expected[i], actual[i]);
     }
     }

     @Test
     public void testGenerateTwoDimensionalArrayTrue() {
     int[][] expected = new int[2][3];
     for (int i = 0; i < expected.length; i++) {
     for (int j = 0; j < expected[i].length; j++) {
     expected[i][j] = RANDOM_GENERATOR.nextInt(100) - 50;
     }
     }
     int[][] actual = NewNumbersMain.generateTwoDimensionalArray(true);

     assertEquals(expected.length, actual.length);
     assertEquals(expected[0].length, actual[0].length);

     for (int i = 0; i < expected.length; i++) {
     for (int j = 0; j < expected[i].length; j++) {
     assertEquals(expected[i][j], actual[i][j]);
     }
     }
     }

     @Test
     public void testGenerateTwoDimensionalArrayFalse() {
     int[][] expected = {{1, 2, 3}, {4, 5, 6}};
     int[][] actual = NewNumbersMain.generateTwoDimensionalArray(false);

     assertEquals(expected.length, actual.length);
     assertEquals(expected[0].length, actual[0].length);

     for (int i = 0; i < expected.length; i++) {
     for (int j = 0; j < expected[i].length; j++) {
     assertEquals(expected[i][j], actual[i][j]);
     }
     }
     }

     @Test
     public void testGenerateListLengthMinus() {
     assertEquals(0, NewNumbersMain.generateList(false, -1).size());
     }

     @Test
     public void testGenerateListLengthZero() {
     assertEquals(0, NewNumbersMain.generateList(false, 0).size());
     }

     @Test
     public void testGenerateListLengthOne() {
     ArrayList<Integer> expected = new ArrayList<Integer>();
     expected.add(1);
     ArrayList<Integer> actual = NewNumbersMain.generateList(false, 1);

     assertEquals(expected.size(), actual.size());
     assertEquals(expected.get(0), actual.get(0));
     }

     @Test
     public void testGenerateListLengthTen() {
     ArrayList<Integer> expected = new ArrayList<Integer>();
     for (int i = 1; i <= 10; i++) {
     expected.add(i);
     }
     ArrayList<Integer> actual = NewNumbersMain.generateList(false, 10);

     assertEquals(expected.size(), actual.size());

     for (int i = 0; i < 10; i++) {
     assertEquals(expected.get(i), actual.get(i));
     }
     }

     @Test
     public void testSelectEvenNumbersNoEvenNumber() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 1; i <= 100; i += 2) {
     list.add(i);
     }

     assertEquals(0, NewNumbersMain.selectEvenNumbers(list).size());
     }

     @Test
     public void testSelectEvenNumbersEvenAtStart() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     list.add(100);
     for (int i = 1; i <= 100; i += 2) {
     list.add(i);
     }

     assertEquals(1, NewNumbersMain.selectEvenNumbers(list).size());
     }

     @Test
     public void testSelectEvenNumbersEvenAtEnd() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 1; i <= 100; i += 2) {
     list.add(i);
     }
     list.add(2);

     assertEquals(1, NewNumbersMain.selectEvenNumbers(list).size());
     }

     @Test
     public void testSelectEvenNumbersMultiple() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 0; i <= 100; i++) {
     list.add(i);
     }

     assertEquals(51, NewNumbersMain.selectEvenNumbers(list).size());
     }

     @Test
     public void testIntersectionEmptyList() {
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     for (int i = 0; i < 100; i++) {
     list1.add(i);
     }

     assertEquals(0, NewNumbersMain.intersection(list1, new ArrayList<Integer>()).size());
     }

     @Test
     public void testIntersectionEmptyIntersection() {
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     for (int i = 0; i < 100; i += 2) {
     list1.add(i);
     }

     ArrayList<Integer> list2 = new ArrayList<Integer>();
     for (int i = 1; i < 100; i += 2) {
     list2.add(i);
     }

     assertEquals(0, NewNumbersMain.intersection(list1, list2).size());
     }

     @Test
     public void testIntersectionSameList() {
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     for (int i = 0; i < 100; i += 2) {
     list1.add(i);
     }

     assertEquals(50, NewNumbersMain.intersection(list1, list1).size());
     }

     @Test
     public void testNumberOfOddsEmptyList() {
     assertEquals(0, NewNumbersMain.numberOfOdds(new ArrayList<>()));
     }

     @Test
     public void testNumberOfOddsNoOdd() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 0; i < 100; i += 2) {
     list.add(i);
     }

     assertEquals(0, NewNumbersMain.numberOfOdds(list));
     }

     @Test
     public void testNumberOfOddsAllOdd() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 1; i < 100; i += 2) {
     list.add(i);
     }

     assertEquals(50, NewNumbersMain.numberOfOdds(list));
     }

     @Test
     public void testContainsEmptyList() {
     assertFalse(NewNumbersMain.contains(new ArrayList<>(), 100));
     }

     @Test
     public void testContainsTrue() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 1; i < 100; i += 2) {
     list.add(i);
     }

     assertTrue(NewNumbersMain.contains(list, 13));
     }

     @Test
     public void testContainsFalse() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 0; i < 100; i += 2) {
     list.add(i);
     }

     assertFalse(NewNumbersMain.contains(list, 13));
     }

     @Test
     public void testSumEmptyList() {
     assertEquals(0, NewNumbersMain.sum(new ArrayList<Integer>()));
     }

     @Test
     public void testSum() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     int expected = 0;
     for (int i = 0; i < 100; i += 3) {
     list.add(i);
     expected += i;
     }
     assertEquals(expected, NewNumbersMain.sum(list));
     }

     @Test
     public void testIndexOfEmptyList() {
     assertEquals(-1, NewNumbersMain.indexOf(new ArrayList<>(), 100));
     }

     @Test
     public void testIndexOfFirstElement() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 0; i < 100; i++) {
     list.add(i);
     }

     assertEquals(0, NewNumbersMain.indexOf(list, 0));
     }

     @Test
     public void testIndexOfMiddleElement() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 10; i < 100; i++) {
     list.add(i);
     }

     assertEquals(46, NewNumbersMain.indexOf(list, 56));
     }

     @Test
     public void testIndexOfLastElement() {
     ArrayList<Integer> list = new ArrayList<Integer>();
     for (int i = 0; i < 100; i++) {
     list.add(i);
     }

     assertEquals(99, NewNumbersMain.indexOf(list, 99));
     }

     @Test
     public void testUnionTwoEmptyList() {
     assertEquals(0, NewNumbersMain.union(new ArrayList<Integer>(), new ArrayList<Integer>()).size());
     }

     @Test
     public void testUnionEmptyList() {
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     for (int i = 0; i < 100; i++) {
     list1.add(i);
     }

     assertEquals(100, NewNumbersMain.union(list1, new ArrayList<Integer>()).size());
     }

     @Test
     public void testUnionTwoList() {
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     for (int i = 0; i < 100; i += 2) {
     list1.add(i);
     }

     ArrayList<Integer> list2 = new ArrayList<Integer>();
     for (int i = 1; i < 100; i += 2) {
     list2.add(i);
     }

     assertEquals(100, NewNumbersMain.union(list1, list2).size());
     }

     @Test
     public void testUnionSameList() {
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     for (int i = 0; i < 100; i += 2) {
     list1.add(i);
     }

     assertEquals(50, NewNumbersMain.union(list1, list1).size());
     }*/
}