package buoi6_bai2;

import java.util.*;

public class Buoi6_bai2 {

    public static void main(String[] args) {
        List<Employee> E_list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee pt = new PartTimeEmployee((i + 2), "NhanVien" + (i + 1), ((i + 1) * 1500));
            Employee ft = new FullTimeEmployee("NhanVien" + (4*i + 1), ((i + 1) * 1602));
            E_list.add(pt);
            E_list.add(ft);
        }
//        for(Employee i:E_list){
//            i.display();
//        }

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1: Enter ");
            System.out.println("2: Display ");
            System.out.println("3: Sort by Salary desc");
            System.out.println("4: Find max working hour");
            System.out.println("5: Remove least working hour employees ");
            System.out.println("6: Escape ");
            System.out.println("");
            System.out.print("Your choice: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Enter num of Part time employee: ");
                    int n = s.nextInt();
                    s.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Part Time Employee num "+(i+1));
                        Employee pt = new PartTimeEmployee();
                        pt.enter();
                        E_list.add(pt);
                    }

                    System.out.print("Enter num of Full time employee: ");
                    int k = s.nextInt();
                    s.nextLine();
                    for (int i = 0; i < k; i++) {
                        System.out.println("Full Time Employee num "+(i+1));
                        Employee ft = new FullTimeEmployee();
                        ft.enter();
                        E_list.add(ft);
                    }
                    break;
                }
                case 2: {
                    for (Employee i : E_list) {
                        i.display();
                    }
                    break;
                }
                case 3: {
                    E_list.sort(new salaryComparator());
                    for (Employee i : E_list) {
                        i.display();
                    }
                    break;
                }
                case 4: {
                    int max = 0;
                    for (Employee i : E_list) {
                        if (i.getWorkingHours() > max) {
                            max = i.getWorkingHours();
                        }
                    }
                    for (Employee i : E_list) {
                        if (i.getWorkingHours() == max) {
                            i.display();
                        }
                    }
                    break;
                }
                case 5: {
                    int min = 365 * 24;
                    for (Employee i : E_list) {
                        if (i.getWorkingHours() < min) {
                            min = i.getWorkingHours();
                        }
                    }
                    for (Employee i : E_list) {
                        if (i.getWorkingHours() - min > 0) {
                            i.display();
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("GoodByte !!!");
                    return;
                }
                default:
                    break;
            }
        }
    }

}
