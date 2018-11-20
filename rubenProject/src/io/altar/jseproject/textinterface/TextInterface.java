package io.altar.jseproject.textinterface;

import java.util.Scanner;

public class TextInterface {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		printHeader();
		run();
	}

	private static void run() {
		printMenu();
//		while (!)

	}

	private static void printHeader() {
		System.out.println("+-----------------------------------+");
		System.out.println("|           Bem vindo               |");
		System.out.println("+-----------------------------------+");
	}

	private static void printMenu() {
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");
	}

	private static void printProduct() {
		System.out.println("\r\n" + "Por favor selecione uma das seguintes opções:" + "\r\n" + "1) Criar novo produto"
				+ "\r\n" + "2) Editar um produto existente" + "\r\n" + "3) Consultar o detalhe de um produto" + "\r\n"
				+ "4) Remover um produto" + "\r\n" + "5) Voltar ao ecrã anterior");

	}

	private void printShelf() {
		System.out.println(
				"\r\n" + "Por favor selecione uma das seguintes opções:" + "\r\n" + "1) Criar nova prateleira" + "\r\n"
						+ "2) Editar uma prateleira existente" + "\r\n" + "3) Consultar o detalhe de uma prateleira"
						+ "\r\n" + "4) Remover uma prateleira" + "\r\n" + "5) Voltar ao ecrã anterior");

	}
}