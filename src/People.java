import java.util.Scanner;

public class People {
    String name;
    int age;

    People () {
    }

    public  void setNameAge () {
        Scanner in = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = in.next();

        System.out.println("enter age: ");
        int age = Integer.parseInt(in.next());
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}



