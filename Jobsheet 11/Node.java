public class Node {

    String question;
    String answer;
    Node nextNode;

    Node(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextNode = null;
    }
}