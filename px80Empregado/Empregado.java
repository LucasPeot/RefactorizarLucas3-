package px80Empregado;

public class Empregado {
    private String nome;
    int horas;
    int horasextra;
    cargoEmpregado cargo;

    // Xenera automaticamente un Constructor

    // Xenera automaticamente os métodos get e set para cada atributo da clase

    public Empregado(String nome, int horas, int horasextra, cargoEmpregado cargo) {
        this.nome = nome;
        this.horas = horas;
        this.horasextra = horasextra;
        this.cargo = cargo;
    }

    public double getSoldo() {
        return cargo.geteurosPorHora() * cargo.calculoHoras(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public cargoEmpregado getCargo() {
        return cargo;
    }

    public void setCargo(cargoEmpregado cargo) {
        this.cargo = cargo;
    }

}