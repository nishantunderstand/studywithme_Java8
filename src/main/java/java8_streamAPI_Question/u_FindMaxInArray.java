package java8_streamAPI_Question;

import java.util.Arrays;

/**
 * 21. Write a Program to find the Maximum element in an array?
 */
public class u_FindMaxInArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 99};
    int[] arr2 = {};

    System.out.println("====== 1 =======");
    Arrays.stream(arr).max().ifPresent(System.out::println);

    System.out.println("====== 2 =======");
    int ans = Arrays.stream(arr).max().getAsInt();
    System.out.println(ans);

    // In Case of Empty , throws Exception

    // From Different Java Version
    //Java-8
    //Java-11
    //Java-17
    //Java-21
    System.out.println("======  3  ======");
    Arrays.stream(arr).max().stream().forEach(System.out::println);


  }
}

/**
 | **Method Name** | **Belongs To**   | **Returns**      | **Return Type**                | **Boxing / Unboxing**              |
 | --------------- | ---------------- | ---------------- | ------------------------------ | ---------------------------------- |
 | `get()`         | `Optional<T>`    | Wrapped value    | `T` (e.g. `Integer`, `String`) | **Boxed** — may auto-unbox later |
 | `getAsInt()`    | `OptionalInt`    | Primitive int    | `int`                          | **No boxing/unboxing**           |
 | `getAsLong()`   | `OptionalLong`   | Primitive long   | `long`                         | **No boxing/unboxing**           |
 | `getAsDouble()` | `OptionalDouble` | Primitive double | `double`                       | **No boxing/unboxing**           |


 */