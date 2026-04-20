package px80Empregado;

public class Main {
    /**
     * @see  https://refactoring.guru/move-method
     */
    public static void main(String[] args) {
        cargoEmpregado empregado1 = new cargoEmpregado("Supervisor", 10);
        cargoEmpregado empregado2 = new cargoEmpregado("Dependente", 2);
        cargoEmpregado empregado3 = new cargoEmpregado("Pepe", 0);
        // Crea un obxecto da clase CargoEmpregado para cada tipo de cargo

        // Crea un obxecto da clase Empregado asignándolles o cargo correspondente
        Empregado mari = new Empregado("Dona Mari", 100, 2, empregado1);
        Empregado Manolo = new Empregado("Manolo", 115, 5, empregado2);
        Empregado Pepe = new Empregado("Don Pepe", 150, 8, empregado3);
        // Faino de tal xeito que deas executado:

        System.out.println(mari.getNome() + " ten un soldo de " + mari.getSoldo());
        System.out.println(Manolo.getNome() + " ten un soldo de " + Manolo.getSoldo());
        System.out.println(Pepe.getNome() + " ten un soldo de " + Pepe.getSoldo());

        //Comenta todo o código

    }
}