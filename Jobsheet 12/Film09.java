class Film09 {
    NodeFilm09 head, tail;

    Film09() {
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int id, String title, double rating) {
        NodeFilm09 newFilm = new NodeFilm09(id, title, rating);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
    }

    void addLast(int id, String title, double rating) {
        NodeFilm09 newFilm = new NodeFilm09(id, title, rating);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            tail.next = newFilm;
            newFilm.prev = tail;
            tail = newFilm;
        }
    }

    void addAtIndex(int id, String title, double rating, int index) {
        if (index == 0) {
            addFirst(id, title, rating);
            return;
        }
        NodeFilm09 newFilm = new NodeFilm09(id, title, rating);
        NodeFilm09 temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addLast(id, title, rating);
        } else {
            newFilm.next = temp.next;
            temp.next.prev = newFilm;
            temp.next = newFilm;
            newFilm.prev = temp;
            System.out.println("Film telah ditambahkan di index " + index + ".");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Film pertama telah dihapus.");
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
        System.out.println("Film terakhir telah dihapus.");
    }

    void removeAtIndex(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        NodeFilm09 temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index tidak ditemukan.");
        } else if (temp == head) {
            removeFirst();
        } else if (temp == tail) {
            removeLast();
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            System.out.println("Film di index " + index + " telah dihapus.");
        }
    }

    void printList() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        NodeFilm09 temp = head;
        System.out.println("Cetak Data");
        while (temp != null) {
            System.out.println("ID: " + temp.id);
            System.out.println(" Judul Film: " + temp.title);
            System.out.println(" Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    void searchByID(int id) {
        NodeFilm09 temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Data Id Film: " + temp.id + " berada di node ke- " + position);
                System.out.println("IDENTITAS:");
                System.out.println(" ID Film: " + temp.id);
                System.out.println(" Judul Film: " + temp.title);
                System.out.println(" Rating: " + temp.rating);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    void sortByRatingDesc() {
        if (isEmpty()) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            NodeFilm09 current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    int tempId = current.id;
                    String tempTitle = current.title;
                    double tempRating = current.rating;
                    current.id = current.next.id;
                    current.title = current.next.title;
                    current.rating = current.next.rating;
                    current.next.id = tempId;
                    current.next.title = tempTitle;
                    current.next.rating = tempRating;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        System.out.println("Data telah diurutkan berdasarkan rating secara descending.");
    }
}