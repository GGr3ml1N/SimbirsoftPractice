package com.ggr3ml1n.collections;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

import com.ggr3ml1n.classes.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see CollectionsBlockTest.
 */
public class CollectionsBlock<T extends Comparable> {

    /**
     * Даны два упорядоченных по убыванию списка.
     * Объедините их в новый упорядоченный по убыванию список.
     * Исходные данные не проверяются на упорядоченность в рамках данного задания
     *
     * @param firstList  первый упорядоченный по убыванию список
     * @param secondList второй упорядоченный по убыванию список
     * @return объединенный упорядоченный список
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask0(@NonNull List<T> firstList, @NonNull List<T> secondList) {
        List<T> _firstList = new ArrayList<>(firstList);
        List<T> _secondList = new ArrayList<>(secondList);
        _firstList.addAll(_secondList);
        _firstList.sort(Comparator.reverseOrder());
        return _firstList;
    }

    /**
     * Дан список. После каждого элемента добавьте предшествующую ему часть списка.
     *
     * @param inputList с исходными данными
     * @return измененный список
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask1(@NonNull List<T> inputList) {
        List<T> _inputList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            _inputList.add(inputList.get(i));
            _inputList.addAll(inputList.subList(0, i));
        }
        return _inputList;
    }

    /**
     * Даны два списка. Определите, совпадают ли множества их элементов.
     *
     * @param firstList  первый список элементов
     * @param secondList второй список элементов
     * @return <tt>true</tt> если множества списков совпадают
     * @throws NullPointerException если один из параметров null
     */
    public boolean collectionTask2(@NonNull List<T> firstList, @NonNull List<T> secondList) {
        Set<T> _firstList = new HashSet<>(firstList);
        Set<T> _secondList = new HashSet<>(secondList);
        if (_firstList.equals(_secondList)) return true;
        return false;
    }

    /**
     * Создать список из заданного количества элементов.
     * Выполнить циклический сдвиг этого списка на N элементов вправо или влево.
     * Если N > 0 циклический сдвиг вправо.
     * Если N < 0 циклический сдвиг влево.
     *
     * @param inputList список, для которого выполняется циклический сдвиг влево
     * @param n         количество шагов циклического сдвига N
     * @return список inputList после циклического сдвига
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask3(@NonNull List<T> inputList, int n) throws NullPointerException{
        if (inputList == null) throw new NullPointerException();
        if (inputList.isEmpty()) return inputList;
        List<T> _inputList = new ArrayList<>(inputList);
        int _n;
        if (Math.abs(n) > inputList.size()) {
            _n = n - (n / inputList.size() * inputList.size());
        } else {
            _n = n;
        }
        if (_n > 0) {
            for (int i = 0; i < _n; i++) {
                T x = _inputList.get(_inputList.size()-1);

                for (int j = _inputList.size()-1; j > 0; j--) {
                    _inputList.set(j,_inputList.get(j-1));
                }
                _inputList.set(0,x);
            }
        } else {
            for (int i = 0; i > _n; i--) {
                T x = _inputList.get(0);

                for (int j = 1; j < _inputList.size(); j++) {
                    _inputList.set(j-1,_inputList.get(j));
                }
                _inputList.set(_inputList.size()-1,x);
            }
        }
        return _inputList;
    }

    /**
     * Элементы списка хранят слова предложения.
     * Замените каждое вхождение слова A на B.
     *
     * @param inputList список со словами предложения и пробелами для разделения слов
     * @param a         слово, которое нужно заменить
     * @param b         слово, на которое нужно заменить
     * @return список после замены каждого вхождения слова A на слово В
     * @throws NullPointerException если один из параметров null
     */
    public List<String> collectionTask4(@NonNull List<String> inputList,
                                        @NonNull String a,
                                        @NonNull String b) throws NullPointerException{
        if (b == null) throw new NullPointerException();
        List<String> _inputList = new ArrayList<>(inputList);
        for (int i = 0; i < _inputList.size(); i++) {
            if (a.equals(_inputList.get(i))) {
                _inputList.remove(a);
                _inputList.add(i, b);
            }
        }
        return _inputList;
    }

    /*
     * Задание подразумевает создание класса(ов) для выполнения задачи.
     * <p>
     * Дан список студентов. Элемент списка содержит фамилию, имя, отчество, год рождения,
     * курс, номер группы, оценки по пяти предметам. Заполните список и выполните задание.
     * Упорядочите студентов по курсу, причем студенты одного курса располагались
     * в алфавитном порядке. Найдите средний балл каждой группы по каждому предмету.
     * Определите самого старшего студента и самого младшего студентов.
     * Для каждой группы найдите лучшего с точки зрения успеваемости студента.
     */
    public List<Student> sortedStudents(List<Student> students) throws NullPointerException {

        if (students == null) throw new NullPointerException();

        List<Student> sortedStudents = new ArrayList<>();

        for (int i = 1; i <= 5; i++){
            sortedStudents.addAll(sortedByCourses(students,i));
        }

        return sortedStudents;
    }


