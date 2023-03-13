public class TestaGerente {
    public static void main(String[] args) {
        Autenticavel referencia = new Gerente();

        Gerente g1 = new Gerente();
        g1.setNome("Mairon");
        g1.setCpf("2323232");
        g1.setSalario(4000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2526);
         boolean autenticou = g1.autentica(2526);

        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());
    }
}
