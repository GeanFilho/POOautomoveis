package main;
public class Principal {
		public static void main(String[] args) {
			Carro carro = new Carro();
			Moto moto = new Moto();
			
			System.out.println(carro.descricao());
			System.out.println(moto.descricao());
		}


}