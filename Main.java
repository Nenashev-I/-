public class Main {

        public static void main (String[] args) {
                Animal[] m = new Animal[3];
                hare hare = new hare();
                MiniCat MiniCat = new MiniCat();
                Cat Cat = new Cat();
               Cat.makeSound(3);
               hare.makeSound(2);
               MiniCat.makeSound(3);
        }
}

