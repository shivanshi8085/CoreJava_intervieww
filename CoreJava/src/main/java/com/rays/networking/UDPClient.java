package com.rays.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket();//UDP connection establish karega. Yeh socket client-side communication ke liye use hoga.

		byte[] bt = "Hello from UDP Client!".getBytes();//UDP mein data bytes ke form mein send hota hai

		InetAddress address = InetAddress.getByName("127.0.0.1");

		DatagramPacket packet = new DatagramPacket(bt, bt.length, address, 4445);

		socket.send(packet); 

		bt = new byte[256];
		packet = new DatagramPacket(bt, bt.length);

		socket.receive(packet);

		String received = new String(packet.getData(), 0, packet.getLength());
		System.out.println("Quote of the Moment: " + received);

		socket.close();
		System.out.println("Client closed.");
	}

}
