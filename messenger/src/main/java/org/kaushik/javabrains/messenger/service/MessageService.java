package org.kaushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kaushik.javabrains.messenger.database.DatabaseClass;
import org.kaushik.javabrains.messenger.model.Message;

public class MessageService {
	
	private static Map<Long,Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1l, new Message(1,"hello World !" , "Kaushik"));
		messages.put(2l, new Message(2,"hello Jersey !" , "Kaushik"));
	}
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getmessage(long id)
	{
		return messages.get(id);
		
	}
	
	public Message addMessage(Message message)
	{
		 message.setId(messages.size()+1);
		 messages.put(message.getId(), message);
		 return message;
		
	}
	
	public Message updateMessage(Message message)
	{
		if (message.getId() < 0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message deleteMessage(long id)
	{
		return messages.remove(id);
		
	}

}
