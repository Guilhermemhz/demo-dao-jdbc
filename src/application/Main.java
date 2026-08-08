package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller sl = new Seller(1, "João", "Joao@gmail.com", LocalDate.now(), 300.0, obj);
        System.out.println(sl);
    }
}