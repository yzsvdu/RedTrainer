/*  1 */ package f;public final class Lb0 extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { Gp0 gp0 = paramkf.AD;
/*    */     
/*    */     hm0[] arrayOfHm01, arrayOfHm02;
/*    */     
/*  5 */     for (arrayOfHm02 = new hm0[(arrayOfHm01 = gp0.cl[this.eV]).length], paramBoolean2 = false; paramBoolean2 < arrayOfHm01.length; ) { hm0 hm01; if ((hm01 = arrayOfHm01[this.Wy[paramBoolean2]]) != null) hm01
/*  6 */           .ws = (byte)paramBoolean2;  arrayOfHm02[paramBoolean2] = hm01;
/*  7 */       paramBoolean2++; }  byte b = this.eV; hm0[][] arrayOfHm0;
/*  8 */     if ((arrayOfHm0 = gp0.cl) != null) arrayOfHm0[b] = arrayOfHm02; 
/*  9 */     this(this, paramkf, arrayOfHm02); AZ aZ;
/* 10 */     paramkf.YP.add(aZ); }
/*    */ 
/*    */   
/*    */   public final byte eV;
/*    */   public final byte[] Wy;
/*    */   
/*    */   public Lb0(byte paramByte, byte[] paramArrayOfbyte) {
/*    */     this.eV = paramByte;
/*    */     this.Wy = paramArrayOfbyte;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return 106;
/*    */   }
/*    */   
/*    */   public final boolean Lt() {
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */