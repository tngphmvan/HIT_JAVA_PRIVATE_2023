
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 84393
 */
public class Classroom {

    Scanner s = new Scanner(System.in);

    private static ArrayList<Student> li = new ArrayList<>();

    static {
        // Create a list of students using the full parameter constructor
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", 9.0, "Nguyen Van A", 20, new Address("Ha Noi", "Thanh Xuan", "Ha Noi")),
                new Student(2, "Bob", 8.5, "Tran Thi B", 19, new Address("Da Nang", "Thanh Khe", "Da Nang")),
                new Student(3, "Charlie", 9.5, "Pham Nhat C", 18, new Address("Ho Chi Minh", "Thu Duc", "Ho Chi Minh")),
                new Student(4, "David", 8.0, "Le Van D", 17, new Address("Can Tho", "Ninh Kieu", "Can Tho"))
        );

        // Add the students to the classroom list
        li.addAll(students);
    }

    public static void inputList() {

        while (true) {
            System.out.println("-");
            Student std = new Student();
            std.input();
            if (std.getId() == 555) {
                break;
            }
            li.add(std);
        }
    }

    public static void outputList() {
        System.out.printf("%-16s %-22s %-17s %-25s %-25s %-20s %-18s %s\n", "Id", "Name", "Age", "Commune", "District", "City", "NameClass", "Gpa");
        for (Student std : li) {
            std.output();
        }
    }

    public static void sortByGpa() {
        li.sort(new gpaComparator());
        outputList();
    }

    public static boolean removeById(int id) {
        for (Student std : li) {
            if (std.getId() == id) {
                li.remove(std);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int choice;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Nhập thông tin các sinh viên");
            System.out.println("2. In ra thông tin các sinh viên theo dạng bảng");
            System.out.println("3. Sắp xếp danh sách sinh viên theo điểm GPA");
            System.out.println("4. Xóa sinh viên theo ID");
            System.out.println("5. Thoát chương trình");
            System.out.println("----------------");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = s.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập thông tin Sinh Viên: ");
                    inputList();
                    break;
                }
                case 2: {
                    outputList();
                    break;
                }
                case 3: {
                    sortByGpa();
                    break;
                }
                case 4: {
                    System.out.print("Enter id:");
                    int id = s.nextInt();
                    if (removeById(id)) {
                        System.out.println("SUCCESS");
                        outputList();
                    } else {
                        System.out.println("Can't find ");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Thoát chương trình...");
                    return;
                }
                default:
                    break;
            }
        } while (choice != 5);
    }
}
