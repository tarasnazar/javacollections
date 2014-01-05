import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String> lines = getLines();
        System.out.println(lines);
        Set<String> uniqLines = new LinkedHashSet<String>(lines);
        System.out.println("uniq");System.out.println(uniqLines);
    }

    private static List<String> getLines() {
        // TODO Auto-generated method stub
        return Arrays.asList("12", "23", "12", "34", "12");
    }


}
