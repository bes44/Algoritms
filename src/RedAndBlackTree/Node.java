package RedAndBlackTree;

class Node<T extends Comparable<T>> {
    T data;
    Node<T> left, right, parent;
    Color color;

    Node(T data) {
        this.data = data;
        this.color = Color.RED; // Новые узлы всегда красные
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
