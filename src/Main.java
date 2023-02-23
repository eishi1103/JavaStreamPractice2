import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> G8 = new ArrayList<String>();
        G8.add("Japan");
        G8.add("USA");
        G8.add("Canada");
        G8.add("United Kingdom");
        G8.add("France");
        G8.add("Germany");
        G8.add("Italy");
        G8.add("Russia");

        //G8の国々からアジアにある国のみフィルターをかけて抽出
        List<String> expelled = G8.stream()
                .filter(country -> country.equals("Russia"))
                .toList();

        System.out.println(expelled + "はG8から追放されました。");
        G8.removeAll(expelled);

        List<String> G7 = new ArrayList<String>();
        G7.addAll(G8);

        System.out.println("G7の加盟国は下記となります↓");
        G7.forEach(System.out::println);

        System.out.println("G7の加盟国を大文字に変えます↓");
        G7.stream().map(countries -> countries.toUpperCase())
                .forEach(countries -> System.out.println(countries));
    }

}
