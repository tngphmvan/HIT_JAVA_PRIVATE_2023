
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 84393
 */
public class Address {

    private String commune;
    private String district;
    private String city;

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter commune: ");
        commune = scanner.nextLine();

        System.out.print("Enter district: ");
        district = scanner.nextLine();

        System.out.print("Enter city: ");
        city = scanner.nextLine();
    }

    public void output() {
        System.out.println("Commune: " + commune);
        System.out.println("District: " + district);
        System.out.println("City: " + city);
    }
}
