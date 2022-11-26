package ui;

import bll.OpStu;
import bll.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] stu = new Student[50];
        login(stu);
    }

    public static void login(Student[] stu) {
        while (true) {
            System.out.println("\t*****************************************************************");
            System.out.println("\t                      欢迎来到学生管理系统!                      ");
            System.out.println("\t ---------------------------------------------------------------");
            System.out.println("\t                         1.添加学生信息                          ");
            System.out.println("\t ---------------------------------------------------------------");
            System.out.println("\t                         2.查询学生信息                          ");
            System.out.println("\t ---------------------------------------------------------------");
            System.out.println("\t                         3.插入学生信息                          ");
            System.out.println("\t ---------------------------------------------------------------");
            System.out.println("\t                         4.删除学生信息                          ");
            System.out.println("\t ---------------------------------------------------------------");
            System.out.println("\t                         q.退出管理系统                          ");
            System.out.println("\t******************************************************************");
            Scanner input = new Scanner(System.in);
            System.out.print("\n请输入你的选择：");
            String choose = input.next();
            switch (choose) {
                case "1" -> OpStu.InputSaveStu(stu);
                case "2" -> {
                    System.out.println("1.通过身份证查询");
                    System.out.println("2.通过学号查询");
                    System.out.print("\n请输入你的选择：");
                    String option = input.next();
                    switch (option) {
                        case "1" -> {
                            System.out.print("\n请输入身份证号：");
                            String id = input.next();
                            OpStu.SearchStu_id(stu, id);
                        }
                        case "2" -> {
                            System.out.print("\n请输入学号：");
                            String num = input.next();
                            OpStu.SearchStu_num(stu, num);
                        }
                        default -> System.out.println("输入错误，请重新输入：");
                    }
                }
                case "3" -> {
                    OpStu.InputSaveStu(stu);
                    OpStu.SortStu_num(stu);
                }
                case "4" -> {
                    System.out.println("1.通过身份证删除");
                    System.out.println("2.通过学号删除");
                    System.out.print("\n请输入你的选择：");
                    String option_del = input.next();
                    switch (option_del) {
                        case "1" -> {
                            System.out.print("\n请输入身份证号：");
                            String id = input.next();
                            OpStu.DelStu_id(stu, id);
                        }
                        case "2" -> {
                            System.out.print("\n请输入学号：");
                            String num = input.next();
                            OpStu.DelStu_num(stu, num);
                        }
                        default -> System.out.println("输入错误，请重新输入：");
                    }
                }
                case "q" -> {
                    System.out.println("退出成功！");
                    System.out.println("学生个数：" + Student.count);
                    OpStu.PrintStu(stu);
                    System.exit(0);
                }
                default -> System.out.println("输入错误，请重新输入：");
            }
        }
    }
}
