package Ders4;


public class MyLinkedList {
    MyNode head;

    public void addFirst(int data){
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        MyNode newNode = new MyNode(data);
        if(head == null){
            head = newNode;
        }else{
            MyNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addAtPosition(int data, int position){
        if(position == 0){
            addFirst(data);
        }
        MyNode newNode = new MyNode(data);
        MyNode temp = head;
        for(int i = 0; i < position-1; i++){
            if(temp == null){
                throw new RuntimeException("Invalid position");
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(head == null){
            throw new RuntimeException("List is empty.");
        }
        head = head.next;
    }

    public void removeLast(){
        if(head == null){
            throw new RuntimeException("List is empty.");
        }
        if(head.next == null){
            head = null;
        }
        MyNode temp = head;
        while(temp.next.next != null){   //bi sonraki dersem hata alıyorum eksik işlem oluyor sonuncuyu denetleyemiyorum
            temp = temp.next;
        }
        temp.next = null;
    }



    public void removeAtPosition(int position){
        if (position == 0) {
            removeFirst();  // Eğer pozisyon 0 ise, baştaki eleman silinir
            return;
        }

        MyNode temp = head;

        // Silinecek düğümden bir önceki düğüme kadar gideriz
        for (int i = 0; i < position - 1; i++) {
            if (temp == null || temp.next == null) {
                throw new RuntimeException("Invalid position");
            }
            temp = temp.next;
        }

        // temp.next null değilse bir sonraki düğümü ayarlarız
        if (temp.next == null) {
            throw new RuntimeException("Invalid position");
        }

        // Silinecek düğüm: temp.next
        MyNode nodeToDelete = temp.next;

        // temp.next, silinecek düğümün sonrasına bağlanır
        temp.next = nodeToDelete.next;

        // Silinecek düğümü bellekten temizlemek isterseniz:
        nodeToDelete.next = null;


    }



    public void printList() {
        if (head == null) {
            System.out.println("Liste boş");
            return;
        }
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
