import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LaunchSTR {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 8, 4, 9, 7, 8);
        //Making stream***********
        Stream<Integer> streamData = list.stream();
         //streamData.forEach(n->System.out.print(n +" "));
       //Stream<Integer> sortedStream=streamData.sorted();
       // sortedStream.forEach(n->System.out.print(n +" "));
      //Stream<Integer> mapStream=sortedStream.map(n->n*2);
       // mapStream.forEach(n->System.out.print(n +" "));
       /* Predicate<Integer>pre=new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i % 2 == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        };*/
        Predicate<Integer>pre=i->i*2==0;
        Stream<Integer> finalstream = streamData.filter(pre).sorted().map(n->n*2);
          finalstream.forEach(n -> System.out.println(n));
        //Stream<Integer> sorted = fill.sorted();
        //Stream<Integer> doustream = sorted.map(n -> n * 2);


    }
}
