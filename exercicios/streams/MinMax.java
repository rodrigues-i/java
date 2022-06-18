package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MinMax {
    public static void main(String[] args) {
    	Aluno a1 = new Aluno("Ana", 7.1);
    	Aluno a2 = new Aluno("Luna", 6.1);
    	Aluno a3 = new Aluno("Gui", 8.1);
    	Aluno a4 = new Aluno("Gabi", 10);

    	List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

    	// Comparator<Aluno> melhorNota = new Comparator<Aluno> {
	    // 	@Override
	    // 	public int compare(Aluno o1, Aluno o2) {
	    // 		return 0;
	    // 	}
    	// }

    	Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
    		if(aluno1.nota > aluno2.nota) return 1;
    		if(aluno1.nota < aluno2.nota) return -1;

    		return 0;
    	};

    	Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
    		if(aluno1.nota > aluno2.nota) return -1;
    		if(aluno1.nota < aluno2.nota) return 1;

    		return 0;
    	};

    	// com o método min, imprime o aluno com a pior nota
    	System.out.println(alunos.stream().min(melhorNota).get());

    	// imprime o aluno com a maior nota
    	System.out.println(alunos.stream().max(melhorNota).get());

    	// com o método max, imprime o aluno com a pior nota
    	System.out.println(alunos.stream().max(piorNota).get());



    }
}
