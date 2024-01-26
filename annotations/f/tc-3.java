/* 1 */ package f;public abstract class tc extends Qh0 { public static int kH(tc paramtc1, tc paramtc2) { if (paramtc2.Jg == 
/*   */       
/* 3 */       km.a3.Ct
/* 4 */       .Jg) return 100;  if (paramtc2 instanceof zk0)
/* 5 */       return 99; 
/* 6 */     return paramtc1.m().compareTo(paramtc2.m()); }
/*   */ 
/*   */   
/*   */   public static final Comparator qL = tc::kH;
/*   */   public final G5 HW;
/*   */   public final d7 pm = new d7(this);
/*   */   public final static Y1 = tA();
/*   */   public zk0 Ae;
/*   */   public boolean dh = false;
/*   */   public byte G80;
/*   */   public Z50 kK0 = Z50.yx0;
/*   */   
/*   */   public tc(int paramInt, G5 paramG5, byte paramByte) {
/*   */     super(paramInt);
/*   */     this.HW = paramG5;
/*   */     this.G80 = paramByte;
/*   */   }
/*   */   
/*   */   public abstract static tA();
/*   */   
/*   */   public final G5 zm() {
/*   */     return this.HW;
/*   */   }
/*   */   
/*   */   public final byte tY() {
/*   */     return this.HW.FB;
/*   */   }
/*   */   
/*   */   public final short nul() {
/*   */     return this.HW.mm;
/*   */   }
/*   */   
/*   */   public final short zD() {
/*   */     return this.HW.Yu0;
/*   */   }
/*   */   
/*   */   public float aJ0() {
/*   */     return this.HW.VI0();
/*   */   }
/*   */   
/*   */   public byte Os() {
/*   */     return 1;
/*   */   }
/*   */   
/*   */   public byte Bh() {
/*   */     return 1;
/*   */   }
/*   */   
/*   */   public final d7 kz0() {
/*   */     return this.pm;
/*   */   }
/*   */   
/*   */   public abstract static default();
/*   */   
/*   */   public void EL(boolean paramBoolean) {
/*   */     this.pm.tS();
/*   */     if ((this = this.Ae) != null)
/*   */       EL(paramBoolean); 
/*   */   }
/*   */   
/*   */   public abstract byte my();
/*   */   
/*   */   public abstract short D4();
/*   */   
/*   */   public boolean Pf() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public boolean z80() {
/*   */     return this.dh;
/*   */   }
/*   */   
/*   */   public final boolean XC() {
/*   */     return ((this.G80 & 0x2) != 0);
/*   */   }
/*   */   
/*   */   public boolean UG() {
/*   */     return ((this.G80 & 0x1) != 0);
/*   */   }
/*   */   
/*   */   public void sq(boolean paramBoolean) {
/*   */     if (paramBoolean) {
/*   */       this.G80 = (byte)(this.G80 | 0x1);
/*   */     } else {
/*   */       this.G80 = (byte)(this.G80 & 0xFFFFFFFE);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean VO() {
/*   */     return ((this.G80 & 0x10) != 0);
/*   */   }
/*   */   
/*   */   public short nX() {
/*   */     return ((this = this.Ae) == null) ? 0 : ((zk0)this).YZ;
/*   */   }
/*   */   
/*   */   public byte wo() {
/*   */     return ((this = this.Ae) == null) ? 0 : ((zk0)this).zz0;
/*   */   }
/*   */   
/*   */   public final boolean AJ0() {
/*   */     return (this.Ae == null) ? false : (((this.G80 & Byte.MIN_VALUE) != 0) ? true : (default().nc0() ? false : (((this.G80 & 0x33) == 0))));
/*   */   }
/*   */   
/*   */   public tc U0() {
/*   */     return null;
/*   */   }
/*   */   
/*   */   public boolean er() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final boolean so0(byte paramByte) {
/*   */     return ((this.G80 & paramByte) != 0);
/*   */   }
/*   */   
/*   */   public boolean yO() {
/*   */     return this instanceof dE0;
/*   */   }
/*   */   
/*   */   public String a() {
/*   */     return "";
/*   */   }
/*   */   
/*   */   public final void q90(Z50 paramZ50) {
/*   */     if (paramZ50 != Z50.yx0 && this == km.a3.Ct)
/*   */       return; 
/*   */     this.kK0 = paramZ50;
/*   */   }
/*   */   
/*   */   public boolean zl() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public boolean b1() {
/*   */     return true;
/*   */   }
/*   */   
/*   */   public void WC(short paramShort, boolean paramBoolean, byte paramByte) {
/*   */     if ((this = this.Ae) != null)
/*   */       super.WC(paramShort, paramBoolean, paramByte); 
/*   */   }
/*   */   
/*   */   public final boolean jC(byte paramByte, xr0 paramxr0) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield HW : Lf/G5;
/*   */     //   4: getfield LB0 : Z
/*   */     //   7: aload_2
/*   */     //   8: invokevirtual Y00 : ()Z
/*   */     //   11: if_icmpeq -> 16
/*   */     //   14: iconst_0
/*   */     //   15: ireturn
/*   */     //   16: aload_0
/*   */     //   17: getfield HW : Lf/G5;
/*   */     //   20: getfield FB : B
/*   */     //   23: invokestatic n80 : (B)Z
/*   */     //   26: ifeq -> 65
/*   */     //   29: aload_0
/*   */     //   30: getfield HW : Lf/G5;
/*   */     //   33: getfield kD0 : B
/*   */     //   36: aload_2
/*   */     //   37: invokevirtual Q4 : ()Lf/KI;
/*   */     //   40: getfield cA : B
/*   */     //   43: if_icmpne -> 63
/*   */     //   46: aload_0
/*   */     //   47: getfield HW : Lf/G5;
/*   */     //   50: getfield vu0 : B
/*   */     //   53: aload_2
/*   */     //   54: invokevirtual Q4 : ()Lf/KI;
/*   */     //   57: getfield VZ : B
/*   */     //   60: if_icmpeq -> 65
/*   */     //   63: iconst_0
/*   */     //   64: ireturn
/*   */     //   65: aload_2
/*   */     //   66: invokevirtual Ka : ()S
/*   */     //   69: aload_0
/*   */     //   70: getfield HW : Lf/G5;
/*   */     //   73: getfield mm : S
/*   */     //   76: if_icmplt -> 214
/*   */     //   79: aload_2
/*   */     //   80: invokevirtual Ka : ()S
/*   */     //   83: aload_0
/*   */     //   84: dup
/*   */     //   85: getfield HW : Lf/G5;
/*   */     //   88: getfield mm : S
/*   */     //   91: istore_3
/*   */     //   92: invokevirtual Os : ()B
/*   */     //   95: iload_3
/*   */     //   96: iadd
/*   */     //   97: if_icmplt -> 103
/*   */     //   100: goto -> 214
/*   */     //   103: aload_2
/*   */     //   104: invokevirtual hA0 : ()S
/*   */     //   107: aload_0
/*   */     //   108: getfield HW : Lf/G5;
/*   */     //   111: getfield Yu0 : S
/*   */     //   114: aload_0
/*   */     //   115: invokevirtual Bh : ()B
/*   */     //   118: isub
/*   */     //   119: if_icmple -> 212
/*   */     //   122: aload_2
/*   */     //   123: invokevirtual hA0 : ()S
/*   */     //   126: aload_0
/*   */     //   127: getfield HW : Lf/G5;
/*   */     //   130: dup
/*   */     //   131: astore_3
/*   */     //   132: getfield Yu0 : S
/*   */     //   135: if_icmple -> 141
/*   */     //   138: goto -> 212
/*   */     //   141: aload_3
/*   */     //   142: getfield FB : B
/*   */     //   145: invokestatic n80 : (B)Z
/*   */     //   148: ifeq -> 178
/*   */     //   151: iload_1
/*   */     //   152: iflt -> 176
/*   */     //   155: aload_0
/*   */     //   156: getfield HW : Lf/G5;
/*   */     //   159: getfield Qf0 : B
/*   */     //   162: dup
/*   */     //   163: istore_0
/*   */     //   164: iflt -> 176
/*   */     //   167: iload_1
/*   */     //   168: iconst_3
/*   */     //   169: idiv
/*   */     //   170: iload_0
/*   */     //   171: iconst_3
/*   */     //   172: idiv
/*   */     //   173: if_icmpne -> 208
/*   */     //   176: iconst_1
/*   */     //   177: ireturn
/*   */     //   178: aload_2
/*   */     //   179: invokevirtual bl0 : ()B
/*   */     //   182: aload_0
/*   */     //   183: getfield HW : Lf/G5;
/*   */     //   186: getfield Qf0 : B
/*   */     //   189: dup
/*   */     //   190: istore_0
/*   */     //   191: if_icmpeq -> 210
/*   */     //   194: iload_0
/*   */     //   195: ifge -> 208
/*   */     //   198: aload_2
/*   */     //   199: invokevirtual bl0 : ()B
/*   */     //   202: ifne -> 208
/*   */     //   205: goto -> 210
/*   */     //   208: iconst_0
/*   */     //   209: ireturn
/*   */     //   210: iconst_1
/*   */     //   211: ireturn
/*   */     //   212: iconst_0
/*   */     //   213: ireturn
/*   */     //   214: iconst_0
/*   */     //   215: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 4
/*   */     //   #3	-> 8
/*   */     //   #4	-> 17
/*   */     //   #5	-> 20
/*   */     //   #6	-> 23
/*   */     //   #7	-> 30
/*   */     //   #8	-> 33
/*   */     //   #9	-> 37
/*   */     //   #10	-> 40
/*   */     //   #11	-> 47
/*   */     //   #12	-> 50
/*   */     //   #13	-> 54
/*   */     //   #14	-> 57
/*   */     //   #15	-> 66
/*   */     //   #16	-> 70
/*   */     //   #17	-> 73
/*   */     //   #18	-> 80
/*   */     //   #19	-> 85
/*   */     //   #20	-> 88
/*   */     //   #21	-> 92
/*   */     //   #22	-> 108
/*   */     //   #23	-> 111
/*   */     //   #24	-> 115
/*   */     //   #25	-> 127
/*   */     //   #26	-> 132
/*   */     //   #27	-> 142
/*   */     //   #28	-> 145
/*   */     //   #29	-> 156
/*   */     //   #30	-> 159
/*   */     //   #31	-> 169
/*   */     //   #32	-> 183
/*   */     //   #33	-> 186
/*   */     //   #34	-> 199
/*   */   }
/*   */   
/*   */   public final void Sf() {}
/*   */   
/*   */   public final void aT() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */