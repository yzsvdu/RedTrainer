/*   */ package f;
/*   */ public final class c1 extends Wr {
/*   */   public final h2 Po0;
/*   */   
/* 5 */   private void Bz0() { ME(km.wI0.dG() / 2 - this.xY / 2, km.wI0.k1() / 2 - this.HC / 2); } public c1(h2 paramh2) { Un un1; Un un2; Un un3; Un un4; Un un5; Un un6; Un un7; Un un8; Un un9; Fy0 fy0; YA0 yA0; this.Po0 = paramh2; Lo("Teleport"); TG0(paramh2::ax); TG0(this::Z0); EP(1); Xu("tp-direction-widget"); (new Ip()).rK0((new Ip()).mE0()); (new Ip()).WN((new Ip()).d7()); this("-"); (new Un()).Xu("button-symbol"); this("↖"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::u4); this("↑"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::u1); this("↗"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::pV); this("←"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::v7); this("→"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::Oq); this("↙"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::mL0); this("↓"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::Jr); this("↘"); (new Un()).Xu("button-symbol"); (new Un()).tW(c1::Wx0); this("", 16, 16); (new Fy0()).Xu("tooltip-button2"); (new Fy0()).Pb0(0); (new Fy0()).Gq0("Keyboard shortcut: CTRL+SHIFT+(↓ ↑ ← →)"); this(); if (km.Nr()) { JG0 jG0; this(); yA0.J8(jG0); this(); yA0.J8(jG0); yA0.J8(fy0); yA0.ZE(); }  yA0.J8(un2); yA0.J8(un3); yA0.J8(un4); yA0.ZE(); yA0.J8(un5); yA0.J8(un1); yA0.J8(un6); yA0.ZE(); yA0.J8(un7); yA0.J8(un8); yA0.J8(un9); J8(yA0); } private void mn() { ME(h1.O40, h1.EZ); } public static void Jr() { vh0 vh0; if ((vh0 = km.a3).Ct.HW.Yu0 == (vh0.Jr0()).nT)
/* 6 */     { km.u4
/* 7 */         .jF((byte)0, true, false); }
/* 8 */     else { km.u4.lF("//moveclose 0 1"); }  } public static void Oq() { vh0 vh0; if ((vh0 = km.a3).Ct.HW.mm == (vh0.Jr0()).Fk0) { km.u4.jF((byte)3, true, false); } else { km.u4.lF("//moveclose 1 0"); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static void v7() {
/*   */     if (km.a3.Ct.HW.mm == 0) {
/*   */       km.u4.jF((byte)2, true, false);
/*   */     } else {
/*   */       km.u4.lF("//moveclose -1 0");
/*   */     } 
/*   */   }
/*   */   
/*   */   public static void u1() {
/*   */     if (km.a3.Ct.HW.Yu0 == 0) {
/*   */       km.u4.jF((byte)1, true, false);
/*   */     } else {
/*   */       km.u4.lF("//moveclose 0 -1");
/*   */     } 
/*   */   }
/*   */   
/*   */   private void Z0() {
/*   */     h1.O40 = this.Kd;
/*   */     h1.EZ = this.er0;
/*   */     h1.Gh0 = true;
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     super.d40();
/*   */   }
/*   */   
/*   */   public final void LM(throws paramthrows) {
/*   */     if (h1.O40 >= km.wI0.dG() - this.xY)
/*   */       h1.O40 = -1; 
/*   */     if (h1.EZ >= km.wI0.k1() - this.HC)
/*   */       h1.EZ = -1; 
/*   */     if (km.XU())
/*   */       this.Po0.cH0(); 
/*   */     if (h1.O40 > -1 && h1.EZ > -1) {
/*   */       UB0.Kg0.fN(this::mn);
/*   */     } else {
/*   */       UB0.Kg0.fN(this::Bz0);
/*   */     } 
/*   */     UB0.Kg0.fN(() -> VA0.c90(this));
/*   */   }
/*   */ }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/c1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */