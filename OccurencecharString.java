package vamshi;
import java.util.HashMap;


public class OccurencecharString {
	public static void main(String[] args)
	{
		String str = "hello hai how are you";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				int val = map.get(ch);
				map.put(ch, val+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
	System.out.println(map);
    }
    }
