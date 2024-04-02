package school;
public class Main {

    public static void main(String[] args) {

        // Khởi tạo các đối tượng
        School school = new School("Trường Đại học Quảng Bình");
        Department department = new Department("Khoa Công nghệ Thông tin");
        Course course1 = new Course("Lập trình Java", "CT101");
        Course course2 = new Course("Cơ sở dữ liệu", "CSDL01");
        Instructor instructor1 = new Instructor("Nguyễn Văn A");
        Instructor instructor2 = new Instructor("Lê Thị B");
        Student student1 = new Student("Trần Văn B", "123456789");
        Student student2 = new Student("Lê Thị C", "987654321");

        // Thêm khoa vào trường
        school.addDepartment(department);

        // Thêm khóa học vào khoa
        department.addCourse(course1);
        department.addCourse(course2);

        // Gán giảng viên cho khóa học
        course1.setInstructor(instructor1);
        course2.setInstructor(instructor2);

        // Thêm sinh viên vào khóa học
        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student1);

        // In thông tin về trường
        System.out.println("Tên trường: " + school.getName());

        // In thông tin về khoa
        System.out.println("Tên khoa: " + department.getName());

        // In thông tin về khóa học
        System.out.println("Danh sách khóa học:");
        for (Course course : department.getCourses()) {
            System.out.println("    - " + course.getName() + " (" + course.getCourseID() + ")");
            System.out.println("        Giảng viên: " + course.getInstructor().getName());
        }

        // In thông tin về sinh viên
        System.out.println("Danh sách sinh viên:");
        for (Student student : course1.getRegisteredStudents()) {
            System.out.println("    - " + student.getName() + " (" + student.getStudentID() + ")");
        }

        // Ví dụ sử dụng phương thức getCourses() trong Department
        System.out.println("Danh sách các khóa học trong khoa " + department.getName() + ":");
        for (Course c : department.getCourses()) {
            System.out.println("    - " + c.getName() + " (" + c.getCourseID() + ")");
        }

        // Ví dụ sử dụng phương thức isRegistered() trong Course
        System.out.println("Sinh viên " + student1.getName() + " có đăng ký khóa " + course2.getName() + " hay không? " + course2.isRegistered(student1));
    }

}

