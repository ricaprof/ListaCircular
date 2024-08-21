public class Main {
    public static void main(String[] args) {
        Lista_circular list = new Lista_circular();

        //Deverá imprimir a lista vazia
        list.printList();

        // Inserir elementos
        list.inserir(1);

        list.printList();

        list.inserir(2);
        list.inserir(3);
        list.inserir(4);

        // Imprimir lista
        System.out.println("Lista após inserção:");
        list.printList();

        // Remover elementos
        list.remover(2);
        list.remover(4);
        list.remover(5); // Elemento que não está na lista

        // Imprimir lista após remoção
        System.out.println("Lista após remoção:");
        list.printList();
    }
}
