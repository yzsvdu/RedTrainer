/*  1 */ package f;public final class HT extends JG0 implements r60 { public final Ip ga0; public final Un Vo; public final Un VC; public final OZ zz0; public final W1 ay; public final long qH0; public final void V90(throws paramthrows) { if (this.Q4) { super.V90(paramthrows); return; }  float f; if ((f = (float)(this.qH0 - System.currentTimeMillis()) / 1000.0F) > 0.0F) { this.HC0.Nu(f / this.C2); this.HC0.HC(Ml0.Go(1904, (int)f + "")); this
/*  2 */         .Vo.sk0(false); super.V90(paramthrows); return; }  this.Q4 = true; this.ga0.jf0(this.HC0); this.Vo.sk0(true); super.V90(paramthrows); } public final IN HC0; public final short C2; public boolean Q4; public ge0 HN; public int cA; public HT() { W1 w1; OZ oZ; dQ dQ; this.Q4 = false; this.cA = 0; Xu("channelwidget"); this.ga0 = new Ip(); if (km.a40()) { this.qH0 = 0L; this.C2 = 0; } else { this.qH0 = km.a3.nD0(); this.C2 = km.a3.w40(); }  this.HC0 = new IN(); byte b = km.a3.Jr0().eM(); int i = Math.max(1, km.a3.Jy0()); if (km.D70(5)) i = 127;  String[] arrayOfString = new String[i]; int j = 0; for (byte b1 = 0; b1 < i; b1++) { if (b1 == b) { arrayOfString[j++] = Ml0.Go(1901, (b1 + 1) + ""); } else { arrayOfString[j++] = Ml0.Go(1900, (b1 + 1) + ""); }  }  this((Object[])arrayOfString); this.zz0 = oZ; this(oZ); this.ay = w1; if (b < -1 || b >= i) b = 0;  w1.Z30(b); this(Ml0.OH0(1902)); this.Vo = un1; Un un1; (un1 = new Un()).tW(new bj(this)); this(Ml0.OH0(53)); this.VC = un2; Un un2; (un2 = new Un()).tW(new W(this)); this(Ml0.OH0(1906)); this.HN = new ge0(); this.ga0.WN(this.ga0.d7().Ya(this.HC0).Ya(w1).ee0(this.ga0.mE0().Mg(new JG0[] { this.HN, dQ })).Ya(un1).Ya(un2).Em0()); this.ga0.rK0(this.ga0.mE0().Ya(this.HC0).Ya(w1).ee0(this.ga0.d7().Em0().Mg(new JG0[] { this.HN, dQ }).Em0()).Ya(un1).Ya(un2)); J8(this.ga0); } public final void LM(throws paramthrows) { VA0.c90(Hv()); } public final boolean i2(oa0 paramoa0) { W1 w1; int i; if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO())
/*    */     { int j;
/*  5 */       if (h1.J20(j = paramoa0.GG0, BM.ni)) { this.cA--;
/*  6 */         VA0.c90(Hv()); return true; }
/*  7 */        if (h1.J20(j, BM.N70)) { this.cA++;
/*  8 */         VA0.c90(Hv()); return true; }
/*  9 */        if (h1.J20(j, BM.Oq)) { if (this.cA == 0 && (
/*    */           
/* 11 */           i = (w1 = this.ay).Wa0.go) > 0)
/* 12 */           Z30(i - 1);  return true; }  if (h1.J20(j, BM.M8)) { if (((HT)super).cA == 0 && 
/* 13 */           ((HT)super).ay.Wa0
/* 14 */           .go + 1 < 
/* 15 */           ((HT)super).zz0
/* 16 */           .Fj
/* 17 */           .size()) ((HT)super)
/* 18 */             .ay
/*    */ 
/*    */             
/* 21 */             .Z30(((HT)super).ay.Wa0.go + 1);  return true; }  if (h1.J20(j, BM.bC)) { if (super.Hv() instanceof Un)
/*    */         {
/*    */           
/* 24 */           hm.Fz0(((Un)super.Hv()).TG0.oh0); }  return true; }
/* 25 */        if (h1.J20(j, BM.lc)) { this
/* 26 */           .fr0
/* 27 */           .jf0(this); return true; }  }  return super.i2(i); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     this.Vo.uh0(this.Vo.xY, 25);
/*    */     this.VC.uh0(this.Vo.xY, 25);
/*    */     this.ga0.mM();
/*    */     int i = this.fr0.RS();
/*    */     i = this.fr0.e3();
/*    */     this.ga0.ME(JO.Se0(this.fr0.qF(), this.ga0.xY, 2, i), (this.fr0.Hy() - this.ga0.HC) / 2 + i);
/*    */     Ip ip;
/*    */     Tm((ip = this.ga0).Kd + this.xY, this.er0 + this.HC);
/*    */   }
/*    */   
/*    */   public final JG0 Hv() {
/*    */     if (this.cA < 0)
/*    */       this.cA = 0; 
/*    */     int i;
/*    */     return (JG0)(((i = this.cA) == 0) ? this.ay : ((i == 1) ? this.Vo : this.VC));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */