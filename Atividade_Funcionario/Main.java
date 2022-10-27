public class Main {
  public static void main(String[] args){

    Funcionarios fGe = new Gerente();
    Funcionarios fPo = new Programador();

    fGe.setNome("Renato");
    fGe.setSalario(2000);

    fPo.setNome("Dheb");
    fPo.setSalario(8000);

    System.out.println(fGe);
    System.out.println(fPo);

    fGe.aumentaSalario();
    fPo.aumentaSalario();

    System.out.println(fGe);
    System.out.println(fPo);
  
    //ArrayList <Funcionarios> funcionario = new ArrayList<>();
    
    // for(Funcionarios f : Funcionarios){
    //   System.out.println(f);
    //   f.aumentaSalario();
    //   System.out.println(f);
    // }
  
  }
}
