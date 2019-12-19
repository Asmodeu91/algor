package lesson1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }

        return name.equals(((Person) obj).name) &&
                age== ((Person) obj).age;
    }

    @Override
    public int hashCode() {
        return 31* name.hashCode() + 17 * age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
