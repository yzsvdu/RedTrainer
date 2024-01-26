package f;

import java.nio.ByteBuffer;

public final class dU extends df {
  public String Dt0;
  
  public String KJ;
  
  public dU(x6 paramx6, ByteBuffer paramByteBuffer) {
    super(paramByteBuffer, paramx6, 7);
  }
  
  public final void sM() {
    this.Dt0 = au();
    this.KJ = au();
  }
  
  public final void Cx() {
    // Byte code:
    //   0: aload_0
    //   1: getfield KJ : Ljava/lang/String;
    //   4: invokevirtual isEmpty : ()Z
    //   7: ifeq -> 70
    //   10: aload_0
    //   11: getfield Dt0 : Ljava/lang/String;
    //   14: astore_1
    //   15: invokestatic kt0 : ()Ljava/util/ArrayList;
    //   18: dup
    //   19: astore_2
    //   20: invokevirtual iterator : ()Ljava/util/Iterator;
    //   23: astore_3
    //   24: aload_3
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 177
    //   33: aload_3
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast f/nt
    //   42: dup
    //   43: astore #4
    //   45: getfield sG : Ljava/lang/String;
    //   48: aload_1
    //   49: invokevirtual equals : (Ljava/lang/Object;)Z
    //   52: ifeq -> 24
    //   55: aload_2
    //   56: dup
    //   57: aload #4
    //   59: invokevirtual remove : (Ljava/lang/Object;)Z
    //   62: pop
    //   63: invokestatic KK : (Ljava/util/ArrayList;)Z
    //   66: pop
    //   67: goto -> 177
    //   70: new f/nt
    //   73: dup
    //   74: astore_1
    //   75: aload_0
    //   76: dup
    //   77: getfield Dt0 : Ljava/lang/String;
    //   80: astore_2
    //   81: getfield KJ : Ljava/lang/String;
    //   84: aload_2
    //   85: swap
    //   86: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   89: invokestatic kt0 : ()Ljava/util/ArrayList;
    //   92: dup
    //   93: astore_2
    //   94: invokevirtual iterator : ()Ljava/util/Iterator;
    //   97: astore_3
    //   98: aload_3
    //   99: invokeinterface hasNext : ()Z
    //   104: ifeq -> 127
    //   107: aload_3
    //   108: invokeinterface next : ()Ljava/lang/Object;
    //   113: checkcast f/nt
    //   116: aload_1
    //   117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   120: ifeq -> 98
    //   123: iconst_1
    //   124: goto -> 137
    //   127: aload_2
    //   128: dup
    //   129: aload_1
    //   130: invokevirtual add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: invokestatic KK : (Ljava/util/ArrayList;)Z
    //   137: ifne -> 177
    //   140: aload_0
    //   141: getfield d : Lf/LPt3;
    //   144: checkcast f/x6
    //   147: getfield E50 : Lf/hb0;
    //   150: bipush #87
    //   152: invokestatic OH0 : (I)Ljava/lang/String;
    //   155: astore_1
    //   156: checkcast f/is
    //   159: invokevirtual getClass : ()Ljava/lang/Class;
    //   162: pop
    //   163: getstatic f/js.vu0 : Lf/js;
    //   166: dup
    //   167: astore_2
    //   168: ifnull -> 177
    //   171: aload_2
    //   172: iconst_m1
    //   173: aload_1
    //   174: invokevirtual Pu : (ILjava/lang/String;)V
    //   177: aload_0
    //   178: getfield d : Lf/LPt3;
    //   181: checkcast f/x6
    //   184: getfield E50 : Lf/hb0;
    //   187: checkcast f/is
    //   190: invokevirtual getClass : ()Ljava/lang/Class;
    //   193: pop
    //   194: getstatic f/UB0.Kg0 : Lf/Q50;
    //   197: new f/tX
    //   200: dup
    //   201: invokespecial <init> : ()V
    //   204: invokevirtual fN : (Ljava/lang/Runnable;)V
    //   207: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 15
    //   #2	-> 45
    //   #3	-> 49
    //   #4	-> 70
    //   #5	-> 89
    //   #6	-> 141
    //   #7	-> 144
    //   #8	-> 147
    //   #9	-> 152
    //   #10	-> 163
    //   #11	-> 174
    //   #12	-> 178
    //   #13	-> 181
    //   #14	-> 184
    //   #15	-> 187
    //   #16	-> 194
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */