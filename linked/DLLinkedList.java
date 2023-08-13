package edu.zut.cn.linked;

public class DLLinkedList {
    Goods head = new Goods(0,"",0.0);//定义头结点

    public void insert(Goods node){//将node对象添加到链表末尾
        Goods temp = this.head;
        while (true){
            if(temp.next==null){//若链表下一个节点为空，结束循环
                break;
            }
            temp = temp.next;//若下一个结点不为空，跳到下一个节点
        }
        temp.next = node;//将参数node的地址赋给链表尾节点
    }

    public void addById(Goods node){//按照id从小到大添加
        Goods temp = this.head;
        boolean fal = false;//标识符，用来标识该对象id在链表中是否存在
        while (true){
            if(temp.next==null){
                break;
            }
            if(temp.next.id>node.id){
                break;
            }
            if(temp.next.id==node.id){
                fal = true;
                break;
            }
            temp = temp.next;
        }
        if(fal){
            System.out.println("该id在链表中已存在，无法添加");
        }else {//插入节点
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void remove(int id){//删除指定id的节点
        Goods temp = this.head;
        boolean fal = false;
        while(true){//遍历寻找对应id的节点
            if(temp.next==null){
                break;
            }
            if(temp.next.id==id){
                fal = true;
                break;
            }
            temp = temp.next;
        }
        if(fal){
            temp.next = temp.next.next;//删除节点
            System.out.println("删除成功");
        }else {
            System.out.println("未找到，无法删除");
        }
    }

    public void printf(){//打印链表中所有节点信息
        Goods temp = this.head;
        while (true){//遍历打印
            if(temp.next==null){
                break;
            }
            System.out.println(temp.next.toString());
            temp = temp.next;
        }
    }
}
