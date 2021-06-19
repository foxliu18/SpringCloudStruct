package com.applicationmysql.operator;

import com.applicationmysql.config.DBUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class MysqlInterface {

    @RequestMapping(value = "/init")
    public static void StatementOperate(){
        Connection conn = null;				//和数据库取得连接
        Statement s = null;		//创建statement
        try{
            conn = DBUtil.getConnection();
            s = conn.createStatement();
            // 准备sql语句
            // 注意： 字符串要用单引号'
            String sql = "insert into t_courses values(null,1002,'dynamic')";
            //在statement中使用字符串拼接的方式，这种方式存在诸多问题
            s.execute(sql);
            System.out.println("执行插入语句成功");
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            DBUtil.close(conn);		//必须关闭
        }

    }

    @RequestMapping(value = "/addCourse")
    public static void addCourse(String courseName){
        System.out.println(courseName);
        String sql = "insert into t_courses(course_name) values(?)";
        //该语句为每个 IN 参数保留一个问号（“？”）作为占位符
        Connection conn = null;				//和数据库取得连接
        PreparedStatement pstmt = null;		//创建statement
        try{
            conn = DBUtil.getConnection();
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, courseName); //给占位符赋值
            pstmt.executeUpdate();			//执行
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            DBUtil.close(pstmt);
            DBUtil.close(conn);		//必须关闭
        }
    }
}
