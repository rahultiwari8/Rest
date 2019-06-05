package org.kaushik.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kaushik.javabrains.messenger.model.Message;
import org.kaushik.javabrains.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService ms = new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> gteMessages()
	{
		return ms.getAllMessages(); 
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message  getMessage(@PathParam("messageId") long messageId)
	{
		return ms.getmessage(messageId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return ms.addMessage(message);
	}

}
