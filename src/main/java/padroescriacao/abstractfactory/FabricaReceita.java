package padroescriacao.abstractfactory;

public class FabricaReceita implements FabricaClass {

    @Override
    public Consulta createConsulta() {
        return new ConsultaReceita();
    }

    @Override
    public Internacao createInternacao() {
        return new InternacaoReceita();
    }
}
