package com.xuzhang.springbootmybatisforeachinsert.mapper;

import com.xuzhang.springbootmybatisforeachinsert.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class TestPersonMapper {
    @Autowired
    private PersonMapper personMapper;

//    @Test
//    public void smokeTest() {
//        List<Person> persons = personMapper.getPersons();
//        Assertions.assertEquals(persons.size(), 0);
//    }
//
//    @Test
//    public void test_person_insert() {
//        List<Person> personList = new ArrayList<>();
//        Person person1 = new Person();
//        person1.setAge(1);
//        person1.setName("test1");
//        Person person2 = new Person();
//        person2.setName("test2");
//        person2.setAge(2);
//        personList.add(person1);
//        personList.add(person2);
//        personMapper.insertPersons(personList);
//    }
//
//    @Test
//    public void testSelectByIds() {
//        List<Integer> ids = new ArrayList<>();
//        ids.add(5);
//        ids.add(6);
//        List<Person> personList = personMapper.getPersonByIds(ids);
//        Assertions.assertEquals(personList.size(), 2);
//    }
}
