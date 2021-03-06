public class List<T> {

    static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    Node<T> head;
    Node<T> tail;
    int length = 0;

    public void addItem(T value) {
        if (length == 0) {
            head = tail = new Node<>(value, null);
        } else {
            Node<T> newNode = new Node<>(value, null);
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    private Node<T> getAfterNNode(Node<T> currentNode, int n) {
        if (currentNode.next != null) {
            if (n != 1) return getAfterNNode(currentNode.next, n - 1);
            else return currentNode;

        }
        return null;
    }

    public void removeNodes(int n, int k) {
        if (head != null) {
            Node<T> lastAfterDelete = getAfterNNode(head, n);
            if (lastAfterDelete != null) removeNodes(lastAfterDelete, k - n + 1);
        }
    }

    public void removeNodes(Node<T> currentNode, int count) {

        if (currentNode.next != null && count != 0) {
            currentNode.next = currentNode.next.next;
            length--;
            removeNodes(currentNode, count - 1);
        }
    }


    public String toString() {

        String str = "[";

        Node<T> currentNode = head;
        while (currentNode != tail) {
            str += currentNode.value + ", ";
            currentNode = currentNode.next;
        }

        str += tail.value + "]";
        return str;
    }
}
