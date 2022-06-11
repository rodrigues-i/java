package lambdas;

// o @FunctionalInterface estabelece que a interface deverá ter somente um metodo/funcao

@FunctionalInterface
public interface Calculo {
    
    public abstract double executar(double a, double b);

    // ter um metodo default não impactará a interface funcional
    default String legal() {
        return "Legal";
    }

    // ter um metodo estático não afetará a interface funcional
    static String muitoLegal() {
        return "Muito legal";
    }
}
