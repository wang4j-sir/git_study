package com.atguigu.mybatis.pojo;

public class Emp {

    private Integer eid;

    private String empName;

    private Integer age;

    private Character sex;

    private String email;

    private Integer did;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    private Dept dept;

    public Emp(Integer eid, String empName, Integer age, Character sex, String email, Dept dept,Integer did) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.dept = dept;
        this.did = did;
    }

    public Integer getEid() {
        return eid;
    }

    public Emp() {
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", dept=" + dept +
                '}';
    }
}
