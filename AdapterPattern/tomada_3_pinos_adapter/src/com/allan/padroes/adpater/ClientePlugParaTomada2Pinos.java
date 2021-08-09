package com.allan.padroes.adpater;

import com.katyusco.padroes.adpater.servicos.Fio;


/**
* @author allan
* @version 0.0.1
*
*/
public class ClientePlugParaTomada2Pinos{
	
	/**
	 * @param args
	 */
	private Fio pinoFase;
	private Fio pinoNeutro;
	
	public ClientePlugParaTomada2Pinos(Fio pinoFase, Fio pinoNeutro) {
		this.pinoFase = pinoFase;
		this.pinoNeutro = pinoNeutro;
	}
	
	public void acoplaPlug() {
		Adaptador2pinos adaptador = new Adaptador2pinos(this.pinoFase, this.pinoNeutro);
		adaptador.forneceEnergia();
	}

	public static void main(String[] args) {
		ClientePlugParaTomada2Pinos tomada = new ClientePlugParaTomada2Pinos(Fio.FASE, Fio.NEUTRO);
		tomada.acoplaPlug();
	}
}