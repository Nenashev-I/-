public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("roooo");
    }
    void makeSound(int n){
        for (int i=0;i<n;i++)
            makeSound();
    }
}