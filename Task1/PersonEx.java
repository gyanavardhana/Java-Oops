package Task1;
class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void printattr(){
        System.out.println("Name : "+this.name+", Age : "+this.age);
    }
}

public class PersonEx {
    public static void main(String [] args){
        Person A = new Person("Gyanavardhan", 20);
        Person B = new Person("Viswesh", 21);
        A.printattr();
        B.printattr();
    }

}
