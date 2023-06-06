interface java {
    void code();
}
interface JVM extends java{
    void run();
}
class Output implements JVM{
    @Override
    public void code() {
        System.out.println("Coding!!");
    }

    @Override
    public void run() {
        System.out.println("Run!!");
    }

    public static void main(String[] args) {
        JVM j = new Output();
        j.code();
        j.run();
    }
}