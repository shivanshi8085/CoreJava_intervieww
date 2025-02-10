package com.rays.networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 1235);

        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        DataOutputStream out = new DataOutputStream(client.getOutputStream());

        out.writeBytes("Hello Server");

        String greeting = in.readLine();
        System.out.println("Received from server: " + greeting);

        client.close();
        System.out.println("Client closed.");
    }

}
