public class StringExample {

    public static void main(String[] args) {

        // =====================================================
        // 1. STRING
        // =====================================================

        String str = "Hello Java";

        System.out.println("STRING");
        System.out.println("Original: " + str);

        System.out.println("Length: " + str.length());
        System.out.println("charAt: " + str.charAt(1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Substring: " + str.substring(6));
        System.out.println("Substring: " + str.substring(0, 5));

        System.out.println("Contains Java: " + str.contains("Java"));
        System.out.println("Starts with Hello: " + str.startsWith("Hello"));
        System.out.println("Ends with Java: " + str.endsWith("Java"));

        System.out.println("Index of J: " + str.indexOf("J"));
        System.out.println("Last index of a: " + str.lastIndexOf("a"));

        System.out.println("Replace: " +
                str.replace("Java", "World"));

        System.out.println("Equals: " +
                str.equals("Hello Java"));

        System.out.println("Equals Ignore Case: " +
                str.equalsIgnoreCase("hello java"));

        String space = "   Java   ";
        System.out.println("Trim: " + space.trim());

        System.out.println("Is Empty: " + "".isEmpty());

        System.out.println();


        // =====================================================
        // 2. STRING CONCATENATION
        // =====================================================

        System.out.println("STRING CONCATENATION");

        String firstName = "Manas";
        String lastName = "Dwivedi";

        String fullName = firstName + " " + lastName;

        System.out.println("Using + : " + fullName);

        System.out.println("Using concat(): " +
                firstName.concat(" ").concat(lastName));

        System.out.println();


        // =====================================================
        // 3. STRING SPLIT
        // =====================================================

        System.out.println("STRING SPLIT");

        String data = "Java,Python,C++";

        String[] languages = data.split(",");

        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println();


        // =====================================================
        // 4. STRINGBUFFER
        // =====================================================

        System.out.println("STRINGBUFFER");

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original: " + sb);

        // append()
        sb.append(" Java");
        System.out.println("append(): " + sb);

        // insert()
        sb.insert(6, "World ");
        System.out.println("insert(): " + sb);

        // replace()
        sb.replace(6, 12, "Amazing");
        System.out.println("replace(): " + sb);

        // delete()
        sb.delete(6, 14);
        System.out.println("delete(): " + sb);

        // reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // reverse again
        sb.reverse();

        // charAt()
        System.out.println("charAt(): " + sb.charAt(1));

        // setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt(): " + sb);

        // length()
        System.out.println("length(): " + sb.length());

        // capacity()
        System.out.println("capacity(): " + sb.capacity());

        System.out.println();


        // =====================================================
        // 5. STRINGBUILDER
        // =====================================================

        System.out.println("STRINGBUILDER");

        StringBuilder builder = new StringBuilder("Hello");

        System.out.println("Original: " + builder);

        // append()
        builder.append(" Java");
        System.out.println("append(): " + builder);

        // insert()
        builder.insert(6, "World ");
        System.out.println("insert(): " + builder);

        // replace()
        builder.replace(6, 12, "Amazing");
        System.out.println("replace(): " + builder);

        // delete()
        builder.delete(6, 14);
        System.out.println("delete(): " + builder);

        // reverse()
        builder.reverse();
        System.out.println("reverse(): " + builder);

        // reverse again
        builder.reverse();

        // charAt()
        System.out.println("charAt(): " + builder.charAt(1));

        // setCharAt()
        builder.setCharAt(0, 'h');
        System.out.println("setCharAt(): " + builder);

        // length()
        System.out.println("length(): " + builder.length());

        // capacity()
        System.out.println("capacity(): " + builder.capacity());
    }
}