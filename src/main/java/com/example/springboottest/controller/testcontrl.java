package com.example.springboottest.controller;

import com.example.springboottest.Entity.lageEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
public class testcontrl {
    @Resource
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/")
    public String telse(Model model){
        lageEntity weewq;
        String sql="select * from lage";
        weewq = jdbcTemplate.queryForObject(sql.toString(), new Object[]{}, (rs, rowNum) -> {
                lageEntity temp = new lageEntity();
                temp.setName(rs.getString("name"));
                temp.setAge(rs.getString("age"));
                return temp;
            });
        model.addAttribute("lage",weewq);
        System.out.println(weewq.toString());
        return "lage";
    }


}
