package br.com.senai.revisao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aeronave {



	private String modelo;
	private String fabricante;
	ArrayList<String> listaAeronave = new ArrayList<>();
	
	public Aeronave() {
		
	}
	public Aeronave(String modelo, String fabricante) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String mostrarLetreiroDigital() {
		
		return "VoeAirlines, voando com você!";
	}
	
	public void adicionarAeronave() {
		listaAeronave.add("Legacy 450");
		listaAeronave.add("Legacy 650");
		listaAeronave.add("Phenon");
	}
	
	public void mostrarAeronaves() {
		
		/*for (String lista:listaAeronave) {
			JOptionPane.showMessageDialog(null, lista);
		}*/
		
		listaAeronave.forEach(
				aeronave->JOptionPane.showMessageDialog
				(null, aeronave));
		
		
	}
	
	public String buscaAeronave(int indice) {
		
		String r;
		r = listaAeronave.get(indice);
		return r;
	}
	
	public void removerAeroanve(int indice) {
		
		listaAeronave.remove(indice);
		
		listaAeronave.forEach(
				aeronave->JOptionPane.showMessageDialog
				(null, aeronave));
		
	}
	
	/*public void mostrarLetreiroDigital() {
		
		JOptionPane.showMessageDialog(null, "VoeAirlines, voando com você!",
				"Mensagem 2" , 1);
	}*/
}
