import javax.swing.JOptionPane;

public class TurmaTeste {

   public static void main (String [] args){
   
      String nome = JOptionPane.showInputDialog("Digite nome");
      String curso = JOptionPane.showInputDialog("Digite Curso");
      int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Alunos"));
      int serie =Integer.parseInt(JOptionPane.showInputDialog("Digite a Serie"));
      
      Turma turma;
      turma = new Turma (nome, curso, quantidadeDeAlunos, serie);
      
      JOptionPane.showMessageDialog(null, "Nome: " + turma.getNome());
      JOptionPane.showMessageDialog(null, "Curso: " + turma.getCurso());
      JOptionPane.showMessageDialog(null, "Quantidade de Alunos: " + turma.getquantidadeDeAlunos());
      JOptionPane.showMessageDialog(null, "Serie: "+ turma.getSerie());
   }
}