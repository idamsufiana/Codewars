import java.util.Arrays;
import java.util.stream.Collectors;

public class abreviation {

    public String input;

    public abreviation(String input){
        this.input = input;
    }

    public String solustion(){
        return Arrays
        .stream(input.split(" "))
        .map(s-> String.valueOf(s.charAt(0)).toUpperCase())
        .collect(Collectors.joining("."));
    }
    
}
