package com.lizza.spring_06_tx.tx_01_xml.test;

import com.lizza.spring_06_tx.tx_01_xml.entity.User;
import com.lizza.spring_06_tx.tx_01_xml.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring_08_beans.xml")
public class TestApp {

    @Autowired
    private UserService userService;

    @Test
    public void addOne() {
    }

    @Test
    public void deleteOne() {
    }

    @Test
    public void updateOne() {
    }

    @Test
    public void findAll() {
        List<User> list = userService.findAll();
        System.out.println(list);
    }

    @Test
    public void transferMoney() {
        userService.transferMoney(1, 2, 100);
        System.out.println(userService.findAll());
    }

}
