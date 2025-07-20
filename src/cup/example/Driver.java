package cup.example;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;

import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = new Parser();
		parser.parse();
		
		 // Parse the input and get the root of the parse tree
        Symbol parseSymbol = parser.parse();
        TreeNode root = (TreeNode) parseSymbol.value;

        // Print the parse tree
        System.out.println("Parse Tree:");
        TreeNodePrinter printer = new TreeNodePrinter(root);
        printer.print();
		
	}
	
}