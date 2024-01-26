package f;

public final class ju0 extends O0 {
  public int Lq = 0;
  
  public ju0(Ea0 paramEa0) {
    super((short)0, 0, (short)0, (short)0, bool);
    if (km.XU()) {
      this.gc = 25;
      this.x80 = 25;
      E20();
    } else {
      this.gc = 12;
      this.x80 = 6;
    } 
    Xu("item-slot");
  }
  
  public final void LPt2(byte paramByte, short paramShort1, short paramShort2) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup2
    //   3: iconst_0
    //   4: putfield Lq : I
    //   7: iload_1
    //   8: iload_2
    //   9: iload_3
    //   10: invokespecial LPt2 : (BSS)V
    //   13: getfield z70 : Lf/Ea0;
    //   16: dup
    //   17: astore_0
    //   18: getfield Lh0 : Lf/ju0;
    //   21: dup
    //   22: astore_1
    //   23: if_acmpeq -> 102
    //   26: aload_0
    //   27: getfield d50 : Lf/ju0;
    //   30: dup
    //   31: astore_2
    //   32: ifnull -> 102
    //   35: aload_1
    //   36: ifnonnull -> 42
    //   39: goto -> 102
    //   42: aload_2
    //   43: getfield hC0 : S
    //   46: dup
    //   47: istore_1
    //   48: iconst_1
    //   49: if_icmpge -> 60
    //   52: aload_0
    //   53: iconst_0
    //   54: invokevirtual xw0 : (S)V
    //   57: goto -> 102
    //   60: iload_1
    //   61: invokestatic l90 : (S)S
    //   64: istore_1
    //   65: iconst_0
    //   66: istore_2
    //   67: iload_2
    //   68: getstatic f/Ea0.S50 : [S
    //   71: astore_3
    //   72: bipush #17
    //   74: if_icmpge -> 52
    //   77: aload_3
    //   78: iload_2
    //   79: saload
    //   80: iload_1
    //   81: if_icmpne -> 96
    //   84: aload_0
    //   85: getstatic f/Ea0.UA : [S
    //   88: iload_2
    //   89: saload
    //   90: invokevirtual xw0 : (S)V
    //   93: goto -> 102
    //   96: iinc #2, 1
    //   99: goto -> 67
    //   102: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 27
    //   #2	-> 43
    //   #3	-> 54
  }
  
  public final void Tm0(Y paramY) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: getfield z70 : Lf/Ea0;
    //   5: getfield Lh0 : Lf/ju0;
    //   8: if_acmpne -> 12
    //   11: return
    //   12: aload_1
    //   13: ifnull -> 275
    //   16: aload_1
    //   17: getfield Bp0 : Lf/LPT3;
    //   20: dup
    //   21: astore_2
    //   22: ifnonnull -> 26
    //   25: return
    //   26: aload_1
    //   27: getstatic f/Ea0.S50 : [S
    //   30: bipush #17
    //   32: newarray short
    //   34: astore_3
    //   35: iconst_0
    //   36: istore #4
    //   38: iconst_0
    //   39: aload_3
    //   40: bipush #17
    //   42: bipush #17
    //   44: istore #5
    //   46: iload #4
    //   48: swap
    //   49: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   52: getfield Lh : Lf/nH0;
    //   55: getfield p1 : S
    //   58: invokestatic l90 : (S)S
    //   61: istore #4
    //   63: iload #5
    //   65: dup
    //   66: iconst_m1
    //   67: iadd
    //   68: istore #5
    //   70: ifle -> 85
    //   73: aload_3
    //   74: iload #5
    //   76: saload
    //   77: iload #4
    //   79: if_icmpne -> 63
    //   82: goto -> 88
    //   85: iconst_m1
    //   86: istore #5
    //   88: iload #5
    //   90: iflt -> 97
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ifne -> 114
    //   101: getstatic f/km.u4 : Lf/R8;
    //   104: sipush #6032
    //   107: invokestatic OH0 : (I)Ljava/lang/String;
    //   110: invokevirtual Pq : (Ljava/lang/String;)V
    //   113: return
    //   114: aload_1
    //   115: getfield Lh : Lf/nH0;
    //   118: dup
    //   119: astore_3
    //   120: getfield Sf0 : S
    //   123: dup
    //   124: istore #4
    //   126: sipush #9999
    //   129: if_icmple -> 137
    //   132: sipush #9999
    //   135: istore #4
    //   137: iload #4
    //   139: iconst_1
    //   140: if_icmple -> 245
    //   143: getstatic f/js.vu0 : Lf/js;
    //   146: ldc f/AD0
    //   148: invokestatic Bv0 : (Lf/JG0;Ljava/lang/Class;)Lf/JG0;
    //   151: checkcast f/AD0
    //   154: dup
    //   155: astore_3
    //   156: ifnull -> 165
    //   159: aload_3
    //   160: invokestatic c90 : (Lf/JG0;)Z
    //   163: pop
    //   164: return
    //   165: aload_0
    //   166: aload_2
    //   167: getfield Iu : I
    //   170: invokestatic OH0 : (I)Ljava/lang/String;
    //   173: sipush #8554
    //   176: swap
    //   177: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
    //   180: astore_2
    //   181: new f/AD0
    //   184: astore_3
    //   185: getfield z70 : Lf/Ea0;
    //   188: getfield Iz : Lf/ju0;
    //   191: getfield op0 : S
    //   194: dup
    //   195: istore #5
    //   197: iload #4
    //   199: if_icmple -> 205
    //   202: goto -> 209
    //   205: iload #5
    //   207: istore #4
    //   209: aload_3
    //   210: new f/sk0
    //   213: dup
    //   214: astore #5
    //   216: aload_0
    //   217: aload_1
    //   218: invokespecial <init> : (Lf/ju0;Lf/Y;)V
    //   221: aload_2
    //   222: iload #4
    //   224: aload #5
    //   226: aload_0
    //   227: invokespecial <init> : (Ljava/lang/String;ILf/q5;Lf/JG0;)V
    //   230: getstatic f/js.vu0 : Lf/js;
    //   233: dup
    //   234: invokevirtual Ub : ()I
    //   237: aload_3
    //   238: swap
    //   239: invokevirtual si : (Lf/JG0;I)V
    //   242: goto -> 287
    //   245: aload_0
    //   246: aload_1
    //   247: aload_0
    //   248: aload_3
    //   249: dup
    //   250: getfield p1 : S
    //   253: istore_0
    //   254: getfield Nj : B
    //   257: iload_0
    //   258: iload #4
    //   260: invokevirtual LPt2 : (BSS)V
    //   263: getfield Lh : Lf/nH0;
    //   266: getfield Wy : I
    //   269: putfield Lq : I
    //   272: goto -> 287
    //   275: aload_0
    //   276: dup
    //   277: iconst_0
    //   278: iconst_0
    //   279: iconst_0
    //   280: invokevirtual LPt2 : (BSS)V
    //   283: iconst_0
    //   284: putfield Lq : I
    //   287: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 17
    //   #2	-> 27
    //   #3	-> 32
    //   #4	-> 49
    //   #5	-> 52
    //   #6	-> 55
    //   #7	-> 58
    //   #8	-> 76
    //   #9	-> 101
    //   #10	-> 115
    //   #11	-> 120
    //   #12	-> 143
    //   #13	-> 146
    //   #14	-> 167
    //   #15	-> 177
    //   #16	-> 191
    //   #17	-> 210
    //   #18	-> 230
    //   #19	-> 234
    //   #20	-> 239
    //   #21	-> 250
    //   #22	-> 254
    //   #23	-> 260
    //   #24	-> 263
    //   #25	-> 266
    //   #26	-> 269
  }
  
  public final void EX(nY paramnY) {
    d40();
  }
  
  public final void d40() {
    if (km.XU()) {
      uh0(100, 100);
      RI(100, 100);
      Tm(100, 100);
    } else {
      uh0(48, 48);
      RI(48, 48);
      Tm(48, 48);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ju0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */