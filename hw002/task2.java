package hw002;



public class task2 implements inter, i_const, deafult {

    private String name = "vasya";
    private int age = AGE ;
    private String ownerName = ownerName();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
    

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + ownerName + ".");
    }

}
