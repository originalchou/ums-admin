package com.original.admin.demo.admin;

import com.original.admin.demo.admin.model.UmsAdmin;
import com.original.admin.demo.admin.repository.UmsAdminRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoAdminApplicationTests {

    @Autowired
    private UmsAdminRepository umsAdminRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testAdminTableSize() {
        List<UmsAdmin> admins = umsAdminRepository.findAll();
        Assert.assertNotEquals(0, admins.size());
    }

}
