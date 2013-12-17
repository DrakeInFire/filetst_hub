package filetst;

import java.io.*;
import java.util.List;
import java.util.LinkedList;

public class Filetst {
	
	
	
	public static void main(String[] args){
		
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		List<Persona> lista=new LinkedList<Persona>();
		 int count=0;
		
		 //Propiedades.get();
	
		System.out.println(Propiedades.getPath());
		System.out.println("/home/mario/serverfiles/users.txt"); 
		
		try
		{
			
			file=new File("/home/mario/serverfiles/users.txt");
			fr = new FileReader (file);
	        br = new BufferedReader(fr);
	        
	        // Lectura del fichero
	         String linea;
	        
	         while((linea=br.readLine())!=null)
	         {
	        	 if (linea.equals(""))
	        	 {
	        		 System.out.println("Linea nula");
	        		 break;
	        	 }
	        	// System.out.println(linea);
	        	 String[] sub=linea.split("\t");
	        	 int i=0;
	        	 Persona p=new Persona();
	        	 for(String temp:sub)
	        	 {
	        		 if(i==0)
	        			 p.setName(temp);
	        		 if(i==1)
	        			 p.setApe(temp);
	        		 if(i==2)
	        			 p.setId(temp);
	        		 i++;
	        	}
	        	//System.out.println(p.getName()+" "+p.getApe()+" "+p.getId());
	        	lista.add(p);
	        	 
	         }
	      
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		finally
		{
			try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
		}
		System.out.println(count);
		for(Persona temp:lista)
		{
			System.out.println(temp.getName()+"\t"+temp.getApe()+"\t"+temp.getId());
		}
		
		if(file.delete())
		{
			System.out.println("Archivo Borrado");
		}
		else
		{
			System.out.println("Archivo no se pudo borrar");
		}
	}
	
	
}
