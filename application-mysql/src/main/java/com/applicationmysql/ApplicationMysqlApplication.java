package com.applicationmysql;

import com.applicationmysql.dao.UserMapper;
import com.applicationmysql.mode.course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMysqlApplication.class, args);
    }


    @Test
    public void selectUser() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<course> userList = mapper.selectCourseID();
        for (course user: userList){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
