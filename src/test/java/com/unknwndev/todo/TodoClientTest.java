package com.unknwndev.todo;

import java.io.IOException;
import java.net.UnknownHostException;

import org.json.JSONObject;
import org.junit.Test;

public class TodoClientTest {
    TodoClient client = new TodoClient();
    
    
    @Test
    public void testStartConnection() throws UnknownHostException, IOException {
        client.connectToServer("nova", 5000);
    }
    
    @Test
    public void testSendMessage() throws UnknownHostException, IOException {
        this.client.connectToServer("nova", 5000);
        
        // Construct a JSON object for the command
        JSONObject command = new JSONObject();
        command.put("command", "list_tasks");
        
        // Send the JSON object
        client.sendCommand(command);
        
        String response = client.receiveResponse();

        // Handle the response here
        System.out.println("Response from server: " + response);
        client.closeConnection();
        
    }
    
    @Test
    public void testStopConnection() throws UnknownHostException, IOException {
        this.client.closeConnection();
    }
}
