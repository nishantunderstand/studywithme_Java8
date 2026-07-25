List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 16, 33);
List<Integer> myList1 = new ArrayList<>();
List<Integer> myList2 = Arrays.asList(10, 10, 10, 10, 11, 11, 11, 12, 12);
List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 15, 15, 98, 98);
String input = "Java articles are Awesome";
List<String> myList4 = Arrays.asList("Java","String","Awesome");
List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
int[] arr = {11,12,13,14,15,16,99};



---

List<Integer> res = myList.stream().distinct().collect(Collectors.toList()); // Modifable List
List<Integer> res17 = myList.stream().distinct().toList(); // UnModifable List

decimalList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println); // For Sorting
decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // For Sorting


listOfStrings.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);


Collectors.joining(delimiter, prefix, suffix)
String res = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
System.out.println("Result : "+ res);



int max =  listOfIntegers.stream().max(Integer::compare).get();
int max1 =  listOfIntegers.stream().max(Comparator.naturalOrder()).get();



boolean isAnagram = s1.length() == s2.length() &&
Arrays.equals(s1.toLowerCase().chars().sorted().toArray(), s2.toLowerCase().chars().sorted().toArray());