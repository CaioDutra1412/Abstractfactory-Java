package padroescriacao.abstractfactory;

public class FabricaExame implements FabricaClass {

    @Override
    public Consulta createConsulta() {
        return new ConsultaExame();
    }

    @Override
    public Internacao createInternacao() {
        return new InternacaoExame();
    }
}
