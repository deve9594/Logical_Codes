import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProcessCsv {
	public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\deve9\\Desktop\\csv compare\\Devendra.csv";
        String filePath2 = "C:\\Users\\deve9\\Desktop\\csv compare\\New Text Document.csv";
        ArrayList<String> fileEntries = new ArrayList<String>();
        ArrayList<String> fileEntries2 = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null)
                fileEntries.add(line);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(filePath2))) {
            String line1;
            while ((line1 = br.readLine()) != null)
                fileEntries2.add(line1);
        }
        
        
        
        fileEntries.remove(0); // remove the csv header entry
        fileEntries2.remove(0);

//        for (String entry : fileEntries) {
//        	
//             System.out.println(entry);
//        }
//        System.out.println("Entries of secound csv");
//        
//        for (String entry1 : fileEntries2) {
//        	
//            System.out.println(entry1);
//       }
       for(int i=0;i<10;i++) {
    	   if(fileEntries.get(i).equals(fileEntries2.get(i))) {
    		   System.out.println(fileEntries.get(i));
    	   }
       }
        
    }
	
}
