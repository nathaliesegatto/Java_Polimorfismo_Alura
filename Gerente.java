public class Gerente extends Funcionario {

    private int senha = 23465;
    
        public void setSenha(int senha) {
            this.senha = senha;
        }


    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        return (super.getBonificacao()) + super.getSalario(); 
    //  return (super.getBonificacao()) + super.salario(); >>> OUTRA FORMA ( MAIS RARA) DE ACESSAR O ATRIBUTO DA CLASSE MÃE.
        												     //   SOMENTE A CLASSE FILHA PODE ACESSAR DESSA FORMA, DESDE QUE O 
        												     //   ATRIBUTO NA CLASSE MÃE ESTEJA DEFINIDO COMO "PROTECTED"
    }
    
 }