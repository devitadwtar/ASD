class Person09 {
    int queueNumber;
    String name;
    Person09 next;
    Person09 prev;

    Person09(int queueNumber, String name) {
        this.queueNumber = queueNumber;
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}
