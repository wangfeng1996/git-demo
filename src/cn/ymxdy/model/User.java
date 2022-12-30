package cn.ymxdy.model;

import java.util.List;

/**
 * @author wf
 * @date 2022/11/30 16:29
 * @description
 */

public class User {

    private String name;
    private String age;
    private List<School> schoolList;

    public User() {
    }

    public User(String name, String age, List<School> schoolList) {
        this.name = name;
        this.age = age;
        this.schoolList = schoolList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", schoolList=" + schoolList +
                '}';
    }
}
