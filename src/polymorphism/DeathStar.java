package polymorphism;

import java.util.Arrays;

public class DeathStar extends NotAMoon{

//    public DeathStar(){
//
//    }

    public DeathStar(String name){
        super(name);
    }

    public void shootLaserBeam() {
        System.out.println("pew pew");
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        DeathStar deathStar = new DeathStar("DEATHSTAR");
        NotAMoon[] notMoons = new NotAMoon[7];
//        notMoons[1] =
//        notMoons[0] = deathStar;
//        notMoons[0].name = "DeathStar";
        notMoons[1] = new NotAMoon("Herald");
//        notMoons[1].setName("Herald");

//        System.out.println("Deathstar is a moon: " + notMoons[0].isAMoon);
        System.out.println(deathStar.name);
        System.out.println(deathStar.statement1);
        deathStar.shootLaserBeam();
//        System.out.println(notMoons[0].name);
//        System.out.println(notMoons[0].statement);
        // notMoons[0].shootLaserBeam(); // not accessible
//        System.out.println(notMoons[1].name);
//        System.out.println(notMoons[1].statement());
//        System.out.println(super.name);


//        System.out.println();Arrays.toString(notMoons);
        Arrays.fill(notMoons,0,7, deathStar);
        System.out.println(Arrays.toString(notMoons));
        System.out.println(notMoons[3].name);

    }

}
