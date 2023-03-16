package com.demo.util;


import com.demo.Student;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import java.io.File;
import java.io.IOException;

public class JacksonTester {
    public static void main(String[] args) throws IOException {
        JacksonTester jacksonTester=new JacksonTester();
        jacksonTester.JsonConvert();
    }
    public void objectMapperTest()
    {
        ObjectMapper mapper=new ObjectMapper();
        String jsonString="{\"name\":\"mike\",\"age\":51,\"realName\":\"迈克尔\"}";
        try
        {
            Student student=mapper.readValue(jsonString,Student.class);
            System.out.println(student);
            mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
            jsonString=mapper.writeValueAsString(student);
            System.out.println(jsonString);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void JsonConvert() throws IOException {
        JacksonTester tester=new JacksonTester();
        Student student=new Student();
        student.setAge(10);
        student.setName("Allen");
        student.setRealName("阿伦");
        tester.writeJSON(student);

        Student student1=tester.readJSON();
        System.out.println(student1);
    }
    private void writeJSON(Student student) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(new File("student.json"),student);
    }
    private Student readJSON() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        Student student=mapper.readValue(new File("student.json"),Student.class);
        return student;
    }
}
