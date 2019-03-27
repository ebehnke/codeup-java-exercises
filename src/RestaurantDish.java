class RestaurantDish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    static void eat() { // static allows RestaurantTest.java as RestaurantDish.eat instead of dish.eat //its a way to
        // target all of restaurantDish instead of specific props
        System.out.println("Nom nom nom!");
    }

    public static RestaurantDish returnLowestCost(RestaurantDish p1, RestaurantDish p2) { //
        return (p1.costInCents < p2.costInCents) ? p1 : p2; // if 1st dish is less than 2nd, return first.
    }

    // @Override and use String toString().... to create method that prints all of a class into a string
}


    ///Create a class called "RestaurantDish" (you should not include quotes)
    //
    //   Include an integer property called "costInCents"
    //   Include a string property called "nameOfDish"
    //   Include a boolean property called "wouldRecommend"
    //   Include a method called "eat"
    //       this method will print out "Nom nom nom!"


