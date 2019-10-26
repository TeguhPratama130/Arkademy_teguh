package Arkademy_Teguh;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Teguh_Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject obj = new JSONObject();
		obj.put("nama", "Teguh Pratama");
	    obj.put("age", new Integer(22));
	    obj.put("address", "Jalan Sinar Budi gang lontar RT.009 RW.03 Kel. Pejagalan Kec. Penjaringan - Jakarta Utara");
		obj.put("hobbies", "Traveling, Kuliner, dan Ngegame");
		obj.put("is_married", new Boolean(false));
		
		JSONArray listSchool = new JSONArray();
		listSchool.add("SMK Islam PERTI");
		listSchool.add("2011");
		listSchool.add("2014");
		listSchool.add("Akuntansi");
		
		
		obj.put("listSchool", listSchool);
		
		JSONArray skills= new JSONArray();
		skills.add("Java : Beginner");
		
		obj.put("skills", skills);
		obj.put("interest_in_coding", new Boolean(true));
		
		try {
			 
	        FileWriter file = new FileWriter("d:\\json\\simplejson.json");
	        file.write(obj.toJSONString());
	        file.flush();
	        file.close();
	 
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	 
	    System.out.print(obj);
	 
	    }

}
