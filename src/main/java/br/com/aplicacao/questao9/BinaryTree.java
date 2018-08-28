/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aplicacao.questao9;

/**
 *
 * @author Luis Novaes
 */
import java.io.Serializable;

public class BinaryTree implements Serializable{

	private static final long serialVersionUID = 26061973L;
	
	private int value;
	private BinaryTree rigth;
	private BinaryTree left;
	
	
	public BinaryTree(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public BinaryTree getRigth() {
		return rigth;
	}
	public BinaryTree getLeft() {
		return left;
	}
	
	public void insertRight(final BinaryTree binaryTree)
	{
		this.rigth = binaryTree;
	}
	
	public void insertLeft(final BinaryTree binaryTree)
	{
		this.left = binaryTree;
	}
	
	public int sum(final BinaryTree binaryTree)
	{
		
		if(binaryTree == null)
			return 0;
		
		final int valorUm = sum(binaryTree.getLeft());
		final int valordois = sum(binaryTree.getRigth());
		
		return binaryTree.value + valorUm + valordois;
	}	
	
}
