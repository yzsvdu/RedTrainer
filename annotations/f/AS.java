package f;

public final class AS extends GS implements Np0 {
  public final short x00;
  
  public AS(short paramShort) {
    this.x00 = paramShort;
  }
  
  public final byte YG0() {
    return 47;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x00 : S
    //   4: iconst_m1
    //   5: if_icmpeq -> 66
    //   8: aload_2
    //   9: aload_0
    //   10: aload #7
    //   12: dup
    //   13: getstatic f/F40.ef0 : Lf/F40;
    //   16: astore_0
    //   17: bipush #14
    //   19: istore_1
    //   20: getfield AD : Lf/Gp0;
    //   23: sipush #559
    //   26: aload_2
    //   27: invokevirtual ex : (ILf/hm0;)I
    //   30: istore_3
    //   31: iconst_1
    //   32: anewarray java/lang/String
    //   35: dup
    //   36: astore #4
    //   38: aload_2
    //   39: invokevirtual fA : ()Ljava/lang/String;
    //   42: iconst_0
    //   43: swap
    //   44: aastore
    //   45: iconst_2
    //   46: aload_0
    //   47: iload_1
    //   48: iload_3
    //   49: aload #4
    //   51: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   54: invokevirtual Kq : (Ljava/lang/String;)V
    //   57: getfield x00 : S
    //   60: putfield my : S
    //   63: goto -> 125
    //   66: aload_2
    //   67: aload #7
    //   69: dup
    //   70: getstatic f/F40.ef0 : Lf/F40;
    //   73: astore_0
    //   74: bipush #14
    //   76: istore_1
    //   77: getfield AD : Lf/Gp0;
    //   80: sipush #562
    //   83: aload_2
    //   84: invokevirtual ex : (ILf/hm0;)I
    //   87: istore_3
    //   88: iconst_1
    //   89: anewarray java/lang/String
    //   92: dup
    //   93: astore #4
    //   95: aload_2
    //   96: invokevirtual fA : ()Ljava/lang/String;
    //   99: iconst_0
    //   100: swap
    //   101: aastore
    //   102: iconst_2
    //   103: aload_0
    //   104: iload_1
    //   105: iload_3
    //   106: aload #4
    //   108: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   111: invokevirtual Kq : (Ljava/lang/String;)V
    //   114: getfield my : S
    //   117: ifle -> 125
    //   120: aload_2
    //   121: iconst_m1
    //   122: goto -> 60
    //   125: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 20
    //   #2	-> 27
    //   #3	-> 51
    //   #4	-> 54
    //   #5	-> 60
    //   #6	-> 70
    //   #7	-> 77
    //   #8	-> 84
    //   #9	-> 108
    //   #10	-> 111
    //   #11	-> 114
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */