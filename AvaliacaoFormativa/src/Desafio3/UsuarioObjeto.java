package Desafio3;

public class UsuarioObjeto {

	public static void main(String[] args) {

		Usuario user = new Usuario();
		Usuario user2 = new Usuario(2,"yasmin",72393,"aceita","yfahewb");
		
		
		System.out.println(user.getId());
		System.out.println(user.getNome());
		System.out.println(user.getPassword());
		System.out.println(user.getPermissao());
		System.out.println(user.getUsuario());
		
		
		System.out.println(user2.getId());
		System.out.println(user2.getNome());
		System.out.println(user2.getPassword());
		System.out.println(user2.getPermissao());
		System.out.println(user2.getUsuario());

	}

}
