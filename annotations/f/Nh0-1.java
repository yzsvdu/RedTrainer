/*  1 */ package f;public final class Nh0 extends gu { public Nh0(S60 paramS60) {} public final void Zg(float paramFloat1, float paramFloat2) { this.cl.eB0(); S60 s602; if (!(s602 = this.cl).h50) paramFloat1 = 0.0F;  if (!s602.Cf) paramFloat2 = 0.0F;  s602.LY -= paramFloat1; s602.kB += paramFloat2; s602.Zj0(); S60 s601; Zy zy; if ((s601 = this.cl).ia0 && (paramFloat1 != 0.0F || paramFloat2 != 0.0F) && (zy = this.ih0) != null) zy
/*  2 */         .yn0(this.S70, this);  } public final void L5(float paramFloat1, float paramFloat2) { if (Math.abs(paramFloat1) <= 150.0F || !this.cl.h50) paramFloat1 = 0.0F;  if (Math.abs(paramFloat2) > 150.0F && this.cl.Cf) { paramFloat2 = -paramFloat2; } else { paramFloat2 = 0.0F; }  if (paramFloat1 != 0.0F || paramFloat2 != 0.0F) { S60 s602; Zy zy; if ((s602 = this.cl).ia0 && (zy = s602.ih0) != null) zy.yn0(s602.S70, s602); 
/*  3 */       this
/*  4 */         .qr0 = this.An;
/*  5 */       this.ks0 = paramFloat1; S60 s601; (s601 = this.cl).q0 = paramFloat2; }  } public final boolean Qi0(V80 paramV80) { if (super.Qi0(paramV80)) { if (((iW)paramV80).Dd0 == MV.Va0) this.cl.qr0 = 0.0F;  return true; }  if (paramV80 instanceof iW) { boolean bool; if (((iW)(paramV80 = paramV80)).Aa0 == -2.14748365E9F || ((iW)paramV80).coM4 == -2.14748365E9F) { bool = true; } else { bool = false; }  if (bool) { this.cl
/*  6 */           .aF = -1;
/*  7 */         this.cl.Ad0 = false; this.cl.hf0 = false;
/*  8 */         this.cl.S70.gq
/*  9 */           .SH0
/* 10 */           .uw0(); this.cl.S70.gq.Cp0 = true; }  }  return false; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nh0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */