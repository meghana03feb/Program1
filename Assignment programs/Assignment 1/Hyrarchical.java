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
        System.out.println("Eating " + this.name + ".");
    }
}
class Pizza extends Food {
    private String topping;
 public Pizza(String name, String topping) {
        super(name); 
        this.topping = topping;
    }
public void bake() {
        System.out.println("Baking " + getName() + " with " + this.topping + ".");
    }
}
class Burger extends Food {
    private boolean hasCheese;
  public Burger(String name, boolean hasCheese) {
        super(name); 
        this.hasCheese = hasCheese;
    }
  public void grill() {
        System.out.println("Grilling the " + getName() + " patty.");
    }
}
public class Hyrarchical {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza("Pizza", "Pepperoni");
        myPizza.eat();  
        myPizza.bake(); 
        System.out.println();
        Burger myBurger = new Burger("Burger", true);
        myBurger.eat();   
        myBurger.grill(); 
    }
}
