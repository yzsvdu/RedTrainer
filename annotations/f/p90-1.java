/* 1 */ package f;public final class p90 implements qd0 { public final void Ed0(float paramFloat) { this.zL0 = paramFloat; this.COm2 = f; int i = this.I4 + 1; float f; this.wK = (f = this.COm2 + paramFloat) / i; m50 m501; if ((m501 = this.PA0) != null) { int j; float[] arrayOfFloat; if ((j = m501.pg0) < (
/* 2 */         arrayOfFloat = m501.sl0).length) m501.pg0 = j + 1;  m501.fe0 = k; arrayOfFloat[j] = paramFloat; int k; if ((k = (j = m501.fe0) + 1) > arrayOfFloat.length - 1) m501.fe0 = 0;  m501.getClass();
/* 3 */       if ((m501.pg0 >= arrayOfFloat.length)) { paramFloat = 0.0F; j = 0; while (j < (
/* 4 */           arrayOfFloat = m501.sl0).length) { paramFloat += arrayOfFloat[j]; j++; }  m501.Tl = paramFloat / arrayOfFloat.length; m501.getClass(); paramFloat = m501.Tl; } else { paramFloat = 0.0F; }  }  this
/* 5 */       .Ol = paramFloat; if ((m501 = this.PA0) == null || (
/* 6 */       (m501.pg0 >= m501.sl0.length))) { if (paramFloat < this
/* 7 */         .zp) this.zp = paramFloat;  if (paramFloat > this.jw0) this.jw0 = paramFloat;  }
/*   */      }
/*   */ 
/*   */   
/*   */   public int I4;
/*   */   public float COm2;
/*   */   public float zp;
/*   */   public float jw0;
/*   */   public float wK;
/*   */   public float zL0;
/*   */   public float Ol;
/*   */   public final m50 PA0;
/*   */   
/*   */   public p90(int paramInt) {
/*   */     m50 m501;
/*   */     if (paramInt > 1) {
/*   */       this(paramInt);
/*   */     } else {
/*   */       m501 = null;
/*   */     } 
/*   */     this.PA0 = m501;
/*   */     reset();
/*   */   }
/*   */   
/*   */   public final void reset() {
/*   */     this.I4 = 0;
/*   */     this.COm2 = 0.0F;
/*   */     this.zp = Float.MAX_VALUE;
/*   */     this.jw0 = -3.4028235E38F;
/*   */     this.wK = 0.0F;
/*   */     this.zL0 = 0.0F;
/*   */     this.Ol = 0.0F;
/*   */     m50 m501;
/*   */     if ((m501 = this.PA0) != null) {
/*   */       this.pg0 = 0;
/*   */       byte b;
/*   */       float[] arrayOfFloat;
/*   */       for (this.fe0 = 0, b = 0; b < (arrayOfFloat = this.sl0).length; ) {
/*   */         arrayOfFloat[b] = 0.0F;
/*   */         b++;
/*   */       } 
/*   */       getClass();
/*   */     } 
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return B40.df("FloatCounter{count=").append(this.I4).append(", total=").append(this.COm2).append(", min=").append(this.zp).append(", max=").append(this.jw0).append(", average=").append(this.wK).append(", latest=").append(this.zL0).append(", value=").append(this.Ol).append('}').toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/p90.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */