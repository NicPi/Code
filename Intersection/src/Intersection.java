import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection {

    public static void main(String[] args){

        List<String> listOne = Arrays.asList("A","B","C");
        List<String> listTwo = Arrays.asList("A","C","D","F");

        Intersection intersection = new Intersection();

        //get the intersection. Expecting "A", "C"
        intersection.getIntersection(listOne, listTwo);
    }

    //get the intersection via the stream function
    public void getIntersection(List<String> listOne, List<String> listTwo){

        List<String> intersect = listOne.stream().filter(listTwo::contains).collect(Collectors.toList());
        System.out.println(intersect);
    }
}
