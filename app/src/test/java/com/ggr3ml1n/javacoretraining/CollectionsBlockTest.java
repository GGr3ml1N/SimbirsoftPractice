package com.ggr3ml1n.javacoretraining;

import static org.junit.Assert.assertEquals;

import com.ggr3ml1n.classes.Student;
import com.ggr3ml1n.collections.CollectionsBlock;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsBlockTest {

    Student dinar = new Student("Dinar", "Subeev", "Ramilevich",
            2000, 1, Student.GROUP2, 3, 4, 4, 2, 5);

    Student misha = new Student("Mikhail", "Romanov", "",
            1997, 3, Student.GROUP1, 5, 3, 2, 4, 4);
    Student sasha = new Student("Sasha", "Pupkin", "",
            1993, 3, Student.GROUP2, 4, 4, 4, 4, 4);
    Student lena = new Student("Elena", "Smolnikova", "",
            2000, 2, Student.GROUP3, 3, 5, 3, 1, 2);
    Student olya = new Student("Olga", "Ivanova", "",
            2002, 1, Student.GROUP1, 3, 4, 4, 3, 3);
    Student dima = new Student("Dmitriy", "Sukaev", "",
            1994, 4, Student.GROUP3, 4, 2, 5, 2, 3);
    Student serega = new Student("Sergei", "Kashkinov", "",
            1998, 2, Student.GROUP3, 2, 5, 3, 2, 5);

    private static CollectionsBlock<Integer> collectionsBlock;

    @BeforeClass
    public static void init() {
        collectionsBlock = new CollectionsBlock<>();
    }

    @Test
    public void collectionTask0_emptyLists() {
        List<Integer> averageValue = collectionsBlock.collectionTask0(
                Collections.<Integer>emptyList(),
                Collections.<Integer>emptyList()
        );
        List<Integer> expectedValue = Collections.emptyList();
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask0_notEmptyFirstList() {
        List<Integer> firstList = Arrays.asList(3, 2, 1);
        List<Integer> secondList = Collections.emptyList();
        List<Integer> averageValue = collectionsBlock.collectionTask0(firstList, secondList);
        List<Integer> expectedValue = Arrays.asList(3, 2, 1);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask0_notEmptySecondList() {
        List<Integer> secondList = Arrays.asList(3, 2, 1);
        List<Integer> firstList = Collections.emptyList();
        List<Integer> averageValue = collectionsBlock.collectionTask0(firstList, secondList);
        List<Integer> expectedValue = Arrays.asList(3, 2, 1);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask0_notEmptyLists() {
        List<Integer> secondList = Arrays.asList(3, 2, 1);
        List<Integer> firstList = Arrays.asList(-4, -5, -6);
        List<Integer> averageValue = collectionsBlock.collectionTask0(firstList, secondList);
        List<Integer> expectedValue = Arrays.asList(3, 2, 1, -4, -5, -6);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask0_mergeNotEmptyLists() {
        List<Integer> secondList = Arrays.asList(3, 1, -5);
        List<Integer> firstList = Arrays.asList(2, -4, -6);
        List<Integer> averageValue = collectionsBlock.collectionTask0(firstList, secondList);
        List<Integer> expectedValue = Arrays.asList(3, 2, 1, -4, -5, -6);
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void collectionTask0_throwsNPE() {
        collectionsBlock.collectionTask0(null, null);
    }

    @Test
    public void collectionTask1_emptyList() {
        List<Integer> inputList = Collections.emptyList();
        List<Integer> averageValue = collectionsBlock.collectionTask1(inputList);
        List<Integer> expectedValue = Collections.emptyList();
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask1_notEmptyList() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> averageValue = collectionsBlock.collectionTask1(inputList);
        List<Integer> expectedValue = Arrays.asList(1, 2, 1, 3, 1, 2, 4, 1, 2, 3, 5, 1, 2, 3, 4);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask2_emptyFirstList() {
        List<Integer> firstList = Collections.emptyList();
        List<Integer> secondList = Arrays.asList(3, 2, 1);
        boolean averageValue = collectionsBlock.collectionTask2(firstList, secondList);
        boolean expectedValue = false;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask2_emptyLists() {
        List<Integer> firstList = Collections.emptyList();
        List<Integer> secondList = Collections.emptyList();
        boolean averageValue = collectionsBlock.collectionTask2(firstList, secondList);
        boolean expectedValue = true;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask2_setsAreEqual() {
        List<Integer> firstList = Arrays.asList(4, 1, 3, 2);
        List<Integer> secondList = Arrays.asList(3, 2, 1, 4, 2, 1);
        boolean averageValue = collectionsBlock.collectionTask2(firstList, secondList);
        boolean expectedValue = true;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask2_setsAreNotEqual() {
        List<Integer> firstList = Arrays.asList(4, 1, 3, 2, 5);
        List<Integer> secondList = Arrays.asList(3, 2, 1, 4, 2, 1);
        boolean averageValue = collectionsBlock.collectionTask2(firstList, secondList);
        boolean expectedValue = false;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask3_emptyList() {
        List<Integer> inputList = Collections.emptyList();
        int n = 3;
        List<Integer> averageValue = collectionsBlock.collectionTask3(inputList, n);
        List<Integer> expectedValue = Collections.emptyList();
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask3_notEmptyList_rightShift() {
        List<Integer> inputList = Arrays.asList(4, 3, 2, 1);
        int n = 3;
        List<Integer> averageValue = collectionsBlock.collectionTask3(inputList, n);
        List<Integer> expectedValue = Arrays.asList(3, 2, 1, 4);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask3_notEmptyList_leftShift() {
        List<Integer> inputList = Arrays.asList(4, 3, 2, 1);
        int n = -3;
        List<Integer> averageValue = collectionsBlock.collectionTask3(inputList, n);
        List<Integer> expectedValue = Arrays.asList(1, 4, 3, 2);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask3_notEmptyList_largeLeftShift() {
        List<Integer> inputList = Arrays.asList(4, 3, 2, 1);
        int n = -2_000_000_003;
        List<Integer> averageValue = collectionsBlock.collectionTask3(inputList, n);
        List<Integer> expectedValue = Arrays.asList(1, 4, 3, 2);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask4_emptyList() {
        List<String> inputList = Collections.emptyList();
        String a = "Hello";
        String b = "Hi";
        List<String> averageValue = collectionsBlock.collectionTask4(inputList, a, b);
        List<String> expectedValue = Collections.emptyList();
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask4_notEmptyList() {
        List<String> inputList = Arrays.asList("Hello", ",", " ", "world");
        String a = "Hello";
        String b = "Hi";
        List<String> averageValue = collectionsBlock.collectionTask4(inputList, a, b);
        List<String> expectedValue = Arrays.asList("Hi", ",", " ", "world");
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void collectionTask4_notEmptyListMultipleReplace() {
        List<String> inputList = Arrays.asList("Hello", "Hello", ",", " ", "world", "Hello");
        String a = "Hello";
        String b = "Hi";
        List<String> averageValue = collectionsBlock.collectionTask4(inputList, a, b);
        List<String> expectedValue = Arrays.asList("Hi", "Hi", ",", " ", "world", "Hi");
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void collectionTask4_checkNull() {
        List<String> inputList = null;
        String a = "Hello";
        String b = "Hi";
        List<String> averageValue = collectionsBlock.collectionTask4(inputList, a, b);
        List<String> expectedValue = Arrays.asList("Hi", ",", " ", "world");
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void collectionTask4_checkNullB() {
        List<String> inputList = Collections.emptyList();
        String a = "Hello";
        collectionsBlock.collectionTask4(inputList, a, null);
    }

    @Test
    public void sortedStudents_notEmptyList() {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        List<Student> averageValue = collectionsBlock.sortedStudents(students);
        List<Student> expectedValue = Arrays.asList(dinar, olya, lena, serega, misha, sasha, dima);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void sortedStudents_emptyList() {
        List<Student> students = Collections.emptyList();
        List<Student> averageValue = collectionsBlock.sortedStudents(students);
        List<Student> expectedValue = Collections.emptyList();
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void sortedStudents_checkNull() {
        List<Student> students = null;
        List<Student> averageValue = collectionsBlock.sortedStudents(students);
        List<Student> expectedValue = Arrays.asList(dinar, olya, lena, serega, misha, sasha, dima);
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForMathInGroup1_notEmptyList() {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        int averageValue = collectionsBlock.averageMarkForMathInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForMathInGroup1_emptyList() {
        List<Student> students = Collections.emptyList();
        int averageValue = collectionsBlock.averageMarkForMathInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 0;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void averageMarkForMathInGroup1_checkNull() {
        List<Student> students = null;
        int averageValue = collectionsBlock.averageMarkForMathInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 0;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForLanguageInGroup1_notEmptyList() {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        int averageValue = collectionsBlock.averageMarkForLanguageInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForLanguageInGroup1_emptyList() {
        List<Student> students = Collections.emptyList();
        int averageValue = collectionsBlock.averageMarkForLanguageInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 0;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void averageMarkForLanguageInGroup1_checkNull() {
        List<Student> students = null;
        int averageValue = collectionsBlock.averageMarkForLanguageInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForPhysInGroup1_notEmptyList() {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        int averageValue = collectionsBlock.averageMarkForPhysInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 3;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForPhysInGroup1_emptyList() {
        List<Student> students = Collections.emptyList();
        int averageValue = collectionsBlock.averageMarkForPhysInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 0;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void averageMarkForPhysInGroup1_checkNull() {
        List<Student> students = null;
        int averageValue = collectionsBlock.averageMarkForPhysInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForBiologyInGroup1_notEmptyList() {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        int averageValue = collectionsBlock.averageMarkForBiologyInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForBiologyInGroup1_emptyList() {
        List<Student> students = Collections.emptyList();
        int averageValue = collectionsBlock.averageMarkForBiologyInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 0;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void averageMarkForBiologyInGroup1_checkNull() {
        List<Student> students = null;
        int averageValue = collectionsBlock.averageMarkForLanguageInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForPEInGroup1_notEmptyList() {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        int averageValue = collectionsBlock.averageMarkForPEInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void averageMarkForPEInGroup1_emptyList() {
        List<Student> students = Collections.emptyList();
        int averageValue = collectionsBlock.averageMarkForPEInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 0;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void averageMarkForPEInGroup1_checkNull() {
        List<Student> students = null;
        int averageValue = collectionsBlock.averageMarkForPEInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        int expectedValue = 4;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void getOlder_notEmptyList() throws Exception {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        Student averageValue = collectionsBlock.getOlder(students);
        Student expectedValue = sasha;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = Exception.class)
    public void getOlder_emptyList() throws Exception {
        List<Student> students = Collections.emptyList();
        Student averageValue = collectionsBlock.getOlder(students);
        Student expectedValue = sasha;
        assertEquals(expectedValue, averageValue);

    }

    @Test(expected = NullPointerException.class)
    public void getOlder_checkNull() throws Exception {
        List<Student> students = null;
        Student averageValue = collectionsBlock.getOlder(students);
        Student expectedValue = sasha;
        assertEquals(expectedValue, averageValue);

    }

    @Test
    public void getYoung_notEmptyList() throws Exception {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        Student averageValue = collectionsBlock.getYoung(students);
        Student expectedValue = olya;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = Exception.class)
    public void getYoung_emptyList() throws Exception {
        List<Student> students = Collections.emptyList();
        Student averageValue = collectionsBlock.getYoung(students);
        Student expectedValue = sasha;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void getYoung_checkNull() throws Exception {
        List<Student> students = null;
        Student averageValue = collectionsBlock.getYoung(students);
        Student expectedValue = sasha;
        assertEquals(expectedValue, averageValue);
    }

    @Test
    public void getBestStudentInGroup1_notEmptyList() throws Exception {
        List<Student> students = Arrays.asList(dinar, misha, sasha, lena, olya, dima, serega);
        Student averageValue = collectionsBlock.getBestStudentInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        Student expectedValue = misha;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = Exception.class)
    public void getBestStudentInGroup1_emptyList() throws Exception {
        List<Student> students = Collections.emptyList();
        Student averageValue = collectionsBlock.getBestStudentInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        Student expectedValue = misha;
        assertEquals(expectedValue, averageValue);
    }

    @Test(expected = NullPointerException.class)
    public void getBestStudentInGroup1_checkNull() throws Exception {
        List<Student> students = null;
        Student averageValue = collectionsBlock.getBestStudentInGroup(collectionsBlock.sortedByGroup(students, Student.GROUP1));
        Student expectedValue = misha;
        assertEquals(expectedValue, averageValue);
    }
}
