interface Animal {
    void eat ();
}
interface Dog{
    void bark();
}
class Human implements Animal,Dog{
    @Override
    public void eat() {
        System.out.println("Eating!!");
    }

    @Override
    public void bark() {
        System.out.println("Barking!!");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.bark();













































    }
}
