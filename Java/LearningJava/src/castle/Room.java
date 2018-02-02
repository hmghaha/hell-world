package castle;

import java.awt.RenderingHints.Key;
import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    public Room(String description) 
    {
        this.description = description;
    }
    
    public void setExit(String dir,Room rm) 
    {
        exits.put(dir, rm);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String showExits() {
    	
    	StringBuffer sb = new StringBuffer();
    	for(String Key : exits.keySet()) {
    		sb.append(Key);
    		sb.append(" ");
    	}
    	return sb.toString();
    }
    
    public Room getNextRoom(String direction) {
    	return exits.get(direction);
    }
}
