package org.kaushik.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.kaushik.javabrains.messenger.model.Message;
import org.kaushik.javabrains.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long,Message> messages = new HashMap<>();
	private static Map<Long , Profile> profiles = new HashMap<>();
	
	public static Map<Long,Message> getMessages()
	{
		return messages;
	}
	
	public static Map<Long , Profile> getProfile()
	{
		return profiles;
	}

}
