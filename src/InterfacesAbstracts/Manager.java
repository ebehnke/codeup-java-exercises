package InterfacesAbstracts;

public class Manager extends Employee {

    private Manager(String name, String department){
        super(name, department);
    }

    public String work() {
        return "holding meetings";
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Jim", "HR");
        Developer developer = new Developer("Sally");

        System.out.println(manager.name + " is " + manager.work() + " in " + manager.department + " because " +
                developer.name + " in " + developer.department + " was complaining about a " +
                "hostile work " +
                "environment while she was " + developer.work());
    }
}


