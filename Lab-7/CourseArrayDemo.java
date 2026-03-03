class Course {
    int id;
    String description;
    String duration;
    double fees;

    Course(int id, String description, String duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void GetData() {
        System.out.println("ID: " + id + " | Course: " + description +
                " | Duration: " + duration + " | Fees: ₹" + fees);
    }
}

public class CourseArrayDemo {
    public static void main(String[] args) {
        Course[] courses = new Course[5];

        courses[0] = new Course(101, "Artificial Intelligence", "4 Months", 15000.0);
        courses[1] = new Course(102, "Advanced Java Programming", "3 Months", 12000.0);
        courses[2] = new Course(103, "Digital Logic & Circuit Design", "2 Months", 8000.0);
        courses[3] = new Course(104, "Machine Learning Foundations", "5 Months", 18000.0);
        courses[4] = new Course(105, "Probability & Statistics", "3 Months", 10000.0);

        System.out.println(" Available Courses: ");
        for (Course c : courses) {
            c.GetData();
        }
    }
}