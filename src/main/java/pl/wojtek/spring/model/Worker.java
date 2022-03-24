package pl.wojtek.spring.model;

public class Worker {

    private final String name;
    private final Integer age;
    private final Integer pay;

    public Worker(String name, Integer age, Integer pay) {
        this.name = name;
        this.age = age;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pay=" + pay +
                '}';
    }
}
