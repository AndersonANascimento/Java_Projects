package locadora;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dvd extends ItemAbstrato {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Dvd() {
    }
    
    @Override
    public void cadastrar() {
        setCodigo(1);
        setTitulo("Senhor dos Anéis");
        setSituacaoItem("L");
        System.out.println("DVD Cadastrado: - Cod: " + getCodigo() +
                " - Título: " + getTitulo() + " - Situação: " + getSituacaoItem());
        System.out.println("DVD cadastrado utilizando método abstrato " +
                "herdado da classe abstrata ItemAbstrato");
    }

    @Override
    public void emprestar() {
        setSituacaoItem("E");
        setDataEmprestimo(sdf.format(new Date()));
        System.out.println("DVD Emprestado: - Situação: " + getSituacaoItem() +
                " - Data Empréstimo: " + getDataEmprestimo());
        System.out.println("DVD emprestado utilizando método abstrato " +
                "herdado da classe abstrata ItemAbstrato");
    }

    @Override
    public void devolver() {
        setSituacaoItem("E");
        setDataDevolucao(sdf.format(new Date()));
        System.out.println("DVD Devolvido: - Situação: " + getSituacaoItem() +
                " - Data Devolução: " + getDataDevolucao());
        System.out.println("DVD devolvido utilizando método abstrato " +
                "herdado da classe abstrata ItemAbstrato");
    }
    
    public void imprimir() {
        System.out.println("Imprimir Lista de DVDs utilizando método concreto da classe Dvd");
    }
    
    public static Dvd getInstance() {
        return new Dvd();
    }
    
}
