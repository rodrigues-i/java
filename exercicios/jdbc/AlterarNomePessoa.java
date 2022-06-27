package jdbc;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digita o codigo da pessoa: ");
		int codigo = entrada.nextInt();

		String seleect = "SELECT `codigo`, `nome` FROM `pessoas` WHERE `codigo` = ?";
		String update = "UPDATE `pessoas` SET `nome` = ? WHERE `codigo` = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(seleect);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();

		if(r.next()) {
			Pessoa pessoa = new Pessoa(r.getInt(1), r.getString(2));
			System.out.println("O nome atual é " + pessoa.getNome());
			entrada.nextLine();

			System.out.println("Informa o nome novo: ");
			String nomeNovo = entrada.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, nomeNovo);
			stmt.setInt(2, codigo);
			stmt.execute();

			pessoa.setNome(nomeNovo);
			System.out.println("O nome foi alterado com sucesso!");
		}

		conexao.close();
		entrada.close();
	}
}