package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//17.2

public interface TaskListDao extends CrudRepository<TaskList, Integer> {

    List<TaskList> findByListName(String listName);
}
