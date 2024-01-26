/*  1 */ package f;public final class Bn0 { public final void m9() { HK0 hK0; this.XI.cOM2(UB0.M60.fG0(), UB0.M60.dL()); this.N5 = h1.c00; this.Yn0 = h1.Fg; float f1 = h1.b90; f1 *= 250.0F; this.NUl.DD(25.0F, 25.0F, f1, f1); zx zx1 = this.NUl; float f2; if ((f2 = Math.min(this.lpT9 * 250.0F / 2.0F, this.lpT9 * 250.0F / 2.0F) * h1.nR) >= 0.0F) { HK0 hK01; zx1.BQ = f2; zx1
/*  2 */         .rH0 = true;
/*  3 */       this.dr0.qp0(this.Yn0 * 120.0F, this.Yn0 * 120.0F); this.cF.qp0(this.Yn0 * 120.0F, this.Yn0 * 120.0F); (zx1 = this.NUl)
/*    */ 
/*    */ 
/*    */         
/*  7 */         .i6(100.0F, (int)this.XI.ow - zx1.xr0 - 100.0F); if (!h1.c00) { this.dr0
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 14 */           .i6((int)(hK0 = this.XI).w00 - this.dr0.ZP - 30.0F - this.cF.ZP - 150.0F, ((int)hK0.ow - 220)); this.cF
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 19 */           .i6((int)(hK01 = this.XI).w00 - this.cF.ZP - 30.0F - 120.0F, ((int)this.ow - 220)); } else { ev ev1; HK0 hK02; float f; (ev1 = ((Bn0)super).cF)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 25 */           .i6((int)(hK02 = ((Bn0)super).XI).w00 - (f = ev1.ZP) - 30.0F - f - 150.0F, ((int)hK02.ow - 120) - ev1.xr0); ((Bn0)super).dr0
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 32 */           .i6((int)(hK0 = ((Bn0)super).XI).w00 - ((Bn0)super).dr0.ZP - 30.0F - 120.0F, ((int)hK0.ow - 120) - ((Bn0)super).cF.xr0); }  return; }  hK0.getClass();
/* 33 */     throw new IllegalArgumentException("deadzoneRadius must be > 0"); }
/*    */ 
/*    */   
/*    */   public final Pw eC0;
/*    */   public float H20;
/*    */   public byte G4;
/*    */   public Zy mq0;
/*    */   public zx NUl;
/*    */   public NC0 Jw0;
/*    */   public ev dr0;
/*    */   public ev cF;
/*    */   public boolean PU = false;
/*    */   public ES[] Z8;
/*    */   public qH e60;
/*    */   public Mw q50;
/*    */   public boolean[] xM = new boolean[6];
/*    */   public boolean N5;
/*    */   public float Yn0 = 1.0F;
/*    */   public float lpT9 = 1.0F;
/*    */   public boolean iI;
/*    */   public boolean JH0;
/*    */   public boolean uL0;
/*    */   public boolean GH0;
/*    */   public Tm Bs;
/*    */   public HK0 XI;
/*    */   public JX rw;
/*    */   public NC0 lY = new NC0();
/*    */   
/*    */   public Bn0(Oj paramOj) {
/*    */     this.eC0 = paramOj;
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(Bn0.class);
/*    */   }
/*    */   
/*    */   public final void nF() {
/*    */     boolean bool1;
/*    */     if (this.PU && this.dr0.Qf0()) {
/*    */       bool1 = true;
/*    */     } else {
/*    */       bool1 = false;
/*    */     } 
/*    */     if (this.PU && this.cF.Qf0()) {
/*    */       bool2 = true;
/*    */     } else {
/*    */       bool2 = false;
/*    */     } 
/*    */     boolean[] arrayOfBoolean2;
/*    */     if ((arrayOfBoolean2 = this.xM)[0] != bool1) {
/*    */       arrayOfBoolean2[0] = bool1;
/*    */       km.ek.Qa0(h1.o5, bool1);
/*    */     } 
/*    */     boolean[] arrayOfBoolean1;
/*    */     if ((arrayOfBoolean1 = this.xM)[1] != bool2) {
/*    */       arrayOfBoolean1[1] = bool2;
/*    */       km.ek.Qa0(h1.nUL, bool2);
/*    */     } 
/*    */     this.iI = false;
/*    */     this.JH0 = false;
/*    */     this.uL0 = false;
/*    */     this.GH0 = false;
/*    */     if (this.PU) {
/*    */       float f1 = this.NUl.DD0.x;
/*    */       float f2 = this.NUl.DD0.y;
/*    */       this.Jw0.x = f1;
/*    */       this.Jw0.y = f2;
/*    */       if ((f1 = (float)Math.atan2(f2, f1) * 57.295776F) < 0.0F)
/*    */         f1 += 360.0F; 
/*    */       this.H20 = f1;
/*    */     } else {
/*    */       this.H20 = 0.0F;
/*    */     } 
/*    */     if (this.H20 > 0.0F)
/*    */       if (fp0(h1.Ll)) {
/*    */         this.JH0 = true;
/*    */         this.G4 = 3;
/*    */         this.e60.TJ0 = this.Z8[3];
/*    */       } else if (fp0(h1.SJ0)) {
/*    */         this.uL0 = true;
/*    */         this.G4 = 2;
/*    */         this.e60.TJ0 = this.Z8[1];
/*    */       } else if (fp0(h1.wu)) {
/*    */         this.G4 = 1;
/*    */         this.GH0 = true;
/*    */         this.e60.TJ0 = this.Z8[2];
/*    */       } else if (fp0(h1.Wa0)) {
/*    */         this.G4 = 0;
/*    */         this.iI = true;
/*    */         this.e60.TJ0 = this.Z8[4];
/*    */       }  
/*    */     boolean bool2;
/*    */     if ((arrayOfBoolean1 = this.xM)[2] != (bool2 = this.iI)) {
/*    */       arrayOfBoolean1[2] = bool2;
/*    */       km.ek.Qa0(h1.Wa0, bool2);
/*    */     } else if (arrayOfBoolean1[3] != (bool2 = this.JH0)) {
/*    */       arrayOfBoolean1[3] = bool2;
/*    */       km.ek.Qa0(h1.Ll, bool2);
/*    */     } else if (arrayOfBoolean1[4] != (bool2 = this.uL0)) {
/*    */       arrayOfBoolean1[4] = bool2;
/*    */       km.ek.Qa0(h1.SJ0, bool2);
/*    */     } else if (arrayOfBoolean1[5] != (bool2 = this.GH0)) {
/*    */       arrayOfBoolean1[5] = bool2;
/*    */       km.ek.Qa0(h1.wu, bool2);
/*    */     } 
/*    */     if (!this.JH0 && !this.iI && !this.uL0 && !this.GH0) {
/*    */       this.e60.TJ0 = this.Z8[0];
/*    */       this.G4 = -1;
/*    */       this.xM[2] = false;
/*    */       this.xM[3] = false;
/*    */       this.xM[4] = false;
/*    */       this.xM[5] = false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean fp0(int paramInt) {
/*    */     int i;
/*    */     byte b;
/*    */     if ((b = this.G4) == -1) {
/*    */       i = 0;
/*    */     } else {
/*    */       i = h1.QJ;
/*    */     } 
/*    */     float f1;
/*    */     float f2;
/*    */     float f3;
/*    */     return (paramInt == h1.Ll && ((b == 3 && (f3 = this.H20) >= (46 - i) && f3 <= (i + 135)) || ((f3 = this.H20) >= (i + 45) && f3 <= (136 - i)))) ? true : ((paramInt == h1.SJ0 && ((b == 2 && (f3 = this.H20) >= (136 - i) && f3 <= (i + 225)) || ((f3 = this.H20) >= (i + 135) && f3 <= (226 - i)))) ? true : ((paramInt == h1.wu && ((b == 1 && ((f3 = this.H20) >= (316 - i) || f3 <= (i + 45))) || (f3 = this.H20) >= (i + 315) || f3 <= (46 - i))) ? true : ((paramInt == h1.Wa0 && ((b == 0 && (f2 = this.H20) >= (226 - i) && f2 <= (i + 315)) || ((f1 = this.H20) >= (i + 225) && f1 <= (316 - i)))))));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bn0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */