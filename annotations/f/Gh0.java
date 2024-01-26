/* 1 */ package f;public final class Gh0 { public static void fG0(pe0 parampe0) { parampe0.G3
/* 2 */       .dispose(); }
/*   */ 
/*   */   
/*   */   public static pe0[] h40 = new pe0[9];
/*   */   public static ZH[] Ip0 = new ZH[9];
/*   */   public byte sc;
/*   */   public pe0[] Ru0 = h40;
/*   */   public wa[] jA0 = new wa[9];
/*   */   public ZH[] JX = Ip0;
/*   */   
/*   */   public final void gy() {
/*   */     Arrays.<ZH>stream(this.JX).filter(Objects::nonNull).forEach(Gh0::lz0);
/*   */     Arrays.<pe0>stream(this.Ru0).filter(Objects::nonNull).forEach(Gh0::fG0);
/*   */     for (byte b = 0; b < 9; b++) {
/*   */       this.JX[b] = null;
/*   */       this.jA0[b] = null;
/*   */       this.Ru0[b] = null;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */