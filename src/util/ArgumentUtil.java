package util;

public class ArgumentUtil {

    public static String[] parseStringCom(String s) { // Parsing through a string using a space as the delimeter. then adding to array
        String[] newS =  s.split(" ");


        return newS;
    }
}
