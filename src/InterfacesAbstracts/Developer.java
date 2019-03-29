package InterfacesAbstracts;

public class Developer extends Employee {

    Developer(String name){
        super(name, "IT");
    }

    public String work() {
        return "writing code";
    }

}
