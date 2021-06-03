public class Person {
    private String name;
    private int age;
    private String food;

    public Person(String name, int age, String food){
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setFood(String food){
        this.food = food;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getFood(){
        return food;
    }

    public void copy(Person inputPerson){
        name = inputPerson.getName();
        age = inputPerson.getAge();
        food = inputPerson.getFood();
    }

    public boolean equals(Person inputPerson){
        if(name.equals(inputPerson.getName()) && age == inputPerson.getAge() && food.equals(inputPerson.getFood())){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "My real name is " + name + ", my age is " + age + ", and my favorite food is " + food + ".";
    }
}