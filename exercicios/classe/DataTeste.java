package classe;

public class DataTeste {
	
	public static void main(String[] args) {

		Data dataUm = new Data(16,06,1997);

		// dataUm.dia = 16;
		// dataUm.mes = "06";
		// dataUm.ano = 1997;

		Data dataDois = new Data(30,03,2010);

		// dataDois.dia = 30;
		// dataDois.mes = "03";
		// dataDois.ano = 2010;

		Data semParametro = new Data();


		String dataUmFormatada = dataUm.obterData();
		String dataDoisFormatada = dataDois.obterData();
		String semParametroFormatada = semParametro.obterData();

		System.out.println(dataUmFormatada);
		System.out.println(dataDoisFormatada);
		System.out.println(semParametroFormatada);

		
	}
}