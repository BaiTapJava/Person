public class Main {
    public static void main(String[] args) {
        Person person = new Person("Thinh", "Viet Nam");
        Staff staff = new Staff("Quan", "Ha Noi", "Bach Khoa", 250);
        Student student = new Student("Quyen", "Ha Noi","JAVA", 2018, 300);

        System.out.println(person.toString());
        System.out.println(staff.toString());
        System.out.println(student.toString());
    }
}