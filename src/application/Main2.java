package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n==== TEST 1: department insert ====");
        Department newDep = new Department(null, "Music");
        departmentDao.insert(newDep);
        System.out.println("Inserted! new id = " + newDep.getId());

        System.out.println("\n==== TEST 2: department update ====");
        newDep.setName("Movie");
        departmentDao.update(newDep);
        System.out.println("Update completed");

        System.out.println("\n==== TEST 3: department delete ====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("==== TEST 4: department findById ====");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n==== TEST 5: seller findAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
    }
}
