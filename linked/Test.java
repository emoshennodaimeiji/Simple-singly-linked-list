package edu.zut.cn.linked;

public class Test {
    public static void main(String[] args) {
        DLLinkedList dlLinkedList = new DLLinkedList();
        dlLinkedList.addById(new Goods(1,"薯片",6.0));
        dlLinkedList.addById(new Goods(4,"可乐",3.0));
        dlLinkedList.addById(new Goods(6,"辣条",4.0));
        dlLinkedList.addById(new Goods(2,"泡面",5.0));
        dlLinkedList.printf();
        dlLinkedList.remove(6);
        dlLinkedList.printf();
    }
}
