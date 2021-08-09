package com.allan.padroes.adpater;

import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;


/**
* @author allan
* @version 0.0.1
*
*/
public class Adaptador2pinos extends ServicoTomada3Pinos{
	
	/**
	 * @param args
	 */
	public Adaptador2pinos(Fio pinoFase, Fio pinoNeutro) {
		super(pinoFase, pinoNeutro, Fio.TERRA);
	}
}
