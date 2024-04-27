package com.yuanstack.algo.structure.linear.base.linked;


import lombok.Getter;
import lombok.Setter;

/**
 * @author Sylvan
 * @date 2024年03月02日 19:50
 */

public class LinkedNode {

    @Getter
    @Setter
    static class Node<T> {
        /**
         * 当前节点值
         */
        T value;

        /**
         * 下一节点
         */
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public void printAll(Node node) {
        if (node == null) {
            return;
        }

        while (node != null) {
            System.out.println(node.getValue());
            node = node.next;
        }
    }

    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node two = head.next;
        if (two == null) {
            return false;
        }

        Node fast = head.next.next;
        if (fast == null) {
            return false;
        }

        while (true) {
            if (fast == two) {
                return true;
            }

            if (two == null || fast == null || fast.next == null) {
                return false;
            }
            two = two.next;
            fast = fast.next.next;
        }

    }

    public <T> Node<T> reverseList(Node<T> node) {
        if (node == null) {
            return null;
        }

        Node<T> temp = null;

        while (node != null) {
            Node<T> temp2 = node.next;
            node.next = temp;
            temp = node;
            node = temp2;
        }

        return temp;
    }

    public Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node result = null;

        Node slow = head;
        Node fast = head.next;
        while (fast != null) {

            Node tempBack = fast.next;
            result = fast;
            result.next = slow;
            result.next.next = tempBack;
            if (fast.next == null || fast.next.next == null) {
                break;
            }

            slow = slow.next.next;
            fast = fast.next.next;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedNode linkedNode = new LinkedNode();
        Node<Integer> ints = new Node<>(1, null);
        ints.setNext(new Node<>(2, new Node<>(3, new Node<>(4, null))));
        linkedNode.printAll(linkedNode.reverseList(ints));
    }

}
