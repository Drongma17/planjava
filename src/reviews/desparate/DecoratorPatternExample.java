package reviews.desparate;

// Component Interface
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 2.0;
    }
}

// Decorator (Abstract Wrapper)
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

// Concrete Decorator: Add Milk
class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}

// Concrete Decorator: Add Sugar
class WithSugar extends CoffeeDecorator {
    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.3;
    }
}

// Concrete Decorator: Add Whipped Cream
class WithWhippedCream extends CoffeeDecorator {
    public WithWhippedCream(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whipped Cream";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.7;
    }
}

// Test the Decorator Pattern
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new WithMilk(coffee);
        coffee = new WithSugar(coffee);
        coffee = new WithWhippedCream(coffee);

        System.out.println("Final Order: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());
    }
}
