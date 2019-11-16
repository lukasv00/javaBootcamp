package com.kodilla.spring.Board;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import com.kodilla.spring.portfolio.TaskList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testBoardPreparation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList taskList = context.getBean(TaskList.class);

        board.tasksShow();
    }
}
