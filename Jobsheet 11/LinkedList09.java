import org.w3c.dom.Node;

public class LinkedList09 {
    Node09 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node09 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node09 newNode = new Node09(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node09 newNode = new Node09(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node09 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node09 newNode = new Node09(input, null);

        if (!isEmpty()) {
            Node09 currentNode = head;

            while (currentNode != null) {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }
        } else {
            System.out.print("Linked list kosong");
        }
    }

    public int getData(int index, int size) {
    // Cek apakah linked list kosong
    if (head == null) {
        throw new IllegalStateException("Linked list kosong");
    }

    // Cek apakah indeks valid
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Indeks di luar batas linked list");
    }

    Node09 currentNode = head;
    int currentIndex = 0;

    // Iterasi hingga node dengan indeks yang diminta ditemukan
    while (currentIndex != index) {
        currentNode = currentNode.next;
        currentIndex++;
    }

    return currentNode.data;
}

       
    public int indexOf(int key) {
        Node09 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node09 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node09 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void insertBefore(int key, int input) {
        Node09 newNode = new Node09(input, null);
    
        if (!isEmpty()) {
            if (head.data == key) {
                addFirst(input);
                return;
            }
    
            Node09 prevNode = null;
            Node09 currentNode = head;
    
            while (currentNode != null) {
                if (currentNode.data == key) {
                    newNode.next = currentNode;
                    prevNode.next = newNode;
                    return;
                }
    
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
    
            System.out.println("Kunci tidak ditemukan.");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    
    public void insertAt(int index, int key) {
        Node09 newNode = new Node09(key, null);
    
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
    
        if (index == 0) {
            addFirst(key);
            return;
        }
    
        Node09 prevNode = null;
        Node09 currentNode = head;
        int currentIndex = 0;
    
        while (currentNode != null && currentIndex < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
    
        if (currentIndex == index) {
            newNode.next = currentNode;
            prevNode.next = newNode;
        } else {
            System.out.println("Indeks melebihi ukuran linked list.");
        }
    }
    
    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
    
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
    
        if (index == 0) {
            removeFirst();
            return;
        }
    
        Node09 prevNode = null;
        Node09 currentNode = head;
        int currentIndex = 0;
    
        while (currentNode != null && currentIndex < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
    
        if (currentIndex == index) {
            prevNode.next = currentNode.next;
        } else {
            System.out.println("Indeks melebihi ukuran linked list.");
        }
    }
}
