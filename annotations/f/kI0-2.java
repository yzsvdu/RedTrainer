/*  1 */ package f;public final class kI0 extends JG0 { public static final Ll K6 = Ll.F10("firstTab"); public static final Ll lf = Ll.F10("lastTab"); public final ArrayList qL; public final Q20 aR; public final JG0 FJ0; public final Fp yy0; private void lc() { int i = -1; if (!this.qL.isEmpty()) { int j; if ((j = this.qL.indexOf(this.yI0)) < 0) { i = 0; } else { i = (j + i) % this.qL.size(); i = (this.qL.size() + i) % this.qL.size(); }  Ax0(this.qL.get(i)); }  } public final Fp ut; public boolean Ca0; public int qe; public Mv Fu0; public nJ yI0; public kI0() { Q20 q20; JG0 jG0; Xu("spritetabbedpane"); this.qL = new ArrayList(); this(); this.aR = new Q20(); this(); this.FJ0 = new JG0(); this(); this.yy0 = fp; this(); this.ut = fp; this.Fu0 = Mv.GT; q20.Xu("tabbox"); jG0.Xu(""); Fp fp; (fp = new Fp()).Xu(""); (new Fp()).xL0(); jG0.J8(q20); (fp = new Fp()).J8(fp); super.si(new Fp(), 0); super.si(jG0, 1); L3("nextTab", this::K); L3("prevTab", this::lc); } private void K() { int i = 1; if (!this.qL.isEmpty()) { int j; if ((j = this.qL.indexOf(this.yI0)) < 0) { i = 0; } else { i = (j + i) % this.qL.size(); i = (this.qL.size() + i) % this.qL.size(); }  Ax0(this.qL.get(i)); }  } public final void Yx(int paramInt) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Fu0 : Lf/Mv;
/*    */     //   4: getfield Gq0 : Z
/*    */     //   7: ifeq -> 29
/*    */     //   10: aload_0
/*    */     //   11: dup
/*    */     //   12: getfield aR : Lf/Q20;
/*    */     //   15: getfield xY : I
/*    */     //   18: istore_2
/*    */     //   19: getfield FJ0 : Lf/JG0;
/*    */     //   22: getfield xY : I
/*    */     //   25: istore_3
/*    */     //   26: goto -> 45
/*    */     //   29: aload_0
/*    */     //   30: dup
/*    */     //   31: getfield aR : Lf/Q20;
/*    */     //   34: getfield HC : I
/*    */     //   37: istore_2
/*    */     //   38: getfield FJ0 : Lf/JG0;
/*    */     //   41: getfield HC : I
/*    */     //   44: istore_3
/*    */     //   45: aload_0
/*    */     //   46: dup
/*    */     //   47: iload_1
/*    */     //   48: iload_2
/*    */     //   49: iload_3
/*    */     //   50: isub
/*    */     //   51: invokestatic min : (II)I
/*    */     //   54: iconst_0
/*    */     //   55: swap
/*    */     //   56: invokestatic max : (II)I
/*    */     //   59: dup
/*    */     //   60: istore_1
/*    */     //   61: putfield qe : I
/*    */     //   64: getfield Fu0 : Lf/Mv;
/*    */     //   67: getfield Gq0 : Z
/*    */     //   70: ifeq -> 100
/*    */     //   73: aload_0
/*    */     //   74: getfield aR : Lf/Q20;
/*    */     //   77: aload_0
/*    */     //   78: getfield FJ0 : Lf/JG0;
/*    */     //   81: dup
/*    */     //   82: getfield Kd : I
/*    */     //   85: iload_1
/*    */     //   86: isub
/*    */     //   87: istore_0
/*    */     //   88: getfield er0 : I
/*    */     //   91: iload_0
/*    */     //   92: swap
/*    */     //   93: invokevirtual ME : (II)Z
/*    */     //   96: pop
/*    */     //   97: goto -> 123
/*    */     //   100: aload_0
/*    */     //   101: getfield aR : Lf/Q20;
/*    */     //   104: aload_0
/*    */     //   105: getfield FJ0 : Lf/JG0;
/*    */     //   108: dup
/*    */     //   109: astore_0
/*    */     //   110: getfield Kd : I
/*    */     //   113: aload_0
/*    */     //   114: getfield er0 : I
/*    */     //   117: iload_1
/*    */     //   118: isub
/*    */     //   119: invokevirtual ME : (II)Z
/*    */     //   122: pop
/*    */     //   123: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 15
/*    */     //   #2	-> 19
/*    */     //   #3	-> 22
/*    */     //   #4	-> 31
/*    */     //   #5	-> 34
/*    */     //   #6	-> 38
/*    */     //   #7	-> 41
/*    */     //   #8	-> 51
/*    */     //   #9	-> 82
/*    */     //   #10	-> 88
/*    */     //   #11	-> 93
/*    */     //   #12	-> 101
/*    */     //   #13	-> 110
/*    */     //   #14	-> 114
/*  1 */     //   #15	-> 119 } public final void Xw(nY paramnY) { super.Xw(paramnY); Mv mv = Mv.GT; if ((mv = (Mv)((q80)paramnY).Yz0("tabPosition", false, Mv.class, mv)) != null) { if (this
/*  2 */         .Fu0 != mv) { byte b; this.Fu0 = mv; Q20 q20 = this.aR; if (mv.Gq0) { b = 1; } else { b = 2; }  if (b != 0) { if (q20
/*  3 */             .bm0 != b) { q20
/*  4 */               .bm0 = b; q20.MJ0(); }
/*  5 */            MJ0(); } else { q20.getClass();
/*  6 */           throw new NullPointerException("direction"); }  }  return; }
/*  7 */      throw new NullPointerException("tabPosition"); } public final void Xh(boolean paramBoolean) { paramBoolean = false; if (this.Ca0) { this.Ca0 = paramBoolean; this.FJ0.l0 = paramBoolean; MJ0(); }  } public final void Ax0(nJ paramnJ) { if (paramnJ == null || paramnJ.r00.fr0 == this.aR) { nJ nJ1; if ((nJ1 = this.yI0) != paramnJ) { this.yI0 = paramnJ; if (nJ1 != null) { JG0 jG01; if ((jG01 = nJ1.em) != null) jG01.wI0(nJ1.getValue());  hm.Fz0(nJ1.kG0); }  if (paramnJ != null) { JG0 jG01; if ((jG01 = paramnJ.em) != null) jG01.wI0(paramnJ.getValue()); 
/*  8 */           hm.Fz0(paramnJ.kG0); }  if (this
/*  9 */           .Ca0) { int k; uW(); if (this.Fu0.Gq0) {
/*    */ 
/*    */             
/* 12 */             i = paramnJ.r00.Kd - this.aR.Kd;
/* 13 */             j = paramnJ.r00.xY + i;
/*    */             
/* 15 */             k = this.FJ0.xY;
/*    */           }
/*    */           else {
/*    */             
/* 19 */             i = paramnJ.r00.er0 - this.aR.er0;
/* 20 */             j = paramnJ.r00.HC + i;
/*    */             
/* 22 */             k = this.FJ0.HC;
/* 23 */           }  int i = j + i; int j, m; if ((m = i - (i = (k + 19) / 20)) < (j = this.qe)) { Yx(m); } else if (i > j + k) { Yx(i - k); }  }  JG0 jG0; if (paramnJ != null && (jG0 = paramnJ.em) != null) VA0.c90(this);  }
/*    */       
/*    */       return; }
/*    */     
/*    */     throw new IllegalArgumentException("Invalid tab"); }
/*    */ 
/*    */   
/*    */   public final int AW() {
/*    */     int i;
/*    */     if (this.Fu0.Gq0) {
/*    */       if (!this.Ca0) {
/*    */         i = this.aR.AW();
/*    */         i = Math.max(this.yy0.AW(), i);
/*    */       } else {
/*    */         this.aR.Ho();
/*    */         Q20.Aj0(this.aR);
/*    */         throw null;
/*    */       } 
/*    */     } else {
/*    */       i = this.yy0.AW();
/*    */       i = this.aR.AW() + i;
/*    */     } 
/*    */     return Math.max(super.AW(), Ho() + i);
/*    */   }
/*    */   
/*    */   public final int HY() {
/*    */     int i;
/*    */     if (this.Fu0.Gq0) {
/*    */       i = this.yy0.HY();
/*    */       i = this.aR.HY() + i;
/*    */     } else {
/*    */       i = Math.max(this.yy0.HY(), this.aR.HY());
/*    */     } 
/*    */     return Math.max(super.HY(), Et() + i);
/*    */   }
/*    */   
/*    */   public final int R80() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Fu0 : Lf/Mv;
/*    */     //   4: getfield Gq0 : Z
/*    */     //   7: ifeq -> 101
/*    */     //   10: aload_0
/*    */     //   11: getfield Ca0 : Z
/*    */     //   14: ifeq -> 81
/*    */     //   17: aload_0
/*    */     //   18: dup
/*    */     //   19: getfield aR : Lf/Q20;
/*    */     //   22: invokevirtual Ho : ()I
/*    */     //   25: pop
/*    */     //   26: getfield aR : Lf/Q20;
/*    */     //   29: dup
/*    */     //   30: astore_0
/*    */     //   31: invokevirtual Ub : ()I
/*    */     //   34: istore_1
/*    */     //   35: iconst_0
/*    */     //   36: istore_2
/*    */     //   37: iconst_0
/*    */     //   38: istore_3
/*    */     //   39: iload_3
/*    */     //   40: iload_1
/*    */     //   41: if_icmpge -> 79
/*    */     //   44: iload_2
/*    */     //   45: aload_0
/*    */     //   46: iload_3
/*    */     //   47: invokevirtual lPt3 : (I)Lf/JG0;
/*    */     //   50: dup
/*    */     //   51: astore_2
/*    */     //   52: invokevirtual AW : ()I
/*    */     //   55: aload_2
/*    */     //   56: dup
/*    */     //   57: invokevirtual J50 : ()I
/*    */     //   60: istore_2
/*    */     //   61: invokevirtual W3 : ()I
/*    */     //   64: iload_2
/*    */     //   65: swap
/*    */     //   66: invokestatic Fr : (III)I
/*    */     //   69: invokestatic max : (II)I
/*    */     //   72: istore_2
/*    */     //   73: iinc #3, 1
/*    */     //   76: goto -> 39
/*    */     //   79: aconst_null
/*    */     //   80: athrow
/*    */     //   81: aload_0
/*    */     //   82: dup
/*    */     //   83: getfield aR : Lf/Q20;
/*    */     //   86: invokevirtual J50 : ()I
/*    */     //   89: istore_0
/*    */     //   90: getfield yy0 : Lf/Fp;
/*    */     //   93: invokevirtual J50 : ()I
/*    */     //   96: iload_0
/*    */     //   97: invokestatic max : (II)I
/*    */     //   100: ireturn
/*    */     //   101: aload_0
/*    */     //   102: dup
/*    */     //   103: getfield yy0 : Lf/Fp;
/*    */     //   106: invokevirtual J50 : ()I
/*    */     //   109: istore_0
/*    */     //   110: getfield aR : Lf/Q20;
/*    */     //   113: invokevirtual J50 : ()I
/*    */     //   116: iload_0
/*    */     //   117: iadd
/*    */     //   118: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 31
/*    */     //   #2	-> 52
/*    */     //   #3	-> 69
/*    */     //   #4	-> 80
/*    */   }
/*    */   
/*    */   public final int tJ0() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Fu0 : Lf/Mv;
/*    */     //   4: getfield Gq0 : Z
/*    */     //   7: ifeq -> 28
/*    */     //   10: aload_0
/*    */     //   11: dup
/*    */     //   12: getfield yy0 : Lf/Fp;
/*    */     //   15: invokevirtual tj0 : ()I
/*    */     //   18: istore_0
/*    */     //   19: getfield aR : Lf/Q20;
/*    */     //   22: invokevirtual tj0 : ()I
/*    */     //   25: iload_0
/*    */     //   26: iadd
/*    */     //   27: ireturn
/*    */     //   28: aload_0
/*    */     //   29: getfield yy0 : Lf/Fp;
/*    */     //   32: invokevirtual tj0 : ()I
/*    */     //   35: aload_0
/*    */     //   36: getfield aR : Lf/Q20;
/*    */     //   39: invokevirtual tj0 : ()I
/*    */     //   42: invokestatic max : (II)I
/*    */     //   45: ireturn
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     int i = 0, j = 0, k = this.aR.J50(), m = this.aR.tj0();
/*    */     if (!this.Ca0) {
/*    */       Fp fp3;
/*    */       int i1;
/*    */       Fp fp2;
/*    */       int n;
/*    */       Fp fp1;
/*    */       if (this.Fu0.Gq0) {
/*    */         m = Math.max(j, m);
/*    */       } else {
/*    */         k = Math.max(i, k);
/*    */       } 
/*    */       this.aR.Tm(k, m);
/*    */       switch (this.Fu0.ordinal()) {
/*    */         default:
/*    */           return;
/*    */         case 3:
/*    */           this.FJ0.ME(RS(), e3() - m);
/*    */           this.FJ0.Tm(Math.max(0, qF() - i), m);
/*    */           this.yy0.Tm(qF(), Math.max(0, Hy() - m));
/*    */           fp3 = this.yy0;
/*    */           i = RS();
/*    */           j = e3();
/*    */           ME(i, j);
/*    */         case 2:
/*    */           i = RS() - k;
/*    */           ((kI0)super).FJ0.ME(i, e3());
/*    */           ((kI0)super).FJ0.Tm(k, Math.max(0, Hy() - j));
/*    */           i1 = Math.max(0, qF() - k);
/*    */           ((kI0)super).yy0.Tm(i1, Hy());
/*    */           fp2 = ((kI0)super).yy0;
/*    */           i = RS();
/*    */           j = e3();
/*    */           ME(i, j);
/*    */         case 1:
/*    */           i = RS();
/*    */           ((kI0)super).FJ0.ME(i, e3());
/*    */           ((kI0)super).FJ0.Tm(k, Math.max(0, Hy() - j));
/*    */           n = Math.max(0, qF() - k);
/*    */           ((kI0)super).yy0.Tm(n, Hy());
/*    */           fp1 = ((kI0)super).yy0;
/*    */           i = ((kI0)super).FJ0.Xq();
/*    */           j = e3();
/*    */           ME(i, j);
/*    */         case 0:
/*    */           break;
/*    */       } 
/*    */       j = RS();
/*    */       ((kI0)super).FJ0.ME(j, e3());
/*    */       ((kI0)super).FJ0.Tm(Math.max(0, qF() - i), m);
/*    */       ((kI0)super).yy0.Tm(qF(), Math.max(0, Hy() - m));
/*    */       ((kI0)super).yy0.ME(RS(), ((kI0)super).FJ0.yR());
/*    */     } 
/*    */     throw null;
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
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */