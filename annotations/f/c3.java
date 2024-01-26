/*  1 */ package f;public class c3 extends uB implements Nv0 { public pe0 E00; public c3() {} public c3(Texture paramTexture) { pe0 pe01; this(paramTexture); ew(this); } public final void ew(pe0 parampe0) { this.E00 = parampe0; if (parampe0 != null) { this
/*  2 */         .uz = parampe0.H0;
/*    */       
/*  4 */       this.B90 = parampe0.Vn0; }  }
/*  5 */   public c3(pe0 parampe0) { ew(parampe0); } public c3(c3 paramc3) { super(paramc3); ew(paramc3.E00); } public void JD(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { paramJX.Yo0(this.E00, paramFloat1, paramFloat2, paramFloat3, paramFloat4); } public void MF(JX paramJX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9) { paramJX.dR(this.E00, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8, paramFloat9); } public ES rG(Color paramColor) { pe0 pe01; if (pe01 = this.E00 instanceof P70) { this((P70)pe01); } else { this(pe01); }  ui0.vr(paramColor); float f = this.uz; ui0.Kf(f, this.B90); this(ui0); Ui0 ui0; rO.e = this.e;
/*    */     
/*  7 */     rO.jM = this.jM;
/*    */     
/*  9 */     rO.Ji = this.Ji;
/*    */     RO rO;
/* 11 */     (rO = new RO()).Xm0 = this.Xm0;
/*    */     return new RO(); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/c3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */