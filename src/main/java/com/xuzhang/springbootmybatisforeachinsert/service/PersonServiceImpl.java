package com.xuzhang.springbootmybatisforeachinsert.service;

import com.xuzhang.springbootmybatisforeachinsert.mapper.PersonMapper;
import com.xuzhang.springbootmybatisforeachinsert.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;

    @Override
    public List<Person> getAllPerson() {
        return null;
    }
}
