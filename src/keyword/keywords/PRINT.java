package keyword.keywords;

import keyword.Keyword;

public class PRINT extends Keyword {

    public PRINT() {
        super("PRINT");



    }

    @Override
    public void onEnable() {
        System.out.println();
    }


}
