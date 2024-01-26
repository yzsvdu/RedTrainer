/* 1 */ package f;public class OH extends lpt1 { public final void Ud0(float paramFloat1, float paramFloat2) { super.Ud0(paramFloat1, paramFloat2); if (this.tq0 == null) return;  this.uy0 = paramFloat1; if ((paramFloat1 = this.uy0 + paramFloat2) >= this.gW / 1000.0F) { this.uy0 = 0.0F; this.gW = xi0.A90(2000, 5000); }  int i; if ((i = this.Xy) == 0)
/*   */     {
/* 3 */       if ((i = L70.gq.Rr0()) >= 6 && i < 17) { i = 2; } else { i = 4; }  }  if (i != this
/* 4 */       .oy0)
/* 5 */     { if ((i = this.Xy) == 0)
/*   */       {
/* 7 */         if ((i = L70.gq.Rr0()) >= 6 && i < 17) { i = 2; } else { i = 4; }  }  this
/* 8 */         .oy0 = i; if (i == 2) { int[] arrayOfInt; int j; byte b; for (j = (arrayOfInt = this.tq0).length, b = 0; b < j; ) { int k = arrayOfInt[b]; ((T0)this.xl0.get(k)).Ng0(qo.iu0); b++; }  } else { int[] arrayOfInt; int j; byte b; for (j = (arrayOfInt = this.tq0).length, b = 0; b < j; ) { int k = arrayOfInt[b]; ((T0)this.xl0.get(k)).Tz0(this.mQ); b++; }  }  }  if (this.bm) { float f2; if ((f2 = this.uy0 * 1000.0F / this.gW) > 0.5F) f2 = 1.0F - f2;  paramFloat2 = this.xI0 / 10.0F; float f1 = this.g * f2 * paramFloat2; Color color; this.s00.vF0.set((color = this.pX).r * f2 * paramFloat2, f1, this.b * f2 * paramFloat2, 1.0F); this.mQ.vF0.set(f2 * 0.25F + 0.55F, f2 * 0.25F + 0.55F, f2 * 0.25F + 0.55F, 0.1F); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final eo uH0 = new eo();
/*   */   public qo mQ;
/*   */   public qo s00;
/*   */   public float uy0;
/*   */   public int gW;
/*   */   public int oy0;
/*   */   public int Xy;
/*   */   public int[] tq0;
/*   */   public Color pX;
/*   */   public boolean bm;
/*   */   public float xI0 = 1.0F;
/*   */   
/*   */   public OH(OH paramOH) {
/*   */     super(paramOH);
/*   */     this.tq0 = paramOH.tq0;
/*   */     this.bm = paramOH.bm;
/*   */     this.xI0 = paramOH.xI0;
/*   */     this.pX = paramOH.pX;
/*   */     this.s00 = new qo(qo.cu0, this.pX.cpy().mul(this.xI0 * 0.2F));
/*   */     float f1 = this.xI0 * 0.21F + 0.6F;
/*   */     float f2 = this.xI0 * 0.21F + 0.6F;
/*   */     float f3 = this.xI0 * 0.21F + 0.6F;
/*   */     this.mQ = new qo(qo.iu0, new Color(f1, f2, f3, 0.1F));
/*   */     int[] arrayOfInt;
/*   */     if ((arrayOfInt = this.tq0) != null) {
/*   */       int i = arrayOfInt.length;
/*   */       for (byte b = 0; b < i; b++) {
/*   */         int j = arrayOfInt[b];
/*   */         ((T0)this.xl0.get(j)).Tz0(this.s00);
/*   */         ((T0)this.xl0.get(j)).Tz0(this.mQ);
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   public OH(cf0 paramcf0, Color paramColor, boolean paramBoolean, float paramFloat, int... paramVarArgs) {
/*   */     super(paramcf0, "LightEmissiveModel", 64.0F, null);
/*   */     Jx0(true);
/*   */     if (!paramcf0.cs.isEmpty())
/*   */       ml0(0, true); 
/*   */     this.pX = paramColor;
/*   */     this.bm = paramBoolean;
/*   */     this.xI0 = paramFloat;
/*   */     this.s00 = new qo(qo.cu0, paramColor.cpy().mul(paramFloat * 0.2F));
/*   */     this.mQ = new qo(qo.iu0, new Color(paramFloat * 0.21F + 0.6F, paramFloat * 0.21F + 0.6F, paramFloat * 0.21F + 0.6F, 0.1F));
/*   */     this.tq0 = paramVarArgs;
/*   */     int i = paramVarArgs.length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       int j = paramVarArgs[b];
/*   */       ((T0)this.xl0.get(j)).Tz0(this.s00);
/*   */       ((T0)this.xl0.get(j)).Tz0(this.mQ);
/*   */     } 
/*   */   }
/*   */   
/*   */   public void M70(eo parameo) {
/*   */     getClass();
/*   */     float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z;
/*   */     eo eo1;
/*   */     this.mh.b8((eo1 = uH0).TG0(f1, f2, f3).uD(0.0F, 0.15F, -0.05F));
/*   */   }
/*   */   
/*   */   public final lpt1 ro0() {
/*   */     (new OH(this)).A60 = true;
/*   */     return new OH(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */