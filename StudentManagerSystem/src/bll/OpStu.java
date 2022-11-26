package bll;

import java.util.Scanner;

public class OpStu {
    public static void InputSaveStu(Student[] stu) {
        Scanner input = new Scanner(System.in);
        stu[Student.count] = new Student();
        System.out.println("请输入学生信息");
        System.out.print("请输入身份证号（例：1000）：");
        String id = input.next();
        stu[Student.count].setId(id);
        System.out.print("请输入姓名（例：张三）：");
        String name = input.next();
        stu[Student.count].setName(name);
        System.out.print("请输入学号（例：01）：");
        String num = input.next();
        stu[Student.count].setNum(num);
        System.out.print("请输入成绩（例：90.7）：");
        float score = input.nextFloat();
        stu[Student.count].setScore(score);
        Student.setCount();
    }
    public static void SearchStu_id(Student[] stu, String id) {
        boolean sign = false;
        for (int i = 0; i < Student.count; i++) {
            if (stu[i].getId().equals(id)) {
                System.out.println("查询成功！");
                sign = true;
                System.out.println("身份证号：" + stu[i].getId() + " " + "姓名：" + stu[i].getName() + " " + "学号：" + stu[i].getNum() + " " + "成绩：" + stu[i].getScore());
            }
        }
        if (!sign)
            System.out.println("查询失败！");
    }
    public static void SearchStu_num(Student[] stu, String num) {
        boolean sign = false;
        for (int i = 0; i < Student.count; i++) {
            if (stu[i].getNum().equals(num)) {
                System.out.println("查询成功！");
                sign = true;
                System.out.println("身份证号：" + stu[i].getId() + " " + "姓名：" + stu[i].getName() + " " + "学号：" + stu[i].getNum() + " " + "成绩：" + stu[i].getScore());
            }
        }
        if (!sign)
            System.out.println("查询失败！");
    }
    public static void  SortStu_num(Student[] stu) {
        for (int i = 0; i < Student.count; i++) {
            String min = stu[i].getNum();
            for (int j = i + 1; j < Student.count; j++) {
                if (stu[j].getNum().compareTo(min) <= 0) {
                    Student temp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = temp;
                }
            }
        }
    }
    public static void  SortStu_score(Student[] stu) {
        for (int i = 0; i < Student.count; i++) {
            float max = stu[i].getScore();
            for (int j = i + 1; j < Student.count; j++) {
                if (stu[j].getScore() >= max) {
                    Student temp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = temp;
                }
            }
        }
    }
    public static void  PrintStu(Student[] stu) {
        if (Student.count == 0)
            System.out.println("当前学生个数为0,不能打印！");
        else {
            System.out.println("当前学生个数：" + Student.count);
            for (int i = 0; i < Student.count; i++)
                System.out.println("身份证号：" + stu[i].getId() + " " + "姓名：" + stu[i].getName() + " " + "学号：" + stu[i].getNum() + " " + "成绩：" + stu[i].getScore());
        }
    }
    public static void  DelStu(Student[] stu, String value) {
        boolean sign = false;
        for (int i = 0; i < Student.count; i++) {
            if (stu[i].getId().compareTo(value) == 0) {
                sign = true;
                stu[i] = null;
                Student.count--;
                for (int j = i; j < Student.count; j++)
                    stu[j] = stu[j + 1];
            }
        }
        if (!sign)
            System.out.println("为找到该学生，请重新选择!");
        else
            System.out.println("删除成功！");
    }
    public static void DelStu_id(Student[] stu, String id) {
        DelStu(stu, id);
    }
    public static void DelStu_num(Student[] stu, String num) {
        DelStu(stu, num);
    }
}
