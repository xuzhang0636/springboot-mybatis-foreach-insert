package com.xuzhang.springbootmybatisforeachinsert.mapper;

import com.xuzhang.springbootmybatisforeachinsert.model.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {
    List<Person> getPersons();

    void insertPersons(@Param("persons") List<Person> persons);

    List<Person> getPersonByIds(@Param("ids") List<Integer> ids);
}
