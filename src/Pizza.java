public class Pizza {
    private int price;
    private int basePrice; //price without extra additions
    private Boolean isExtraCheese = false;
    private Boolean isToppings = false;
    private Boolean isTakeAway = false;
    int takeAwayPrice = 50;
    int extraCheesePrice = 100;
    int extraToppingsPrice = 100;

    public Pizza(Boolean isVeg){
        //true for a vegetable pizza
        System.out.println("WELCOME TO BEST PIZZAS");
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 350;
        }
        basePrice = price;
    }

    public int getBasePrice(){
        return this.basePrice;
    }//for future use

    public void addExtraCheese(){
        if(!isExtraCheese) {
            System.out.println("+ Added extra cheese!: " + extraCheesePrice + " Ksh.");
            this.price += extraCheesePrice;
        }else{
            System.out.println("!* Extra cheese already added!");
        }
        isExtraCheese = true;
    }

    public void addExtraToppings(){
        if(!isToppings) {
            System.out.println("+ Added extra toppings!: " + extraToppingsPrice + " Ksh.");
            this.price += extraToppingsPrice;
        }else {
            System.out.println("*! Extra toppings already added!");
        }
        isToppings = true;
    }

    public void takeAway(){
        if(!isTakeAway) {
            System.out.println("+ Takeaway order for: " + takeAwayPrice + " Ksh.");
            this.price += takeAwayPrice;
        }else{
            System.out.println("*! Takeaway already selected!");
        }
        isTakeAway = true;
    }

    public void getBill(){
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("-------------Bill-----------------");
        System.out.println("Base pizza: " + basePrice + " Ksh.");
        if(isExtraCheese){
            System.out.println("Extra cheese: " + extraCheesePrice + " Ksh.");
        }
        if(isToppings){
            System.out.println("Extra toppings: " + extraToppingsPrice + " Ksh.");
        }
        if(isTakeAway){
            System.out.println("Takeaway services: " + takeAwayPrice + " Ksh.");
        }
        System.out.println("--------------TOTAL---------------");
        System.out.println("\t \t \t Ksh: " + this.price);
        System.out.println("----------------------------------");
        System.out.println();
    }
}
