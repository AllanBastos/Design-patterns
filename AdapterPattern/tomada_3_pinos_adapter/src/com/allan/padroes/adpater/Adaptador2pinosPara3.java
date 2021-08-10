package com.allan.padroes.adpater;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;


/**
* @author allan
* @version 0.0.2
*
*/
public class Adaptador2pinosPara3 extends ServicoTomada3Pinos implements Tomada2pinosIF{
	
	/**
	 * @param args
	 */
	public Adaptador2pinosPara3(Fio pinoFase, Fio pinoNeutro) {
		super(pinoFase, pinoNeutro, pinoNeutro);
		System.out.println("Construindo adaptador");
	}

	public void conectar() {
		System.out.println("Encaixando Adptador");
		this.forneceEnergia();
	}
}
