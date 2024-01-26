/* 1 */ package f;public final class c00 implements cA { public final int fE0(IX paramIX) { int k; zp zp1 = paramIX.ze; this.gj = false; int j; if ((j = this.hs) != 0) { if (j != 1) return -1;  int m; for (j = this.strictfp, m = 0; m < (k = this.VG); ) { int n = this.EG[m]; zp zp2; if ((zp2 = this.yB0[n]) == zp1) { this.gj = true; break; }  if (zp2 == null) break;  m++; }  if (m >= k) m = k - 1;  for (k = this.EG[m]; m > 0; ) { this.EG[m] = this.EG[m - 1]; m--; }  this.EG[0] = k; if (!this.gj) { this.yB0[k] = zp1; zp1.bind(this.strictfp + k); }  }
/* 2 */     else { j = this.strictfp; int m = 0; while (true) { if (m < (
/* 3 */           k = this.VG)) { k = (this.p50 + m) % k; if (this.yB0[k] == zp1) { this.gj = true; break; }  m++; continue; }  this.p50 = m = (this.p50 + 1) % k; this.yB0[m] = zp1; zp1.bind(this.strictfp + m); k = this.p50; break; }  }  int i = j + k; if (this
/* 4 */       .gj) UB0.go.glActiveTexture(i + 33984);  A00 a00 = paramIX.FZ; zp1.unsafeSetWrap(this, paramIX.COm4); cu0 cu0 = paramIX.HF0; zp1.unsafeSetFilter(this, paramIX.OH0); return i; }
/*   */ 
/*   */   
/*   */   public final int strictfp;
/*   */   public final int VG;
/*   */   public final zp[] yB0;
/*   */   public int[] EG;
/*   */   public final int hs;
/*   */   public boolean gj;
/*   */   public final IX Nn0 = new IX();
/*   */   public int p50 = 0;
/*   */   
/*   */   public c00(int paramInt) {
/*   */     this(paramInt, 0);
/*   */   }
/*   */   
/*   */   public c00(int paramInt1, int paramInt2) {
/*   */     this(paramInt1, paramInt2, -1);
/*   */   }
/*   */   
/*   */   public c00(int paramInt1, int paramInt2, int paramInt3) {
/*   */     int i = Math.min(EI0(), 32);
/*   */     if (paramInt3 < 0)
/*   */       paramInt3 = i - paramInt2; 
/*   */     if (paramInt2 >= 0 && paramInt3 >= 0 && paramInt2 + paramInt3 <= i) {
/*   */       int[] arrayOfInt;
/*   */       this.hs = paramInt1;
/*   */       this.strictfp = paramInt2;
/*   */       this.VG = paramInt3;
/*   */       this.yB0 = new zp[paramInt3];
/*   */       if (paramInt1 == 1) {
/*   */         arrayOfInt = new int[paramInt3];
/*   */       } else {
/*   */         arrayOfInt = null;
/*   */       } 
/*   */       this.EG = arrayOfInt;
/*   */       return;
/*   */     } 
/*   */     throw new JU("Illegal arguments");
/*   */   }
/*   */   
/*   */   public static int EI0() {
/*   */     UB0.go.glGetIntegerv(34930, intBuffer);
/*   */     IntBuffer intBuffer;
/*   */     return (intBuffer = BufferUtils.mt0(16)).get(0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/c00.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */