package com.xyu.algorithm.extra;

import java.util.HashMap;

/**
 * @program: myproject
 * @description:链表的合并
 * @author: xyu
 * @create: 2019-11-13 13:43
 */
public class LinkListTest {


    public static void main(String[] args) {

        LinkList list1 = LinkList.newLinkList(1, 5, 7, 11, 13, 14);
        LinkList list2 = LinkList.newLinkList(2, 4, 6, 8, 10);
        //LinkList list = mergeAndSort(list1, list2);
        //LinkList list3 = merge(list1, list2);
        LinkList list = reverse(list1);
        System.out.println(list);
    }

    /**
     * 拼接合并
     *
     * @param list1
     * @param list2
     * @return
     */
    private static LinkList merge(LinkList list1, LinkList list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        list1.setNext(merge(list2, list1.getNext()));
        return list1;
    }

    /**
     * 有序合并
     *
     * @param list1
     * @param list2
     * @return
     */
    private static LinkList mergeAndSort(LinkList list1, LinkList list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        LinkList list;
        if (list1.getVal() > list2.getVal()) {
            list = list2;
            list.setNext(mergeAndSort(list1, list2.getNext()));
        } else {
            list = list1;
            list.setNext(mergeAndSort(list1.getNext(), list2));
        }
        return list;
    }


    /**
     * 链表的反转
     *
     * @param list
     * @return
     */
    private static LinkList reverse(LinkList list) {
        LinkList p = null;
        LinkList q = list;
        LinkList r = null;
        while (q != null) {
            r = q.getNext();
            q.setNext(p);
            p = q;
            q = r;
        }
        return p;
    }


    /**
     * 检查链表是否有环并求出进入环的第一个节点
     *
     * @param list
     * @return
     */
    private static int checkLoop(LinkList list) {
        if (list == null)
            return -1;
        LinkList slow = list.getNext();
        LinkList fast = list.getNext().getNext();
        while (slow != fast) {
            if (slow == null)
                return -1;
            slow = slow.getNext();
            if (fast == null)
                return -1;
            fast = fast.getNext().getNext();
        }

        fast = list;
        while (fast != slow) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return fast.getVal();
    }


    /**
     * 获取链表的中间节点
     *
     * @param list
     * @return
     */
    private static LinkList getMiddl(LinkList list) {
        if (list == null || list.getNext() == null)
            return list;
        LinkList fast = list.getNext().getNext();
        LinkList slow = list.getNext();
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }


    /**
     * 获取链表倒数第k个元素
     * @param list
     * @param k
     * @return
     */
    private static LinkList getLastK(LinkList list, int k) {
        if (list == null)
            return null;
        LinkList fast = list;
        LinkList slow = list;
        while (k-- > 0) {
            fast = fast.getNext();
        }

        while (fast != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;
    }


}
