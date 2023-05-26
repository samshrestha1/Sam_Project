import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal jay = new Animal("Jay", 10);
        jay.setName("Nischu");
        jay.setAge(100);
        List<String> text = jay.getText();
        List<Integer> number = jay.getNumber();
//        List<Character> collect = text.stream().map(val -> val.charAt(1)).toList();
        number.forEach(val->System.out.print("Name: "+number + "\n"));
    }
}