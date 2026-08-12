package model.dao;


import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDa0() {
        return new SellerDaoJDBC();
    }
}
