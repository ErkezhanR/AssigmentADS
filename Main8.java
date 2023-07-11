import java.util.regex.Pattern;

public class Main8 {

    public boolean containNumbersOnly(String source){
        boolean result = false;
        Pattern pattern = Pattern.compile("[0-9]+.[0-9]+");
        pattern = Pattern.compile("\\d+.\\d+");

        result = pattern.matcher(source).matches();
        if(result){
            System.out.println("\"" + source + "\""  + " is a number");
        }else
            System.out.println("\"" + source + "\""  + " is a String");
        return result;
    }

    public static void main(String[] args){
        Main8 obj = new Main8();
        obj.containNumbersOnly("123456");
        obj.containNumbersOnly("123a12  ");
    }

}