package com.unknwndev.todo;

import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.*;

import org.json.JSONObject;


public class TodoListPanel extends JPanel {
    TodoClient _client_socket = new TodoClient();; 
    
    public void ListFactory(){

    }

    public void ListFactory(String filepath){
        
    }

    public void ListFactory(JSONObject json){
        
    }

    public void build() throws UnknownHostException, IOException{
        // Received message 
        String respoString;
        
        // Convert string
        JSONObject resoJsonObject;
        
        // Message to transmit
        JSONObject command = new JSONObject();
        command.put("command", "list_tasks");
        
        
        // Connecting to TodoManager
        _client_socket.connectToServer("nova", 5000);
        
        
        // Transmitter
        _client_socket.sendCommand(command);
        
        // Reciever
        respoString = _client_socket.receiveResponse();

        // Closing connection to TodoManager
        _client_socket.closeConnection();
        
        // Covertion to JSon
        resoJsonObject = new JSONObject(respoString);

        System.out.println(resoJsonObject.toString(2));
    }
}
