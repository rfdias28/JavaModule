package io.altar.jseproject.textinterface;

import java.util.Scanner;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class TextInterface {
	static ProductRepository repositorioProduto = ProductRepository.getInstance();
	static ShelfRepository repositorioShelf = ShelfRepository.getInstance();
	
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

		while(true) {
			
			if(scanner.hasNextLong()==true) {
				return scanner.nextLong();
			}else {
				System.out.println("Isso nao e um numero");
			}
			scanner.nextLine();
		}
		
	}
	public static String scanString () {
		String variavel = scanner.nextLine();
		return(variavel);
	}
	public static double scanDouble () {
		double variavel = scanner.nextDouble();
		scanner.nextLine();
		return(variavel);
	}
	public static int scanInt () {
		int variavel = scanner.nextInt();
		scanner.nextLine();
		return(variavel);
		}
	//---------------------------FIM METODOS SCANNER--------------------------------//
	
	public static void printHeader() {
		System.out.println("+------------------------------------------------+");
		System.out.println("|                    Bem vindo                   |");
		System.out.println("+------------------------------------------------+");
	}

	public static void printMenu() {
		
		System.out.println("Por favor selecione uma das seguintes opções:"+ "\n");
		System.out.println("1) Listar Produtos");
		System.out.println("2) Listar Prateleiras");
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

			break;
			
		case 3:
			System.out.println("Adeus");
			break;
			
		default:
			System.out.println("Coloque um numero de 1 a 3 " + "\n");
			run();
			break;
			
		}} catch (Exception e) {
			System.out.println("Insere um numero !!!!!");
			run();
		}
		}	
	
	//-----------------------------------------PRINT PRODUCT---------------------------------------//
	private static void printProduct() {       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Produtos  existentes:\n");
		for(Product product : repositorioProduto.getAll()) {
			System.out.println(product.toString());	
		}
		
		System.out.println("\r\n\n" + "Por favor selecione uma das seguintes opções:" +"\n"+"\n" + "1) Criar novo produto"
				+ "\r\n" + "2) Editar um produto existente" + "\r\n" + "3) Consultar o detalhe de um produto" + "\r\n"
		+ "4) Remover um produto" + "\r\n" + "5) Voltar ao ecrã anterior");
		
		try {

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
			printProduct();
	
		}}catch(Exception e) {
			System.out.println("Coloque um numero de 1 a 5" + "\n");
			printProduct();
		}
	}    //-------------------------------------- FIM PRINT PRODUCT------------------------------------//
	
	//-------------------------------------------- PRINT SHELF------------------------------------------------//

	private static void printShelf() { 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Prateleiras  existentes:\n");
		for(Shelf shelf : repositorioShelf.getAll()) {
			System.out.println(shelf.toString());	
		}
		
		System.out.println(
				"\r\n" + "Por favor selecione uma das seguintes opções:" +"\n"+"\n" + "1) Criar nova prateleira" + "\r\n"
						+ "2) Editar uma prateleira existente" + "\r\n" + "3) Consultar o detalhe de uma prateleira"
						+ "\r\n" + "4) Remover uma prateleira" + "\r\n" + "5) Voltar ao ecrã anterior");

		try {
			
		int choice2 = sc.nextInt();
		switch(choice2) {
		case 1:
			
			makeShelf();
			break;
		case 2:
			editShelf();
			break;
		case 3:break;
		case 4:break;
		case 5:
			run();	break;
		default:
			System.out.println("Coloque um numero de 1 a 5");
		}} catch(Exception e) {
			System.out.println(e);
			System.out.println("Coloque um numero de 1 a 5" + "\n");
			printShelf();
		}
		

	}
	//------------------------------------------------------- FIM PRINT SHELF----------------------------------------//
	
//---------------------------------------------- METODOS PARA PRODUTOS--------------------------------------// 
	private static void makeProduct(){
		System.out.println("Inserir Shelflist");
		int shelflist = scanInt ();
		
		System.out.println("Inserir DiscountValue");
		double discountValue = scanDouble ();
		
		System.out.println("Inserir IVA");
		double iva = scanDouble ();
		
		System.out.println("Inserir PVP");
		double pvp = scanDouble ();
		
		Product produto1 = new Product (discountValue, iva, pvp);
		repositorioProduto.save(produto1);
		
		System.out.println(produto1.toString());
	}
	private static void editProduct(){
		System.out.println("Inserir Product ID");
		int productid= scanInt ();
	}
	private static void detailProduct(){
		System.out.println("e");
	}
	private static void removeProduct(){
		System.out.println("e");
	}

//-----------------------------------------------FIM METODOS DE PRODUTOS----------------------------------------//
	
//------------------------------------------------METODOS SHELVES-----------------------------------------------//	
		
	private static void makeShelf(){

		System.out.println("Inserir Capacity");
		int capacity = scanInt ();
		
//		System.out.println("Inserir ProductID");
//		String productid = scanString();
	
		System.out.println("Inserir rentPrice");
		double rentprice = scanDouble ();

		Shelf shelf1 = new Shelf(capacity, rentprice);
	
		repositorioShelf.save(shelf1);
		System.out.println(shelf1.toString());
		printShelf();
	
	}
		
	private static void editShelf(){
		System.out.println("Inserir Shelf ID");
		long shelfid= scanLong ();
		
		if(repositorioShelf.findById(shelfid)!=null) {

			System.out.println("Inserir nova Capacity");
			int capacity = scanInt ();

		
			System.out.println("Inserir novo rentPrice");
			double rentprice = scanDouble ();
			
			Shelf shelf1 = new Shelf(capacity, rentprice);
			
			System.out.println("Quer associar um produto? (s/n)");
			
			String resposta = scanString();
	
			if(resposta.equals("s")) {
				System.out.println("Qual e o id do produto");
				long produtoId = scanLong();
				Product product =repositorioProduto.findById(produtoId);
				
				if(product!=null) {
					shelf1.setProduct(product);
					
				}else {
					System.out.println("Esse produto nao existe");
				}			
			}
			shelf1.setID(shelfid);
			repositorioShelf.update(shelf1);
			System.out.println(shelf1.toString());
				
			
		}else {
			System.out.println("Nao existe");
		}
		
		printShelf();
	}
//------------------------------------FIM METODOS SHELVES------------------------------------------//		
	

}

	