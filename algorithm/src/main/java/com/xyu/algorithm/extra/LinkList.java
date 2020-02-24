package com.xyu.algorithm.extra;

/**
 * @program: myproject
 * @description: 链表
 * @author: xyu
 * @create: 2019-11-11 16:51
 */
public class LinkList {

    private  int val;

    private  LinkList pre;

    private  LinkList next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public LinkList getPre() {
        return pre;
    }

    public void setPre(LinkList pre) {
        this.pre = pre;
    }

    public LinkList getNext() {
        return next;
    }

    public void setNext(LinkList next) {
        this.next = next;
    }

    public static LinkList newLinkList(int...val) {
        LinkList list = new LinkList();
        list.setVal(val[0]);
        setValue(1,val,list);
        return list;
    }

    private static void setValue(int i, int[] val,LinkList list) {
        if (i==val.length)
            return;
        LinkList nextList = new LinkList();
        nextList.setVal(val[i]);
        list.setNext(nextList);
        i++;
        setValue(i,val,nextList);
    }

    @Override
    public String toString() {
        return "LinkList{" +
                "val=" + val +
                ", pre=" + pre +
                ", next=" + next +
                '}';
    }
}
