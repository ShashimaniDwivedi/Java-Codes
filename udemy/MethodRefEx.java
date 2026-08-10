import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String>name=Arrays.asList("Manas","Rani","Benny","Adam");
        List<String>uNames=name.stream().map(String::toUpperCase).toList();
        System.out.println(uNames);
    }
}
