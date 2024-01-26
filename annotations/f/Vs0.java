package f;

public final class Vs0 extends Wr {
  public final Ip qS;
  
  public zT z30;
  
  public zT Kw;
  
  public dQ As0;
  
  public ge0[] x00;
  
  public Vs0(h2 paramh2) {
    dQ dQ1;
    dQ dQ2;
    rh rh1;
    rh rh2;
    Un un1;
    Un un2;
    this.x00 = new ge0[16];
    this.qS = new Ip();
    EP(1);
    Xu("adminframe");
    Lo("Sound Debugger");
    TG0(new LpT1(this, paramh2));
    this("Region ID: ");
    this("Track ID: ");
    this.z30 = new zT(0, 10, 0);
    this(this.z30);
    this.Kw = new zT(1, 5000, 1);
    this(this.Kw);
    (this.As0 = new dQ()).uh0(300, 20);
    this.z30.Ac0(new BU(this));
    this.Kw.Ac0(new eZ(this));
    this("PLAY");
    (new Un()).tW(new HJ0(this));
    this("STOP");
    (new Un()).tW(new SM());
    ge0[] arrayOfGe03;
    for (byte b = 0; b < (arrayOfGe03 = this.x00).length; b++) {
      boolean bool;
      this();
      arrayOfGe03[b] = ge01;
      ge0 ge01 = this.x00[b];
      if ((ov.Ia0 & 1 << b) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      ge01.zs(bool);
      this.x00[b].tW(new Hp0(this, b));
    } 
    arrayOfJG02[0] = arrayOfGe03[0];
    arrayOfJG02[1] = arrayOfGe03[1];
    arrayOfJG02[2] = arrayOfGe03[2];
    arrayOfJG02[3] = arrayOfGe03[3];
    arrayOfJG02[4] = arrayOfGe03[4];
    arrayOfJG02[5] = arrayOfGe03[5];
    arrayOfJG02[6] = arrayOfGe03[6];
    JG0[] arrayOfJG02;
    (arrayOfJG02 = new JG0[8])[7] = (arrayOfGe03 = this.x00)[7];
    arrayOfJG02[0] = arrayOfGe03[8];
    arrayOfJG02[1] = arrayOfGe03[9];
    arrayOfJG02[2] = arrayOfGe03[10];
    arrayOfJG02[3] = arrayOfGe03[11];
    arrayOfJG02[4] = arrayOfGe03[12];
    arrayOfJG02[5] = arrayOfGe03[13];
    arrayOfJG02[6] = arrayOfGe03[14];
    (arrayOfJG02 = new JG0[8])[7] = (arrayOfGe03 = this.x00)[15];
    this.qS.rK0(this.qS.mE0().Mg(new JG0[] { dQ1, rh1, dQ2, rh2, this.As0, un1, un2 }).ee0(this.qS.vo0(new JG0[8])).ee0(this.qS.vo0(new JG0[8])));
    arrayOfJG01[0] = arrayOfGe02[0];
    arrayOfJG01[1] = arrayOfGe02[1];
    arrayOfJG01[2] = arrayOfGe02[2];
    arrayOfJG01[3] = arrayOfGe02[3];
    arrayOfJG01[4] = arrayOfGe02[4];
    arrayOfJG01[5] = arrayOfGe02[5];
    arrayOfJG01[6] = arrayOfGe02[6];
    JG0[] arrayOfJG01;
    ge0[] arrayOfGe02;
    (arrayOfJG01 = new JG0[8])[7] = (arrayOfGe02 = this.x00)[7];
    arrayOfJG01[0] = this[8];
    arrayOfJG01[1] = this[9];
    arrayOfJG01[2] = this[10];
    arrayOfJG01[3] = this[11];
    arrayOfJG01[4] = this[12];
    arrayOfJG01[5] = this[13];
    arrayOfJG01[6] = this[14];
    ge0[] arrayOfGe01;
    (arrayOfJG01 = new JG0[8])[7] = (arrayOfGe01 = this.x00)[15];
    this.qS.WN(this.qS.d7().Mg(new JG0[] { dQ1, rh1, dQ2, rh2, this.As0, un1, un2 }).ee0(this.qS.AUX(new JG0[8])).ee0(this.qS.AUX(new JG0[8])));
    J8(this.qS);
  }
  
  public final void t0() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: getfield x00 : [Lf/ge0;
    //   7: dup
    //   8: astore_2
    //   9: arraylength
    //   10: if_icmpge -> 45
    //   13: aload_2
    //   14: iload_1
    //   15: aaload
    //   16: dup
    //   17: astore_2
    //   18: ifnonnull -> 24
    //   21: goto -> 39
    //   24: aload_2
    //   25: aload_0
    //   26: getfield z30 : Lf/zT;
    //   29: getfield hk : I
    //   32: i2b
    //   33: invokestatic sz0 : (B)Z
    //   36: invokevirtual wI0 : (Z)V
    //   39: iinc #1, 1
    //   42: goto -> 2
    //   45: getstatic f/km.pm0 : Lf/VD0;
    //   48: iconst_0
    //   49: invokevirtual a7 : (Z)V
    //   52: ldc2_w 50
    //   55: invokestatic sleep : (J)V
    //   58: goto -> 64
    //   61: invokevirtual printStackTrace : ()V
    //   64: aload_0
    //   65: getfield z30 : Lf/zT;
    //   68: getfield hk : I
    //   71: i2b
    //   72: dup
    //   73: istore_1
    //   74: bipush #10
    //   76: if_icmpne -> 99
    //   79: getstatic f/km.pm0 : Lf/VD0;
    //   82: aload_0
    //   83: getfield Kw : Lf/zT;
    //   86: getfield hk : I
    //   89: i2s
    //   90: bipush #10
    //   92: swap
    //   93: invokevirtual bL : (BS)V
    //   96: goto -> 114
    //   99: getstatic f/km.pm0 : Lf/VD0;
    //   102: iload_1
    //   103: aload_0
    //   104: getfield Kw : Lf/zT;
    //   107: getfield hk : I
    //   110: i2s
    //   111: invokevirtual Wk0 : (BS)V
    //   114: aload_0
    //   115: getfield z30 : Lf/zT;
    //   118: getfield hk : I
    //   121: i2b
    //   122: invokestatic sz0 : (B)Z
    //   125: ifeq -> 232
    //   128: aload_0
    //   129: getfield As0 : Lf/dQ;
    //   132: astore_1
    //   133: getstatic f/km.mI0 : Lf/P1;
    //   136: aload_0
    //   137: getfield z30 : Lf/zT;
    //   140: getfield hk : I
    //   143: i2b
    //   144: invokevirtual LpT7 : (B)Lf/HI;
    //   147: invokevirtual gL0 : ()Lf/E4;
    //   150: dup
    //   151: astore_2
    //   152: aload_0
    //   153: iconst_0
    //   154: istore_0
    //   155: getfield Kw : Lf/zT;
    //   158: getfield hk : I
    //   161: istore_3
    //   162: getfield Zn : Lf/U5;
    //   165: ifnonnull -> 191
    //   168: aload_2
    //   169: getfield m4 : I
    //   172: ifeq -> 224
    //   175: aload_2
    //   176: new f/U5
    //   179: dup
    //   180: astore #4
    //   182: aload_2
    //   183: invokespecial <init> : (Lf/E4;)V
    //   186: aload #4
    //   188: putfield Zn : Lf/U5;
    //   191: iload_3
    //   192: iflt -> 224
    //   195: iload_3
    //   196: aload_2
    //   197: getfield Zn : Lf/U5;
    //   200: getfield Dz0 : [Lf/dc;
    //   203: iload_0
    //   204: aaload
    //   205: getfield qJ0 : [Ljava/lang/String;
    //   208: dup
    //   209: astore_0
    //   210: arraylength
    //   211: if_icmplt -> 217
    //   214: goto -> 224
    //   217: aload_0
    //   218: iload_3
    //   219: aaload
    //   220: astore_0
    //   221: goto -> 227
    //   224: ldc '--'
    //   226: astore_0
    //   227: aload_1
    //   228: aload_0
    //   229: invokevirtual E1 : (Ljava/lang/String;)V
    //   232: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 29
    //   #2	-> 33
    //   #3	-> 68
    //   #4	-> 79
    //   #5	-> 86
    //   #6	-> 93
    //   #7	-> 107
    //   #8	-> 111
    //   #9	-> 118
    //   #10	-> 122
    //   #11	-> 140
    //   #12	-> 144
    //   #13	-> 158
    //   #14	-> 162
    //   #15	-> 169
    //   #16	-> 229
    // Exception table:
    //   from	to	target	type
    //   52	61	61	java/lang/InterruptedException
  }
  
  public final void d40() {
    mM();
    this.qS.mM();
    super.d40();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vs0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */