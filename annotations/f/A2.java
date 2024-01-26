package f;

import java.io.File;
import java.math.BigInteger;
import java.util.LinkedList;

public abstract class A2 {
  static {
    BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1024L))))));
    BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
  }
  
  public static void pg(LinkedList<File> paramLinkedList, File paramFile, QA paramQA) {
    File[] arrayOfFile;
    if ((arrayOfFile = paramFile.listFiles(paramQA)) != null) {
      int i = arrayOfFile.length;
      for (byte b = 0; b < i; b++) {
        File file;
        if ((file = arrayOfFile[b]).isDirectory()) {
          pg(paramLinkedList, file, paramQA);
        } else {
          paramLinkedList.add(file);
        } 
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/A2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */