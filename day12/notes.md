-Day12:
-Collection:
    .Collection API/Collection Framework --> a concept
    .Collection --> an interface
    .Collections --> a Class
    .Collection Interface:
        -belongs to java.util package
        -Root interface for storing a group of objects
        -Hierarchy first Iterable Collection extends that and then List,Stack,Queue all of these interfaces extends Collection interface and all of  these has their own class implementation
            Eg: List: ArrayList,LinkedList, Set: HashSet,LinkedHashSet Queue: DeQueue
        -Map is not a part of that collection interface
        -Generixx: Mentioning the type of data that you are going to use for the collection using the angular brackets
        -HashSet does not print value in sorted order or in the order given to it and the elements are unique and we cannot use .get() or .set() here
        -TreeSet for sorted and unique values
    .Collections:
        -Utility class contains utility methods like sorting,shuffling,find min,max etc
    .List
        -Maintains the given order, allows duplicates,index based
        -ArrayList:
            ArrayList<Integer> a=new ArrayList<Integer>();
            methods: a.add(9); a.remove(8), a.contains(9), a.set(2,3), a.get(2) a.size() a.clear()
            Complexity:
                get(index) - O(1)
                add(end)   - O(1) avg
                insert(middle) O(n)
                remove(middle) O(n)
            Working:
                uses an dynamic array internally and when the array is full it creates a new array and copies the old elements
                Better at random acces  worse at insertion/deletion
        -LinkedList:
            Working:
                Better at insertion/deletion worse at random acces
                Nodes connected using links
    .Set
        -HashSet:
            No duplicates,unordered like random, very fast because it uses hashing internally
            Avg. complexity O(1)
        -LinkedHashSet:
            No duplicates ,inserted order maintained
        -TreeSet:
            No duplicates,sorted 
            Avg complexity O(log n)
    .Map
        Not a part of collection interface but a part of collection framework
        Unlike HashMap Hashtable is synchronized
        -HashMap
            Working: internally uses hashing,buckets,hashCode()
            | Method          | Meaning        |
            | --------------- | -------------- |
            | put()           | insert         |
            | get()           | retrieve       |
            | remove()        | delete         |
            | containsKey()   | check key      |
            | containsValue() | check value    |
            | keySet()        | get all keys   |
            | values()        | get all values |
        -LinkedHashMap
            maintains insertion order
        -TreeMap
            automatically sorts keys

    .Iteration:
        -for loop:
            for(int i=0;i<list.size();i++)           >
            {
                System.out.println(list.get(i));
            }
        -enhanced for loop:
            for(int i:list)
            {
                System.out.println(i);
            }
        -Iterator:
            Iterator<String> it=list.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        -You should not remove elements usually inside a for each loop you should use iterator
-Collections:
    Collections.sort(list);
    Collections.reverse(list);
    Collections.shuffle(list);
    Collections.max(list);
    Collections.min(list);
Additional points:
    .For custom sort use Comparator interface and implement the compare function if returned 1 it will swap if returned -1 it will not swap or say you are creating an array of say Student class then you can implement the Comparable<Student> and implement the compareTo(T o) function of it because of it why there is a natural sort presennt for data types like Integer,String..
