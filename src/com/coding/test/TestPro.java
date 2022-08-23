package com.coding.test;

import com.coding.mapper.ProMapper;
import com.coding.model.Pro;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPro {
    public static void main(String[] args) throws Exception {
        String resource = "sqlMapConfig.xml";
        SqlSession sqlSession = null;
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        ProMapper proMapper = sqlSession.getMapper(ProMapper.class);
        List<Pro> pros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Pro pro = null;


        while (true) {
            System.out.println("\t1.查询所有人的个人信息\n" +
                    "\t2.查询姓名中带有\"明\"字的人，其个人信息\n" +
                    "\t3.查询编号为1002的人，其个人信息\n" +
                    "\t4.查询成绩大于85分的人，其个人信息\n" +
                    "\t5.查询班级为1的人，其个人信息\n" +
                    "\t6.查询年龄大于等于30，其个人信息\n");


            switch (scanner.nextInt()) {
                case 1: {
                    pro = new Pro();
                    pros = proMapper.selectDynamic(pro);
                    System.out.println(pros);
                }
                break;
                case 2: {
                    String likeName = "明";
                    pro = new Pro();
                    pro.setName(likeName);
                    pros = proMapper.selectDynamic(pro);
                    System.out.println(pros);


                }
                break;
                case 3: {
                    pro = new Pro();
                    pro.setId(1002);
                    pros = proMapper.selectDynamic(pro);
                    System.out.println(pros);

                }
                break;
                case 4: {
                    Double greatThanScore = 85.0;
                    pro = new Pro();
                    pro.setScore(greatThanScore);
                    pros = proMapper.selectDynamic(pro);
                    System.out.println(pros);

                }
                break;
                case 5: {
                    int classNo = 1;
                    pro = new Pro();
                    pro.setClassNo(classNo);
                    pros = proMapper.selectDynamic(pro);
                    System.out.println(pros);
                }
                break;
                case 6: {
                    int age = 30;
                    pro = new Pro();
                    pro.setAge(age);
                    pros = proMapper.selectDynamic(pro);
                    System.out.println(pros);

                }
                break;
                default:
                    System.out.println("输入不是1到6之间的整数, 退出");
            }
        }


    }
}
