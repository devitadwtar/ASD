class NodeFilm09 {
    int id;
    String title;
    double rating;
    NodeFilm09 next;
    NodeFilm09 prev;

    NodeFilm09(int id, String title, double rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
