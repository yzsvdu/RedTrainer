/*  1 */ package f;public abstract class Bj0 extends JG0 { public static final Ll Ax0 = Ll.F10("editActive"); public final Nj BK0; public final of uu0; public final Un mc0; public final Un Xx; public final fq AH0; public final ts0 KC; private void Su(AtomicReference<a70> paramAtomicReference, int paramInt) { this.uu0
/*  2 */       .kc = (a70[])hm.LL0(paramAtomicReference.get(), (Object[])this.uu0.kc); of of1;
/*  3 */     if (paramInt == 0 && (of1 = this.uu0)
/*  4 */       .dP) { if (this
/*  5 */         .jp)
/*    */       {
/*    */         
/*  8 */         UX(of1.F2.toString()); }  z00(); }  } public fx0 V30; public String W70; public String Da; public boolean Fn; public boolean jp; public boolean w70; public int HC; public Bj0() { Nj nj; w0 w0; ts0 ts01; Un un1; this.Da = ""; this.Fn = true; this.jp = true; this(cOm7()); this.BK0 = new Nj(); this(cOm7()); this.uu0 = of1; this(cOm7(), 0); this.mc0 = new Un(); this(cOm7(), 0); this.Xx = un2; nj.xL0(); nj.Xu("valueDisplay"); of1.Xu("valueEdit"); un1.Xu("decButton"); Un un2; (un2 = new Un()).Xu("incButton"); this(this); this.AH0 = new fq(this); un1.Xe0().xu0(w0); un2.Xe0().xu0(w0); this(this); this.KC = new ts0(); nj.tW(ts01); nj.p9(ts01); of of1; (of1 = new of()).wI0(false); (new of()).JD0(ts01); J8(nj); J8(of1); J8(un1); J8(un2); Zf0(true); fk(); } public final void Gq0(Object paramObject) { this.z4 = paramObject; zn(); this.BK0.z4 = paramObject; this.BK0.zn(); } public final void Wj() { if (this.BK0.dP) { boolean bool; this.uu0.IO(null); this.uu0.Be0(X7(), false); this.uu0.wI0(true); this.uu0.BA(); this.uu0.tP(); Sa0 sa0 = this.uu0.O; Ll ll = of.sB; if ((this.BK0.TG0.hm0 & 0x1) != 0) { bool = true; } else { bool = false; }  sa0
/*  9 */         .gf0(ll, bool); this.BK0.wI0(false);
/* 10 */       this.O
/* 11 */         .gf0(Ax0, true); }  } public final void z00() { if (this.uu0.dP) { Fj(); this.BK0.wI0(true); this.uu0.wI0(false); this.BK0.TG0.zb(this.uu0.O.z60(Ap.b00)); this.O.gf0(Ax0, false); }  } public final void Xw(nY paramnY) { super.Xw(paramnY); this.HC = q80.Km(100, "width"); String str1 = ""; q80 q80; String str2; if ((str2 = (String)(q80 = (q80)paramnY).Yz0("displayPrefix", true, String.class, null)) != null) str1 = str2;  this.Da = str1; this.Fn = q80.Mw0("useMouseWheel", this.Fn); } public final int AW() { int j = Ho(); j = this.mc0.AW() + j; int i = Math.max(this.HC, this.BK0.AW()) + j; return Math.max(super.AW(), this.Xx.AW() + i); }
/* 12 */   public final boolean i2(oa0 paramoa0) { int i; int j; if (B8.Wm0(j = paramoa0.cz0)) { ts0 ts01; if (paramoa0.oO() && paramoa0.GG0 == 111 && (ts01 = this.KC).ZT) { ts01.ZT = false; BG0(); return true; }  if (!this.uu0.dP) { if (Zk0.yE(paramoa0.cz0) == 8) { if ((j = yl.Nk(paramoa0.GG0)) != 21) { if (j != 22) { if (j != 62 && j != 66) { if (paramoa0.QD() && hv0(paramoa0.Z9)) { Wj(); this.uu0.i2(paramoa0); return true; }  return false; }  Wj(); return true; }  Dg(); return true; }  hI0(); return true; }  return false; }  }
/* 13 */     else if (!this.uu0.dP && this
/* 14 */       .Fn && j == 8)
/* 15 */     { if ((i = paramoa0.kB0) < 0)
/* 16 */       { hI0(); } else if (i > 0) { Dg(); }  return true; }  return super.i2(i); }
/*    */ 
/*    */   
/*    */   public final int HY() {
/*    */     int i = Math.max(Math.max(this.BK0.HY(), this.mc0.HY()), this.Xx.HY());
/*    */     return Math.max(Et() + i, super.HY());
/*    */   }
/*    */   
/*    */   public final int R80() {
/*    */     int j = this.mc0.J50();
/*    */     int i = Math.max(this.HC, this.BK0.J50()) + j;
/*    */     return this.Xx.J50() + i;
/*    */   }
/*    */   
/*    */   public final int tJ0() {
/*    */     return Math.max(Math.max(this.mc0.tj0(), this.Xx.tj0()), this.BK0.tj0());
/*    */   }
/*    */   
/*    */   public final void GD() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getfield uu0 : Lf/of;
/*    */     //   5: dup
/*    */     //   6: astore_1
/*    */     //   7: getfield dP : Z
/*    */     //   10: putfield w70 : Z
/*    */     //   13: aload_1
/*    */     //   14: invokevirtual p3 : ()Z
/*    */     //   17: ifeq -> 90
/*    */     //   20: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   23: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   26: pop
/*    */     //   27: getstatic f/Dp0.Ro0 : Lf/Dp0;
/*    */     //   30: dup
/*    */     //   31: astore_1
/*    */     //   32: getstatic f/Dp0.uM : Lf/Dp0;
/*    */     //   35: if_acmpeq -> 52
/*    */     //   38: aload_1
/*    */     //   39: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   42: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   45: pop
/*    */     //   46: getstatic f/Dp0.QG : Lf/Dp0;
/*    */     //   49: if_acmpne -> 90
/*    */     //   52: aload_0
/*    */     //   53: getstatic f/UB0.PU : Lf/aY;
/*    */     //   56: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   59: pop
/*    */     //   60: new java/util/concurrent/atomic/AtomicReference
/*    */     //   63: dup
/*    */     //   64: aload_0
/*    */     //   65: swap
/*    */     //   66: dup
/*    */     //   67: invokespecial <init> : ()V
/*    */     //   70: <illegal opcode> SX : (Lf/Bj0;Ljava/util/concurrent/atomic/AtomicReference;)Lf/a70;
/*    */     //   75: dup
/*    */     //   76: astore_1
/*    */     //   77: invokevirtual set : (Ljava/lang/Object;)V
/*    */     //   80: getfield uu0 : Lf/of;
/*    */     //   83: aload_1
/*    */     //   84: invokevirtual JD0 : (Lf/a70;)V
/*    */     //   87: goto -> 125
/*    */     //   90: aload_0
/*    */     //   91: getfield uu0 : Lf/of;
/*    */     //   94: dup
/*    */     //   95: astore_1
/*    */     //   96: getfield dP : Z
/*    */     //   99: ifeq -> 125
/*    */     //   102: aload_0
/*    */     //   103: getfield jp : Z
/*    */     //   106: ifeq -> 121
/*    */     //   109: aload_0
/*    */     //   110: aload_1
/*    */     //   111: getfield F2 : Lf/ak0;
/*    */     //   114: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   117: invokevirtual UX : (Ljava/lang/String;)Z
/*    */     //   120: pop
/*    */     //   121: aload_0
/*    */     //   122: invokevirtual z00 : ()V
/*    */     //   125: aload_0
/*    */     //   126: getfield BK0 : Lf/Nj;
/*    */     //   129: getfield O : Lf/Sa0;
/*    */     //   132: getstatic f/JG0.e30 : Lf/Ll;
/*    */     //   135: iconst_0
/*    */     //   136: invokevirtual gf0 : (Lf/Ll;Z)V
/*    */     //   139: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 7
/*    */     //   #2	-> 10
/*    */     //   #3	-> 27
/*    */     //   #4	-> 32
/*    */     //   #5	-> 91
/*    */     //   #6	-> 96
/*    */     //   #7	-> 103
/*    */     //   #8	-> 111
/*    */     //   #9	-> 114
/*    */     //   #10	-> 117
/*    */     //   #11	-> 126
/*    */     //   #12	-> 129
/*    */     //   #13	-> 132
/*    */   }
/*    */   
/*    */   public final void pm() {
/*    */     this.BK0.O.gf0(JG0.e30, true);
/*    */   }
/*    */   
/*    */   public final void LB(vN paramvN, JG0 paramJG0) {
/*    */     pm();
/*    */     if (paramvN == vN.N1) {
/*    */       if (paramJG0 != null && !(paramJG0 instanceof Bj0))
/*    */         paramJG0 = paramJG0.fr0; 
/*    */       if (paramJG0 != this && paramJG0 instanceof Bj0 && ((Bj0)paramJG0).w70)
/*    */         Wj(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void wI0(boolean paramBoolean) {
/*    */     super.wI0(paramBoolean);
/*    */     if (!paramBoolean)
/*    */       z00(); 
/*    */   }
/*    */   
/*    */   public final void V7() {
/*    */     z00();
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     int j = Hy(), k = e3();
/*    */     this.mc0.ME(RS(), k);
/*    */     this.mc0.Tm(this.mc0.J50(), j);
/*    */     this.Xx.ME(m40() - this.Xx.J50(), k);
/*    */     this.Xx.Tm(this.Xx.J50(), j);
/*    */     int m = this.mc0.Xq();
/*    */     int i = Math.max(0, this.Xx.Kd - m);
/*    */     this.BK0.Tm(i, j);
/*    */     this.BK0.ME(m, k);
/*    */     this.uu0.Tm(i, j);
/*    */     this.uu0.ME(m, k);
/*    */   }
/*    */   
/*    */   public final void t90() {
/*    */     String str;
/*    */     if ((str = this.W70) == null)
/*    */       str = this.Da; 
/*    */     this.BK0.s6(str.concat(jw()));
/*    */   }
/*    */   
/*    */   public abstract String jw();
/*    */   
/*    */   public abstract String X7();
/*    */   
/*    */   public abstract boolean UX(String paramString);
/*    */   
/*    */   public abstract String I40(String paramString);
/*    */   
/*    */   public abstract void Fj();
/*    */   
/*    */   public abstract boolean hv0(char paramChar);
/*    */   
/*    */   public abstract void on0();
/*    */   
/*    */   public abstract void L10(int paramInt);
/*    */   
/*    */   public abstract void BG0();
/*    */   
/*    */   public abstract void hI0();
/*    */   
/*    */   public abstract void Dg();
/*    */   
/*    */   public abstract void YI();
/*    */   
/*    */   public final void VL() {
/*    */     this.W70 = "$";
/*    */     t90();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */