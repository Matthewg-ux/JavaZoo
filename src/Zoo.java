public class Zoo {


    public static void main(String[] args) {

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmellows");
        rarity.eat("meat");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("kibble");
        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");
        stinger.eat("meat");
        Zookeeper z = new Zookeeper("Zoebot");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        z.feedAnimals(animals, "steak");

    }

//    public void sleep(String name){
//        System.out.println(name + " sleeps for 8 hours");
 //   }

  //  String favouriteFood = "bacon";

    //public void eat(String name, String food) {
      //  System.out.println(name + " eats " + food);
        //if (food == favouriteFood) {
          //  System.out.println("Yum! " + name + "wants more food!");
        //}
    //}

}