package JavaStudy.Sort;

public class ComparableUser implements Comparable<ComparableUser> {
    private String name;
    private int age;

    public ComparableUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(ComparableUser o) {
        return Integer.compare(o.age, this.age);
    }
}
