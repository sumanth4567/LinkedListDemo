import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String args[]){
        //we use double linked list
        LinkedList<Integer> l=new LinkedList<Integer>();
        //we use add method to add elements to a linked list
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        System.out.println(l);//output is [1,2,3,4,5,6,7,8]

        //we can also add an element based on the index
        l.add(4,9);
        System.out.println(l);//output is [1, 2, 3, 4, 9, 5, 6, 7, 8]

        //as it is a linked list we have addresses of both first and last so we can easily add
        //elements at first and last positions
        l.addFirst(25);
        System.out.println(l);//output is [25, 1, 2, 3, 4, 9, 5, 6, 7, 8]
        l.addLast(35);
        System.out.println(l);//output is [25, 1, 2, 3, 4, 9, 5, 6, 7, 8, 35]

        //if we want to get any value based on index we use get function
        int x=l.get(2);
        System.out.println(x);//output is 2
        int x1=l.getFirst();
        int x2=l.getLast();
        System.out.println(x1+" "+x2);//output is 25 35


        //we can also retrieve an index of a particular element
        int i1=l.indexOf(25);//gives first occurence of the given element
        int i2=l.lastIndexOf(35);//give last occurence of the given element
        System.out.println(i1+" "+i2);//output is 0 10
        
        //we can also remove the elements from the list
        int r1=l.remove();//it removes and retrives the data
        int r2=l.remove(4);//removes based on index values
        int r3=l.removeFirst();//it removes and retrives the data at first position
        int r4=l.removeLast();//it removes and retrives the data at last position
        System.out.println(r1+" "+r2+" "+r3+" "+r4);//output is 25 9 1 35

        //we can also know the current size of a LinkedList
        int size=l.size();
        System.out.println("Size of the list is:"+size);//output is 7

        //if we want to access the all the elements of the list we use iterator method

        //if we want to clear all the elements of the list we use following function
        l.clear();
        System.out.println(l);//output is []
    }
}
