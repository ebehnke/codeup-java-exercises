public class ServerNameGenerator {
    //Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
    static String[] adjectives = {
            "hairy",
            "annoying",
            "cloudy",
            "baggy",
            "heavy",
            "expensive",
            "pretty",
            "wasteful",
            "frustrating",
            "silly"};

    static String[] nouns = {
            "arms",
            "salesman",
            "sky",
            "skateboard",
            "elevator",
            "watch",
            "clown",
            "garbage",
            "chair",
            "table"};

    //Create a method that will return a random element from an array of strings.
    static String returnRandomString(String[] stringArray){
        int randomNumber = (int) (Math.random() * stringArray.length);
        return stringArray[randomNumber];

    }
    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
//        ServerNameGenerator sng = new ServerNameGenerator(); // use sng.adjectives if not static
        String randomNoun = returnRandomString(nouns);
        String randomAdjective = ServerNameGenerator.returnRandomString(adjectives); //ServerNameGenerator prefix not
        // needed;

        System.out.printf("%s-%s", randomAdjective, randomNoun);

    }
}
