interface Bank {
    float interestRate();
}
class BOC implements Bank{
    @Override
    public float interestRate() {
        return 22.76f;
    }
}
class Selan implements Bank{
    @Override
    public float interestRate() {
        return 23.86f;
    }
}
class TestInterface{
    public static void main(String[] args) {
        Bank b = new BOC();
        System.out.println("Rate of interface = " + b.interestRate());
    }
}