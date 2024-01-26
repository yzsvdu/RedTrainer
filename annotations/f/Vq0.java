/*    */ package f;
/*    */ public final class Vq0 extends JG0 { public static final Ll fj = Ll.F10("firstTab"); public static final Ll yX = Ll.F10("lastTab"); public final ArrayList Us0; public final Q20 PRN;
/*    */   public final JG0 xQ;
/*    */   public final Fp vg0;
/*    */   public final Fp d00;
/*    */   
/*  7 */   public final void Or0(int paramInt) { int i = this.PRN.HC - (this.Il0.Gq0 ? this.xQ.xY : this.xQ.HC); this
/*  8 */       .ci0 = paramInt = Math.max(0, Math.min(paramInt, i)); if (this.Il0.Gq0)
/*  9 */     { int j = this.xQ.Kd - paramInt;
/*    */       
/* 11 */       this.PRN.ME(j, this.xQ.er0); } else { JG0 jG0; this
/* 12 */         .PRN
/*    */ 
/*    */         
/* 15 */         .ME((jG0 = this.xQ).Kd, jG0.er0 - paramInt); }  if (this
/* 16 */       .K40 != null) { boolean bool; Un un2 = this.yE; if (paramInt > 0) { bool = true; } else { bool = false; }  un2.sk0(bool); Un un1 = this.Li; if (paramInt < i) { paramInt = 1; } else { paramInt = 0; }  sk0(paramInt); }  } public Ip K40; public Un yE; public Un Li; public boolean ey0; public int ci0; public Mv Il0; public Li0 zO; public Vq0() { Q20 q20; JG0 jG0; this.Us0 = new ArrayList(); this(); this.PRN = new Q20(); this(); this.xQ = new JG0(); this(); this.vg0 = fp; this(); this.d00 = fp; this.Il0 = Mv.GT; q20.Xu("tabbox"); jG0.Xu(""); Fp fp; (fp = new Fp()).Xu(""); (new Fp()).xL0(); jG0.J8(q20); (fp = new Fp()).J8(fp); super.si(new Fp(), 0); super.si(jG0, 1); L3("nextTab", () -> E00(1)); L3("prevTab", () -> E00(-1)); Zf0(false); } public final String TI() { return "tabbedpane"; } public final void dA0(Li0 paramLi0) { if (paramLi0 == null || paramLi0.T1.fr0 == this.PRN) { Li0 li0; if ((li0 = this.zO) != paramLi0) { this.zO = paramLi0; if (li0 != null) { JG0 jG01; if ((jG01 = li0.EC0) != null) jG01.wI0(li0.getValue());  hm.Fz0(li0.kG0); }  if (paramLi0 != null) { Runnable runnable; if ((runnable = paramLi0.PG0) != null) runnable.run();  JG0 jG01; if ((jG01 = paramLi0.EC0) != null) jG01.wI0(paramLi0.getValue());  hm.Fz0(paramLi0.kG0); }  if (this.ey0) { int k; uW(); if (this.Il0.Gq0) { i = paramLi0.T1.Kd - this.PRN.Kd; j = paramLi0.T1.xY + i; k = this.xQ.xY; }
/*    */           
/*    */           else
/*    */           
/* 20 */           { i = paramLi0.T1.er0 - this.PRN.er0;
/* 21 */             j = paramLi0.T1.HC + i;
/*    */             
/* 23 */             k = this.xQ.HC; }
/* 24 */            int i = j + i; int j, m; if ((m = i - (i = (k + 19) / 20)) < (j = this.ci0)) { Or0(m); } else if (i > j + k) { Or0(i - k); }  }  JG0 jG0; if (paramLi0 != null && (jG0 = paramLi0.EC0) != null) BA();  }
/*    */       
/*    */       return; }
/*    */     
/*    */     throw new IllegalArgumentException("Invalid tab"); }
/*    */ 
/*    */   
/*    */   public final void Xw(nY paramnY) {
/*    */     super.Xw(paramnY);
/*    */     Mv mv = Mv.GT;
/*    */     if ((mv = (Mv)((q80)paramnY).Yz0("tabPosition", false, Mv.class, mv)) != null) {
/*    */       if (this.Il0 != mv) {
/*    */         byte b;
/*    */         this.Il0 = mv;
/*    */         Q20 q20 = this.PRN;
/*    */         if (mv.Gq0) {
/*    */           b = 1;
/*    */         } else {
/*    */           b = 2;
/*    */         } 
/*    */         if (b != 0) {
/*    */           if (q20.bm0 != b) {
/*    */             q20.bm0 = b;
/*    */             q20.MJ0();
/*    */           } 
/*    */           MJ0();
/*    */         } else {
/*    */           q20.getClass();
/*    */           throw new NullPointerException("direction");
/*    */         } 
/*    */       } 
/*    */       return;
/*    */     } 
/*    */     throw new NullPointerException("tabPosition");
/*    */   }
/*    */   
/*    */   public final void T1(boolean paramBoolean) {
/*    */     if (this.ey0 != paramBoolean) {
/*    */       this.ey0 = paramBoolean;
/*    */       if (this.K40 == null && paramBoolean) {
/*    */         (this.K40 = new Ip()).Xu("scrollControls");
/*    */         (this.yE = new Un()).Xu("scrollLeft");
/*    */         this.yE.tW(new uY(this, -1));
/*    */         (this.Li = new Un()).Xu("scrollRight");
/*    */         this.Li.tW(new uY(this, 1));
/*    */         u901.G90(new Ei0(u901.nL0, "scrollButtons"));
/*    */         U90 u901 = (u901 = V2.Ur(this.K40, this.K40).Ya(this.yE)).Ya(this.Li);
/*    */         U90 u902 = Mr.X60(this.K40, this.K40).Ya(this.yE).Ya(this.Li);
/*    */         this.K40.rK0(u901);
/*    */         this.K40.WN(u902);
/*    */         super.si(this.K40, 2);
/*    */       } 
/*    */       this.xQ.l0 = paramBoolean;
/*    */       Ip ip;
/*    */       if ((ip = this.K40) != null)
/*    */         ip.wI0(paramBoolean); 
/*    */       MJ0();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void dD(int paramInt) {
/*    */     if (paramInt < 0 || paramInt >= this.Us0.size())
/*    */       return; 
/*    */     dA0(this.Us0.get(paramInt));
/*    */   }
/*    */   
/*    */   public final Li0 Hf(int paramInt) {
/*    */     return this.Us0.get(paramInt);
/*    */   }
/*    */   
/*    */   public final int nv0() {
/*    */     return this.Us0.isEmpty() ? -1 : this.Us0.indexOf(this.zO);
/*    */   }
/*    */   
/*    */   public final void E00(int paramInt) {
/*    */     if (!this.Us0.isEmpty()) {
/*    */       int i;
/*    */       if ((i = this.Us0.indexOf(this.zO)) < 0) {
/*    */         paramInt = 0;
/*    */       } else {
/*    */         paramInt = (i + paramInt) % this.Us0.size();
/*    */         paramInt = (this.Us0.size() + paramInt) % this.Us0.size();
/*    */       } 
/*    */       dA0(this.Us0.get(paramInt));
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int AW() {
/*    */     int i;
/*    */     if (this.Il0.Gq0) {
/*    */       if (this.ey0) {
/*    */         i = this.PRN.Ho();
/*    */         i = Q20.Aj0(this.PRN) + i;
/*    */         i = this.K40.J50() + i;
/*    */       } else {
/*    */         i = this.PRN.AW();
/*    */       } 
/*    */       i = Math.max(this.vg0.AW(), i);
/*    */     } else {
/*    */       i = this.vg0.AW();
/*    */       i = this.PRN.AW() + i;
/*    */     } 
/*    */     return Math.max(super.AW(), Ho() + i);
/*    */   }
/*    */   
/*    */   public final int HY() {
/*    */     int i;
/*    */     if (this.Il0.Gq0) {
/*    */       i = this.vg0.HY();
/*    */       i = this.PRN.HY() + i;
/*    */     } else {
/*    */       if (this.ey0) {
/*    */         i = this.PRN.Et();
/*    */         i = Q20.sK(this.PRN) + i;
/*    */         i = this.K40.tj0() + i;
/*    */       } else {
/*    */         i = this.PRN.HY();
/*    */       } 
/*    */       i = Math.max(this.vg0.HY(), i);
/*    */     } 
/*    */     return Math.max(super.HY(), Et() + i);
/*    */   }
/*    */   
/*    */   public final int R80() {
/*    */     if (this.Il0.Gq0) {
/*    */       int j;
/*    */       if (this.ey0) {
/*    */         Q20 q20;
/*    */         int k;
/*    */         int m;
/*    */         byte b;
/*    */         for (j = this.PRN.Ho(), k = (q20 = this.PRN).Ub(), m = 0, b = 0; b < k; ) {
/*    */           m = jG0.J50();
/*    */           JG0 jG0;
/*    */           m = Math.max(m, JG0.Fr((jG0 = q20.lPt3(b)).AW(), m, jG0.W3()));
/*    */           b++;
/*    */         } 
/*    */         j = m + j;
/*    */         j = this.K40.J50() + j;
/*    */       } else {
/*    */         j = this.PRN.J50();
/*    */       } 
/*    */       return Math.max(this.vg0.J50(), j);
/*    */     } 
/*    */     int i = this.vg0.J50();
/*    */     return this.PRN.J50() + i;
/*    */   }
/*    */   
/*    */   public final int tJ0() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Il0 : Lf/Mv;
/*    */     //   4: getfield Gq0 : Z
/*    */     //   7: ifeq -> 28
/*    */     //   10: aload_0
/*    */     //   11: dup
/*    */     //   12: getfield vg0 : Lf/Fp;
/*    */     //   15: invokevirtual tj0 : ()I
/*    */     //   18: istore_0
/*    */     //   19: getfield PRN : Lf/Q20;
/*    */     //   22: invokevirtual tj0 : ()I
/*    */     //   25: iload_0
/*    */     //   26: iadd
/*    */     //   27: ireturn
/*    */     //   28: aload_0
/*    */     //   29: getfield ey0 : Z
/*    */     //   32: ifeq -> 125
/*    */     //   35: aload_0
/*    */     //   36: dup
/*    */     //   37: getfield PRN : Lf/Q20;
/*    */     //   40: invokevirtual Et : ()I
/*    */     //   43: istore_1
/*    */     //   44: getfield PRN : Lf/Q20;
/*    */     //   47: dup
/*    */     //   48: astore_2
/*    */     //   49: invokevirtual Ub : ()I
/*    */     //   52: istore_3
/*    */     //   53: iconst_0
/*    */     //   54: istore #4
/*    */     //   56: iconst_0
/*    */     //   57: istore #5
/*    */     //   59: iload #5
/*    */     //   61: iload_3
/*    */     //   62: if_icmpge -> 107
/*    */     //   65: iload #4
/*    */     //   67: aload_2
/*    */     //   68: iload #5
/*    */     //   70: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   73: dup
/*    */     //   74: astore #4
/*    */     //   76: invokevirtual HY : ()I
/*    */     //   79: aload #4
/*    */     //   81: dup
/*    */     //   82: invokevirtual tj0 : ()I
/*    */     //   85: istore #4
/*    */     //   87: invokevirtual Hj : ()I
/*    */     //   90: iload #4
/*    */     //   92: swap
/*    */     //   93: invokestatic Fr : (III)I
/*    */     //   96: invokestatic max : (II)I
/*    */     //   99: istore #4
/*    */     //   101: iinc #5, 1
/*    */     //   104: goto -> 59
/*    */     //   107: aload_0
/*    */     //   108: iload #4
/*    */     //   110: iload_1
/*    */     //   111: iadd
/*    */     //   112: istore_1
/*    */     //   113: getfield K40 : Lf/Ip;
/*    */     //   116: invokevirtual tj0 : ()I
/*    */     //   119: iload_1
/*    */     //   120: iadd
/*    */     //   121: istore_1
/*    */     //   122: goto -> 133
/*    */     //   125: aload_0
/*    */     //   126: getfield PRN : Lf/Q20;
/*    */     //   129: invokevirtual tj0 : ()I
/*    */     //   132: istore_1
/*    */     //   133: aload_0
/*    */     //   134: getfield vg0 : Lf/Fp;
/*    */     //   137: invokevirtual tj0 : ()I
/*    */     //   140: iload_1
/*    */     //   141: invokestatic max : (II)I
/*    */     //   144: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 49
/*    */     //   #2	-> 76
/*    */     //   #3	-> 96
/*    */     //   #4	-> 113
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     int n, i = 0, j = 0, k = this.PRN.J50(), m = this.PRN.tj0();
/*    */     if (this.ey0) {
/*    */       i = this.K40.J50();
/*    */       j = this.K40.tj0();
/*    */     } 
/*    */     if (this.Il0.Gq0) {
/*    */       m = Math.max(j, m);
/*    */     } else {
/*    */       k = Math.max(i, k);
/*    */     } 
/*    */     this.PRN.Tm(k, m);
/*    */     switch (this.Il0.ordinal()) {
/*    */       case 3:
/*    */         this.xQ.ME(RS(), e3() - m + this.HC);
/*    */         this.xQ.Tm(Math.max(0, qF() - i), m);
/*    */         this.vg0.Tm(qF(), Math.max(0, Hy() - m));
/*    */         n = RS();
/*    */         this.vg0.ME(n, e3());
/*    */         break;
/*    */       case 4:
/*    */         this.xQ.Tm(k, m);
/*    */         n = qF();
/*    */         this.vg0.Tm(n, Hy());
/*    */         this.vg0.ME(0, 0);
/*    */         break;
/*    */       case 2:
/*    */         n = RS() - k + this.xY;
/*    */         this.xQ.ME(n, e3());
/*    */         this.xQ.Tm(k, Math.max(0, Hy() - j));
/*    */         n = Math.max(0, qF() - k);
/*    */         this.vg0.Tm(n, Hy());
/*    */         n = RS();
/*    */       case 1:
/*    */         n = RS();
/*    */         this.xQ.ME(n, e3());
/*    */         this.xQ.Tm(k, Math.max(0, Hy() - j));
/*    */         n = Math.max(0, qF() - k);
/*    */         this.vg0.Tm(n, Hy());
/*    */         n = this.xQ.Xq();
/*    */       case 0:
/*    */         n = RS();
/*    */         this.xQ.ME(n, e3());
/*    */         this.xQ.Tm(Math.max(0, qF() - i), m);
/*    */         this.vg0.Tm(qF(), Math.max(0, Hy() - m));
/*    */     } 
/*    */     Ip ip;
/*    */     if ((ip = this.K40) != null) {
/*    */       if (this.Il0.Gq0) {
/*    */         ip.ME(this.xQ.Xq(), this.xQ.er0);
/*    */         this.K40.Tm(i, m);
/*    */       } else {
/*    */         i = this.xQ.Kd;
/*    */         ip.ME(i, this.xQ.yR());
/*    */         this.K40.Tm(k, j);
/*    */       } 
/*    */       Or0(this.ci0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void si(JG0 paramJG0, int paramInt) {
/*    */     throw new UnsupportedOperationException("use addTab/removeTab");
/*    */   }
/*    */   
/*    */   public final void gx() {
/*    */     throw new UnsupportedOperationException("use addTab/removeTab");
/*    */   }
/*    */   
/*    */   public final JG0 fG0(int paramInt) {
/*    */     throw new UnsupportedOperationException("use addTab/removeTab");
/*    */   }
/*    */   
/*    */   public final Li0 WS(JG0 paramJG0, String paramString) {
/*    */     this(this);
/*    */     li0.T1.s6(paramString);
/*    */     Li0 li0;
/*    */     (li0 = new Li0()).qs0(paramJG0);
/*    */     paramJG0 = li0.T1;
/*    */     this.PRN.si(paramJG0, this.PRN.Ub());
/*    */     this.Us0.add(li0);
/*    */     if (this.Us0.size() == 1)
/*    */       dA0(li0); 
/*    */     byte b = 0;
/*    */     for (int i = this.Us0.size(); b < i; ) {
/*    */       boolean bool;
/*    */       Sa0 sa0 = ((Li0)this.Us0.get(b)).T1.O;
/*    */       Ll ll = fj;
/*    */       if (b == 0) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       sa0.gf0(ll, bool);
/*    */       ll = yX;
/*    */       if (b == i - 1) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       sa0.gf0(ll, bool);
/*    */       b++;
/*    */     } 
/*    */     return li0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */