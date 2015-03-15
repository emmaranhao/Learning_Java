package lista3.Colecoes.Exe02;

/**
 * Created by WhiteHorse on 23/09/2014.
 */
public class RelatorioAlunos {

    public static void main(String[] args) {
        // Testar adicionando uma turma e um aluno
        Turma turma = new Turma();
        RelatorioAlunos ra = new RelatorioAlunos();
        turma.inserirAluno(new Aluno("Alex", 13100651, 7 , 8));
        for (Aluno e : turma.listaAlunos){
            System.out.println(ra.gerarRelatorio(e));
        }
    }

    public float gerarRelatorio(Aluno aluno){
        return (aluno.getNota1() + aluno.getNota2())/2;
    }

}
