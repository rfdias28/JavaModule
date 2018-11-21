package io.altar.jseproject.textinterface;

import java.util.Scanner;

import io.altar.jseproject.model.Product;

public class TextInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printHeader();
		run();
	}

	private static void run() {
		printMenu();
	}
	
	//-----------------------------METODOS SCANNER----------------------------------//
	static Scanner scanner = new Scanner(System.in);
	public static long scanLong () {
	long variavel = scanner.nextLong();
	return(variavel);
	}
	public static String scanString () {
	String variavel = scanner.nextLine();
	return(variavel);
	}
	public static double scanDouble () {
	double variavel = scanner.nextDouble();
	return(variavel);
	}
	public static int scanInt () {
		int variavel = scanner.nextInt();
		return(variavel);
		}
	//---------------------------FIM METODOS SCANNER--------------------------------//
	
	private static void printHeader() {
		System.out.println("+-----------------------------------+");
		System.out.println("|             Bem vindo             |");
		System.out.println("+-----------------------------------+");
	}

	private static void printMenu() {
		
		System.out.println("Por favor selecione uma das seguintes opções:"+ "\n");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");
		
		
		
		try {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();	
		switch(choice){
		
		case 1:
			printProduct();
			break;
			
		case 2:
			printShelf();
			int choice2 = sc.nextInt();
			break;
			
		case 3:
			System.out.println("Adeus");
			break;
			
		default:
			System.out.println("Coloque um numero de 1 a 3 " + "\n");
			run();
			break;
			
		}} catch (Exception e) {
			System.out.println("Insere um n�mero !!!!!");
			run();
		}
		}	
	

	private static void printProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\r\n" + "Por favor selecione uma das seguintes opções:" + "\n" + "1) Criar novo produto"
				+ "\r\n" + "2) Editar um produto existente" + "\r\n" + "3) Consultar o detalhe de um produto" + "\r\n"
				+ "4) Remover um produto" + "\r\n" + "5) Voltar ao ecrã anterior");
		int choice1 = sc.nextInt();
		
		switch(choice1){
		
		case 1:
			makeProduct();
			printProduct();
			break;
		case 2:
			editProduct();
			printProduct();
			break;
		case 3:
			detailProduct();
			printProduct();
			break;
		case 4:	
			removeProduct();
			printProduct();
			break;
		case 5:		
			run();
		default:
			System.out.println("Coloque um numero de 1 a 5");	
	
		}
	}

	private static void printShelf() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"\r\n" + "Por favor selecione uma das seguintes opções:" + "\r\n" + "1) Criar nova prateleira" + "\r\n"
						+ "2) Editar uma prateleira existente" + "\r\n" + "3) Consultar o detalhe de uma prateleira"
						+ "\r\n" + "4) Remover uma prateleira" + "\r\n" + "5) Voltar ao ecrã anterior");

		
		int choice2 = sc.nextInt();
		
		switch(choice2) {
		case 1:
			getShelfid();
			makeShelf();
			break;
		case 2:
		case 3:
		case 4:
		case 5:	
			run();
		default:
			System.out.println("Coloque um numero de 1 a 5");
		}
		
		
	}

//-------------------------------------- METODOS PARA PRODUTOS------------------------------// 
	private static void makeProduct(){
		System.out.println("Inserir Shelflist");
		int shelflist = scanInt ();
		
		System.out.println("Inserir DiscountValue");
		double discountValue = scanDouble ();
		
		System.out.println("Inserir IVA");
		double iva = scanDouble ();
		
		System.out.println("Inserir PVP");
		double pvp = scanDouble ();
		
		Product produto1 = new Product (shelflist, discountValue, iva, pvp);
		System.out.println("Produto : " + produto1.getShelflist() + " , " + produto1.getDiscountValue()+ " , " + produto1.getIva()+ " , " + produto1.getPvp());
	}
	private static void editProduct(){
		System.out.println("");
	}
	private static void detailProduct(){
		System.out.println("e");
	}
	private static void removeProduct(){
		System.out.println("e");
	}

//----------------------------------FIM METODOS DE PRODUTOS----------------------------------------//
	
//----------------------------------------METODOS SHELVES------------------------------------------//	
	private static void getShelfid(){
		System.out.println("Inserir Shelf ID");
		int shelfid= scanInt ();
	}	
	private static void makeShelf(){
		System.out.println("Inserir Capacity");
		int capacity = scanInt ();
	
		System.out.println("Inserir rentPrice");
		double rentprice = scanDouble ();
	}
//------------------------------------FIM METODOS SHELVES------------------------------------------//		
	
}
	