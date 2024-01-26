package f;

public final class T1 extends O0 {
  public int dn0 = 0;
  
  public T1() {
    super((short)0, 0, (short)0, (short)0, true);
    this.gc = 12;
    this.x80 = 6;
    Xu("item-slot");
  }
  
  public final void wA0(byte paramByte, int paramInt, short paramShort1, short paramShort2) {
    this.dn0 = paramInt;
    super.LPt2(paramByte, paramShort1, paramShort2);
    this.dn0 = paramInt;
  }
  
  public final void LPt2(byte paramByte, short paramShort1, short paramShort2) {
    this.dn0 = 0;
    super.LPt2(paramByte, paramShort1, paramShort2);
  }
  
  public final void Tm0(Y paramY) {
    // Byte code:
    //   0: aload_0
    //   1: getfield kN : Z
    //   4: ifne -> 20
    //   7: aload_0
    //   8: dup
    //   9: iconst_0
    //   10: iconst_0
    //   11: iconst_0
    //   12: invokevirtual LPt2 : (BSS)V
    //   15: iconst_0
    //   16: putfield dn0 : I
    //   19: return
    //   20: aload_1
    //   21: ifnull -> 151
    //   24: aload_1
    //   25: getfield Bp0 : Lf/LPT3;
    //   28: dup
    //   29: astore_2
    //   30: ifnonnull -> 34
    //   33: return
    //   34: aload_1
    //   35: getfield Lh : Lf/nH0;
    //   38: dup
    //   39: astore_3
    //   40: getfield Sf0 : S
    //   43: dup
    //   44: istore #4
    //   46: iconst_1
    //   47: if_icmple -> 125
    //   50: getstatic f/js.vu0 : Lf/js;
    //   53: ldc f/AD0
    //   55: invokestatic Bv0 : (Lf/JG0;Ljava/lang/Class;)Lf/JG0;
    //   58: checkcast f/AD0
    //   61: dup
    //   62: astore_3
    //   63: ifnull -> 72
    //   66: aload_3
    //   67: invokestatic c90 : (Lf/JG0;)Z
    //   70: pop
    //   71: return
    //   72: aload_2
    //   73: getfield Iu : I
    //   76: invokestatic OH0 : (I)Ljava/lang/String;
    //   79: sipush #5842
    //   82: swap
    //   83: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
    //   86: astore_2
    //   87: new f/AD0
    //   90: dup
    //   91: astore_3
    //   92: aload_2
    //   93: iload #4
    //   95: new f/T2
    //   98: dup
    //   99: astore_2
    //   100: aload_0
    //   101: aload_1
    //   102: invokespecial <init> : (Lf/T1;Lf/Y;)V
    //   105: aload_2
    //   106: aconst_null
    //   107: invokespecial <init> : (Ljava/lang/String;ILf/q5;Lf/JG0;)V
    //   110: getstatic f/js.vu0 : Lf/js;
    //   113: dup
    //   114: aload_3
    //   115: swap
    //   116: invokevirtual Ub : ()I
    //   119: invokevirtual si : (Lf/JG0;I)V
    //   122: goto -> 163
    //   125: aload_0
    //   126: aload_3
    //   127: dup
    //   128: dup
    //   129: getfield p1 : S
    //   132: istore_0
    //   133: getfield Nj : B
    //   136: istore_1
    //   137: getfield Wy : I
    //   140: iload_1
    //   141: swap
    //   142: iload_0
    //   143: iload #4
    //   145: invokevirtual wA0 : (BISS)V
    //   148: goto -> 163
    //   151: aload_0
    //   152: dup
    //   153: iconst_0
    //   154: iconst_0
    //   155: iconst_0
    //   156: invokevirtual LPt2 : (BSS)V
    //   159: iconst_0
    //   160: putfield dn0 : I
    //   163: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 12
    //   #3	-> 25
    //   #4	-> 35
    //   #5	-> 40
    //   #6	-> 50
    //   #7	-> 53
    //   #8	-> 73
    //   #9	-> 83
    //   #10	-> 110
    //   #11	-> 116
    //   #12	-> 119
    //   #13	-> 129
    //   #14	-> 133
    //   #15	-> 137
    //   #16	-> 145
  }
  
  public final void d40() {
    uh0(48, 48);
    RI(48, 48);
    Tm(48, 48);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/T1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */