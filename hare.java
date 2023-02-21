public class hare extends Animal {

    @Override
    public void makeSound() {
        System.out.println("snort");
    }
    void makeSound(int n){
        for (int i=0;i<n;i++)
            makeSound();}
}
