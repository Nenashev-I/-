public class MiniCat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
    void makeSound(int n){
        for (int i=0;i<n;i++)
            makeSound();}
}
