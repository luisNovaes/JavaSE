/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aplicacao.testequestao9;

import org.junit.Assert;
import org.junit.Test;

import br.com.aplicacao.questao9.BinaryTree;

/**
 *
 * @author Luis Novaes
 */
public class TestBinaryTree {

	@Test
	public void testBinaryTreeResult()
	{
		final BinaryTree binaryTree = new BinaryTree(10);
		final BinaryTree binaryTree2 = new BinaryTree(20);
		final BinaryTree binaryTree3 = new BinaryTree(30);
		final BinaryTree binaryTree4 = new BinaryTree(30);
		
		binaryTree.insertLeft(binaryTree2);
		binaryTree.insertRight(binaryTree3);
		binaryTree2.insertRight(binaryTree4);
		
		int value = binaryTree.sum(binaryTree);
		Assert.assertEquals("The value is not right",90, value);
	}
	
	//@Test
	public void testBinaryTreeResultSettingNullLeftTree()
	{
		final BinaryTree binaryTree = new BinaryTree(10);
		final BinaryTree binaryTree2 = new BinaryTree(20);
		final BinaryTree binaryTree3 = new BinaryTree(30);
		final BinaryTree binaryTree4 = new BinaryTree(30);
		
		binaryTree.insertLeft(null);
		binaryTree.insertRight(binaryTree3);
		binaryTree2.insertRight(binaryTree4);
		
		int value = binaryTree.sum(binaryTree);
		Assert.assertEquals("The value is not right for node left",40, value);
	}
	
	//@Test
	public void testBinaryTreeResultSettingNullRightTree()
	{
		final BinaryTree binaryTree = new BinaryTree(10);
		final BinaryTree binaryTree2 = new BinaryTree(20);
		
		binaryTree.insertLeft(binaryTree2);
		binaryTree.insertRight(null);
		binaryTree2.insertRight(null);
		
		int value = binaryTree.sum(binaryTree);
		Assert.assertEquals("The value is not right for node right",30, value);
	}
	
	//@Test
	public void testBinaryTreeSumMethodPassedNullParam()
	{
		final BinaryTree binaryTree = new BinaryTree(10);
		int value = binaryTree.sum(null);
		Assert.assertEquals("The value is not right",0, value);
	}
}
