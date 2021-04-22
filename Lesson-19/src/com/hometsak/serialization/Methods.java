package com.hometsak.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Methods {
	
	
	public static void main(String[] args) {
		
	

	}
		public static void serialezib(Serializable object)  throws Exception{
			try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("worker.bin")) ){
						ous.writeObject(object);	
						} catch(IOException e) {
							e.printStackTrace();
						}
	}
		
		public static Serializable deserialezib()  throws Exception{
			
			InputStream is = new FileInputStream("worker.bin");
			ObjectInputStream ois = new ObjectInputStream(is);
			Serializable object = (Serializable) ois.readObject();
			ois.close();
				
			return object;	
		}
		
	@Override
	public String toString() {
		return "Methods []";
	}
	

}
