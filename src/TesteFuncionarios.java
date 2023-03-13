public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente nico = new Gerente();

        nico.setNome("Nico Steppad");
        nico.setCpf("08242268606");
        nico.setSalario(2600.0);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
