
public class Main {

	public static void main(String[] args) {
		System.out.println("===========================================Objeto Concreto=============================================");
		Controle Xbox = new Controle();
		Xbox.Marca = "Microsoft";
		Xbox.Nome = "Xbox";
		Xbox.Cor = "preto";
		Xbox.QtnBotoes = 16;
		Xbox.Tecnologia = "Bluetooth";
		Xbox.Apresentacao();
		
		Controle Tv = new Controle();
		Tv.Marca = "Samsung";
		Tv.Nome = "TV";
		Tv.Cor = "Branco";
		Tv.QtnBotoes = 32;
		Tv.Tecnologia = "IR";
		Tv.Apresentacao();
		
		
	}

}
