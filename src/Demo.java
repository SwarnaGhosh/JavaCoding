
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> al= Arrays.asList("ABC","JAVA","C","C++");
        al.stream().forEach(System.out::println);
        List<String> result=al.stream().filter(value->"Java".equalsIgnoreCase(value)).collect(Collectors.toList());

        result.forEach(System.out::println);
        System.out.println("---------------------------------------");

        List<Integer> num= Arrays.asList(10,20,30,40,20,23,23,34);
        List<Integer> result1 = num.stream().distinct().collect(Collectors.toList());

        result1.forEach(System.out::println);

        System.out.println("-----------------------------------------"
        );

        List<Integer> num1 = Arrays.asList(30,35,29,67,65,54,70);
        List<Integer> result2 = num1.stream().sorted().collect(Collectors.toList());

        result2.forEach(System.out::println);

        System.out.println("-----------------------------------------"
        );

        List<Integer> num2 = Arrays.asList(30,35,29,67,65,54,70);
        List<Integer> result3 = num1.stream().filter(number->number>50).collect(Collectors.toList());

        result3.forEach(System.out::println);

        System.out.println("-----------------------------------------"
        );








    }


}
