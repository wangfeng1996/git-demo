package cn.ymxdy;

import cn.ymxdy.model.School;
import cn.ymxdy.model.User;

import java.util.ArrayList;

/**
 * @author wf
 * @date 2022/10/17 14:28
 * @description
 */
public class demo {
    public static void main(String[] args) {
        User user = new User();
        extracted(user);


    }

    private static void extracted(User user) {
        user.setName("张三");
        user.setAge("20");
        extracted1(user);
    }

    private static void extracted1(User user) {
        ArrayList<School> list = getSchools();
        user.setSchoolList(list);
    }

    private static ArrayList<School> getSchools() {
        ArrayList<School> list = new ArrayList<>();
        School school = new School();
        return list;
    }
}
