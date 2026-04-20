package px80Empregado;

public class cargoEmpregado {
    //Non tes que  modificar esta clase para que funcione.
    private String cargo;
    private double eurosPorHora;

    public cargoEmpregado(String t, double eurosPorHora) {
        this.cargo = t;
        this.eurosPorHora = eurosPorHora;
    }

    public String getCargo() {
        return cargo;
    }

    public double geteurosPorHora() {
        return eurosPorHora;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void seteurosPorHora(double eurosPorHora) {
        this.eurosPorHora = eurosPorHora;
    }

    public double calculoHoras(Empregado empregado) {
        if (getCargo().equals("Supervisor")) {
            return empregado.horas + empregado.horasextra * 2;
        }
        if (getCargo().equals("Dependente")) {
            return empregado.horas + empregado.horasextra * 1.5;
        }
        return empregado.horas + empregado.horasextra * 1.1;
    }

}