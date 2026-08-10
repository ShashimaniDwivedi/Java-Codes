import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

        // =====================================================
        // 1. ARRAYLIST
        // =====================================================
        // ArrayList stores elements in insertion order.
        // It allows duplicate values.
        // It uses a dynamic array internally.

        ArrayList<String> names = new ArrayList<>();

        names.add("Manas");
        names.add("Rahul");
        names.add("Aman");
        names.add("Manas"); // Duplicate is allowed

        System.out.println("ArrayList: " + names);

        // Access element using index
        System.out.println("First name: " + names.get(0));

        // Remove an element
        names.remove("Rahul");

        System.out.println("After removal: " + names);
        //Iterator to iterate throw collection
        Iterator<String>n=names.iterator();
        System.out.println("Printing using Iterator");
        while(n.hasNext()){
            System.out.println(n.next());
        }

        // =====================================================
        // 2. LINKEDLIST
        // =====================================================
        // LinkedList stores elements as linked nodes.
        // It allows duplicates.
        // It maintains insertion order.
        // It can be used as a List, Queue, or Deque.

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Lucknow");
        cities.add("Delhi");
        cities.add("Mumbai");

        // Add element at the beginning
        cities.addFirst("Varanasi");

        // Add element at the end
        cities.addLast("Jaipur");

        System.out.println("\nLinkedList: " + cities);


        // =====================================================
        // 3. HASHSET
        // =====================================================
        // HashSet stores UNIQUE elements.
        // Duplicate values are automatically ignored.
        // It does NOT guarantee insertion order.

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate - ignored

        System.out.println("\nHashSet: " + numbers);


        // =====================================================
        // 4. TREESET
        // =====================================================
        // TreeSet stores UNIQUE elements.
        // Elements are automatically stored in SORTED order.

        TreeSet<Integer> sortedNumbers = new TreeSet<>();

        sortedNumbers.add(50);
        sortedNumbers.add(10);
        sortedNumbers.add(30);
        sortedNumbers.add(20);
        sortedNumbers.add(10);

        System.out.println("\nTreeSet: " + sortedNumbers);


        // =====================================================
        // 5. HASHMAP
        // =====================================================
        // HashMap stores data in KEY-VALUE pairs.
        // Keys must be UNIQUE.
        // Values can be duplicated.
        // HashMap does NOT guarantee order.

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Manas");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        // Same key -> old value gets replaced
        students.put(102, "Rohit");

        System.out.println("\nHashMap: " + students);

        // Get value using key
        System.out.println("Student 101: " + students.get(101));


        // =====================================================
        // 6. TREEMAP
        // =====================================================
        // TreeMap stores key-value pairs.
        // Keys are automatically sorted.
        // Keys must be unique.

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(103, "Aman");
        employees.put(101, "Manas");
        employees.put(102, "Rahul");

        System.out.println("\nTreeMap: " + employees);


        // =====================================================
        // 7. ITERATING THROUGH A COLLECTION
        // =====================================================

        System.out.println("\nStudents:");

        for (String student : names) {
            System.out.println(student);
        }


        // =====================================================
        // 8. ITERATING THROUGH HASHMAP
        // =====================================================
        // entrySet() gives us both key and value.

        System.out.println("\nStudent Details:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                "Roll No: " + entry.getKey() +
                ", Name: " + entry.getValue()
            );
        }

        // =====================================================
        // 1. HASHMAP
        // =====================================================

        // HashMap stores data in KEY-VALUE pairs.
        // Key must be unique.
        // Values can be duplicate.
        // HashMap is NOT synchronized.
        // HashMap allows ONE null key and multiple null values.

        HashMap<Integer, String> student = new HashMap<>();

        // Adding key-value pairs
        student.put(101, "Manas");
        student.put(102, "Rahul");
        student.put(103, "Aman");

        // Duplicate key
        // The old value "Rahul" will be replaced by "Rohit".
        student.put(102, "Rohit");

        // Null key and null value are allowed in HashMap
        student.put(null, "Unknown");
        student.put(104, null);

        System.out.println("HashMap:");
        System.out.println(student);

        // Get value using key
        System.out.println("Student 101: " + student.get(101));

        // Check whether a key exists
        System.out.println("Contains key 103: "
                + student.containsKey(103));

        // Check whether a value exists
        System.out.println("Contains value Aman: "
                + student.containsValue("Aman"));

        // Remove using key
        student.remove(104);

        System.out.println("After removing 104: " + student);


        // =====================================================
        // 2. HASHTABLE
        // =====================================================

        // Hashtable also stores data in KEY-VALUE pairs.
        // Key must be unique.
        // Values can be duplicate.
        // Hashtable is synchronized.
        // Hashtable does NOT allow null key or null value.

        Hashtable<Integer, String> employee = new Hashtable<>();

        // Adding key-value pairs
        employee.put(1, "John");
        employee.put(2, "David");
        employee.put(3, "Alex");

        // Duplicate key
        // Old value "David" is replaced by "Robert".
        employee.put(2, "Robert");

        System.out.println("\nHashtable:");
        System.out.println(employee);

        // Get value using key
        System.out.println("Employee 1: "
                + employee.get(1));

        // Check key
        System.out.println("Contains key 3: "
                + employee.containsKey(3));

        // Remove using key
        employee.remove(3);

        System.out.println("After removing 3: "
                + employee);


        // =====================================================
        // NULL EXAMPLE
        // =====================================================

        // HashMap allows null
        HashMap<Integer, String> map = new HashMap<>();

        map.put(null, "Hello");
        map.put(1, null);

        System.out.println("\nHashMap with null:");
        System.out.println(map);


        // Hashtable does NOT allow null.
        // Uncommenting the following line will cause
        // NullPointerException.

        // employees.put(null, "Test");
        // employees.put(4, null);

    }
}