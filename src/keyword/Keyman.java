package keyword;

import keyword.keywords.PRINT;

import java.util.ArrayList;

public class Keyman {

    public static ArrayList<Keyword> list = new ArrayList<>();

    public Keyman() {
        list.add(new PRINT());
    }
}
