package bsu.comp152;

public class Main {
    public static void main(String[] args) {
        // Create a Food object, where the name of the food is chicken filet.
        Food food1 = new Food("chicken filet");
        // Fry the chicken filet to 165 degrees.
        food1.setTemp(165);
        // Call a getter on the chicken filet to get the temperature. (Show the result.)
        System.out.println(food1.getTemp());
        // Print the chicken filet.
        System.out.println(food1);
        // Create a Food object, where the name of the food is hamburger.
        Food food2 = new Food("hamburger");
        // Fry the hamburger to 130 degrees.
        food2.setTemp(130);
        // Call the hotEnough method on the chicken filet to determine
        // whether the chicken is at least 165 degrees (hot enough to be fully cooked).
        System.out.println(food1.hotEnough(165));
        // Call the isCooler method on the chicken filet, passing in the hamburger as
        // a parameter, to find out whether the chicken is cooler than the burger.
        System.out.println(food1.isCooler(food2));
        // You decide you want your hamburger cooked medium well rather than medium rare.
        // Call the changeTemp method on the hamburger to increase its temperature by 20 degrees.
        food2.changeTemp(20);
        // Print the hamburger.
        System.out.println(food2);
    }
}