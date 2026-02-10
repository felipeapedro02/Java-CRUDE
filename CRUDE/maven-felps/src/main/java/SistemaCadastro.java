public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaDeConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = new Cadastro();
        cadastro.setNome("Orácio");
        cadastro.setIdade(12);

        repository.salvar(cadastro);
    }
}
