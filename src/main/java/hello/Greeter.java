package hello;

public class Greeter {
    private String name = "";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String sayHello() {
        if (name == "") {
            return "Hello null name enter--test!";
        } else {
            return "Hello My name is print here " + name + "!";
        }
    }
}