    public List<Student> sortedByCourses(List<Student> students, int course) throws NullPointerException {

        if (students == null) throw new NullPointerException();

        List<Student> _students = new ArrayList<>(students);
        Comparator<Student> nameComparator = Comparator.comparing(Student::getFirstName);
        List<Student> sortedByCourse = new ArrayList<>();

        for (Student student : _students) {
            if (student.getCourse() == course) {
                sortedByCourse.add(student);
            }
        }
        sortedByCourse.sort(nameComparator);

        return sortedByCourse;
    }

    public int averageMarkForLanguageInGroup(List<Student> sortedByGroupStudents) throws NullPointerException {
        if (sortedByGroupStudents == null) throw new NullPointerException();
        int average = 0;
        for (Student student: sortedByGroupStudents) {
            average+= student.getMarkLanguage();
        }
        average = (int) Math.round((double) average / (double) sortedByGroupStudents.size());
        return average;
    }

    public int averageMarkForPhysInGroup(List<Student> sortedByGroupStudents) throws NullPointerException {
        if (sortedByGroupStudents == null) throw new NullPointerException();
        int average = 0;
        for (Student student: sortedByGroupStudents) {
            average+= student.getMarkPhys();
        }
        average = (int) Math.round((double) average / (double) sortedByGroupStudents.size());
        return average;
    }

    public int averageMarkForBiologyInGroup(List<Student> sortedByGroupStudents) throws NullPointerException {
        if (sortedByGroupStudents == null) throw new NullPointerException();
        int average = 0;
        for (Student student: sortedByGroupStudents) {
            average+= student.getMarkBiology();
        }
        average = (int) Math.round((double) average / (double) sortedByGroupStudents.size());
        return average;
    }
    public int averageMarkForPEInGroup(List<Student> sortedByGroupStudents) throws NullPointerException {
        if (sortedByGroupStudents == null) throw new NullPointerException();
        int average = 0;
        for (Student student: sortedByGroupStudents) {
            average+= student.getMarkPE();
        }
        average = (int) Math.round((double) average / (double) sortedByGroupStudents.size());
        return average;
    }

    public int averageMarkForMathInGroup(List<Student> sortedByGroupStudents) throws NullPointerException {
        if (sortedByGroupStudents == null) throw new NullPointerException();
        int average = 0;
        for (Student student: sortedByGroupStudents) {
            average+= student.getMarkMath();
        }
        average = (int) Math.round((double) average / (double) sortedByGroupStudents.size());
        return average;
    }

    public List<Student> sortedByGroup(List<Student> students, int groupNumber){
        List<Student> sortedByGroup = new ArrayList<>();
        for (Student student: students) {
            if (student.getNumberOfGroup() == groupNumber){
                sortedByGroup.add(student);
            }
        }
        return sortedByGroup;
    }

    public Student getOlder (List<Student> students) throws Exception {
        if (students.isEmpty()) {
            throw new Exception("InputListIsEmpty");
        } else {
            List<Student> _students = new ArrayList<>(students);
            Student oldest = _students.get(0);
            for (int i = 0; i < students.size() - 1; i++) {
                if (oldest.getYearOfBirth() > _students.get(i).getYearOfBirth()) {
                    oldest = _students.get(i);
                }
            }
            return oldest;
        }
    }

    public Student getYoung (List<Student> students) throws Exception{
        if (students.isEmpty()) {
            throw new Exception("InputListIsEmpty");
        } else {
            List<Student> _students = new ArrayList<>(students);
            Student young = _students.get(0);
            for (int i = 0; i < students.size(); i++) {
                if (young.getYearOfBirth() < _students.get(i).getYearOfBirth()) {
                    young = _students.get(i);
                }
            }
            return young;
        }
    }

    public Student getBestStudentInGroup (List<Student> sortedByGroup) throws Exception {
        if (sortedByGroup == null) throw new NullPointerException();
        if (sortedByGroup.isEmpty()) throw new Exception("InputListIsEmpty");
        int[] average = new int[sortedByGroup.size()];
        for (int i = 0; i < sortedByGroup.size(); i++) {
            average[i] = (sortedByGroup.get(i).getMarkMath() +
                    sortedByGroup.get(i).getMarkLanguage() +
                    sortedByGroup.get(i).getMarkPhys() +
                    sortedByGroup.get(i).getMarkBiology() +
                    sortedByGroup.get(i).getMarkPE()) / 5;
        }
        int highest = average[0];
        for (int i = 0; i < average.length; i++) {
            if (highest < average[i]) {
                highest = average[i];
            }
        }
        int i = 0;
        while (highest != average[i]){
            i++;
        }
        return sortedByGroup.get(i);
    }
}
