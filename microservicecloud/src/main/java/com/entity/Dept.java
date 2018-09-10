package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author:San Jinhong
 * @create:2018-09-10 17:13:18
 **/

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = 6427940792542180595L;

    private Long deptno;    //主键
    private String dname;   //部门名称
    private String db_source; //来自哪个数据库

    public Dept(String dname) {
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        //链式写法，此写法需要加@Accessors(chain = true)
        dept.setDeptno(11L).setDname("RD").setDb_source(("DB01"));
        System.out.println(dept);
    }
}
