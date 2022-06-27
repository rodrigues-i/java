package jdbc;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM `pessoas`";

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");

			pessoas.add( new Pessoa(codigo, nome));
		}

		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}

		conexao.close();
	}
}
