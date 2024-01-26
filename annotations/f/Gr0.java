/*  1 */ package f;public class Gr0 extends yp0 { public Hj TM; public int Uq; public short Qw; public hm0 G70; public boolean FA; public boolean r1; public boolean Yc = false; private void Wh() { hm0 hm01 = this.G70; short s = this.Qw; this.TM
/*  2 */       .COM8(hm01, true, s); R8 r8;
/*  3 */     if ((r8 = km.u4) != null)
/*  4 */     { Uc0 uc02 = km.u4.z2; Uc0 uc01; if ((uc01 = r8.s40(aq0.LI)) != null && uc01 != uc02) uc01
/*  5 */           .Ix0();  uc02.Ix0(); }  this.O1 = true; if (this.d0)
/*    */     { hm0 hm02;
/*    */ 
/*    */       
/*  9 */       mi.qt0((hm02 = this.G70).A0 ? hm02.Af() : hm02.rF0); this.d0 = false; }  if (this
/* 10 */       .r1) Ra();  }
/*    */   public boolean O1 = false;
/*    */   public boolean d0;
/* 13 */   public wb d60 = null; public Gr0(hm0 paramhm0, Hj paramHj) { this(paramhm0, paramHj, null, false, false); } public Gr0(hm0 paramhm0, Hj paramHj, wb paramwb) { this(paramhm0, paramHj, paramwb, false, false); } public Gr0(hm0 paramhm0, Hj paramHj, boolean paramBoolean1, boolean paramBoolean2) { this(paramhm0, paramHj, null, paramBoolean1, paramBoolean2); } public Gr0(hm0 paramhm0, Hj paramHj, wb paramwb, boolean paramBoolean1, boolean paramBoolean2) { this.Uq = paramHj.lpt9(); this.Qw = s; short s; if ((s = paramhm0.XW()) <= this.Uq) { s = 1; } else { s = 0; }  this.d0 = s; this.TM = paramHj; this.G70 = paramhm0; this.FA = paramBoolean1; this.r1 = paramBoolean2; this.d60 = paramwb; } public final void wL() { if (this.Yc) return;  this.Yc = true; if (this.FA) { A1.L7.ac0(() -> UB0.Kg0.fN(this::Wh), 250L); } else { if (!this.d0) { wb wb2; if ((wb2 = this.d60) == null) { this.d60 = (new mj(this.G70)).O3(); } else { wb2.O3(); }  } else { Ra(); }  wb wb1; if ((wb1 = this.d60) != null) km.wI0.K7.u4 = wb1;  hm0 hm01 = this.G70; short s = this.Qw; this.TM.COM8(hm01, true, s); R8 r8; if ((r8 = km.u4) != null) { Uc0 uc02 = km.u4.z2; Uc0 uc01; if ((uc01 = r8.s40(aq0.LI)) != null && uc01 != uc02) uc01.Ix0();  uc02.Ix0(); }  this.O1 = true; if (this.d0) { hm0 hm02; mi.qt0((hm02 = this.G70).A0 ? hm02.Af() : hm02.rF0); this.d0 = false; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final boolean Ie() {
/*    */     if (this.O1) {
/*    */       boolean bool;
/*    */       I50 i50;
/*    */       if ((((i50 = this.TM.lC).j40 == i50.wg0)) || !i50.dP) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       wb wb1;
/*    */       if (bool && ((wb1 = this.d60) == null || cw()))
/*    */         return true; 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final int zE() {
/*    */     return 4;
/*    */   }
/*    */   
/*    */   public final void Ra() {
/*    */     hm0 hm01;
/*    */     short s;
/*    */     if (!km.MR.sQ() && (s = this.Qw) > 0 && s <= (int)((hm01 = this.G70).K0.hp0 * 0.25D) && this.FT == km.MR.hG0())
/*    */       UB0.Kg0.fN(Gr0::Ll); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */