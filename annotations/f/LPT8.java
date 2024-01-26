/* 1 */ package f;public final class LPT8 extends Sp0 { public final zh0[] VC(byte paramByte1, byte paramByte2) { zh0[] arrayOfZh01; if ((arrayOfZh01 = this.DK0) != null) return arrayOfZh01;
/*   */     
/* 3 */     int i = (gT()).Con.ju / paramByte1;
/*   */     
/* 5 */     int j = (gT()).Con.Og0 / paramByte2; gT().dispose(); zh0[] arrayOfZh02 = new zh0[paramByte2 * paramByte1]; this(new AE(this)); U70 u70; for (byte b = 0; b < paramByte1; ) { for (byte b1 = 0; b1 < paramByte2; ) { int k = b * i; arrayOfZh02[b1 * paramByte1 + b] = new zh0(u70, k, b1 * j, i, j); b1++; }  b++; }  this.DK0 = arrayOfZh02; return arrayOfZh02; }
/*   */ 
/*   */   
/*   */   public static final ik oT = C00.gd(LPT8.class);
/*   */   public static final ik Er0 = C00.R4("mod");
/*   */   public zh0[] DK0 = null;
/*   */   
/*   */   public LPT8(RD0 paramRD0) {
/*   */     super(paramRD0);
/*   */   }
/*   */   
/*   */   public final ZH gT() {
/*   */     try {
/*   */       return new ZH(this.YL0);
/*   */     } catch (Exception exception) {
/*   */       oT.error(B40.df("Error loading png ").append(this.YL0.rw()).toString(), exception);
/*   */       Er0.error(B40.df("Error loading png ").append(this.YL0.rw()).toString(), exception);
/*   */       JU jU = (JU)exception;
/*   */       km.VH.getClass();
/*   */       if (!Yj.LpT5(this))
/*   */         return GD0.lH; 
/*   */       throw exception;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPT8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */