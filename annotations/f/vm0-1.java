package f;

public final class vm0 implements Runnable {
  public vm0(Wx paramWx, P10 paramP10) {}
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp0 : Lf/Wx;
    //   4: dup
    //   5: astore_1
    //   6: aload_0
    //   7: getfield RM : Lf/P10;
    //   10: getfield FJ0 : B
    //   13: istore_0
    //   14: invokevirtual getClass : ()Ljava/lang/Class;
    //   17: pop
    //   18: getstatic f/km.SE0 : Lf/is;
    //   21: dup
    //   22: astore_2
    //   23: ifnonnull -> 29
    //   26: goto -> 285
    //   29: aload_2
    //   30: getfield qf0 : I
    //   33: bipush #10
    //   35: if_icmpeq -> 43
    //   38: iconst_1
    //   39: istore_0
    //   40: goto -> 146
    //   43: aload_2
    //   44: getfield N30 : [Lf/P10;
    //   47: dup
    //   48: astore_3
    //   49: arraylength
    //   50: istore #4
    //   52: iconst_0
    //   53: istore #5
    //   55: iload #5
    //   57: iload #4
    //   59: if_icmpge -> 85
    //   62: aload_3
    //   63: iload #5
    //   65: aaload
    //   66: dup
    //   67: astore #6
    //   69: getfield FJ0 : B
    //   72: iload_0
    //   73: if_icmpne -> 79
    //   76: goto -> 88
    //   79: iinc #5, 1
    //   82: goto -> 55
    //   85: aconst_null
    //   86: astore #6
    //   88: aload #6
    //   90: ifnonnull -> 98
    //   93: iconst_2
    //   94: istore_0
    //   95: goto -> 146
    //   98: aload #6
    //   100: getfield gw0 : Ljava/lang/String;
    //   103: ldc 'PTS'
    //   105: swap
    //   106: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   109: ifeq -> 117
    //   112: iconst_4
    //   113: istore_0
    //   114: goto -> 146
    //   117: aload_2
    //   118: dup
    //   119: dup
    //   120: aload #6
    //   122: putfield mp0 : Lf/P10;
    //   125: bipush #11
    //   127: putfield qf0 : I
    //   130: getfield rQ : Lf/x6;
    //   133: new f/LH
    //   136: dup
    //   137: iload_0
    //   138: invokespecial <init> : (B)V
    //   141: invokevirtual Ab0 : (Lf/Mg;)V
    //   144: iconst_0
    //   145: istore_0
    //   146: iload_0
    //   147: ifeq -> 211
    //   150: iload_0
    //   151: iconst_3
    //   152: if_icmpeq -> 190
    //   155: iload_0
    //   156: iconst_4
    //   157: if_icmpeq -> 175
    //   160: aload_1
    //   161: getfield Ja : Lf/js;
    //   164: astore_0
    //   165: sipush #1016
    //   168: invokestatic OH0 : (I)Ljava/lang/String;
    //   171: astore_1
    //   172: goto -> 202
    //   175: aload_1
    //   176: getfield Ja : Lf/js;
    //   179: astore_0
    //   180: sipush #1015
    //   183: invokestatic OH0 : (I)Ljava/lang/String;
    //   186: astore_1
    //   187: goto -> 202
    //   190: aload_1
    //   191: getfield Ja : Lf/js;
    //   194: astore_0
    //   195: sipush #1014
    //   198: invokestatic OH0 : (I)Ljava/lang/String;
    //   201: astore_1
    //   202: aload_0
    //   203: iconst_m1
    //   204: aload_1
    //   205: invokevirtual Pu : (ILjava/lang/String;)V
    //   208: goto -> 285
    //   211: getstatic f/UB0.Kg0 : Lf/Q50;
    //   214: new f/x10
    //   217: dup
    //   218: aload_1
    //   219: invokespecial <init> : (Lf/Wx;)V
    //   222: invokevirtual fN : (Ljava/lang/Runnable;)V
    //   225: getstatic f/km.mI0 : Lf/P1;
    //   228: getfield Mv0 : Z
    //   231: ifeq -> 285
    //   234: getstatic f/js.vu0 : Lf/js;
    //   237: dup
    //   238: astore_0
    //   239: ifnull -> 285
    //   242: aload_0
    //   243: getfield Lz : Lf/wL;
    //   246: ifnull -> 285
    //   249: aload_1
    //   250: iconst_0
    //   251: istore_0
    //   252: getfield rI : Lf/Ip;
    //   255: dup
    //   256: astore_2
    //   257: getfield dP : Z
    //   260: ifeq -> 268
    //   263: aload_2
    //   264: iload_0
    //   265: invokevirtual wI0 : (Z)V
    //   268: aload_1
    //   269: invokevirtual p3 : ()Z
    //   272: ifeq -> 285
    //   275: getstatic f/js.vu0 : Lf/js;
    //   278: getfield Lz : Lf/wL;
    //   281: invokestatic c90 : (Lf/JG0;)Z
    //   284: pop
    //   285: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 10
    //   #2	-> 14
    //   #3	-> 18
    //   #4	-> 30
    //   #5	-> 44
    //   #6	-> 69
    //   #7	-> 100
    //   #8	-> 103
    //   #9	-> 161
    //   #10	-> 205
    //   #11	-> 211
    //   #12	-> 234
    //   #13	-> 243
    //   #14	-> 252
    //   #15	-> 257
    //   #16	-> 265
    //   #17	-> 269
    //   #18	-> 275
    //   #19	-> 278
    //   #20	-> 281
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */