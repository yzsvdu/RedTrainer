package f;

public final class Uk {
  public static final ik a9 = C00.gd(Uk.class);
  
  public Sn M;
  
  public Ud0 Xp0;
  
  public final int E30;
  
  public final int vr0;
  
  public final qw0 w5;
  
  public Uk(Sn paramSn, Ud0 paramUd0, int paramInt1, int paramInt2) {
    qw0 qw01;
    this();
    this.w5 = this;
    this.M = paramSn;
    this.Xp0 = paramUd0;
    this.E30 = paramInt1;
    this.vr0 = paramInt2;
  }
  
  public final i[] qh() {
    return (i[])this.w5.nt((Object[])new i[0]);
  }
  
  public final Ud0 D5() {
    return this.Xp0;
  }
  
  public final int CA() {
    return this.E30;
  }
  
  public final int CoM2() {
    return this.vr0;
  }
  
  public final i rd0(short paramShort1, Ud0 paramUd0, short paramShort2, short paramShort3) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: istore #5
    //   4: getfield M : Lf/Sn;
    //   7: invokevirtual ordinal : ()I
    //   10: dup
    //   11: istore #6
    //   13: ifeq -> 116
    //   16: iload #6
    //   18: iconst_1
    //   19: if_icmpeq -> 24
    //   22: aconst_null
    //   23: areturn
    //   24: getstatic f/HQ.Z90 : Lf/HQ;
    //   27: iload_1
    //   28: invokevirtual Qe : (S)Lf/lj0;
    //   31: dup
    //   32: astore #5
    //   34: ifnonnull -> 78
    //   37: getstatic f/Uk.a9 : Lf/ik;
    //   40: new java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: ldc 'Missing item '
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: iload_1
    //   53: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   56: ldc ' for shop!'
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: invokevirtual toString : ()Ljava/lang/String;
    //   64: new java/lang/RuntimeException
    //   67: dup
    //   68: invokespecial <init> : ()V
    //   71: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   76: aconst_null
    //   77: areturn
    //   78: new f/i
    //   81: dup
    //   82: astore_1
    //   83: aload_0
    //   84: aload_1
    //   85: aload #5
    //   87: aload_0
    //   88: getfield w5 : Lf/qw0;
    //   91: getfield ir0 : I
    //   94: istore_0
    //   95: aload_2
    //   96: iload_3
    //   97: iload_0
    //   98: iload #4
    //   100: invokespecial <init> : (Lf/lj0;Lf/Ud0;SIS)V
    //   103: getfield w5 : Lf/qw0;
    //   106: aload_1
    //   107: invokevirtual iq0 : ()S
    //   110: aload_1
    //   111: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: areturn
    //   116: new f/i
    //   119: dup
    //   120: astore #6
    //   122: aload_0
    //   123: aload #6
    //   125: getstatic f/Of.eH : Lf/Of;
    //   128: iload_1
    //   129: invokevirtual On0 : (S)Lf/LPT3;
    //   132: aload_2
    //   133: aload_0
    //   134: getfield w5 : Lf/qw0;
    //   137: getfield ir0 : I
    //   140: istore_0
    //   141: iload #5
    //   143: iload_3
    //   144: iload_0
    //   145: iload #4
    //   147: invokespecial <init> : (Lf/LPT3;Lf/Ud0;ISIS)V
    //   150: getfield w5 : Lf/qw0;
    //   153: aload #6
    //   155: invokevirtual iq0 : ()S
    //   158: aload #6
    //   160: invokevirtual Vh0 : (SLjava/lang/Object;)Ljava/lang/Object;
    //   163: pop
    //   164: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 24
    //   #2	-> 28
    //   #3	-> 91
    //   #4	-> 100
    //   #5	-> 125
    //   #6	-> 129
    //   #7	-> 137
    //   #8	-> 147
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Uk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */