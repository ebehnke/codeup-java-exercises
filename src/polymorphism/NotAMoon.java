package polymorphism;

public class NotAMoon {
    public boolean isAMoon = false;
    public String name;
    public String statement1;

    //
    public String statement() {
        return "That's.. " + this.name;
    }


//    public NotAMoon(){
//    }

    public NotAMoon(String newName){
        name = newName;
        statement1 = "That's no moon.. that's a .." + this.name;
    }

    public boolean isAMoon() {
        return isAMoon;
    }

    public void setAMoon(boolean AMoon) {
        isAMoon = AMoon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
