package core_java;
class Food {
    private String name;
public Food(String name) {
        this.name = name;
    }
public String getName() {
        return this.name;
    }
  public void eat() {
        System.out.println("Eating " + this.name);
    }
}
class Pizza extends Food {
    private String topping;

    public Pizza(String name, String topping) {
        super(name);
        this.topping = topping;
    }
 public String getTopping() {
        return this.topping;
    }
public void bake() {
        System.out.println("Baking the " + getName() + " pizza...");
    }
}
class Slice extends Pizza {
    private int size; 

    public Slice(String name, String topping, int size) {
        super(name, topping); 
        this.size = size;
    }

    public void hold() {
        System.out.println("Holding a " + this.size + " inch slice.");
    }

    public void show() {
        System.out.println("This is a " + getName() + " with " + getTopping());
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Slice choice = new Slice("Pizza", "Cheese", 8);
        choice.eat();  
        choice.bake();
        choice.hold(); 
        choice.show(); 
    }
}
