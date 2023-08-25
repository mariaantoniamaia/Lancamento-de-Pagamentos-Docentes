package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Professor;

public class ProfessorDAO {

	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;

	public ProfessorDAO()
	{
		arq=new File("dados.txt");
	}

	public boolean cadastraProfessor(Professor p) {

		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);

			bw.write(p.toString());
			bw.newLine();
			bw.flush();

			fw.close();
			bw.close();

			return true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}

	public boolean consultaMatricula(Professor p) {

		try {
			fr = new FileReader(arq);
			br = new BufferedReader(fr);

			String linha = null;
			String[] campos = new String[3];

			while ((linha = br.readLine()) != null) {
				campos = linha.split("#");
				if (campos[0].equals(p.getMatricula())) {
					p.setNome(campos[1]);
					p.setSalarioFinal(Float.parseFloat(campos[2]));
					return true; 
				}
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return false; 
	}
}
