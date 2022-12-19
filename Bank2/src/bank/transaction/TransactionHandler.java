package bank.transaction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class TransactionHandler {

	private final String transPath = "C:\\Users\\Administrator\\git\\Java\\Bank2\\src\\DocFiles\\";

	public ArrayList<Transaction> initializeData(String cid) {
		
		String path=transPath + cid + ".txt";
		File file=new File(path);
		//System.out.println(file.exists());
		FileReader fr;
		ArrayList<Transaction> al=new ArrayList<Transaction>();
		try {
			fr = new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			//System.out.println("cominggg");
			//System.out.println(line);
			while(line!=null) {
				String[] s=line.split("[ ]");
				
				Transaction t=new Transaction(Integer.parseInt(s[0]),s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]),Integer.parseInt(s[4]));
				al.add(t);
				line=br.readLine();
			}
			br.close();
			//return al;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return al;
		
		
		
	}
	//add transaction detail in file
		public void transctionFileAdd(Transaction t, String cusId) {
			/*FILE HECK OR CREATE NEW FILE*/
			String path=transPath + cusId +".txt";
			File file=new File(path);
			FileWriter fw;
			//System.out.println(file);
			try {
				fw = new FileWriter(file,true);
				BufferedWriter bw=new BufferedWriter(fw);
				if(file.exists()) {
					//System.out.println("coming true dddddd");
					//System.out.println(t.toString());
					bw.write(t.toString());
					bw.newLine();
					bw.flush();
					bw.close();
				}else {
					//System.out.println("coming falsedddd");
					file.createNewFile();
					//System.out.println(t.toString());
					bw.write(t.toString());
					bw.newLine();
					bw.flush();
					bw.close();
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
		//GET TRANSACTION ID WITH THE HELP OF CUSTOMER OBJECT
		public int getTransactionId(List<Transaction> al) {
			int size=al.size();
			Transaction t=al.get(size-1);
			 
			
			int id=t.getTransactionId();
			return id+1;
			
			
		}
	
	
}
