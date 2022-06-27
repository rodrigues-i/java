package jdbc;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digita um nome para pesquisar");
		String valor = entrada.nextLine();

		String sql = "SELECT * FROM `pessoas` WHERE nome LIKE ?";
		Connection conexao = FabricaConexao.getConexao();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");

			pessoas.add(new Pessoa(codigo, nome));
		}

		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}

		conexao.close();
		entrada.close();
	}
}
