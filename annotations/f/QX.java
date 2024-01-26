/*  1 */ package f;public final class QX implements ob { public final Ou0 Gc0(Ou0 paramOu0, float paramFloat) { int i; float f1 = paramFloat * (i = this.tv0); if (paramFloat >= 1.0F) { i--; } else { i = (int)f1; }  f1 -= i; boolean bool; if (!(bool = this.Hm0)) i++;  Ou0 ou01 = this.Ua;
/*  2 */     int j = arrayOfOu0.length; float f2, f3 = (f2 = f1 * f1) * f1; Ou0 arrayOfOu0[], ou02 = (arrayOfOu0 = this.nw0)[i]; ((eo)paramOu0).getClass();
/*  3 */     ((eo)paramOu0).JL((eo)ou02)
/*  4 */       .uu(f3 * 1.5F - f2 * 2.5F + 1.0F); if (bool || i > 0)
/*  5 */     { ou02 = hH(arrayOfOu0[(j + i - 1) % j]).cm0(f3 * -0.5F + f2 - f1 * 0.5F);
/*  6 */       ((eo)paramOu0).zT((eo)ou02); }  if (bool || i < j - 1)
/*  7 */     { f1 = f3 * -1.5F; f1 = f2 * 2.0F + f1; Ou0 ou0 = hH(arrayOfOu0[(i + 1) % j]).cm0(f1 * 0.5F + f1);
/*  8 */       ((eo)paramOu0).zT((eo)ou0); }  if (bool || i < j - 2)
/*  9 */     { ou01 = hH(arrayOfOu0[(i + 2) % j]).cm0(f3 * 0.5F - f2 * 0.5F);
/* 10 */       ((eo)paramOu0).zT((eo)this); }  return paramOu0; }
/*    */ 
/*    */   
/*    */   public Ou0[] nw0;
/*    */   public boolean Hm0;
/*    */   public int tv0;
/*    */   public Ou0 Ua;
/*    */   public Ou0 TF0;
/*    */   public Ou0 cl;
/*    */   
/*    */   public QX() {}
/*    */   
/*    */   public QX(Ou0[] paramArrayOfOu0, boolean paramBoolean) {
/*    */     pQ(paramArrayOfOu0, paramBoolean);
/*    */   }
/*    */   
/*    */   public final void pQ(Ou0[] paramArrayOfOu0, boolean paramBoolean) {
/*    */     int i;
/*    */     if (this.Ua == null)
/*    */       this.Ua = paramArrayOfOu0[0].b3(); 
/*    */     if (this.TF0 == null)
/*    */       this.TF0 = paramArrayOfOu0[0].b3(); 
/*    */     if (this.cl == null)
/*    */       this.cl = paramArrayOfOu0[0].b3(); 
/*    */     this.nw0 = paramArrayOfOu0;
/*    */     this.Hm0 = paramBoolean;
/*    */     if (paramBoolean) {
/*    */       i = paramArrayOfOu0.length;
/*    */     } else {
/*    */       i = i.length - 3;
/*    */     } 
/*    */     this.tv0 = i;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QX.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */