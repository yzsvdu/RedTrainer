package f;

import java.util.Comparator;

public final class sZ implements Comparator {
  public boolean St0;
  
  public sZ(boolean paramBoolean) {
    this.St0 = paramBoolean;
  }
  
  public final int compare(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast f/sM
    //   4: dup
    //   5: astore_1
    //   6: aload_2
    //   7: checkcast f/sM
    //   10: astore_2
    //   11: getfield Jc0 : Lf/iQ;
    //   14: dup
    //   15: astore_3
    //   16: ifnonnull -> 25
    //   19: iconst_1
    //   20: istore #4
    //   22: goto -> 28
    //   25: iconst_0
    //   26: istore #4
    //   28: aload_2
    //   29: getfield Jc0 : Lf/iQ;
    //   32: dup
    //   33: astore #5
    //   35: ifnonnull -> 44
    //   38: iconst_1
    //   39: istore #6
    //   41: goto -> 47
    //   44: iconst_0
    //   45: istore #6
    //   47: iload #4
    //   49: iload #6
    //   51: if_icmpeq -> 84
    //   54: aload #5
    //   56: ifnonnull -> 64
    //   59: iconst_0
    //   60: istore_0
    //   61: goto -> 66
    //   64: iconst_1
    //   65: istore_0
    //   66: aload_3
    //   67: ifnonnull -> 75
    //   70: iconst_0
    //   71: istore_1
    //   72: goto -> 77
    //   75: iconst_1
    //   76: istore_1
    //   77: iload_0
    //   78: iload_1
    //   79: isub
    //   80: istore_0
    //   81: goto -> 159
    //   84: aload_0
    //   85: getfield St0 : Z
    //   88: ifeq -> 109
    //   91: aload_1
    //   92: getfield this : I
    //   95: dup
    //   96: istore_0
    //   97: aload_2
    //   98: getfield this : I
    //   101: dup
    //   102: istore_3
    //   103: if_icmpeq -> 131
    //   106: goto -> 124
    //   109: aload_1
    //   110: getfield ui0 : I
    //   113: dup
    //   114: istore_0
    //   115: aload_2
    //   116: getfield ui0 : I
    //   119: dup
    //   120: istore_3
    //   121: if_icmpeq -> 131
    //   124: iload_3
    //   125: iload_0
    //   126: isub
    //   127: istore_0
    //   128: goto -> 159
    //   131: aload_1
    //   132: getfield qu : I
    //   135: dup
    //   136: istore_0
    //   137: aload_2
    //   138: getfield qu : I
    //   141: dup
    //   142: istore_3
    //   143: if_icmpeq -> 149
    //   146: goto -> 124
    //   149: aload_2
    //   150: getfield m2 : I
    //   153: aload_1
    //   154: getfield m2 : I
    //   157: isub
    //   158: istore_0
    //   159: iload_0
    //   160: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 11
    //   #2	-> 85
    //   #3	-> 92
    //   #4	-> 110
    //   #5	-> 132
    //   #6	-> 150
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */