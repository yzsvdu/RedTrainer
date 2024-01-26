/*  1 */ package f;public final class Ke0 extends yp0 { public Hj v4; public int Za; public short nK0; public hm0 Y40; public final boolean Ie() { if (this.Z7)
/*    */     { boolean bool; I50 i50;
/*  3 */       if ((((i50 = this.v4.lC).j40 == i50.wg0)) || 
/*  4 */         !i50.dP) { bool = true; } else { bool = false; }  if (bool && this
/*  5 */         .AI.cw()); }  return false; } public boolean Z7; public boolean dL; public final wb AI; public Ke0(hm0 paramhm0, Hj paramHj) { this.Za = paramHj.lpt9(); this.nK0 = s; short s; if ((s = paramhm0.XW()) <= this.Za) { s = 1; } else { s = 0; }  this.dL = s; this.v4 = paramHj; this.Y40 = paramhm0; this.AI = (new Dc0(paramhm0)).SK(paramhm0); } public final void wL() { this.AI.O3(); km.wI0.K7.u4 = this.AI; hm0 hm01 = this.Y40; short s = this.nK0; this.v4.COM8(hm01, true, s); R8 r8;
/*  6 */     if ((r8 = km.u4) != null)
/*  7 */     { Uc0 uc02 = km.u4.z2; Uc0 uc01; if ((uc01 = r8.s40(aq0.LI)) != null && uc01 != uc02) uc01
/*  8 */           .Ix0();  uc02.Ix0(); }  this.Z7 = true; if (this.dL) { uT uT; hm0 hm02; if ((hm02 = this.Y40)
/*  9 */         .A0)
/* 10 */       { uT = hm02.Af(); }
/* 11 */       else { uT = ((hm0)uT).rF0; }
/* 12 */        mi.qt0(uT); this.dL = false; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final int zE() {
/*    */     return 4;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ke0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */