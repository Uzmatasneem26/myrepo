package com.tnsif.onlineshopping.services;
import java.util.ArrayList;
import java.util.List;

import com.tnsif.onlineshopping.enitity.Admin;





public class AdminService {

    private List<Admin> adminList = new ArrayList<>();

    public void addAdmin(Admin admin) {
        adminList.add(admin);
    }

    public List<Admin> getAdmins() {
        return adminList;
    }
}
