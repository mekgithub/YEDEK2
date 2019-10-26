package abstractionandinterface;

 class Fish implements AnimalInterface {
     public void makeSound(){
         System.out.println("blop blop");
     }
    public void move(){
         System.out.println("slap slap");
     }
}
