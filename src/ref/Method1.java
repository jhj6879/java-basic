package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);   // 전달한 학생 객체의 필드에 값을 설정한다.

        Student student2 = new Student();
        initStudent(student2, "학생2", 15, 80);   // 전달한 학생 객체의 필드에 값을 설정한다.

        printStudent(student1);   // 전달한 학생 객체의 필드 값을 읽어서 출력한다.
        printStudent(student2);   // 전달한 학생 객체의 필드 값을 읽어서 출력한다.
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student1) {
        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
    }
}
