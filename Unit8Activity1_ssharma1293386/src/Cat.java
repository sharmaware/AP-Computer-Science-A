
public class Cat {

    private String breed;
    private int age;
    private double weight;
    private char sex;
    private String name;

    public Cat (String setBreed, int setAge,double setWeight, char setSex, String setName){
        breed = setBreed;
        age = setAge;
        weight = setWeight;
        sex = setSex;
        name = setName;
    }
    public String eat() {
        String eat = "Munch, munch, munch";
        return eat;
    }

    public String meow() {
        String meow = "Meeeeeeeow";
        return meow;
    }

    public void setBreed(String EnteredBreed) {
        breed = EnteredBreed;
    }

    public void setAge(int EnteredAge) {
        age = EnteredAge;
    }

    public void setWeight(double EnteredWeight) {
        weight = EnteredWeight;
    }

    public void setSex(char EnteredSex) {
        sex = EnteredSex;
    }

    public void setName(String EnteredName){
        name = EnteredName;
    }
    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

}
