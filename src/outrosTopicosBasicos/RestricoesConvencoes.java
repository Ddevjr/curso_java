//Restrições para nomes de variáveis
//
//*Não pode começar com dígito: use uma letra ou _
//*Não usar acentos ou til
//*Não pode ter espaço em branco
//*Sugestão: use nomes que tenham um significado
//
//*Camel Case: lastName
//*pacotes
//*atributos
//*método
//*variáveis e parâmetros
//
//*Pascal Case: ProductService
//*classes
package outrosTopicosBasicos;

public class RestricoesConvencoes{
	private String holder;
	private Double balance;
	
	public RestricoesConvencoes(String holder, Double balance) {
		this.holder = holder;
		this.balance = balance;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}