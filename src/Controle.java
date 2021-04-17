
public class Controle {
	int QtnBotoes;
	String Nome;
	String Marca;
	String Cor;
	String Tecnologia;
	void Apresentacao() {
		System.out.print("O controle ");
		System.out.print(" de ");
		System.out.print(this.Nome);
		System.out.print(" ");
		System.out.print(this.Tecnologia);
		System.out.print(" da marca ");
		System.out.print(this.Marca);
		System.out.print(" possui ");
		System.out.print(this.QtnBotoes);
		System.out.print(" botões e é ");
		System.out.println(this.Cor);
		System.out.println("____________________________________________________________________________________________________");
	}
}
