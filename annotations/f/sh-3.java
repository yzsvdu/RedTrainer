/* 1 */ package f;public abstract class sh { public final void nO(float paramFloat) { if (!this.p0 || this.fr0) return;  this.Qy0 = paramFloat; if (!this.sn && this.yz0 + paramFloat >= this.aJ0) { S7(); this.sn = true; this.uQ = true; this.g4 = 0; this.Qy0 -= this.aJ0 - this.yz0; this.yz0 = 0.0F; io(1); io(2); }  if (this
/* 2 */       .sn)
/* 3 */     { float f1; boolean bool; int j; float f2, f3; if (!(bool = this.uQ) && this.Zz >= 0 && (j = this.g4) < 0 && (f2 = this.yz0) + (f3 = this.Qy0) >= 0.0F) { if (sL || j == -1) { this.uQ = true; this.g4 = 0; this.Qy0 = f3 - (f1 = 0.0F - f2); this.yz0 = 0.0F; io(1); io(2); int k = (j = this.g4) - 1; sa(this.uQ, j, k, f1); } else { throw new AssertionError(); }  } else { int k; if (f1 == 0.0F && (k = this.Zz) >= 0 && (j = this.g4) > (k *= 2) && (f2 = this.yz0) + (f3 = this.Qy0) < 0.0F) if (sL || j == k + 1) { this.uQ = true; this.g4 = k; float f; this.Qy0 = f3 - (f = 0.0F - f2); this.yz0 = this.aq0; io(16); io(32); int m = (j = this.g4) + 1; sa(this.uQ, j, m, f); } else { throw new AssertionError(); }   }  int i; while ((((
/* 4 */         i = this.g4) >= 0 && i <= this
/* 5 */         .Zz * 2) || this.Zz < 0)) {
/* 6 */         float f5; int k, m; float f6; boolean bool1; if (!(bool1 = this.uQ) && (f2 = this.yz0) + (f3 = this.Qy0) <= 0.0F) { this.uQ = true; this.g4 = i - 1; this.Qy0 = f3 - (f5 = 0.0F - f2); this.yz0 = this.aq0; else(); io(32); int n = (m = this.g4) + 1; sa(this.uQ, m, n, f5); continue; }  float f7; if (m == 0 && (f2 = this.yz0) + (f3 = this.Qy0) >= (f7 = this.iA0)) { this.uQ = true; this.g4 = f5 + 1; this.Qy0 = f3 - (f5 = f7 - f2); this.yz0 = 0.0F; Dy(); io(2); int n = (m = this.g4) - 1; sa(this.uQ, m, n, f5); continue; }  if (m != 0 && (f2 = this.yz0) + (f3 = this.Qy0) < 0.0F) { this.uQ = false; this.g4 = k = f5 - 1; this.Qy0 = f3 - (f6 = 0.0F - f2); this.yz0 = 0.0F; int n = k + 1; sa(false, k, n, f6); io(64); if (this.g4 < 0 && this.Zz >= 0) { io(128); continue; }  this.yz0 = this.iA0; continue; }  if (f6 != 0.0F && (f2 = this.yz0) + (f3 = this.Qy0) > (f7 = this.aq0)) { this.uQ = false; this.g4 = k; this.Qy0 = f3 - (f6 = f7 - f2); this.yz0 = f7; int n = ++k - 1; sa(false, k, n, f6); io(4); if (this.g4 > (k = this.Zz) * 2 && k >= 0) io(8);  this.yz0 = 0.0F; continue; }  if (f6 != 0.0F) { this.Qy0 -= f6 = this.Qy0; this.yz0 += f6; sa(f6, k, k, f6); break; }  float f4; this.Qy0 -= f4 = this.Qy0; this.yz0 += f4;
/* 7 */       }  if ((i = this.Zz) >= 0 && ((j = this.g4) > i * 2 || j < 0)) { i = 1; } else { i = 0; }  this.nm = i; }  this
/* 8 */       .yz0 += this.Qy0; this.Qy0 = 0.0F; }
/*   */ 
/*   */   
/*   */   public int g4;
/*   */   public int Zz;
/*   */   public boolean uQ;
/*   */   public float aJ0;
/*   */   public float aq0;
/*   */   public float iA0;
/*   */   public float yz0;
/*   */   public float Qy0;
/*   */   public boolean p0;
/*   */   public boolean sn;
/*   */   public boolean nm;
/*   */   public boolean fr0;
/*   */   public hk0 C00;
/*   */   public int yj0;
/*   */   public boolean DP;
/*   */   public boolean QB0;
/*   */   
/*   */   public void TL0() {
/*   */     this.g4 = -2;
/*   */     this.Zz = 0;
/*   */     this.uQ = false;
/*   */     this.Qy0 = 0.0F;
/*   */     this.yz0 = 0.0F;
/*   */     this.iA0 = 0.0F;
/*   */     this.aq0 = 0.0F;
/*   */     this.aJ0 = 0.0F;
/*   */     this.fr0 = false;
/*   */     this.nm = false;
/*   */     this.sn = false;
/*   */     this.p0 = false;
/*   */     this.C00 = null;
/*   */     this.yj0 = 8;
/*   */     this.QB0 = true;
/*   */     this.DP = true;
/*   */   }
/*   */   
/*   */   public abstract Object VS();
/*   */   
/*   */   public abstract void Cy0();
/*   */   
/*   */   public final float sV() {
/*   */     int i;
/*   */     if ((i = this.Zz) < 0)
/*   */       return -1.0F; 
/*   */     float f1;
/*   */     float f2 = this.aJ0 + (f1 = this.aq0);
/*   */     return (this.iA0 + f1) * i + f2;
/*   */   }
/*   */   
/*   */   public final boolean DD() {
/*   */     if (this.nm || this.fr0)
/*   */       return true; 
/*   */   }
/*   */   
/*   */   public abstract void Dy();
/*   */   
/*   */   public abstract void else();
/*   */   
/*   */   public void S7() {}
/*   */   
/*   */   public final void s0(float paramFloat) {
/*   */     this.yz0 = paramFloat - sV();
/*   */     this.g4 = this.Zz * 2 + 1;
/*   */     this.uQ = false;
/*   */     else();
/*   */   }
/*   */   
/*   */   public final void io(int paramInt) {
/*   */     hk0 hk01;
/*   */     if ((hk01 = this.C00) != null && (this.yj0 & paramInt) > 0)
/*   */       hk01.Do(paramInt, this); 
/*   */   }
/*   */   
/*   */   public abstract void sa(boolean paramBoolean, int paramInt1, int paramInt2, float paramFloat);
/*   */   
/*   */   public void Ob0() {
/*   */     VS();
/*   */     this.yz0 = 0.0F;
/*   */     this.p0 = true;
/*   */   }
/*   */   
/*   */   public final sh mg(G30 paramG30) {
/*   */     if (!paramG30.x.contains(this))
/*   */       paramG30.x.add(this); 
/*   */     if (this.QB0)
/*   */       Ob0(); 
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final sh Vq(float paramFloat) {
/*   */     this.aJ0 += paramFloat;
/*   */     return this;
/*   */   }
/*   */   
/*   */   public final sh Ck0(int paramInt, float paramFloat) {
/*   */     if (!this.p0) {
/*   */       this.Zz = paramInt;
/*   */       if (paramFloat < 0.0F)
/*   */         paramFloat = 0.0F; 
/*   */       this.iA0 = paramFloat;
/*   */       return this;
/*   */     } 
/*   */     throw new RuntimeException("You can't change the repetitions of a tween or timeline once it is started");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */