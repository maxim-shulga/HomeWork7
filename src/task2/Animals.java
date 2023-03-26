package task2;

public enum Animals { CAT(5), DOG(10), FOX(15);
    Animals(int age){
        this.age = age;
    }
    private final int age;
    @Override
    public String toString() {
        return super.toString() + ", " + age + " years old";
    }
}
