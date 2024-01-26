/* 1 */ package f;public final class Eb implements Serializable { private static final long serialVersionUID = -1286036817192127343L; public static final eo Dp0 = new eo(); public final eo pp0; public final eo s60; public final eo sD; public final Eb kX(eo parameo1, eo parameo2) { eo eo1 = this.pp0; float f3, f4; if ((f3 = parameo1.x) >= (f4 = parameo2.x)) f3 = f4;  float f5; if ((f4 = parameo1.y) >= (f5 = parameo2.y)) f4 = f5;  float f6; if ((f5 = parameo1.z) >= (f6 = parameo2.z)) f5 = f6;  eo1.TG0(f3, f4, f5); eo1 = this.s60; if ((f3 = parameo1.x) <= (f4 = parameo2.x)) f3 = f4;  if ((f4 = parameo1.y) <= (f5 = parameo2.y)) f4 = f5;  float f1, f2; if ((f1 = parameo1.z) <= (f2 = parameo2.z)) f1 = f2;  eo1.TG0(f3, f4, f1); this.sD.JL(this.pp0).zT(this.s60).uu(0.5F); this.LW.JL(this.s60).zy0(this.pp0); return this; } public final eo LW; public Eb() { eo eo1; this(); this.pp0 = this; this(); this.s60 = this; this(); this.sD = this; this(); this.LW = this; xa0(); } public Eb(Eb paramEb) { eo eo1; this(); this.pp0 = this; this(); this.s60 = this; this(); this.sD = this; this(); this.LW = this; rD0(paramEb); } public Eb(eo parameo1, eo parameo2) { eo eo1; this(); this.pp0 = this; this(); this.s60 = this; this(); this.sD = this; this(); this.LW = this; kX(parameo1, parameo2); } public static final float Po(float paramFloat1, float paramFloat2) { if (paramFloat1 <= paramFloat2) paramFloat1 = paramFloat2;  return paramFloat1; } public final Eb Te0() { this.pp0.TG0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY); this.s60.TG0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY); this.sD.TG0(0.0F, 0.0F, 0.0F); this.LW.TG0(0.0F, 0.0F, 0.0F); return this; } public final boolean r10(Eb paramEb) { boolean bool; eo eo1, eo2; if ((eo1 = this.pp0).x <= (eo2 = this.s60).x && eo1.y <= eo2.y && eo1.z <= eo2.z) { bool = true; } else { bool = false; }  if (!bool) return false; 
/* 2 */     float f3 = this.LW.x / 2.0F, f1 = Math.abs(this.sD.y - paramEb.sD.y); f3 = this.LW.y / 2.0F; f3 = paramEb.LW.y / 2.0F + f3; float f2 = Math.abs(this.sD.z - paramEb.sD.z), f4 = this.LW.z / 2.0F; f4 = paramEb.LW.z / 2.0F + f4; return (Math.abs(this.sD.x - paramEb.sD.x) <= paramEb.LW.x / 2.0F + f3 && f1 <= f3 && f2 <= f4); } public final String toString() { return B40.df("[").append(this.pp0).append("|").append(this.s60).append("]").toString(); }
/*   */ 
/*   */   
/*   */   public final void rD0(Eb paramEb) {
/*   */     eo eo1 = paramEb.pp0;
/*   */     kX(this, paramEb.s60);
/*   */   }
/*   */   
/*   */   public final void RO(eo parameo) {
/*   */     eo eo1;
/*   */     float f2;
/*   */     float f3;
/*   */     if ((f2 = (eo1 = this.pp0).x) > (f3 = parameo.x))
/*   */       f2 = f3; 
/*   */     float f4;
/*   */     if ((f3 = eo1.y) > (f4 = parameo.y))
/*   */       f3 = f4; 
/*   */     float f5;
/*   */     if ((f4 = eo1.z) > (f5 = parameo.z))
/*   */       f4 = f5; 
/*   */     eo1 = eo1.TG0(f2, f3, f4);
/*   */     float f1 = Math.max(this.s60.y, parameo.y);
/*   */     kX(eo1, this.s60.TG0(Math.max(this.s60.x, parameo.x), f1, Math.max(this.s60.z, parameo.z)));
/*   */   }
/*   */   
/*   */   public final void xa0() {
/*   */     kX(this.pp0.TG0(0.0F, 0.0F, 0.0F), this.s60.TG0(0.0F, 0.0F, 0.0F));
/*   */   }
/*   */   
/*   */   public final void fY(Eb paramEb) {
/*   */     eo eo1;
/*   */     float f2;
/*   */     eo eo2;
/*   */     float f4;
/*   */     if ((f2 = (eo1 = this.pp0).x) > (f4 = (eo2 = paramEb.pp0).x))
/*   */       f2 = f4; 
/*   */     float f5;
/*   */     if ((f4 = eo1.y) > (f5 = eo2.y))
/*   */       f4 = f5; 
/*   */     float f3;
/*   */     if ((f5 = eo1.z) > (f3 = eo2.z))
/*   */       f5 = f3; 
/*   */     eo1 = eo1.TG0(f2, f4, f5);
/*   */     float f1 = Po(this.s60.y, paramEb.s60.y);
/*   */     kX(eo1, this.s60.TG0(Po(this.s60.x, paramEb.s60.x), f1, Po(this.s60.z, paramEb.s60.z)));
/*   */   }
/*   */   
/*   */   public final void Uc(Matrix4 paramMatrix4) {
/*   */     float f1 = this.pp0.x;
/*   */     float f2 = this.pp0.y;
/*   */     float f3 = this.pp0.z;
/*   */     float f4 = this.s60.x;
/*   */     float f5 = this.s60.y;
/*   */     float f6 = this.s60.z;
/*   */     Te0();
/*   */     RO(eo1.TG0(f1, f2, f3).eM(paramMatrix4));
/*   */     RO(eo1.TG0(f1, f2, f6).eM(paramMatrix4));
/*   */     RO(eo1.TG0(f1, f5, f3).eM(paramMatrix4));
/*   */     RO(eo1.TG0(f1, f5, f6).eM(paramMatrix4));
/*   */     RO(eo1.TG0(f4, f2, f3).eM(paramMatrix4));
/*   */     RO(eo1.TG0(f4, f2, f6).eM(paramMatrix4));
/*   */     RO(eo1.TG0(f4, f5, f3).eM(paramMatrix4));
/*   */     eo eo1;
/*   */     RO((eo1 = Dp0).TG0(f4, f5, f6).eM(paramMatrix4));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Eb.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */