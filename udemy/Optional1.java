//The main use of Optional is to handle a value that may be null without directly causing a NullPointerException.

import java.util.*;
import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        List<String>name=Arrays.asList("Manas","Rani","Benny","Adam");
        Optional<String> names=name.stream().filter(str->str.contains("e")).findFirst();
        System.out.println(names.orElse("Not found"));
    }
}
