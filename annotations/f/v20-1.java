package f;

public final class v20 implements Comparable {
  public String Kt;
  
  public boolean q30;
  
  public v20(String paramString, boolean paramBoolean) {
    this.Kt = paramString;
    this.q30 = paramBoolean;
  }
  
  public final int compareTo(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast f/v20
    //   4: dup
    //   5: astore_1
    //   6: getfield q30 : Z
    //   9: dup
    //   10: istore_2
    //   11: aload_0
    //   12: getfield q30 : Z
    //   15: dup
    //   16: istore_3
    //   17: if_icmpeq -> 27
    //   20: iload_2
    //   21: iload_3
    //   22: isub
    //   23: istore_0
    //   24: goto -> 39
    //   27: aload_0
    //   28: getfield Kt : Ljava/lang/String;
    //   31: aload_1
    //   32: getfield Kt : Ljava/lang/String;
    //   35: invokevirtual compareTo : (Ljava/lang/String;)I
    //   38: istore_0
    //   39: iload_0
    //   40: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 6
    //   #2	-> 32
    //   #3	-> 35
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/v20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */