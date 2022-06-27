package jdbc;

import java.util.Scanner;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;


public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digita o código: ");
		int codigo = entrada.nextInt();

		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setInt(1, codigo);

		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluída com sucesso");
		} else {
			System.out.println("Não foi possível fazer a exclusão");
		}

		conexao.close();
		entrada.close();
	}
}
