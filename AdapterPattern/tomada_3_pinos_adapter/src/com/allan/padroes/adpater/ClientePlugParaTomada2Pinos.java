package com.allan.padroes.adpater;

import com.katyusco.padroes.adpater.servicos.Fio;


/**
* @author allan
* @version 0.0.2
*
*/
public class ClientePlugParaTomada2Pinos{
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Adaptador2pinosPara3 tomada = new Adaptador2pinosPara3(Fio.FASE, Fio.NEUTRO);
		tomada.conectar();;
	}
}