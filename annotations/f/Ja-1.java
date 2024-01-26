/*  1 */ package f;public final class Ja extends JG0 { public final int cg0; public final Un oq; public final Un lm; public final Nj JX; public final V40 tB; public fx0 Pg0; public int ML; public int iS; public Runnable[] A5; public mX pRN; public final void ve() { int i = this.sy - this.mz0; if (this.cg0 == 1) { int k = this.JX.J50(); if (this.zm0)
/*    */       
/*    */       { 
/*    */ 
/*    */         
/*  6 */         long l = Math.max(1, this.xY - this.oq.xY - this.lm.xY); k = (int)Math.max(k, l * (k = this.x10) / (k + i + 1)); }  this.JX
/*    */         
/*  8 */         .Tm(k, this.HC);
/*    */       Un un;
/* 10 */       int j = (un = this.oq).Kd + un.xY; if (i != 0)
/* 11 */       { int m = this.Ny0 - this.mz0; j = lT() * m / i + j; }  this.JX
/*    */         
/* 13 */         .ME(j, this.er0); }
/* 14 */     else { int k = this.JX.tj0(); if (this.zm0)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */         
/* 20 */         long l = Math.max(1, this.HC - this.oq.HC - this.lm.HC); k = (int)Math.max(k, l * (k = this.x10) / (k + i + 1)); }  this.JX
/*    */         
/* 22 */         .Tm(this.xY, k);
/*    */       Un un;
/* 24 */       int j = (un = this.oq).er0 + un.HC; if (i != 0)
/* 25 */       { int m = this.Ny0 - this.mz0; j = lT() * m / i + j; }  this.JX
/*    */         
/* 27 */         .ME(this.Kd, j); }  } public mX GT; public int x10; public int YB; public boolean zm0; public int mz0; public int sy; public int Ny0; public long Uo0; public Ja() { this(2); } public Ja(int paramInt) { Un un1; V40 v40; Un un2; Nj nj; Qr0 qr0; this.cg0 = paramInt; this(); this.oq = un1; this(); this.lm = un2; this(); this.JX = nj; this(this); if (paramInt == 1) { Xu("hscrollbar"); un1.Xu("leftbutton"); un2.Xu("rightbutton"); } else { Xu("vscrollbar"); un1.Xu("upbutton"); un2.Xu("downbutton"); }  this(this); this.tB = new V40(); un1.Zf0(false); un1.Xe0().xu0(qr0); un2.Zf0(false); un2.Xe0().xu0(qr0); nj.Zf0(false); nj.Xu("thumb"); nj.p9(v40); J8(un1); J8(un2); J8(nj); this.x10 = 10; this.YB = 1; this.sy = 100; Tm(30, 200); fk(); } public final String TI() { return "scrollbar"; } public final void XI0(Runnable paramRunnable) { this.A5 = (Runnable[])hm.LpT6((Object[])this.A5, paramRunnable, Runnable.class); } public final boolean i2(oa0 paramoa0) { if (paramoa0.cz0 == 4 && paramoa0.vl == 0) { this.ML = 0; instanceof(); }  int i = paramoa0.aK; if (!super.i2(paramoa0) && paramoa0.cz0 == 3 && paramoa0.vl == 0 && mu0(i, paramoa0.gk0)) { this.iS = i; this.iS = i; if ((this.cg0 == 1) ? ((i = paramoa0.aK) < this.JX.Kd) : ((i = paramoa0.gk0) < this.JX.er0)) { this.ML = -1; } else { this.ML = 1; }  instanceof(); }  if (((paramoa0.com8 & 0x24) != 0)) { i = this.x10; } else { i = this.YB; }  if (paramoa0.cz0 == 9) { int j; if ((j = yl.Nk(paramoa0.GG0)) != 92) { if (j != 93) { switch (j) { case 22: if (this.cg0 == 1) { Fk0(this.Ny0 + i, true); return true; }  break;case 21: if (this.cg0 == 1) { Fk0(this.Ny0 - i, true); return true; }  break;case 20: if (this.cg0 == 2) { Fk0(this.Ny0 + i, true); return true; }  break;case 19: if (this.cg0 == 2)
/* 28 */               { Fk0(this.Ny0 - i, true); return true; }  break; }  } else if (this
/* 29 */           .cg0 == 2)
/* 30 */         { Fk0(this.Ny0 + this.x10, true); return true; }  } else if (this
/* 31 */         .cg0 == 2)
/* 32 */       { Fk0(this.Ny0 - this.x10, true); return true; }  }  if (paramoa0
/* 33 */       .cz0 == 8)
/*    */     {
/*    */       
/* 36 */       Fk0(this.Ny0 - i * paramoa0.kB0, true); } 
/* 37 */     return B8.Pg(paramoa0.cz0); }
/*    */ 
/*    */   
/*    */   public final void U90(int paramInt) {
/*    */     Fk0(paramInt, true);
/*    */   }
/*    */   
/*    */   public final void Fk0(int paramInt, boolean paramBoolean) {
/*    */     this.Ny0 = paramInt = Jk(paramInt);
/*    */     ve();
/*    */     US(i, paramInt, "value");
/*    */     int i;
/*    */     if ((i = this.Ny0) != paramInt && paramBoolean)
/*    */       hm.Fz0(this.A5); 
/*    */   }
/*    */   
/*    */   public final void Xw(nY paramnY) {
/*    */     String str;
/*    */     Class<mX> clazz;
/*    */     super.Xw(paramnY);
/*    */     q80 q80;
/*    */     this.zm0 = (q80 = (q80)paramnY).Mw0("scaleThumb", false);
/*    */     ve();
/*    */     if (this.cg0 == 1) {
/*    */       this.pRN = (mX)q80.Yz0("trackImageLeft", false, mX.class, null);
/*    */       str = "trackImageRight";
/*    */       clazz = mX.class;
/*    */     } else {
/*    */       this.pRN = (mX)q80.Yz0("trackImageUp", false, mX.class, null);
/*    */       str = "trackImageDown";
/*    */       clazz = mX.class;
/*    */     } 
/*    */     this.GT = (mX)q80.Yz0(str, false, clazz, null);
/*    */   }
/*    */   
/*    */   public final void J00(throws paramthrows) {
/*    */     int i = RS(), j = e3();
/*    */     if (this.cg0 == 1) {
/*    */       int k = Hy();
/*    */       mX mX1;
/*    */       if ((mX1 = this.pRN) != null)
/*    */         mX1.W8(this.O, i, j, this.JX.Kd - i, k); 
/*    */       if (this.GT != null) {
/*    */         i = this.JX.Xq();
/*    */         this.GT.W8(this.O, i, j, m40() - i, k);
/*    */       } 
/*    */     } else {
/*    */       int k = qF();
/*    */       mX mX1;
/*    */       if ((mX1 = this.pRN) != null) {
/*    */         int m = this.JX.er0 - j;
/*    */         mX1.W8(this.O, i, j, k, m);
/*    */       } 
/*    */       if (this.GT != null) {
/*    */         j = this.JX.yR();
/*    */         int m = mD() - j;
/*    */         this.GT.W8(this.O, i, j, k, m);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     this(paramthrows);
/*    */     this.Pg0 = fx01;
/*    */     fx0 fx01;
/*    */     (fx01 = new fx0()).NY = this.tB;
/*    */     (new fx0()).bo = true;
/*    */   }
/*    */   
/*    */   public final void ED0(throws paramthrows) {
/*    */     fx0 fx01;
/*    */     if ((fx01 = this.Pg0) != null)
/*    */       fx01.vI(); 
/*    */     this.Pg0 = null;
/*    */   }
/*    */   
/*    */   public final int Jk(int paramInt) {
/*    */     int i;
/*    */     int j;
/*    */     if ((j = this.mz0) < (i = this.sy)) {
/*    */       if (paramInt < j)
/*    */         return j; 
/*    */       if (paramInt > i)
/*    */         return i; 
/*    */     } else {
/*    */       if (paramInt > j)
/*    */         return j; 
/*    */       if (paramInt < i)
/*    */         return i; 
/*    */     } 
/*    */     return paramInt;
/*    */   }
/*    */   
/*    */   public final void Sr(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getfield Pg0 : Lf/fx0;
/*    */     //   5: iload_1
/*    */     //   6: invokevirtual rl0 : (I)V
/*    */     //   9: getfield ML : I
/*    */     //   12: dup
/*    */     //   13: istore_1
/*    */     //   14: ifeq -> 99
/*    */     //   17: aload_0
/*    */     //   18: getfield cg0 : I
/*    */     //   21: iconst_1
/*    */     //   22: if_icmpne -> 36
/*    */     //   25: aload_0
/*    */     //   26: getfield JX : Lf/Nj;
/*    */     //   29: getfield Kd : I
/*    */     //   32: istore_2
/*    */     //   33: goto -> 44
/*    */     //   36: aload_0
/*    */     //   37: getfield JX : Lf/Nj;
/*    */     //   40: getfield er0 : I
/*    */     //   43: istore_2
/*    */     //   44: aload_0
/*    */     //   45: getfield iS : I
/*    */     //   48: iload_2
/*    */     //   49: isub
/*    */     //   50: iload_1
/*    */     //   51: imul
/*    */     //   52: ifle -> 164
/*    */     //   55: aload_0
/*    */     //   56: iload_1
/*    */     //   57: aload_0
/*    */     //   58: getfield x10 : I
/*    */     //   61: imul
/*    */     //   62: istore_1
/*    */     //   63: getfield mz0 : I
/*    */     //   66: aload_0
/*    */     //   67: getfield sy : I
/*    */     //   70: if_icmpge -> 83
/*    */     //   73: aload_0
/*    */     //   74: getfield Ny0 : I
/*    */     //   77: iload_1
/*    */     //   78: iadd
/*    */     //   79: istore_1
/*    */     //   80: goto -> 90
/*    */     //   83: aload_0
/*    */     //   84: getfield Ny0 : I
/*    */     //   87: iload_1
/*    */     //   88: isub
/*    */     //   89: istore_1
/*    */     //   90: aload_0
/*    */     //   91: iload_1
/*    */     //   92: iconst_1
/*    */     //   93: invokevirtual Fk0 : (IZ)V
/*    */     //   96: goto -> 164
/*    */     //   99: aload_0
/*    */     //   100: getfield oq : Lf/Un;
/*    */     //   103: getfield TG0 : Lf/protected;
/*    */     //   106: invokevirtual Ni0 : ()Z
/*    */     //   109: ifeq -> 132
/*    */     //   112: aload_0
/*    */     //   113: dup
/*    */     //   114: getfield YB : I
/*    */     //   117: ineg
/*    */     //   118: istore_1
/*    */     //   119: getfield mz0 : I
/*    */     //   122: aload_0
/*    */     //   123: getfield sy : I
/*    */     //   126: if_icmpge -> 83
/*    */     //   129: goto -> 73
/*    */     //   132: aload_0
/*    */     //   133: getfield lm : Lf/Un;
/*    */     //   136: getfield TG0 : Lf/protected;
/*    */     //   139: invokevirtual Ni0 : ()Z
/*    */     //   142: ifeq -> 164
/*    */     //   145: aload_0
/*    */     //   146: dup
/*    */     //   147: getfield YB : I
/*    */     //   150: istore_1
/*    */     //   151: getfield mz0 : I
/*    */     //   154: aload_0
/*    */     //   155: getfield sy : I
/*    */     //   158: if_icmpge -> 83
/*    */     //   161: goto -> 73
/*    */     //   164: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 29
/*    */     //   #2	-> 37
/*    */     //   #3	-> 40
/*    */     //   #4	-> 45
/*    */     //   #5	-> 63
/*    */     //   #6	-> 84
/*    */     //   #7	-> 93
/*    */     //   #8	-> 100
/*    */     //   #9	-> 103
/*    */     //   #10	-> 106
/*    */     //   #11	-> 119
/*    */     //   #12	-> 133
/*    */     //   #13	-> 136
/*    */     //   #14	-> 139
/*    */     //   #15	-> 151
/*    */   }
/*    */   
/*    */   public final void instanceof() {
/*    */     if (this.Pg0 != null) {
/*    */       fx0 fx01;
/*    */       if (this.ML != 0 || this.oq.TG0.Ni0() || this.lm.TG0.Ni0()) {
/*    */         boolean bool;
/*    */         fx0 fx02;
/*    */         int i;
/*    */         if ((i = (fx02 = this.Pg0).Sa0) > 0 || (fx02.bo && i == -1)) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         Sr(300);
/*    */         if (!bool && (fx01 = this.Pg0) != null)
/*    */           ha(); 
/*    */         return;
/*    */       } 
/*    */       ((Ja)super).Pg0.vI();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int AW() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield cg0 : I
/*    */     //   4: iconst_1
/*    */     //   5: if_icmpne -> 43
/*    */     //   8: aload_0
/*    */     //   9: invokespecial AW : ()I
/*    */     //   12: aload_0
/*    */     //   13: dup
/*    */     //   14: dup
/*    */     //   15: getfield oq : Lf/Un;
/*    */     //   18: invokevirtual AW : ()I
/*    */     //   21: istore_0
/*    */     //   22: getfield JX : Lf/Nj;
/*    */     //   25: invokevirtual AW : ()I
/*    */     //   28: iload_0
/*    */     //   29: iadd
/*    */     //   30: istore_0
/*    */     //   31: getfield lm : Lf/Un;
/*    */     //   34: invokevirtual AW : ()I
/*    */     //   37: iload_0
/*    */     //   38: iadd
/*    */     //   39: invokestatic max : (II)I
/*    */     //   42: ireturn
/*    */     //   43: aload_0
/*    */     //   44: invokespecial AW : ()I
/*    */     //   47: aload_0
/*    */     //   48: getfield JX : Lf/Nj;
/*    */     //   51: invokevirtual AW : ()I
/*    */     //   54: invokestatic max : (II)I
/*    */     //   57: ireturn
/*    */   }
/*    */   
/*    */   public final int HY() {
/*    */     if (this.cg0 == 1)
/*    */       return Math.max(super.HY(), this.JX.HY()); 
/*    */     int i = this.oq.HY();
/*    */     i = this.JX.HY() + i;
/*    */     return Math.max(super.HY(), this.lm.HY() + i);
/*    */   }
/*    */   
/*    */   public final int J50() {
/*    */     return AW();
/*    */   }
/*    */   
/*    */   public final int tj0() {
/*    */     return HY();
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (this.cg0 == 1) {
/*    */       int j = this.oq.J50();
/*    */       this.oq.Tm(j, this.HC);
/*    */       j = this.Kd;
/*    */       this.oq.ME(j, this.er0);
/*    */       j = this.oq.J50();
/*    */       this.lm.Tm(j, this.HC);
/*    */       int i = this.Kd + this.xY - un.xY;
/*    */       Un un;
/*    */       (un = this.lm).ME(i, this.er0);
/*    */     } else {
/*    */       int i = this.xY;
/*    */       this.oq.Tm(i, this.oq.tj0());
/*    */       i = this.Kd;
/*    */       this.oq.ME(i, this.er0);
/*    */       i = this.xY;
/*    */       this.lm.Tm(i, this.lm.tj0());
/*    */       Un un;
/*    */       (un = this.lm).ME(this.Kd, this.er0 + this.HC - un.HC);
/*    */     } 
/*    */     ve();
/*    */   }
/*    */   
/*    */   public final int lT() {
/*    */     if (this.cg0 == 1)
/*    */       return Math.max(1, this.xY - this.oq.xY - this.JX.xY - this.lm.xY); 
/*    */     return Math.max(1, this.HC - this.oq.HC - this.JX.HC - this.lm.HC);
/*    */   }
/*    */   
/*    */   public final void mE0(int paramInt) {
/*    */     boolean bool = false;
/*    */     if (paramInt >= 0) {
/*    */       this.mz0 = bool;
/*    */       this.sy = paramInt;
/*    */       this.Ny0 = Jk(this.Ny0);
/*    */       ve();
/*    */       Nj nj = this.JX;
/*    */       if (paramInt != 0) {
/*    */         paramInt = 1;
/*    */       } else {
/*    */         paramInt = 0;
/*    */       } 
/*    */       wI0(paramInt);
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("maxValue < minValue");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */