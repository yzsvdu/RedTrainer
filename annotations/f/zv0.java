package f;

public class zv0 implements E6 {
  public static final NC0 FZ = new NC0();
  
  public final boolean Qi0(V80 paramV80) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof f/iW
    //   4: ifne -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: checkcast f/iW
    //   13: astore_1
    //   14: getstatic f/TP.WH0 : [I
    //   17: dup
    //   18: astore_2
    //   19: aload_1
    //   20: getfield Dd0 : Lf/MV;
    //   23: invokevirtual ordinal : ()I
    //   26: iaload
    //   27: dup
    //   28: istore_3
    //   29: iconst_1
    //   30: if_icmpeq -> 363
    //   33: iload_3
    //   34: iconst_2
    //   35: if_icmpeq -> 361
    //   38: iload_3
    //   39: iconst_3
    //   40: if_icmpeq -> 359
    //   43: aload_2
    //   44: aload_1
    //   45: dup
    //   46: getfield Kx : Lf/eF0;
    //   49: getstatic f/zv0.FZ : Lf/NC0;
    //   52: dup
    //   53: dup2
    //   54: astore_2
    //   55: aload_1
    //   56: dup
    //   57: getfield Aa0 : F
    //   60: fstore_3
    //   61: getfield coM4 : F
    //   64: fstore #4
    //   66: fload_3
    //   67: putfield x : F
    //   70: fload #4
    //   72: putfield y : F
    //   75: invokevirtual pT : (Lf/NC0;)Lf/NC0;
    //   78: pop
    //   79: getfield Dd0 : Lf/MV;
    //   82: invokevirtual ordinal : ()I
    //   85: iaload
    //   86: tableswitch default -> 128, 4 -> 230, 5 -> 197, 6 -> 172, 7 -> 166, 8 -> 150, 9 -> 140, 10 -> 130
    //   128: iconst_0
    //   129: ireturn
    //   130: aload_0
    //   131: aload_1
    //   132: getfield W00 : I
    //   135: invokevirtual zn0 : (I)V
    //   138: iconst_0
    //   139: ireturn
    //   140: aload_0
    //   141: aload_1
    //   142: getfield W00 : I
    //   145: invokevirtual HT : (I)V
    //   148: iconst_0
    //   149: ireturn
    //   150: aload_0
    //   151: aload_1
    //   152: dup
    //   153: getfield Db : F
    //   156: fstore_0
    //   157: getfield NQ : F
    //   160: fload_0
    //   161: swap
    //   162: invokevirtual UI0 : (FF)Z
    //   165: ireturn
    //   166: aload_0
    //   167: invokevirtual ci0 : ()V
    //   170: iconst_0
    //   171: ireturn
    //   172: aload_0
    //   173: aload_1
    //   174: aload_2
    //   175: dup
    //   176: getfield x : F
    //   179: fstore_0
    //   180: getfield y : F
    //   183: fstore_2
    //   184: getfield W00 : I
    //   187: istore_3
    //   188: aload_1
    //   189: fload_0
    //   190: fload_2
    //   191: iload_3
    //   192: invokevirtual Si : (Lf/iW;FFI)V
    //   195: iconst_1
    //   196: ireturn
    //   197: aload_0
    //   198: aload_1
    //   199: dup
    //   200: aload_2
    //   201: dup
    //   202: getfield x : F
    //   205: fstore_0
    //   206: getfield y : F
    //   209: fstore_2
    //   210: getfield W00 : I
    //   213: istore_3
    //   214: getfield so : I
    //   217: istore #4
    //   219: aload_1
    //   220: fload_0
    //   221: fload_2
    //   222: iload_3
    //   223: iload #4
    //   225: invokevirtual ga : (Lf/iW;FFII)V
    //   228: iconst_1
    //   229: ireturn
    //   230: aload_0
    //   231: aload_1
    //   232: dup
    //   233: aload_2
    //   234: dup
    //   235: getfield x : F
    //   238: fstore_2
    //   239: getfield y : F
    //   242: fstore_3
    //   243: getfield W00 : I
    //   246: istore #4
    //   248: getfield so : I
    //   251: istore #5
    //   253: aload_1
    //   254: fload_2
    //   255: fload_3
    //   256: iload #4
    //   258: iload #5
    //   260: invokevirtual LPt8 : (Lf/iW;FFII)Z
    //   263: dup
    //   264: istore_2
    //   265: ifeq -> 357
    //   268: aload_1
    //   269: getfield KF0 : Z
    //   272: ifeq -> 357
    //   275: aload_1
    //   276: getfield OC0 : Lf/Zy;
    //   279: dup
    //   280: aload_1
    //   281: dup
    //   282: dup2
    //   283: getfield Kx : Lf/eF0;
    //   286: astore_1
    //   287: getfield l0 : Lf/eF0;
    //   290: astore_3
    //   291: getfield W00 : I
    //   294: istore #4
    //   296: getfield so : I
    //   299: istore #5
    //   301: invokevirtual getClass : ()Ljava/lang/Class;
    //   304: pop
    //   305: ldc f/Wn
    //   307: invokestatic vu0 : (Ljava/lang/Class;)Lf/Lc;
    //   310: invokevirtual obtain : ()Ljava/lang/Object;
    //   313: checkcast f/Wn
    //   316: dup
    //   317: astore #6
    //   319: iload #5
    //   321: aload #6
    //   323: iload #4
    //   325: aload #6
    //   327: aload_0
    //   328: aload #6
    //   330: aload_3
    //   331: aload #6
    //   333: aload_1
    //   334: putfield tq : Lf/eF0;
    //   337: putfield me0 : Lf/eF0;
    //   340: putfield Ra : Lf/E6;
    //   343: putfield Fa0 : I
    //   346: putfield yB : I
    //   349: getfield Sq : Lf/d10;
    //   352: aload #6
    //   354: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   357: iload_2
    //   358: ireturn
    //   359: iconst_0
    //   360: ireturn
    //   361: iconst_0
    //   362: ireturn
    //   363: iconst_0
    //   364: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 20
    //   #2	-> 23
    //   #3	-> 46
    //   #4	-> 49
    //   #5	-> 57
    //   #6	-> 67
    //   #7	-> 72
    //   #8	-> 75
    //   #9	-> 79
    //   #10	-> 82
    //   #11	-> 132
    //   #12	-> 135
    //   #13	-> 142
    //   #14	-> 145
    //   #15	-> 153
    //   #16	-> 157
    //   #17	-> 162
    //   #18	-> 184
    //   #19	-> 192
    //   #20	-> 210
    //   #21	-> 214
    //   #22	-> 225
    //   #23	-> 243
    //   #24	-> 248
    //   #25	-> 260
    //   #26	-> 269
    //   #27	-> 276
    //   #28	-> 283
    //   #29	-> 287
    //   #30	-> 291
    //   #31	-> 296
    //   #32	-> 301
    //   #33	-> 305
    //   #34	-> 313
  }
  
  public boolean LPt8(iW paramiW, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    return false;
  }
  
  public void ga(iW paramiW, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {}
  
  public void Si(iW paramiW, float paramFloat1, float paramFloat2, int paramInt) {}
  
  public void ci0() {}
  
  public void HT(int paramInt) {}
  
  public void zn0(int paramInt) {}
  
  public boolean UI0(float paramFloat1, float paramFloat2) {
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zv0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */