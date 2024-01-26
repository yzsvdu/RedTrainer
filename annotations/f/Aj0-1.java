/* 1 */ package f;public final class Aj0 extends wb { public final wb pI0(hR paramhR, byte paramByte) { boolean bool; String str; char c; if (paramByte == 0) { tS(); return this; }  if (paramByte > 0) { bool = true; } else { bool = false; }
/* 2 */      StringBuilder stringBuilder = B40.df("status/"); if (bool)
/* 3 */     { str = "up"; } else { str = "down"; }  ParticleEffectExt particleEffectExt = vR(stringBuilder.append(str).toString()); So so2 = So.k60().Wz0(0.75F).L5(); if (bool) { c = 'ؕ'; } else { c = 'ؖ'; }
/*   */     
/* 5 */     this.synchronized = so1; So so1; (so1 = so2.PL(wb.A50(c, this.M7.Si())).PL(Wz0.OC((paramInt, paramsh) -> { OJ(paramParticleEffectExt); if (paramhR != null) UB0.Kg0.fN(());  })).Kr())
/*   */ 
/*   */       
/* 8 */       .mg(this.pb.dr0); this.pb.t9(this.synchronized);
/* 9 */     tS();
/*   */     return this; }
/*   */ 
/*   */   
/*   */   public kf YA;
/*   */   
/*   */   public Aj0(kf paramkf, hm0 paramhm0) {
/*   */     super(paramhm0);
/*   */     this.YA = paramkf;
/*   */   }
/*   */   
/*   */   public final boolean tF0(boolean paramBoolean) {
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Aj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */