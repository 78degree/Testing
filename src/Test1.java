
import java.io.*;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        int data;
        String [] kata;
        String katainput;
        String path;
        
        System.out.println("masukan kata yang akan di cari: ");
        Scanner input = new Scanner (System.in);
        katainput = input.nextLine();
        
         System.out.println("masukan path folder yang akan di index, contoh: E:/20_newsgroups ");
        Scanner input1 = new Scanner (System.in);
        path = input1.nextLine();
        File folder = new File(path);


        String[] isi = folder.list();
        System.out.println("");
        System.out.println("processing . . . ");
        //System.out.println();

        for (int i = 0; i < isi.length; i++) {
            File pathisi = new File(path + "/" + isi[i]);
            String[] isi2 = pathisi.list();
            for (int j = 0; j < isi2.length; j++) {
                //System.out.println(isi2[j]);
                
                BufferedReader br = null;
 
		try {
                    String sCurrentLine;
                    br = new BufferedReader(new FileReader(path + "/" + isi[i] + "/" + isi2[j]));
 
			while ((sCurrentLine = br.readLine()) != null) {
                            String[] sudah = sCurrentLine.split("\\s+");
                            for (int counter = 0; counter < sudah.length; counter++){
				 //System.out.println(sudah[counter]);
                                 String path1 = path + "/" + isi[i] + "/" + isi2 [j];
                                 String isinya = sudah[counter];
                                 
                                 LinkedList ddl = new LinkedList();
                                 ddl.insertFirst(isinya, path1);
                                 //ddl.BacaDariDepan();
                                 ddl.caripathnya(katainput);
                                 //ddl.printsebelum(katainput);
                            }
 
		}} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
                
	}
}
                
        }
            }
        
    

