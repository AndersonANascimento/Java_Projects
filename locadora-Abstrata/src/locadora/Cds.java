package locadora;

public class Cds extends Dvd {
    @Override
    public void cadastrar() {
        setCodigo(1);
        setTitulo("The Best of Joy Division");
        setSituacaoItem("L");
        System.out.println("CD Cadastrado: - Cod: " + getCodigo() +
                " - Título: " + getTitulo() + " - Situação: " + getSituacaoItem());
        System.out.println("CD cadastrado utilizando método abstrato " +
                "herdado da classe abstrata ItemAbstrato");
    }
    
    @Override
    public void imprimir() {
        System.out.println("Imprimir Lista de CDs utilizando método concreto da classe Dvd");
    }
    
    public void vender() {
        System.out.println("CD vendido utilizando método concreto da classe Cds");
    }
    
    public static Cds getInstance() {
        return new Cds();
    }
}
