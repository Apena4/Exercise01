import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String city= "Columbus";
        int zipcode = 43215;
        double weather[] = {32, 25, 27, 40, 45};
        double sum = Arrays.stream(weather).sum() / weather.length;
        System.out.println("City: " + city +"  Zipcode: " + zipcode + "  Average Temperature: "+ sum);
    }
}