/*    */ package f;public final class TG0 implements Serializable { private static final long serialVersionUID = -7661875440774897168L; public static TG0 Bn0 = new TG0(0.0F, 0.0F, 0.0F, 0.0F); public static TG0 LPT5 = new TG0(0.0F, 0.0F, 0.0F, 0.0F); public float D80; public float tb0; public float z60; public float AD; public TG0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { vp0(paramFloat1, paramFloat2, paramFloat3, paramFloat4); } public TG0() { Gl0(); } public TG0(TG0 paramTG0) { XL(paramTG0); } public TG0(eo parameo, float paramFloat) { eY(parameo, paramFloat); } public final TG0 vp0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.D80 = paramFloat1; this.tb0 = paramFloat2; this.z60 = paramFloat3; this.AD = paramFloat4; return this; } public final TG0 XL(TG0 paramTG0) { float f1 = paramTG0.D80; float f2 = paramTG0.tb0; float f3 = paramTG0.z60; float f4 = paramTG0.AD; return vp0(f1, f2, f3, f4); }
/*  2 */   public final String toString() { return B40.df("[").append(this.D80).append("|").append(this.tb0).append("|").append(this.z60).append("|").append(this.AD).append("]").toString(); } public final TG0 pb(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { float f3 = f2 * paramFloat1; float f1 = f4 * paramFloat4 + f3; f1 = (f3 = this.tb0) * paramFloat3 + f1; f1 -= f5 * paramFloat2; paramFloat4 = f2 * paramFloat2; paramFloat4 = f3 * paramFloat4 + paramFloat4; paramFloat4 = f5 * paramFloat1 + paramFloat4 - f4 * paramFloat3; f2 *= paramFloat3; float f5; float f2 = (f5 = this.z60) * paramFloat4 + f2; float f4; f2 = (f4 = this.D80) * paramFloat2 + f2 - f3 * paramFloat1; paramFloat1 = (f2 = this.AD) * paramFloat4 - f4 * paramFloat1 - f3 * paramFloat2 - f5 * paramFloat3; this.D80 = f1; this.tb0 = paramFloat4; this.z60 = f2; this.AD = paramFloat1; return this; } public final TG0 L90(TG0 paramTG0) { float f4; float f5 = f3 * (f4 = this.D80); float f2; f5 = f6 * (f2 = this.AD) + f5; float f7; float f8; f5 = (f7 = paramTG0.tb0) * (f8 = this.z60) + f5; float f1; float f3 = f5 - f9 * (f1 = this.tb0); f5 = f3 * f1; f5 = f7 * f2 + f5; f5 = f9 * f4 + f5 - f6 * f8; float f10 = f3 * f8; float f9; f10 = (f9 = paramTG0.z60) * f2 + f10; float f6; f10 = (f6 = paramTG0.D80) * f1 + f10 - f7 * f4; f1 = (f3 = paramTG0.AD) * f2 - f6 * f4 - f7 * f1 - f9 * f8; this.D80 = f3; this.tb0 = f5; this.z60 = f10; this.AD = f1; return this; } public final TG0 v7() { float f = this.D80 * this.D80; f = this.tb0 * this.tb0 + f; f = this.z60 * this.z60 + f; if ((f = this.AD * this.AD + f) != 0.0F && !nx0.JC0(f, 1.0F)) { f = (float)Math.sqrt(f); this.AD /= f; this.D80 /= f; this.tb0 /= f; this.z60 /= f; }  return this; } public final TG0 Gl0() { return vp0(0.0F, 0.0F, 0.0F, 1.0F); } public final TG0 qj0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { float f2 = paramFloat1 * paramFloat1; f2 = paramFloat2 * paramFloat2 + f2; if ((f2 = (float)Math.sqrt((paramFloat3 * paramFloat3 + f2))) == 0.0F) return Gl0();  f2 = 1.0F / f2; paramFloat4 = ((paramFloat4 < 0.0F) ? (6.2831855F - -paramFloat4 % 6.2831855F) : (paramFloat4 % 6.2831855F)) / 2.0F; float f1 = (float)Math.sin(paramFloat4); paramFloat1 = (float)Math.cos(paramFloat4); paramFloat2 = f2 * paramFloat1 * f1; paramFloat3 = f2 * paramFloat2 * f1; f1 = f2 * paramFloat3 * f1; return vp0(paramFloat2, paramFloat3, f1, paramFloat1).v7(); } public final TG0 dJ(boolean paramBoolean, Matrix4 paramMatrix4) { float f1 = paramMatrix4.Z0[0]; float f2 = paramMatrix4.Z0[4]; float f3 = paramMatrix4.Z0[8]; float f4 = paramMatrix4.Z0[1]; float f5 = paramMatrix4.Z0[5]; float f6 = paramMatrix4.Z0[9]; float f7 = paramMatrix4.Z0[2]; float f8 = paramMatrix4.Z0[6]; float f9 = paramMatrix4.Z0[10]; return hE0(paramBoolean, f1, f2, f3, f4, f5, f6, f7, f8, f9); } public final TG0 hE0(boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9) { if (paramBoolean) { float f1 = paramFloat1 * paramFloat1; f1 = paramFloat2 * paramFloat2 + f1; f1 = 1.0F / (float)Math.sqrt((paramFloat3 * paramFloat3 + f1)); paramFloat1 = paramFloat4 * paramFloat4; paramFloat1 = paramFloat5 * paramFloat5 + paramFloat1; paramFloat1 = 1.0F / (float)Math.sqrt((paramFloat6 * paramFloat6 + paramFloat1)); paramFloat2 = paramFloat7 * paramFloat7; paramFloat2 = paramFloat8 * paramFloat8 + paramFloat2;
/*  3 */       paramFloat2 = (float)Math.sqrt((paramFloat9 * paramFloat9 + paramFloat2)); paramFloat2 = 1.0F / paramFloat2; paramFloat3 = paramFloat1 * f1; paramFloat4 = paramFloat2 * f1; f1 = paramFloat3 * f1; paramFloat5 = paramFloat4 * paramFloat1; paramFloat6 = paramFloat5 * paramFloat1; paramFloat1 = paramFloat6 * paramFloat1; paramFloat7 *= paramFloat2; paramFloat8 *= paramFloat2; paramFloat9 *= paramFloat2; paramFloat6 = paramFloat1; paramFloat3 = f1; paramFloat2 = paramFloat4; paramFloat4 = paramFloat5; paramFloat5 = paramFloat6; paramFloat1 = paramFloat3; }  float f; if ((f = paramFloat1 + paramFloat5 + paramFloat9) >= 0.0F) { this
/*  4 */         .AD = (f = (float)Math.sqrt((f + 1.0F))) * 0.5F; f = 0.5F / f; this.D80 = (paramFloat8 - paramFloat6) * f; this.tb0 = (paramFloat3 - paramFloat7) * f; this.z60 = (paramFloat4 - paramFloat2) * f; } else if (paramFloat1 > paramFloat5 && paramFloat1 > paramFloat9) { this.D80 = (f = (float)Math.sqrt(paramFloat1 + 1.0D - paramFloat5 - paramFloat9)) * 0.5F; f = 0.5F / f; this.tb0 = (paramFloat4 + paramFloat2) * f; this.z60 = (paramFloat3 + paramFloat7) * f; this.AD = (paramFloat8 - paramFloat6) * f; } else if (paramFloat5 > paramFloat9) { this.tb0 = (f = (float)Math.sqrt(paramFloat5 + 1.0D - paramFloat1 - paramFloat9)) * 0.5F; f = 0.5F / f; this.D80 = (paramFloat4 + paramFloat2) * f; this.z60 = (paramFloat8 + paramFloat6) * f; this.AD = (paramFloat3 - paramFloat7) * f; } else { this.z60 = (f = (float)Math.sqrt(paramFloat9 + 1.0D - paramFloat1 - paramFloat5)) * 0.5F; f = 0.5F / f; this.D80 = (paramFloat3 + paramFloat7) * f; this.tb0 = (paramFloat8 + paramFloat6) * f; this.AD = (paramFloat4 - paramFloat2) * f; }  return this; } public final int hashCode() { int i = 31; i = (Float.floatToRawIntBits(this.AD) + i) * 31; i = (Float.floatToRawIntBits(this.D80) + i) * 31;
/*  5 */     i = (Float.floatToRawIntBits(this.tb0) + i) * 31;
/*    */     
/*  7 */     return Float.floatToRawIntBits(this.z60) + i; } public final boolean equals(Object paramObject) { if (this == paramObject) return true;  if (paramObject == null) return false;  if (!(paramObject instanceof TG0)) return false;  paramObject = paramObject; return (Float.floatToRawIntBits(this.AD) == Float.floatToRawIntBits(((TG0)paramObject).AD) && Float.floatToRawIntBits(this.D80) == Float.floatToRawIntBits(((TG0)paramObject).D80) && 
/*    */       
/*  9 */       Float.floatToRawIntBits(this.tb0) == 
/*    */       
/* 11 */       Float.floatToRawIntBits(((TG0)paramObject).tb0) && 
/*    */       
/* 13 */       Float.floatToRawIntBits(this.z60) == 
/*    */       
/* 15 */       Float.floatToRawIntBits(((TG0)paramObject).z60)); }
/*    */ 
/*    */   
/*    */   public final float lpt2(eo parameo) {
/*    */     float f1 = parameo.x, f2 = parameo.y, f4 = this.D80, f5 = this.tb0;
/*    */     f1 = f4 * f1;
/*    */     f1 = f5 * f2 + f1;
/*    */     f2 = f1 * (f1 = this.z60 * f3 + f1);
/*    */     float f3 = f2 * f1;
/*    */     f4 = (f3 = parameo.z) * f1;
/*    */     f2 *= f2;
/*    */     f2 = f3 * f3 + f2;
/*    */     f2 = f4 * f4 + f2;
/*    */     double d = 2.0D;
/*    */     return (nx0.is(f2 = this.AD * this.AD + f2) ? 0.0F : (float)(Math.acos(nx0.SA0((float)(((f1 < 0.0F) ? -this.AD : this.AD) / Math.sqrt(f2)), -1.0F, 1.0F)) * d)) * 57.295776F;
/*    */   }
/*    */   
/*    */   public final void eY(eo parameo, float paramFloat) {
/*    */     float f1 = parameo.x, f2 = parameo.y;
/*    */     paramFloat = parameo.z;
/*    */     float f3 = paramFloat * 0.017453292F;
/*    */     qj0(f1, f2, paramFloat, f3);
/*    */   }
/*    */   
/*    */   public final void Wq() {
/*    */     this.D80 = -this.D80;
/*    */     this.tb0 = -this.tb0;
/*    */     this.z60 = -this.z60;
/*    */   }
/*    */   
/*    */   public final void m90(eo parameo, float paramFloat) {
/*    */     float f1 = parameo.x, f2 = parameo.y;
/*    */     paramFloat = parameo.z;
/*    */     float f3 = paramFloat * 0.017453292F;
/*    */     qj0(f1, f2, paramFloat, f3);
/*    */   }
/*    */   
/*    */   public final void wd(TG0 paramTG0, float paramFloat) {
/*    */     float f2 = this.D80 * paramTG0.D80;
/*    */     f2 = this.tb0 * paramTG0.tb0 + f2;
/*    */     f2 = this.z60 * paramTG0.z60 + f2;
/*    */     int i;
/*    */     if ((i = (f2 = this.AD * paramTG0.AD + f2) cmp 0.0F) < 0)
/*    */       f2 = -f2; 
/*    */     float f3 = 1.0F - paramFloat;
/*    */     if ((1.0F - f2) > 0.1D) {
/*    */       f2 = 1.0F / (float)Math.sin((paramFloat = (float)Math.acos(f2)));
/*    */       f3 = (float)Math.sin((f3 * (float)Math.acos(f2))) * f2;
/*    */       paramFloat = (float)Math.sin((paramFloat * paramFloat)) * f2;
/*    */     } 
/*    */     if (i < 0)
/*    */       paramFloat = -paramFloat; 
/*    */     float f1 = f3 * this.D80;
/*    */     this.D80 = paramFloat * paramTG0.D80 + f1;
/*    */     f1 = f3 * this.tb0;
/*    */     this.tb0 = paramFloat * paramTG0.tb0 + f1;
/*    */     f1 = f3 * this.z60;
/*    */     this.z60 = paramFloat * paramTG0.z60 + f1;
/*    */     f1 = f3 * this.AD;
/*    */     this.AD = paramFloat * paramTG0.AD + f1;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TG0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */