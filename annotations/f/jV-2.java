/* 1 */ package f;public final class jV { public final void Px0(Wo paramWo) { this.og0 = paramWo;
/* 2 */     this(paramWo.TI.B8("/a/1/3/1")); ig ig; byte b; for (b = 0; b < 6; ) { U70 u70; int i = b * 2 + 6; this(new go0(ig, b, i)); this.HE[b] = u70; b++; }  for (b = 0; b < 6; ) { U70 u70; int i = b + 18, j = b * 2 + 24; this(new xL0(ig, i, j)); this.Yo[b] = u70; b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final jV mg = new jV();
/*   */   public static int aux = 0;
/*   */   public Wo og0;
/*   */   public U70[] HE = new U70[6];
/*   */   public U70[] Yo = new U70[6];
/*   */   
/*   */   public final ja0 w(int paramInt) {
/*   */     return new ja0(this.og0, paramInt);
/*   */   }
/*   */   
/*   */   public final U70 L4(int paramInt) {
/*   */     if (paramInt < 0 || paramInt > this.HE.length)
/*   */       paramInt = 0; 
/*   */     return this.HE[paramInt];
/*   */   }
/*   */   
/*   */   public final U70 MW(int paramInt) {
/*   */     if (paramInt < 0 || paramInt > this.Yo.length)
/*   */       paramInt = 0; 
/*   */     return this.Yo[paramInt];
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */