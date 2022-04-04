package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Random list description";


    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("name", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTaskList.size());

        //Clean up
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }

}
