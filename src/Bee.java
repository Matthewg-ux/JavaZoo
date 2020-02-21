public class Bee extends Animal {

    public Bee(String name) {
        super(name, "pollen");
    }

    public void sleep() {
        System.out.println(name + " never sleeps");
    }

    public void eat(String food) {
        if(food == favoriteFood){
            System.out.println(this.name + " eats " + food);
            System.out.println("Yum! " + this.name + " wants more food!");
        }else{
            System.out.println("Yuck! " + this.name + " will not eat this " + food);
            sleep();
        }

    }

}
