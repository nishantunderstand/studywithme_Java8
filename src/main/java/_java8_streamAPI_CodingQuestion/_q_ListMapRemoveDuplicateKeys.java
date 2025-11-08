package _java8_streamAPI_CodingQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
 */
public class _q_ListMapRemoveDuplicateKeys {
  public static void main(String[] args) {
     List<Notes> noteLst = new ArrayList<>();
     
     noteLst.add(new Notes(1, "note1", 11));
     noteLst.add(new Notes(2, "note2", 12));
     noteLst.add(new Notes(3, "note3", 13));
     noteLst.add(new Notes(4, "note4", 14));
     noteLst.add(new Notes(5, "note5", 15));
     noteLst.add(new Notes(6, "note6", 16));
     
     
  }
}
