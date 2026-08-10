import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// ============================================================
// COMPARABLE
// ============================================================

// Student implements Comparable.
// This means Student itself defines its "natural/default" sorting.
class Student implements Comparable<Student> {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // compareTo() is used by Comparable.
    // Here we are sorting students by ID.
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}


// ============================================================
// COMPARATOR
// ============================================================

// Comparator is used when we want a different/custom sorting
// without changing the Student class.
class SortByMarks implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        // Sort by marks
        return s1.marks - s2.marks;
    }
}


// Comparator for sorting by name
class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        return s1.name.compareTo(s2.name);
    }
}


// ============================================================
// MAIN CLASS
// ============================================================

public class Compare {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 75));
        students.add(new Student(101, "Manas", 90));
        students.add(new Student(102, "Aman", 80));


        // ====================================================
        // COMPARABLE
        // ====================================================

        // Collections.sort() calls compareTo().
        // Student's compareTo() sorts by ID.

        Collections.sort(students);

        System.out.println("Sorted by ID (Comparable):");

        for (Student s : students) {
            System.out.println(s);
        }


        // ====================================================
        // COMPARATOR
        // ====================================================

        // Here we provide a separate Comparator.
        // It sorts students by MARKS.

        Collections.sort(students, new SortByMarks());

        System.out.println("\nSorted by Marks (Comparator):");

        for (Student s : students) {
            System.out.println(s);
        }


        // ====================================================
        // COMPARATOR - SORT BY NAME
        // ====================================================

        Collections.sort(students, new SortByName());

        System.out.println("\nSorted by Name (Comparator):");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}