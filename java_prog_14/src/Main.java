public class Main {
    public static void main(String[] args) {
        WaitList<Integer> list = new WaitList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println("contains 3: " + list.contains(3));
        System.out.println("remove: " + list.remove());
        System.out.println(list);

        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(2);
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        System.out.println(boundedWaitList);
        System.out.println("contains 1: " + boundedWaitList.contains(1));
        boundedWaitList.add(3);
        System.out.println(boundedWaitList);

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        System.out.println(unfairWaitList);
        System.out.println("contains 2: " + unfairWaitList.contains(2));
        unfairWaitList.remove(2);
        System.out.println(unfairWaitList);
        unfairWaitList.moveToBack(1);
        System.out.println(unfairWaitList);
    }
}

