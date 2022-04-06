package test;

import main.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class postOrderTraversalTest {
	
	private BinaryTree<String> tree0 = new BinaryTree<>();
	private BinaryTree<String> tree01 = new BinaryTree<>();

	@BeforeEach
	public void init() {
		BinaryTree<String> tree5 = new BinaryTree<>("F");
		BinaryTree<String> tree3 = new BinaryTree<>("D");
		BinaryTree<String> tree4 = new BinaryTree<>("E", null, tree5);
		BinaryTree<String> tree1 = new BinaryTree<>("B", null, tree3);
		BinaryTree<String> tree2 = new BinaryTree<>("C", tree4, null);
		
		tree0 = new BinaryTree<>("A", tree1, tree2);
		
		
		BinaryTree<String> tree11 = new BinaryTree<>("B");
		BinaryTree<String> tree21 = new BinaryTree<>("C");
		
		tree01 = new BinaryTree<>("A", tree11, tree21);
		
	}
	
	@Test
	void Simple3NodeTraversal() {
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		tree01.postorderTraverse();
		String treeOutput = out.toString();
		
		String expected = "B\r\nC\r\nA\r\n";
		assertEquals(expected, treeOutput);
		
	}
	
	@Test
	void Simple3BinaryMethodNodeTraversal() {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		tree01.postorderTraverse_callBinaryNodeMethod();
		String treeOutput = out.toString();
		
		String expected = "B\r\nC\r\nA\r\n";
		assertEquals(expected, treeOutput);
		
	}
	
	@Test
	void Simple5NodeTraversal() {
		
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		tree0.postorderTraverse();
		String treeOutput = out.toString();
		
		String expected = "D\r\nB\r\nF\r\nE\r\nC\r\nA\r\n";
		assertEquals(expected, treeOutput);
		
	}
	
	@Test
	void Simple5BinaryMethodNodeTraversal() {
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		tree0.postorderTraverse_callBinaryNodeMethod();
		String treeOutput = out.toString();
		
		String expected = "D\r\nB\r\nF\r\nE\r\nC\r\nA\r\n";
		assertEquals(expected, treeOutput);
		
	}
	
	@AfterEach
	public void destroy() {
		tree0.clear();
		tree01.clear();
	}

}
