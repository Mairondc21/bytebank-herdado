public class SistemaInterno {
    private int senha = 2222;
    public void autentica (Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
          if (autenticou == true){
            System.out.println("pode entrar");
       }  else {
           System.out.println("acesso negado");
       }
   }
}
