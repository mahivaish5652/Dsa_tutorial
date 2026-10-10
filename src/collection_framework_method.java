import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class collection_framework_method {
   public static void main(String[]args) {
        LinkedList<Integer> list = new LinkedList<>();
       list.add(10);
       list.add(20);
       list.add(40);
       System.out.println(list);
        System.out.println(list.size());
       System.out.println(list.clone());
//       list.ensureCapacity(100);
//       System.out.println(list);
//        list.remove(1);
//       System.out.println(list);
       ArrayList<Integer> list2= new ArrayList<>();
       list2.add(30);
       list2.add(60);
       list2.add(50);
       list.addAll(list2);
       System.out.println(list);
       Collections.sort(list);
       System.out.println(list);
       System.out.println(list.size());
       System.out.println(list.contains(80));
       System.out.println(list.indexOf(40));
       System.out.println(list.isEmpty());
       list.addFirst(2);
       System.out.println(list);
       list.addLast(6);
       System.out.println(list);
       System.out.println(list.get(3));
       list.set(2,40);
       System.out.println(list);
       System.out.println(list.getFirst());
       System.out.println(list.getLast());
       list.removeFirst();
       System.out.println(list);
       list.removeLast();
       System.out.println(list);
       System.out.println(list.peek());
       list.poll();
       System.out.println(list);
       list.offer(80);
       System.out.println(list);
//       System.out.println(list.removeAll(list2));
//       System.out.println(list);
//       list.clear();
//       System.out.println(list);
//        Iterator <Integer> it = list.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());

       Stack<Integer> st = new Stack<>();
       st.push(90);
       st.push(80);
       st.push(70);
       System.out.println(st);
       st.pop();
       System.out.println(st);
       System.out.println(st.empty());
       System.out.println(st.search(0));
        }
    }
