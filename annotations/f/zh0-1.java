/* 1 */ package f;public final class zh0 extends Bw { public static zh0 Ac0 = U70.ah0.Ql0(); public final U70 jh0; public pe0 TD; public int oU; public int vC0; public final pe0 Uu0() { this
/* 2 */       .mk = zm0.u20; pe0 pe01;
/* 3 */     if ((pe01 = this.TD) != null) return pe01;  Bb0.DL0(this); this.jh0.lu(this); Texture texture = this.jh0.HA0(); if (this.Ys0 < 0) this.Ys0 = texture.getWidth();  if (this.Fj < 0) this.Fj = texture.getHeight();  int i = this.oU, j = this.vC0, k = this.Ys0, m = this.Fj; this(texture, i, j, k, m); this.TD = pe02; pe0 pe02; return pe02 = new pe0(); } public int Ys0; public int Fj; public zh0(U70 paramU70, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.jh0 = paramU70; this.oU = paramInt1; this.vC0 = paramInt2; this.Ys0 = paramInt3; this.Fj = paramInt4; } public final int zN() { return this.Ys0; } public final int IL() { return this.Fj; } public final void yM() { HashSet<?> hashSet; this.TD = null; this.jh0.mk = zm0.u20; this.jh0.gH0(this); /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashSet}, name=null} */ try { return; }
/* 4 */     finally { this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashSet<Wildcard{?}>}, name=null} */ }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void finalize() {
/*   */     yM();
/*   */     super.finalize();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */