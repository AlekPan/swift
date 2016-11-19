
public class task0Person {

    private String name;
    int age;

    public task0Person() {
        name = "No name";
        age = -1;
    }

    public task0Person(String nameVar1) {
        name = nameVar1;

    }

    public task0Person(String nameVar, int ageVar) {
        name = nameVar;
        age = ageVar;
    }

    
      
    
    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;

    }
    //*„Hello, I am <име>. I am

//*<години> years old.” Ако годините не са зададени, да не се отпечатва второто изречение. Ако
//*и името не е зададено, да се отпечатва “I am John Doe”.
    public void saying() {

        if (name == null && age == 0) {

            System.out.printf("I am John Doe.");
            System.out.println();
        } else if (age == 0) {

            System.out.printf("Hello I am %s.", getName());
            System.out.println();
        } else {
            System.out.printf("Hello I am %s. I am %s old", getName(), getAge());
            System.out.println();
        }
    }

   //ange body of generated methods, choose Tools | Templates.
    
}
