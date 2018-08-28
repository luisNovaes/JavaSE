/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aplicacao.questao8;

/**
 *
 * @author Luis Novaes
 */
public class oito {
    
    private int numero;
	private char[] primeiro;
	private char[] segundo;
	
    public Integer gerResult(final Integer valorUm, final Integer valorDois) {
    	
    	if(valorUm == null || valorDois == null)
    		return null;
    	
        this.primeiro = valorUm.toString().toCharArray();
        this.segundo = valorDois.toString().toCharArray();
        StringBuilder Valor = new StringBuilder();
        
        if(this.primeiro.length > this.segundo.length)
        {
        	this.numero = this.primeiro.length;
        }else{
        	this.numero = this.segundo.length;
        }

        for (int x = 0; x < this.numero; x++) {
            if (primeiro.length > x) {
            	Valor.append(String.valueOf(primeiro[x]));
            }
            if (segundo.length > x) {
            	Valor.append(String.valueOf(segundo[x]));
            }
        }

        Integer c = Integer.valueOf(Valor.toString());
        
        return c > 1000000 ? -1 : c;
    }
    
}
