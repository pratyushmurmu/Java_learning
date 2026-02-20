package Basics_01;
class Student{
    // Arrays of Objects in Java
    //An array of objects is created like an array of primitive-type data items
    public String name;
    public int rollno;
    public float marks;

    Student(String name, int rollno, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}
public class Geeks {
    public static void main(String[] args) {
        Student[] arr;

        arr= new Student[5];

        arr[0]= new Student("Pratyush Murmu", 438099, 98.45F);
        arr[1]= new Student("Dhanush Majhi", 506422, 96.76F);
        arr[2]= new Student("Shree", 514460, 92.68F);
        arr[3]= new Student("Surabhee Murmu", 460012, 98.97F);
        arr[4]= new Student("Subhalaxmi Murmu", 438124, 93.58F);

        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at "+ i + ":{ " + arr[i].name +" "+ arr[i].rollno +" "+ arr[i].marks +" }");
        }
    }
}

/*Element at 0:{ Pratyush Murmu 438099 98.45 }
Element at 1:{ Dhanush Majhi 506422 96.76 }
Element at 2:{ Shree 514460 92.68 }
Element at 3:{ Surabhee Murmu 460012 98.97 }
Element at 4:{ Subhalaxmi Murmu 438124 93.58 }*/
