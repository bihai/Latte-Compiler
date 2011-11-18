package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import antlr.build.ANTLR;
import grammar.*;
import grammar.LatteParser.program_return;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws IOException, RecognitionException {
		String fileName;
		InputStream input;
		String inputBase ="";
		if(args.length > 0){
			inputBase = args[0];
			//fileName = args[0];
			//input = new FileInputStream(fileName);
		}
		else{
			input = System.in;
		}
		//System.out.println(inputBase);
		inputBase+= args[1];//"\\core0";
		//String inputBase = "D:\\Projects\\ANTLR\\lattests\\good\\core0";
		String ending =	".lat";
		for(int i = 1; i<=27; i++){
			fileName=inputBase;
			if(i<10)
				fileName+="0";
			fileName+=i+ending;
			try{
				System.out.println();
				System.out.println(fileName);
				input = new FileInputStream(fileName);
				//Lexer Parser init 
				SymbolTable symbolTable = new SymbolTable(false);
				LatteLexer lexer = new LatteLexer(new ANTLRInputStream(input));
				TokenStream tokenStream = new CommonTokenStream(lexer);
				LatteParser parser = new LatteParser(tokenStream, symbolTable, symbolTable.getFunctionParameters());
				parser.setTreeAdaptor(new LatteTreeAdaptor());
				
				
				
				program_return program = parser.program();
//				if(program.getTree() instanceof org.antlr.runtime.tree.CommonErrorNode){
//					//throw new Exception();
//				}else{
					CommonTree tree = (CommonTree)program.getTree();
					//System.out.println(tree.toStringTree());
					
					
					CommonTreeNodeStream stream = new CommonTreeNodeStream(new LatteTreeAdaptor(), tree);
					DefSymbols sem = new DefSymbols(stream, symbolTable, parser.getfunctionParameters(), false);
					sem.downup(tree);
					System.out.println(symbolTable);
					System.out.println();//"///////////////////////////////////");
					
				//}
			}catch(ClassCastException e){}
			catch(Exception e){System.out.println(e);};
		}
	}

}
