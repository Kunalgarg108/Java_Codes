  Queue<Integer> pq=new PriorityQueue<>();
        pq.add(31);
        pq.add(59);
        pq.offer(69);
        pq.add(11);
        pq.add(91);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());