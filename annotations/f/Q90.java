/* 1 */ package f;public final class Q90 implements Cloneable { public final short Vf0() { if (YC()) return um0.xJ0; 
/* 2 */     short s = this.Cw0;
/*   */     
/* 4 */     return um0.HZ(this.Vp, s); }
/*   */ 
/*   */   
/*   */   public int q10;
/*   */   public int c80;
/*   */   public aq0 COm1;
/*   */   public short Tl0;
/*   */   public short Cw0;
/*   */   public int MD0;
/*   */   public int Yt0;
/*   */   public String Yq0 = "";
/*   */   public String nr = "";
/*   */   public byte u0;
/*   */   public byte od;
/*   */   public short Hq0;
/*   */   public short ld0;
/*   */   public short m80 = -1;
/*   */   public int pA;
/*   */   public byte j00;
/*   */   public short Bl0;
/*   */   public short[] En0 = new short[4];
/*   */   public byte[] rI0 = new byte[4];
/*   */   public short[] ko0 = new short[6];
/*   */   public byte COm4;
/*   */   public byte Ij;
/*   */   public byte Jk;
/*   */   public byte IF0;
/*   */   public byte Sf0;
/*   */   public byte YH0;
/*   */   public byte sq0;
/*   */   public byte UK0;
/*   */   public byte qz = 3;
/*   */   public byte Vp;
/*   */   public int Jx0;
/*   */   public byte cC;
/*   */   public long u4;
/*   */   public byte eH;
/*   */   public int Ck;
/*   */   public short LPt7;
/*   */   public short[] AY = new short[4];
/*   */   public Ht0 GJ0 = null;
/*   */   public mA xH = mA.uZ;
/*   */   public mA[] wH = mA.qv0;
/*   */   public nV k0 = nV.n30;
/*   */   public boolean Jg;
/*   */   
/*   */   public Q90(int paramInt) {
/*   */     this.q10 = paramInt;
/*   */     this.Ck = (int)(System.currentTimeMillis() / 1000L);
/*   */   }
/*   */   
/*   */   public static byte Ft(byte paramByte) {
/*   */     return (paramByte == 0) ? 0 : (((paramByte | 0x8) == paramByte) ? 8 : (((paramByte | Byte.MIN_VALUE) == paramByte) ? Byte.MIN_VALUE : (((paramByte | 0x10) == paramByte) ? 16 : (((paramByte | 0x20) == paramByte) ? 32 : (((paramByte | 0x40) == paramByte) ? 64 : (((paramByte & 0x7) > 0) ? 7 : 0))))));
/*   */   }
/*   */   
/*   */   public final int Z90() {
/*   */     return this.q10;
/*   */   }
/*   */   
/*   */   public final int lA() {
/*   */     return this.c80;
/*   */   }
/*   */   
/*   */   public final aq0 RE0() {
/*   */     return this.COm1;
/*   */   }
/*   */   
/*   */   public final short Lpt9() {
/*   */     return this.Tl0;
/*   */   }
/*   */   
/*   */   public final short u60() {
/*   */     return this.Cw0;
/*   */   }
/*   */   
/*   */   public final boolean tm0() {
/*   */     return ((this.eH & 0x9) != 0);
/*   */   }
/*   */   
/*   */   public final boolean Gf() {
/*   */     return ((this.eH & 0x8) != 0);
/*   */   }
/*   */   
/*   */   public final void am(byte paramByte) {
/*   */     this.eH = paramByte;
/*   */     if (tm0() && this.xH == mA.uZ) {
/*   */       this.xH = mA.Wh0;
/*   */     } else if (!tm0() && this.xH == mA.Wh0) {
/*   */       this.xH = mA.uZ;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final boolean iL() {
/*   */     return ((this.eH & 0x2) != 0);
/*   */   }
/*   */   
/*   */   public final boolean wl() {
/*   */     return ((this.eH & 0x10) != 0);
/*   */   }
/*   */   
/*   */   public final boolean da() {
/*   */     return ((this.eH & 0x4) != 0);
/*   */   }
/*   */   
/*   */   public final int fN() {
/*   */     return this.Yt0;
/*   */   }
/*   */   
/*   */   public final String lG() {
/*   */     return this.Yq0.contains("{STRING_") ? Ml0.LU(this.Yq0) : this.Yq0;
/*   */   }
/*   */   
/*   */   public final boolean xt() {
/*   */     String str;
/*   */     return ((str = this.nr) != null && !isEmpty());
/*   */   }
/*   */   
/*   */   public final String AA0() {
/*   */     return this.nr;
/*   */   }
/*   */   
/*   */   public final byte Y20() {
/*   */     return this.od;
/*   */   }
/*   */   
/*   */   public final short i2() {
/*   */     return this.Hq0;
/*   */   }
/*   */   
/*   */   public final void ok(short paramShort) {
/*   */     if (paramShort <= 0)
/*   */       paramShort = 0; 
/*   */     this.Hq0 = paramShort;
/*   */   }
/*   */   
/*   */   public final short p10() {
/*   */     short s;
/*   */     return ((s = this.m80) != -1) ? s : this.ld0;
/*   */   }
/*   */   
/*   */   public final boolean BM() {
/*   */     return (p10() > 0);
/*   */   }
/*   */   
/*   */   public final int Lt0() {
/*   */     return this.pA;
/*   */   }
/*   */   
/*   */   public final short E70() {
/*   */     return this.Bl0;
/*   */   }
/*   */   
/*   */   public final short[] RU() {
/*   */     return this.En0;
/*   */   }
/*   */   
/*   */   public final short Fp0(int paramInt) {
/*   */     return this.En0[paramInt];
/*   */   }
/*   */   
/*   */   public final boolean Xj(short paramShort) {
/*   */     if (paramShort == 0)
/*   */       return false; 
/*   */     if (paramShort == 165) {
/*   */       byte b1 = 0;
/*   */       while (true) {
/*   */         byte[] arrayOfByte;
/*   */         if (b1 < (arrayOfByte = this.rI0).length) {
/*   */           if (arrayOfByte[b1] > 0) {
/*   */             b1 = 1;
/*   */             break;
/*   */           } 
/*   */           b1++;
/*   */           continue;
/*   */         } 
/*   */         b1 = 0;
/*   */         break;
/*   */       } 
/*   */       if (b1 == 0)
/*   */         return true; 
/*   */     } 
/*   */     byte b = 0;
/*   */     short[] arrayOfShort;
/*   */     while (b < (arrayOfShort = this.En0).length) {
/*   */       if (arrayOfShort[b] == paramShort)
/*   */         return true; 
/*   */       b++;
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final byte vC(int paramInt) {
/*   */     return this.rI0[paramInt];
/*   */   }
/*   */   
/*   */   public final byte Vk0(int paramInt, byte paramByte) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: iconst_1
/*   */     //   2: if_icmpne -> 7
/*   */     //   5: iconst_1
/*   */     //   6: ireturn
/*   */     //   7: iload_1
/*   */     //   8: iload_2
/*   */     //   9: i2d
/*   */     //   10: dup2
/*   */     //   11: dstore_3
/*   */     //   12: ldc2_w 0.2
/*   */     //   15: dmul
/*   */     //   16: dstore #5
/*   */     //   18: iflt -> 44
/*   */     //   21: iload_1
/*   */     //   22: iconst_3
/*   */     //   23: if_icmple -> 29
/*   */     //   26: goto -> 44
/*   */     //   29: aload_0
/*   */     //   30: getfield j00 : B
/*   */     //   33: iload_1
/*   */     //   34: iconst_2
/*   */     //   35: imul
/*   */     //   36: ishr
/*   */     //   37: iconst_3
/*   */     //   38: iand
/*   */     //   39: i2b
/*   */     //   40: istore_0
/*   */     //   41: goto -> 46
/*   */     //   44: iconst_0
/*   */     //   45: istore_0
/*   */     //   46: dload #5
/*   */     //   48: iload_0
/*   */     //   49: i2d
/*   */     //   50: dmul
/*   */     //   51: invokestatic floor : (D)D
/*   */     //   54: dload_3
/*   */     //   55: dadd
/*   */     //   56: d2i
/*   */     //   57: i2b
/*   */     //   58: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 30
/*   */     //   #2	-> 51
/*   */   }
/*   */   
/*   */   public final short Gi(int paramInt) {
/*   */     return this.AY[paramInt];
/*   */   }
/*   */   
/*   */   public final boolean MN() {
/*   */     short[] arrayOfShort;
/*   */     for (byte b = 0; b < (arrayOfShort = this.AY).length; b++) {
/*   */       if (arrayOfShort[b] > 0)
/*   */         return true; 
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final short Uu0(hR paramhR) {
/*   */     if (paramhR.NT)
/*   */       return 0; 
/*   */     byte b = paramhR.dL;
/*   */     return this.ko0[b];
/*   */   }
/*   */   
/*   */   public final short Yo0() {
/*   */     return Ue(-1);
/*   */   }
/*   */   
/*   */   public final short Ue(int paramInt) {
/*   */     short s = 0;
/*   */     short[] arrayOfShort;
/*   */     for (byte b = 0; b < (arrayOfShort = this.ko0).length; b++) {
/*   */       if (b != paramInt)
/*   */         s = (short)(s + arrayOfShort[b]); 
/*   */     } 
/*   */     return s;
/*   */   }
/*   */   
/*   */   public final short q50(DG paramDG) {
/*   */     switch (paramDG.ordinal()) {
/*   */       default:
/*   */         return 0;
/*   */       case 4:
/*   */         return (short)(this.Sf0 & 0xFF);
/*   */       case 3:
/*   */         return (short)(this.IF0 & 0xFF);
/*   */       case 2:
/*   */         return (short)(this.Jk & 0xFF);
/*   */       case 1:
/*   */         return (short)(this.Ij & 0xFF);
/*   */       case 0:
/*   */         break;
/*   */     } 
/*   */     return (short)(this.COm4 & 0xFF);
/*   */   }
/*   */   
/*   */   public final byte N1() {
/*   */     return this.YH0;
/*   */   }
/*   */   
/*   */   public final byte n5() {
/*   */     return this.sq0;
/*   */   }
/*   */   
/*   */   public final byte yQ() {
/*   */     return this.UK0;
/*   */   }
/*   */   
/*   */   public final byte R90() {
/*   */     return this.qz;
/*   */   }
/*   */   
/*   */   public final byte Hc(hR paramhR) {
/*   */     if (paramhR.NT)
/*   */       return 0; 
/*   */     return (byte)(this.Jx0 >> paramhR.dL * 5 & 0xFFFFFF1F);
/*   */   }
/*   */   
/*   */   public final short UA0() {
/*   */     short s = 0;
/*   */     hR[] arrayOfHR;
/*   */     int i = (arrayOfHR = hR.ka).length;
/*   */     for (byte b = 0; b < i; b++)
/*   */       s = (short)(Hc(arrayOfHR[b]) + s); 
/*   */     return s;
/*   */   }
/*   */   
/*   */   public final byte ri0() {
/*   */     byte b = 0;
/*   */     hR[] arrayOfHR;
/*   */     int i = (arrayOfHR = hR.ka).length;
/*   */     for (byte b1 = 0; b1 < i; b1++) {
/*   */       byte b2;
/*   */       if ((b2 = Hc(arrayOfHR[b1])) > b)
/*   */         b = b2; 
/*   */     } 
/*   */     return b;
/*   */   }
/*   */   
/*   */   public final hR aK() {
/*   */     hR hR = null;
/*   */     byte b = 0;
/*   */     hR[] arrayOfHR;
/*   */     int i = (arrayOfHR = hR.ka).length;
/*   */     byte b1;
/*   */     for (b1 = 0; b1 < i; b1++) {
/*   */       hR hR1;
/*   */       byte b2;
/*   */       if ((b2 = Hc(hR1 = arrayOfHR[b1])) > b) {
/*   */         hR = hR1;
/*   */         b = b2;
/*   */       } 
/*   */     } 
/*   */     i = (arrayOfHR = hR.ka).length;
/*   */     for (b1 = 0; b1 < i; b1++) {
/*   */       hR hR1;
/*   */       if ((hR1 = arrayOfHR[b1]) != hR && Hc(hR1) == b)
/*   */         return null; 
/*   */     } 
/*   */     return hR;
/*   */   }
/*   */   
/*   */   public final byte M7() {
/*   */     return this.cC;
/*   */   }
/*   */   
/*   */   public final boolean pn(int paramInt) {
/*   */     return ((this.u4 & 1L << paramInt) != 0L);
/*   */   }
/*   */   
/*   */   public final boolean P20(int paramInt1, int paramInt2) {
/*   */     return ((this.u4 >> paramInt1 * 3 + 1 & 0x7L) >= paramInt2);
/*   */   }
/*   */   
/*   */   public final int OF0() {
/*   */     return this.Ck;
/*   */   }
/*   */   
/*   */   public final boolean YC() {
/*   */     return ((this.LPt7 & 0x1) != 0);
/*   */   }
/*   */   
/*   */   public final nV ma0() {
/*   */     return this.k0;
/*   */   }
/*   */   
/*   */   public final mA Ve0() {
/*   */     return this.xH;
/*   */   }
/*   */   
/*   */   public final Object clone() {
/*   */     Object object;
/*   */     try {
/*   */       ((Q90)object).En0 = (short[])this.En0.clone();
/*   */       ((Q90)object).rI0 = (byte[])this.rI0.clone();
/*   */       ((Q90)object).ko0 = (short[])this.ko0.clone();
/*   */       (object = super.clone()).AY = (short[])this.AY.clone();
/*   */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*   */       object = null;
/*   */     } 
/*   */     return object;
/*   */   }
/*   */   
/*   */   public final void JS(mA parammA) {
/*   */     boolean bool;
/*   */     if (parammA == mA.Wh0) {
/*   */       bool = tm0();
/*   */     } else {
/*   */       mA[] arrayOfMA;
/*   */       int i = (arrayOfMA = this.wH).length;
/*   */       byte b = 0;
/*   */       while (true) {
/*   */         if (b < i) {
/*   */           if (arrayOfMA[b] == parammA) {
/*   */             boolean bool1 = true;
/*   */             break;
/*   */           } 
/*   */           b++;
/*   */           continue;
/*   */         } 
/*   */         bool = false;
/*   */         break;
/*   */       } 
/*   */     } 
/*   */     if (bool)
/*   */       return; 
/*   */     if (!parammA.Pp())
/*   */       return; 
/*   */     ((mA[])Arrays.<mA>copyOf(this.wH, this.wH.length + 1))[((mA[])Arrays.<mA>copyOf(this.wH, this.wH.length + 1)).length - 1] = parammA;
/*   */     this.wH = Arrays.<mA>copyOf(this.wH, this.wH.length + 1);
/*   */     if (this.xH == mA.uZ)
/*   */       this.xH = parammA; 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Q90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */