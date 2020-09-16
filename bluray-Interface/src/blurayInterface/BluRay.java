package blurayInterface;

import java.util.Vector;

public class BluRay implements InterfaceBluRay {
    private Vector<ItemBluRay> listaBluRay = new Vector<ItemBluRay>();

    @Override
    public void adicionarLista(ItemBluRay obj) {
        this.listaBluRay.add(obj);
    }

    @Override
    public void imprimirLista() {
        System.out.println("Lista de Blu-Rays");
        for (int i = 0; i < listaBluRay.size(); i++) {
            System.out.println("");
            System.out.println("Nome do Cliente: " + this.listaBluRay.get(i).getNomeCliente());
            System.out.println("Preço do Blu-Ray: " + this.listaBluRay.get(i).getPreco());
        }
        System.out.println("..........");
        System.out.println("");
    }
    
}
