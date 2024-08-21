public class Lista_circular {
    private Node last;

    public Lista_circular() {
        last = null;
    }

    // Método para inserir um elemento na lista
    public void inserir(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    // Método para remover um elemento da lista
    public void remover(int data) {
        if (last == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Node current = last.next;
        Node previous = last;

        do {
            if (current.data == data) {
                if (current == last && current.next == last) { // Lista tem um único elemento
                    last = null;
                } else if (current == last) { // Remover o último nó
                    previous.next = current.next;
                    last = previous;
                } else if (current == last.next) { // Remover o primeiro nó
                    last.next = current.next;
                } else { // Remover nó intermediário
                    previous.next = current.next;
                }
                System.out.println("Elemento " + data + " removido.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Elemento " + data + " não encontrado na lista.");
    }

    // Método para imprimir os elementos da lista
    public void printList() {
        if (last == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Node current = last.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
            //Imprime até garantir que o próximo elemento não é o primeiro da lista
        } while (current != last.next);
        System.out.print("\n");
    }
}
