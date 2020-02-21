public class Giraffe extends Animal{

    public Giraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food) {
        if(food == favoriteFood){
            System.out.println(this.name + " eats " + food);
            System.out.println("Yum! " + this.name + " wants more food!");
        }else{
            System.out.println("Yuck! " + this.name + " will not eat this " + food);
        }

    }

}
