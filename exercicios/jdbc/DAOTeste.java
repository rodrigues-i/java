package jdbc;
// parei no minuto 24

public class DAOTeste {
    public static void main(String[] args) {
		DAO dao  new DAO();

		String sql = "INSE INTO pessoas (nome) VALUES(?)";
		System.out.println(dao.incluir(sql, "João da Silva"));
		System.out.println(dao.incluir(sql, "Ana Julia"));

		dao.close();
	}
}
