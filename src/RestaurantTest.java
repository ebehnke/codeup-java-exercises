class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
            dish.costInCents = 10;
            dish.nameOfDish = "salad";
            dish.wouldRecommend = true;

        RestaurantDish dish2 = new RestaurantDish();
            dish2.costInCents = 5;
            dish2.nameOfDish = "drink";
            dish2.wouldRecommend = false;

        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);



        RestaurantDish.eat();

    }
}






    //   Create another class called RestaurantTest
    //   Add a main method and inside the method...
    //       1) instantiate a RestaurantDish object called "dish"
    //       2) assign creative values for each of the properties
    //       3) print out each of the property values
    //       4) test the eat() method by calling it
