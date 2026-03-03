class Teacher{
    String name;
    int id;
    String subject;
    Teacher(int id,String name,String subject){
        this.id=id;
        this.name=name;
        this.subject=subject;
    }
    void disp(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
    }
}
class Student extends Teacher{
    int marks;
    Student(int id, String name,String subject,int marks){
        super(id,name,subject);
        this.marks=marks;
    }
    @Override
    void disp(){
        super.disp();
        System.out.println("Marks: "+marks);
    }
}
public class extendsDemo {
    public static void main(String[] args)
    {
        Teacher t=new Teacher(225,"Raj Kamal Maurya","Mathematics");
        Student s = new Student(113,"Aryan Goyal","Mathematics",95);
        t.disp();
        System.out.println();
        s.disp();
    }
}
