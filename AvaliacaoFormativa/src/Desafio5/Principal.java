package Desafio5;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Adriana");
		Fisica pessoaf = new Fisica("Lívia","628.948.264-76","61.847.927-0");
		
		System.out.println(pessoa.getNome());
		
		System.out.println(pessoaf.getNome());
		System.out.println(pessoaf.getCpf());
		System.out.println(pessoaf.getRg());
		

	}

}
