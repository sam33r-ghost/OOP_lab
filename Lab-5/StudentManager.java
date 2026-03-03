import java.util.Scanner;
class Student{
    int s1,s2,s3;
    Student(int st1,int st2,int st3){
      s1=st1;
      s2=st2;
      s3=st3;
    }
    public double average(){
        double avg;
        avg=(s1+s2+s3)/3;
        return avg;
    }
    boolean avgCheck(){
        if(this.average()>50)
        {
            return true;
        }
        else return false;
    }
    void name(String s){
        System.out.println("Student name: "+s);
    }
}
public class StudentManager {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int st1, st2, st3;
        String s = new String();
        System.out.println("Enter Student name : ");
        s= sc.nextLine();
        System.out.println("Enter marks of subject 1: ");
        st1= sc.nextInt();
        System.out.println("Enter marks of subject 2: ");
        st2= sc.nextInt();
        System.out.println("Enter marks of subject 3: ");
        st3=sc.nextInt();
        Student stu = new Student(st1,st2,st3);
        stu.name(s);
        System.out.println("Student passed: "+stu.avgCheck());
    }
}