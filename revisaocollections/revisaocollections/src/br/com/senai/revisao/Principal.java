package br.com.senai.revisao;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aeronave aeronave = new Aeronave();
		
		//aeronave.mostrarLetreiroDigital();

		JOptionPane.showMessageDialog(null, aeronave.mostrarLetreiroDigital() ,
				"VoeAirlines" , 1);
		
		aeronave.adicionarAeronave();
		
		aeronave.mostrarAeronaves();
		
		//aeronave.removerAeroanve(1);
	}

}
