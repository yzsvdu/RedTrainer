/*  1 */ package f;public abstract class Cy extends KI { public HI lG0; public lF0 xk0; public int et0 = 0; public int ey = 0; public boolean hp = false; public Ws0 br0 = null; public HV eX = null; public final short zu() { short s = 0; byte b; if ((b = this.E10) == 2) { switch (L70.gq
/*  2 */         .fu()) { case 3: s = this.br0.Ww0; break;case 2: s = this.br0.fd0; break;case 1: s = this.br0.zk; break;case 0: s = this.br0.zN; break; }  if (s == 1033) s = 1034;  }  if (b == 3 || b == 4) {
/*    */       int i;
/*  4 */       if ((i = L70.gq.Rr0()) >= 6 && i < 17) { i = 2; } else { i = 4; }
/*  5 */        if ((i = Zk0.yE(i)) != 1) { if (i == 3) s = this.br0.qz;  } else { s = this.br0.CW; }  R8 r8 = km.u4; if (this.E10 == 4 && r8 != null) { short s1; if ((s1 = this.br0.Ga) != 96) { if (s1 != 102 && s1 != 104) { if (s1 != 112) switch (s1)
/*    */               
/*    */               { 
/*    */ 
/*    */                 
/*    */                 default:
/* 11 */                   return s;case 186: case 187: case 188: case 189: case 190: break; }   if (r8.fF0.y5((byte)4, (short)2459)) s = 1094;  }  if (r8.fF0.y5((byte)4, (short)2451)) s = 1090;  }  if (r8.fF0.y5((byte)4, (short)2451)) s = 1091;  }
/*    */     
/*    */     }  }
/*    */ 
/*    */   
/*    */   public int FD = 1;
/*    */   public Ws0[][] UF = null;
/*    */   public QJ[][] eG = null;
/*    */   public boolean[][] TU = null;
/*    */   public boolean IY = false;
/*    */   public short zp;
/*    */   public h30 Jb0;
/*    */   public fQ ke;
/*    */   
/*    */   public Cy(HI paramHI, short paramShort1, byte paramByte, short paramShort2, h30 paramh30) {
/*    */     super(b1, b2, paramShort1, paramByte);
/*    */     this.lG0 = paramHI;
/*    */     Ws0 ws0 = paramHI.gH0(paramShort1);
/*    */     this.eX = paramHI.Hb(this.ZC0);
/*    */     this.UZ = vF.IQ;
/*    */     this.zp = paramShort2;
/*    */     this.Jb0 = paramh30;
/*    */     this.Fk0 = this.et0;
/*    */     this.nT = this.ey;
/*    */   }
/*    */   
/*    */   public final boolean A8() {
/*    */     return this.IY;
/*    */   }
/*    */   
/*    */   public void t8() {
/*    */     HI hI = this.lG0;
/*    */     short s2;
/*    */     if ((s2 = this.zp) < 1)
/*    */       s2 = this.br0.F70; 
/*    */     this.xk0 = lF01;
/*    */     lF0 lF01;
/*    */     if ((lF01 = hI.Sk(s2)) != null && lF01.H80 != null) {
/*    */       s2 = 1;
/*    */     } else {
/*    */       s2 = 0;
/*    */     } 
/*    */     this.hp = s2;
/*    */     if (s2 != 0)
/*    */       this.UF = new Ws0[lF01.X7][lF01.cB0]; 
/*    */     short s1;
/*    */     this.eG = new QJ[lF01.X7][s1 = lF01.cB0];
/*    */     this.TU = new boolean[lF01.X7][s1];
/*    */   }
/*    */   
/*    */   public abstract void zf(short paramShort1, short paramShort2);
/*    */   
/*    */   public final boolean o50() {
/*    */     return this.hp;
/*    */   }
/*    */   
/*    */   public void wy0(Ws0 paramWs0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield br0 : Lf/Ws0;
/*    */     //   4: aload_1
/*    */     //   5: if_acmpne -> 9
/*    */     //   8: return
/*    */     //   9: aload_0
/*    */     //   10: dup
/*    */     //   11: aload_1
/*    */     //   12: aload_0
/*    */     //   13: aload_1
/*    */     //   14: dup
/*    */     //   15: invokevirtual Lj0 : ()V
/*    */     //   18: putfield br0 : Lf/Ws0;
/*    */     //   21: getfield Ga : S
/*    */     //   24: invokestatic Pi0 : (S)B
/*    */     //   27: aload_1
/*    */     //   28: getfield Ga : S
/*    */     //   31: invokestatic SG0 : (S)B
/*    */     //   34: istore_1
/*    */     //   35: putfield cA : B
/*    */     //   38: iload_1
/*    */     //   39: putfield VZ : B
/*    */     //   42: aconst_null
/*    */     //   43: astore_1
/*    */     //   44: getstatic f/km.a3 : Lf/vh0;
/*    */     //   47: dup
/*    */     //   48: astore_2
/*    */     //   49: ifnull -> 181
/*    */     //   52: aload_2
/*    */     //   53: invokevirtual iterator : ()Ljava/util/Iterator;
/*    */     //   56: astore_1
/*    */     //   57: aload_1
/*    */     //   58: invokeinterface hasNext : ()Z
/*    */     //   63: ifeq -> 174
/*    */     //   66: aload_1
/*    */     //   67: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   72: checkcast f/tc
/*    */     //   75: dup
/*    */     //   76: astore_2
/*    */     //   77: ifnull -> 57
/*    */     //   80: aload_2
/*    */     //   81: getfield HW : Lf/G5;
/*    */     //   84: dup
/*    */     //   85: astore_2
/*    */     //   86: invokevirtual CJ0 : ()Lf/xr0;
/*    */     //   89: dup
/*    */     //   90: astore_3
/*    */     //   91: ifnonnull -> 97
/*    */     //   94: goto -> 57
/*    */     //   97: aload_3
/*    */     //   98: aload_2
/*    */     //   99: aload_3
/*    */     //   100: aload_2
/*    */     //   101: aload_3
/*    */     //   102: aload_2
/*    */     //   103: aload_3
/*    */     //   104: aload_2
/*    */     //   105: aload_3
/*    */     //   106: aload_2
/*    */     //   107: aload_3
/*    */     //   108: invokevirtual Q4 : ()Lf/KI;
/*    */     //   111: getfield cA : B
/*    */     //   114: putfield kD0 : B
/*    */     //   117: invokevirtual Q4 : ()Lf/KI;
/*    */     //   120: getfield VZ : B
/*    */     //   123: putfield vu0 : B
/*    */     //   126: invokevirtual Y00 : ()Z
/*    */     //   129: putfield LB0 : Z
/*    */     //   132: invokevirtual Ka : ()S
/*    */     //   135: putfield mm : S
/*    */     //   138: invokevirtual hA0 : ()S
/*    */     //   141: putfield Yu0 : S
/*    */     //   144: invokevirtual Q4 : ()Lf/KI;
/*    */     //   147: dup
/*    */     //   148: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   151: pop
/*    */     //   152: instanceof f/IF0
/*    */     //   155: ifne -> 166
/*    */     //   158: aload_2
/*    */     //   159: aload_3
/*    */     //   160: invokevirtual bl0 : ()B
/*    */     //   163: putfield Qf0 : B
/*    */     //   166: aload_2
/*    */     //   167: aconst_null
/*    */     //   168: putfield lT : Lf/xr0;
/*    */     //   171: goto -> 57
/*    */     //   174: getstatic f/km.a3 : Lf/vh0;
/*    */     //   177: getfield Ct : Lf/Jo;
/*    */     //   180: astore_1
/*    */     //   181: aload_0
/*    */     //   182: dup
/*    */     //   183: getfield lG0 : Lf/HI;
/*    */     //   186: aload_0
/*    */     //   187: getfield br0 : Lf/Ws0;
/*    */     //   190: getfield ZC0 : S
/*    */     //   193: invokevirtual Hb : (S)Lf/HV;
/*    */     //   196: putfield eX : Lf/HV;
/*    */     //   199: getstatic f/km.MR : Lf/Gp0;
/*    */     //   202: ifnonnull -> 305
/*    */     //   205: aload_1
/*    */     //   206: ifnull -> 288
/*    */     //   209: aload_1
/*    */     //   210: invokevirtual UG : ()Z
/*    */     //   213: ifeq -> 288
/*    */     //   216: aload_1
/*    */     //   217: invokevirtual VO : ()Z
/*    */     //   220: ifne -> 288
/*    */     //   223: aload_1
/*    */     //   224: getfield HW : Lf/G5;
/*    */     //   227: getfield FB : B
/*    */     //   230: dup
/*    */     //   231: istore_0
/*    */     //   232: iconst_2
/*    */     //   233: if_icmpeq -> 275
/*    */     //   236: iload_0
/*    */     //   237: iconst_3
/*    */     //   238: if_icmpeq -> 262
/*    */     //   241: iload_0
/*    */     //   242: iconst_4
/*    */     //   243: if_icmpeq -> 249
/*    */     //   246: goto -> 305
/*    */     //   249: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   252: iconst_4
/*    */     //   253: sipush #1014
/*    */     //   256: invokevirtual Wk0 : (BS)V
/*    */     //   259: goto -> 305
/*    */     //   262: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   265: iconst_3
/*    */     //   266: sipush #1151
/*    */     //   269: invokevirtual Wk0 : (BS)V
/*    */     //   272: goto -> 305
/*    */     //   275: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   278: iconst_2
/*    */     //   279: sipush #1013
/*    */     //   282: invokevirtual Wk0 : (BS)V
/*    */     //   285: goto -> 305
/*    */     //   288: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   291: aload_0
/*    */     //   292: dup
/*    */     //   293: getfield E10 : B
/*    */     //   296: istore_0
/*    */     //   297: invokevirtual zu : ()S
/*    */     //   300: iload_0
/*    */     //   301: swap
/*    */     //   302: invokevirtual Wk0 : (BS)V
/*    */     //   305: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 35
/*    */     //   #2	-> 44
/*    */     //   #3	-> 81
/*    */     //   #4	-> 86
/*    */     //   #5	-> 108
/*    */     //   #6	-> 111
/*    */     //   #7	-> 114
/*    */     //   #8	-> 120
/*    */     //   #9	-> 123
/*    */     //   #10	-> 152
/*    */     //   #11	-> 160
/*    */     //   #12	-> 174
/*    */     //   #13	-> 177
/*    */     //   #14	-> 183
/*    */     //   #15	-> 224
/*    */     //   #16	-> 227
/*    */     //   #17	-> 249
/*    */     //   #18	-> 293
/*    */     //   #19	-> 297
/*    */   }
/*    */   
/*    */   public final short Eb() {
/*    */     return this.xk0.sa0;
/*    */   }
/*    */   
/*    */   public final int m00() {
/*    */     return this.xk0.X7;
/*    */   }
/*    */   
/*    */   public final int uK0() {
/*    */     return this.xk0.cB0;
/*    */   }
/*    */   
/*    */   public final int ev0() {
/*    */     return this.et0;
/*    */   }
/*    */   
/*    */   public final int jI0() {
/*    */     return this.ey;
/*    */   }
/*    */   
/*    */   public final Ws0 TR() {
/*    */     return this.br0;
/*    */   }
/*    */   
/*    */   public Ws0 XJ0(int paramInt1, int paramInt2) {
/*    */     return this.hp ? ((paramInt1 < 0 || paramInt2 < 0 || paramInt1 >= (arrayOfWs01 = this.UF).length || paramInt2 >= (arrayOfWs0 = arrayOfWs01[paramInt1]).length) ? this.br0 : (((ws0 = arrayOfWs0[paramInt2]) == null) ? this.br0 : ws0)) : this.br0;
/*    */   }
/*    */   
/*    */   public final QJ C20(int paramInt1, int paramInt2) {
/*    */     if (paramInt1 < 0 || paramInt2 < 0)
/*    */       return null; 
/*    */     QJ[][] arrayOfQJ;
/*    */     if (paramInt1 >= (arrayOfQJ = this.eG).length || paramInt2 >= (arrayOfQJ[paramInt1]).length)
/*    */       return null; 
/*    */     if (!this.TU[paramInt1][paramInt2]) {
/*    */       short s = (short)paramInt1;
/*    */       zf(s, (short)paramInt2);
/*    */       this.TU[paramInt1][paramInt2] = true;
/*    */     } 
/*    */     return this.eG[paramInt1][paramInt2];
/*    */   }
/*    */   
/*    */   public final String xc0() {
/*    */     return this.br0.Lr();
/*    */   }
/*    */   
/*    */   public final xr0 v50(int paramInt1, int paramInt2, int paramInt3) {
/*    */     short s = (short)paramInt1;
/*    */     paramInt1 = (short)paramInt2;
/*    */     return mF((byte)paramInt3, s, paramInt1);
/*    */   }
/*    */   
/*    */   public final xr0 U30(short paramShort1, short paramShort2, float paramFloat) {
/*    */     if (this.FD == 1)
/*    */       return mF((byte)0, paramShort1, paramShort2); 
/*    */     il il = mF((byte)0, paramShort1, paramShort2);
/*    */     byte b;
/*    */     for (b = 1; b < this.FD; b = (byte)(b + 1)) {
/*    */       il il1;
/*    */       if ((il1 = mF(b, paramShort1, paramShort2)) != null && !il1.f() && (il == null || il.f() || Math.abs(paramFloat - il.i00()) > Math.abs(paramFloat - il1.i00())) && Math.abs(il.i00() - il1.i00()) >= 0.005F)
/*    */         il = il1; 
/*    */     } 
/*    */     return il;
/*    */   }
/*    */   
/*    */   public final HV rH0() {
/*    */     return this.eX;
/*    */   }
/*    */   
/*    */   public final void gx0(xr0 paramxr0) {
/*    */     if (this.ke == null) {
/*    */       fQ fQ1;
/*    */       this(false, 32);
/*    */       this.ke = fQ1;
/*    */     } 
/*    */     if (this.ke.mB(paramxr0, true))
/*    */       return; 
/*    */     this.ke.Com3(paramxr0);
/*    */   }
/*    */   
/*    */   public final il mF(byte paramByte, short paramShort1, short paramShort2) {
/*    */     int i;
/*    */     int j;
/*    */     if ((i = this.et0) < 1 || (j = this.ey) < 1)
/*    */       return null; 
/*    */     if (paramByte < 0)
/*    */       paramByte = 0; 
/*    */     lF0 lF01;
/*    */     paramShort2 = (short)(paramShort1 - (lF01 = this.xk0).ju);
/*    */     i = paramShort2 / i;
/*    */     short s2;
/*    */     QJ qJ;
/*    */     if ((qJ = C20(i, (s2 = (short)(paramShort2 - lF01.km0)) / j)) == null)
/*    */       return null; 
/*    */     short s1 = (short)(paramShort2 % this.et0);
/*    */     return qJ.p9(paramByte, s1, (short)(s2 % this.ey));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */