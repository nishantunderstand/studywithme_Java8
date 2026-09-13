                 Iterator
                    |
          +---------+---------+
          |                   |
       READ/TRAVERSE       MODIFY
          |                   |
      hasNext()             remove()
      next()                   |
          |                    |
          ✅              Mutable list required
                               |
                    Arrays.asList() → ❌
                    List.of()       → ❌
                    ArrayList       → ✅


Collection
|
+--------------------+
|                    |
Traversal           Modification
|                    |
Iterator             depends on
ListIterator         collection
Spliterator           + iterator
Stream

----------------------------------------

Iterator
ListIterator
Spliterator
Stream
for-each



List<Integer> al
|
+------------------------------+
|                              |
↓                              ↓
Arrays.asList(...)              new ArrayList<>(...)
|                              |
Fixed-size                    Resizable
|                              |
remove ❌                       remove ✅



                     List
                      |
          +-----------+------------+
          |           |            |
     Arrays.asList  ArrayList   CopyOnWriteArrayList
          |           |            |
      fixed-size    mutable       mutable
          |           |            |
       Iterator    Iterator      Iterator
          |           |            |
       remove ❌   remove ✅      remove ❌