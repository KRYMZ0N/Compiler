package keyword.keywords;

import keyword.Keyword;

public class PRINT extends Keyword {


    public PRINT() {
        super("PRINT", "");




    }

    @Override
    public void onEnable() {
        printing(gerValue());


    }

    public static void printing(String s) {
        System.out.println(s);
    }
}
