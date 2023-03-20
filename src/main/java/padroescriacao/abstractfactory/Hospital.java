package padroescriacao.abstractfactory;

public class Hospital {

    private Consulta consulta;
    private Internacao internacao;

    public Hospital(FabricaClass fabrica) {
        this.consulta = fabrica.createConsulta();
        this.internacao = fabrica.createInternacao();
    }

    public String emitirConsulta() {
        return this.consulta.emitir();
    }

    public String emitirInternacao() {
        return this.internacao.emitir();
    }
}
