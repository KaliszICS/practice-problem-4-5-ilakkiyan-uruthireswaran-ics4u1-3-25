public class Cow{
    private String name;
    private int age;
    private double weight;

    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + ", " + this.age + " - " + this.weight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cow cow = (Cow) obj;
        return this.name.equals(cow.name) && this.age == cow.age && this.weight == cow.weight;
    }

}