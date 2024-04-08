package server.model;

import java.io.IOException;
import java.net.ServerSocket;

import server.controller.Controller;

public class SocketServer 
{
	
	private ServerSocket server;
	
	private Controller controller; 
	
	public SocketServer(int port, Controller app)
	{
		this.server = null;
		this.controller = app; 
		prepareServer(port);
	}
	
	public void prepareServer(int port)
	{
		try
		{
			this.server = new ServerSocket(port);
		}
		catch(Exception error)
		{
			Controller.handleError(error);
		}
	}
	
	

}
