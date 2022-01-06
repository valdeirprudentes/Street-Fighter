package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class daoPersonagem {
	static final String caminho = "jdbc:mysql://localhost/streetfighter";
	public daoPersonagem() {
	}
	
	public void inserirpersonagem(String nome, int soco, int chute, int 
			especial, int defesa, int forca, int vida) {

		String operacao = "INSERT INTO personagem (nome, soco, chute, especial, defesa, forca, vida)VALUES ('" + nome + "', '" + soco + "', '" + chute + "', " + especial + ", " + defesa + "," + forca + " , " + vida + ")";
		
		try {
			Connection conexao =

			DriverManager.getConnection(caminho, "root", "valdeirmetallica");
			PreparedStatement inclusao =

			conexao.prepareStatement(operacao);
			inclusao.execute();
			}
			catch (SQLException sqlExcecao) {
			System.out.println("Erro na operação de BD: " +

			sqlExcecao.getMessage());

		}
	}
}
