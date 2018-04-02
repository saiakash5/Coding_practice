package Algorithms_And_DataStructures;

import java.util.Scanner;

/**
 * Created by Akash on 3/15/18.
 */


public class LinkedList {
    static Scanner in = new Scanner(System.in);
    public Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }
    public static void main(String args[])
    {

        LinkedList obj = new LinkedList();
        System.out.println("Enter operation you need to perform");
        System.out.println("1. insertion");
        System.out.println("2. deletion");
        System.out.println("3. size");
        System.out.println("4. search");
        System.out.println("5. Print");
        System.out.println("6. Rotate");
        System.out.println("7. Exit");
        int c = in.nextInt();
        if(c<0)
        {
            System.out.println("Invalid option choose correct option");
            c = in.nextInt();
        }
        while(c>0) {
            switch (c) {
                case 1:
                    insert(obj);
                    break;
                case 2:
                    delete(obj);
                    break;
                case 3:
                    System.out.println(size(obj));
                    break;
                case 4:
                    System.out.println(search(obj));
                    break;
                case 5:
                    print(obj);
                    break;
                case 6:
                    rotate(obj);
                    break;
                case 7:
                    c = -1;
                    break;
                default:
                    System.out.println("Invalid option");
                    System.out.println("Choose correct option");
            }
            if(c>0) {
                System.out.println("Enter operation you need to perform");
                System.out.println("1. insertion");
                System.out.println("2. deletion");
                System.out.println("3. size");
                System.out.println("4. search");
                System.out.println("5. Print");
                System.out.println("6. Rotate");
                System.out.println("7. Exit");
                c = in.nextInt();
            }
        }
    }

    private static void rotate(LinkedList obj) {
        Node h = obj.head;
        int d = h.data;
        h=h.next;
        obj.head=h;
        Node temp = null;
        while(h!=null)
        {
            temp = h;
            h = h.next;
            if(h==null)
                break;

        }
        temp.next=new Node(d);
    }

    private static void print(LinkedList obj) {
        Node h = obj.head;
        while (h!=null)
        {
            System.out.print(h.data+"-->");
            h=h.next;
        }
        System.out.println("null");
    }

    private static String search(LinkedList obj) {
        String s = "";
        System.out.println("Enter data to be found");
        int count =0;
        int data = in.nextInt();
        Node h = obj.head;
        while(h!=null)
        {
            count+=1;
            if(h.data==data)
            {
                s+="Found at position at "+count;
                break;
            }
            h=h.next;
        }
        return "not found";
    }

    private static int size(LinkedList obj) {
        int count = 1;
        Node h = obj.head;
        if(h !=null) {
            while (h.next != null) {
                count += 1;
                h = h.next;
            }
        }
        else
            return 0;
        return count;
    }

    private static void delete(LinkedList obj) {
        System.out.println("Enter element to be deleted");
        int data = in.nextInt();
        Node h = obj.head;
        Node prev = null;
        while(h!=null)
        {
            if(h.data==data)
            {
                if(prev==null)
                {
                    h = h.next;
                    obj.head = h;
                    break;
                }
                else {
                    prev.next = h.next;
                    break;
                }
            }
            prev = h;
            h = h.next;
        }
        System.out.print("Deteted");
    }

    private static void insert(LinkedList obj) {
        System.out.print("Enter data: ");
        Node h = obj.head;
        int data = in.nextInt();
        Node t_obj = new Node(data);
        if(obj.head==null)
        {
            obj.head = t_obj;
        }
        else
        {
            while (h.next!=null)
            {
                h= h.next;
            }
            h.next = t_obj;
        }
        System.out.println("Inserted");
    }
}
