/*//class
class pen{
    String color;
    String type;//ballpiont, gel
    //function
    public void write(){
        System.out.println("Wrting something ");
    } 
//to write pen color and type in the output 
 public void printcolor(){
    System.out.println(this.color);//this key word, print color this will tell which function have called it 
 }

}

public class oops{
//main function 
   public static void main(String[] args) {
       pen pen1 = new pen();
       pen1.color = "blue";
       pen1.type = "gel";

       //creating a new pen 
       pen pen2 = new pen();
       pen2.color = "black";
       pen2.type = "ballpoint";

       //to call wirte function 
       pen1.printcolor();
       pen2.printcolor();

   }
}*/
/* 
class Student{
  String name;
  int age;

  public void printInfo(){
    System.out.println("this.name");
    System.out.println("this.age");
  } 
}

public class oops{
 //main function
 public static void main(String args []){
   Student s1= new Student();
   s1.name ="Diksha";
   s1.age = 20;
 
 
   s1.printInfo();
}
}
*/
//constuctor
/*class Student{
    String name;
    int age ;
    //to print name and age in the output 
    public void printInfo(){
        System.out.println(this.name);
        System.err.println(this.age);
    }
    //normal construtor 
    Student(){
        System.out.println("Constructor called");
    }

}
public class oops{
public static void main(String args [] ){
    Student s1 = new Student();
    s1.name = "Diksha";
    s1.age = 20;

    s1.printInfo();
}
}*/
//
class Student{
    String name;
    int age ;
    //to print name and age in the output 
    public void printInfo(){
        System.out.println(this.name);
        System.err.println(this.age);
    }
    //normal construtor 
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
public class oops{
public static void main(String args [] ){
    Student s1 = new Student("Diksha", 20);
   

    s1.printInfo();
}
}