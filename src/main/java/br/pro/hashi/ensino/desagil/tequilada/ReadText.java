package br.pro.hashi.ensino.desagil.tequilada;
import java.io.*; 
//import java.util.LinkedList;
//import javax.swing.JOptionPane;

public class ReadText {

	public static void main (String[]args){
		System.out.println( "Projeto 1 ");
		try{
			int h;
			int w;
			//para abrir o arquivo
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Emanuelle\\Google Drive\\INSPER\\3C\\Desenvolvimento Colaborativo Ágil\\EmanuelleMoco\\labrinto.txt"));
			String primeiralinha = br.readLine();
			//System.out.println("os numeros sao" + primeiralinha);
			//problema do código abaixo: e se o arquivo tiver xxx linhas e x colunas?
			h = Integer.parseInt(primeiralinha.substring(0, 1));
			w = Integer.parseInt(primeiralinha.substring(2, 4));	
	
			
/////////////para saber quantos algarismos tem cada numero
			for (int l = 0; l<primeiralinha.length() ; l++){
				if (primeiralinha.charAt(l) == ' '){
					int hfinal = l; 
					l = primeiralinha.length();
					//System.out.println("fimh " + hfinal);
					//eu preciso colocar o valor de hfinal na substring 	
				}
			}
			//como eu queria que ficasse:
			//int h = Integer.parseInt(primeiralinha.substring(0, hfinal));
			//int w = Integer.parseInt(primeiralinha.substring(hfinal, primeiralinha.length()));			
//////////////////////////
				
			//percorre todas as linhas
			while(br.ready()){
				String linha = br.readLine();
				String labirinto = "";
				
				for (int i = 0; i <w; i++){
					if (linha.charAt(i) == '#'){
						labirinto += 'X';
					}
					else{
						labirinto += ' ';
					}
				}
					System.out.println(labirinto);	
				
				
			}
		
			br.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		} 
	}
}

	
	
