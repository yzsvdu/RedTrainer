/* 1 */ package f;public final class FN { public final U70 zd0(short paramShort, int paramInt1, int paramInt2) { zh0[] arrayOfZh01; if (paramInt2 == 0) {
/* 2 */       if ((arrayOfZh01 = switch.TK.e4(paramShort, false, (byte)0)) == null) return null; 
/* 3 */       return (this[paramInt1]).jh0;
/*   */     }  U70[] arrayOfU702;
/*   */     byte b;
/* 6 */     for (arrayOfU702 = new U70[arrayOfZh02.length], b = 0; b < arrayOfZh02.length; ) { hZ hZ; if (!(hZ = UB0.vj0.aP("data/sprites/mounts/" + paramShort + "-" + b + ".png")).L0()) { arrayOfU702[b] = null; }
/* 7 */       else { U70 u701, u702 = (arrayOfZh02[b]).jh0;
/*   */         
/* 9 */         this(new d1(u702, hZ)); arrayOfU702[b] = u701; }  b++; }  ((FN)super).rM.Vh0(paramShort, arrayOfU702); U70[] arrayOfU701; zh0[] arrayOfZh02; return ((arrayOfU701 = (U70[])((FN)super).rM.Z90(paramShort)) != null) ? arrayOfU701[paramInt1] : (((arrayOfZh02 = switch.TK.e4(paramShort, false, (byte)0)) == null) ? null : arrayOfU702[paramInt1]); }
/*   */ 
/*   */   
/*   */   public static final FN tv = new FN();
/*   */   public qw0 E90;
/*   */   public qw0 rM;
/*   */   
/*   */   public FN() {
/*   */     qw0 qw01;
/*   */     this();
/*   */     this.E90 = this;
/*   */     this();
/*   */     this.rM = this;
/*   */   }
/*   */   
/*   */   public final float[][] zE0(short paramShort) {
/*   */     float[][] arrayOfFloat2;
/*   */     if ((arrayOfFloat2 = (float[][])this.E90.Z90(paramShort)) != null)
/*   */       return arrayOfFloat2; 
/*   */     hZ hZ;
/*   */     if (!(hZ = UB0.vj0.aP("data/sprites/mounts/" + paramShort + ".txt")).L0()) {
/*   */       arrayOfFloat1[1][0] = 9.0F;
/*   */       arrayOfFloat1[1][1] = 11.0F;
/*   */       arrayOfFloat1[0][0] = 9.0F;
/*   */       arrayOfFloat1[0][1] = 11.0F;
/*   */       arrayOfFloat1[3][0] = 12.0F;
/*   */       arrayOfFloat1[3][1] = 11.0F;
/*   */       arrayOfFloat1[2][0] = 7.0F;
/*   */       arrayOfFloat1[2][1] = 11.0F;
/*   */       this.E90.Vh0(paramShort, arrayOfFloat1);
/*   */       return arrayOfFloat1 = new float[4][2];
/*   */     } 
/*   */     float[][] arrayOfFloat1 = new float[4][2];
/*   */     String[] arrayOfString = arrayOfFloat1.QM("UTF-8").split("\r?\n");
/*   */     for (byte b = 0; b < arrayOfString.length && b < 4; b++) {
/*   */       String[] arrayOfString1;
/*   */       if ((arrayOfString1 = arrayOfString[b].split(",")).length == 2) {
/*   */         arrayOfFloat1[b][0] = Float.parseFloat(arrayOfString1[0]);
/*   */         arrayOfFloat1[b][1] = Float.parseFloat(arrayOfString1[1]);
/*   */       } 
/*   */     } 
/*   */     this.E90.Vh0(paramShort, arrayOfFloat1);
/*   */     return arrayOfFloat1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */