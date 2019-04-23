

import java.util.List;
import Entity.Student;
import Service.IStudentService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//指定bean注入的配置文件
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class test {

    @Autowired
    private IStudentService service;

    @org.junit.Test
    public void test() {
        Student student=new Student();
        student.setClassid(12);
        List<Student> listStu = service.selectByCondition(student);
        for (Student student1 : listStu) {
            System.out.println(student1.getName());
            System.out.println(student1.getAge());
            System.out.println(student1.getUid());
        }
    }
}