package com.unknwndev.todo;

import java.net.*;
import java.util.stream.Collectors;
import java.io.*;
import org.json.*;

public class TodoClient {
    
    private Socket _clientSocket;
    
    // Transmitter / Reciever
    private PrintWriter _out;
    private BufferedReader _in;

    /**
     * Opens connection to server.
     * 
     * @param ip   - Host address
     * @param port - Host port 
     * @throws UnknownHostException
     * @throws IOException
     */
    public void connectToServer(String ip, int port) throws UnknownHostException, IOException {
        _clientSocket = new Socket(ip, port);
        _out = new PrintWriter(_clientSocket.getOutputStream(), true);
        _in = new BufferedReader(new InputStreamReader(_clientSocket.getInputStream()));

    }

    /**
     * Message Transmitter to server.
     * 
     * @param command (JSON) message to transmit.
     * @throws IOException
     */
    public void sendCommand(JSONObject command) throws IOException {
        _out.println(command);
        _out.flush();
    }


    /**
     * Message reciever from server.
     * 
     * @return (String) response from server.
     * @throws IOException
     */
    public String receiveResponse() throws IOException {
        String response = _in.lines().collect(Collectors.joining());

        return response;
    }

    /**
     * Close connection to server
     * 
     * @throws IOException
     */
    public void closeConnection() throws IOException {
        try {
            if (_in != null)
                _in.close();
            if (_out != null)
                _out.close();
            if (_clientSocket != null)
                _clientSocket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
}
