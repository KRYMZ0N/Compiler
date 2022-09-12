package keyword;

public class Keyword {
    String name;
    String value;

    public Keyword(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void onEnable() {

    }

    public String gerValue() {
        return value;
    }

    public void setValue(String s) {
        value = s;
    }
}
