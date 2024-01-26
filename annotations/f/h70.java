/*  1 */ package f;public final class h70 extends Qa0 implements r60 { public Ip YD0; public Un Ak0; public Un Ek; public JG0 yb; public boolean sD0; private void BB() { JG0 jG0; if ((jG0 = this.fr0) != null) jG0
/*  2 */         .jf0(this);  } public h70(JG0 paramJG0, Runnable paramRunnable) { this(paramJG0, paramRunnable, (JG0)null, 1); } public h70(JG0 paramJG01, Runnable paramRunnable, JG0 paramJG02, int paramInt) { super(false, false); this.sD0 = false; Xu("confirm-widget"); this(); this.YD0 = ip; Ip ip; (ip = new Ip()).Xu("confirm-panel"); Un un = new Un(); String str = Ml0.OH0((paramInt == 2) ? 52 : 50); this(str); un.tW(paramRunnable); if (paramInt == 1) { Un un1; this(Ml0.OH0(51)); } else { paramRunnable = null; }  fv(paramJG01, un, (Un)paramRunnable, paramJG02); } public h70(String paramString, Runnable paramRunnable, JG0 paramJG0) { this(paramString, Ml0.OH0(50), this, paramRunnable, paramJG0); } public h70(String paramString1, String paramString2, String paramString3, Runnable paramRunnable, JG0 paramJG0) { super(false, false); Un un1; Un un2; dQ dQ; this.sD0 = false; this(paramString2); (new Un()).tW(paramRunnable); this(paramString1); this(paramString3); fv(dQ, this, un2, paramJG0); } public h70(YA0 paramYA0, Un paramUn1, Un paramUn2, JG0 paramJG0) { super(false, false); this.sD0 = false; fv(paramYA0, paramUn1, paramUn2, paramJG0); } public final h70 Id(Runnable paramRunnable) { if (paramRunnable == null) return this;  this.Ek.tW(paramRunnable); return this; } public final void d40() { this.YD0.mM(); QI(); this.YD0.js0(et.Wi0); } public final void jA0() { super.jA0(); VA0.nR(this, false); JG0 jG0; if ((jG0 = this.yb) != null) VA0.c90(this);  } public final void LM(throws paramthrows) { super.LM(paramthrows); UB0.Kg0.fN(() -> VA0.c90(this.sD0 ? this.Ek : this.Ak0)); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO()) { int i; if (paramoa0
/*  4 */         .cz0 == 9 && paramoa0.sj) { i = 1; } else { i = 0; }  if (!i)
/*    */       
/*  6 */       { if (h1.J20(i = paramoa0.GG0, BM.ni)) { VA0.c90(this.Ak0); return true; }  if (h1.J20(i, BM.N70)) { VA0.c90(this.Ek); return true; }  if (h1.J20(i, BM.bC)) { if (this.Ak0.p3())
/*    */           
/*    */           { 
/*  9 */             hm.Fz0(this.Ak0.TG0.oh0); } else if (this
/* 10 */             .Ek.p3())
/*    */           
/*    */           { 
/* 13 */             hm.Fz0(this.Ek.TG0.oh0); }  return true; }
/* 14 */          if (h1.J20(i, BM.lc))
/*    */         
/*    */         { 
/* 17 */           hm.Fz0(this.Ek.TG0.oh0); return true; }  }  }
/* 18 */      return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public final void fv(JG0 paramJG01, Un paramUn1, Un paramUn2, JG0 paramJG02) {
/*    */     JG0 jG0 = null;
/*    */     this.Ak0 = paramUn1;
/*    */     this.Ek = paramUn2;
/*    */     Runnable runnable;
/*    */     paramUn1.tW(runnable = this::BB);
/*    */     if (paramUn2 != null)
/*    */       paramUn2.tW(runnable); 
/*    */     Xu("confirm-widget");
/*    */     (this.YD0 = new Ip()).Xu("confirm-panel");
/*    */     Ip ip;
/*    */     (ip = this.YD0).getClass();
/*    */     this.YD0.WN((new cr0(ip)).Ya(paramJG01).ee0(V2.Ur(this.YD0, this.YD0).Mg(new JG0[] { this.Ak0, jG0, this.Ek })).Em0());
/*    */     (ip = this.YD0).getClass();
/*    */     this.YD0.rK0((new g0(ip)).Ya(paramJG01).ee0(Mr.X60(this.YD0, this.YD0).Ya(this.Ak0).Ya(this.Ek)));
/*    */     paramJG01 = this.YD0;
/*    */     si(paramJG01, Ub());
/*    */     VA0.Ga.add(this);
/*    */     this.yb = paramJG02;
/*    */     this.eh = km.XU();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/h70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */