Iterator<Integer> iterator = a2.iterator();

while (iterator.hasNext()) {

    Integer i = iterator.next();

    if (i == 10) {
        a2.remove(i);
    }

    if (i == 12) {
        a2.remove(i);
    }

    System.out.println(i);
}