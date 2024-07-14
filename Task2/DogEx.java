package Task2;
class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void show(){
        System.out.println("Name : "+this.name+", Breed : "+this.breed);
    }
}
public class DogEx {
    public static void main(String [] main){
        Dog rocky = new Dog("rocky","bull");
        Dog sweety = new Dog("sweety","pamerian");

        rocky.show();
        sweety.show();

        rocky.setBreed("Dabbarman");
        sweety.setBreed("Husky");

        rocky.show();
        sweety.show();
        
    }
    
}
