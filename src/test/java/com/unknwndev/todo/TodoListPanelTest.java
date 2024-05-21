package com.unknwndev.todo;

import java.io.IOException;
import java.net.UnknownHostException;

import org.junit.Test;

public class TodoListPanelTest {
    TodoListPanel listPanel;

    @Test
    public void testListFactory() {

    }

    @Test
    public void testListFactory2() {

    }

    @Test
    public void testListFactory3() {

    }

    @Test
    public void testBuild() throws UnknownHostException, IOException {
        listPanel = new TodoListPanel();
        listPanel.build();
    }
}
