package com.yuanstack.algo.stack;

import java.util.Stack;

/**
 * @author hansiyuan
 * @date 2024年03月02日 23:21
 */
public class StackDemo {
    public static void main(String[] args) {

        // 创建一个 Stack 实例
        Stack<String> stack = new Stack<>();

        // 使用 push 方法添加元素到栈顶
        stack.push("[");
        stack.push("(");
        stack.push("]");

        if (stack.peek() == "]") {

        }

    }
}
