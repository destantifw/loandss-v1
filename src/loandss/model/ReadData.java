package loandss.model;

//import java.lang.Integer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class ReadData {
	
    
	public void main(String[] args) throws IOException, ParseException, NumberFormatException {
				
//		String csvFile = "/data rekap.csv";
//		Scanner scanner;
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("data/datarekap.csv"));
			System.out.println("kedetect dong");
			
			// read file line by line
			String line = null;
			Scanner scanner = null;
			int index = 0;
			List<GetSetData> applicant = new ArrayList<>();

			while ((line = reader.readLine()) != null) {
				GetSetData gs = new GetSetData();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
				while (scanner.hasNext()) {
					String data = scanner.next();
					if (index == 0)				
						gs.setTypeLoan(data);
					else if (index == 1)
						gs.setPerusahaan(data);
					else if (index == 2)
						gs.setNamaNasabah(data);
					else if (index == 3) {
						Date test = null;
						test = df.parse(data);
						
//						gs.setTtl(df.parse(data)); 
					}
					else if (index == 4)						
						gs.setKtp(data);
					else if (index == 5)
						gs.setTanggalKTP(data);						
					else if (index == 6)
						gs.setTanggalBerlaku(data);														
					else if (index == 7)
						gs.setPekerjaan(data);		
					else if (index == 8)						
						gs.setJenisPembiayaan(data);
					else if (index == 9)
						gs.setTujuan(data);
					else if (index == 10){
						try {
					        int val=Integer.parseInt(data);
					        gs.setKebutuhanAnggaran(Integer.parseInt(data));
					   }catch (NumberFormatException e){
					       System.out.println("not a number"); 
					   } 
					}
					else if (index == 11) {
						try {
					        int val=Integer.parseInt(data);
					        gs.setPlafonPembiayaan(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					}						
					else if (index == 12){
						try {
					        int val=Integer.parseInt(data);
					        gs.setMarginBank(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					} 
					else if (index == 13){
						try {
					        int val=Integer.parseInt(data);
					        gs.setHargaJual(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					} 							
					else if (index == 14){
						try {
					        int val=Integer.parseInt(data);
					        gs.setPembiayaanDiangsur(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					} 			
					else if (index == 15)
					{
						try {
					        int val=Integer.parseInt(data);
					        gs.setJangkaWaktu(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					} 	
					else if (index == 16)
					{
						try {
					        int val=Integer.parseInt(data);
					        gs.setPrice(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					} 					
					else if (index == 17)	{				
						try {
					        int val=Integer.parseInt(data);
					        gs.setAngsuran(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					}
					else if (index == 18)
					{
						try {
					        int val=Integer.parseInt(data);
					        gs.setJumlahDiterima(Integer.parseInt(data));
						}catch (NumberFormatException e){
					       System.out.println("not a number"); 
						}
					}									
					else if (index == 19)	
//						gs.setTglPengajuan(df.parse(data));	
						System.out.println("bisa");
					else if (index == 20)
						System.out.println("bisa");
//						gs.setTglAkad(df.parse(data));	
					else if (index == 21)
						System.out.println("bisa");
//						gs.setTglCair(df.parse(data));			
					else if (index == 22)
						System.out.println("bisa");
//						gs.setTglDue(df.parse(data));		
					else if (index == 23)
						System.out.println("bisa");
//						gs.setTglKontrol(df.parse(data));
					else if (index == 24)						
						gs.setJaminan(data);		
					else if (index == 25)	
						gs.setBesarJaminan(Integer.parseInt(data));
						
					index++;
				}
				index = 0;
				applicant.add(gs);
			}
			

			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ga kedetect");
//			e.printStackTrace();
		}
      
	}
	
}
