/*  1 */ package f;public final class Ns { public final void W70(is0 paramis0, eo parameo) { parameo.eM(paramis0.pm); float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z; this.ud0++; G3 g3;
/*  2 */     float[] arrayOfFloat = (g3 = this.ax0).By0; int j;
/*  3 */     if ((j = this.ax0.NB0) + 2 >= arrayOfFloat.length) arrayOfFloat = g3.Jd0(Math.max(8, (int)(j * 1.75F)));  arrayOfFloat[i] = f1; arrayOfFloat[i + 1] = f2; arrayOfFloat[i + 2] = f3; int i; g3.NB0 = (i = g3.NB0) + 3; if (this
/*  4 */       .w6) { f2 = this.Zo0.x; f3 = this.Zo0.y; float f = this.Zo0.z; G3 g31;
/*  5 */       arrayOfFloat = (g31 = this.ax0).By0;
/*  6 */       if ((j = this.ax0.NB0) + 2 >= arrayOfFloat.length) arrayOfFloat = g31.Jd0(Math.max(8, (int)(j * 1.75F)));  arrayOfFloat[k] = f2; arrayOfFloat[k + 1] = f3; arrayOfFloat[k + 2] = f; int k; g31.NB0 = (k = g31.NB0) + 3; }  if (this
/*  7 */       .K70) { f2 = this.Qq0.r; f3 = this.Qq0.g; float f4 = this.Qq0.b, f5 = this.Qq0.a; G3 g31;
/*  8 */       float[] arrayOfFloat1 = (g31 = this.ax0).By0; int m;
/*  9 */       if ((m = this.ax0.NB0) + 3 >= arrayOfFloat1.length) arrayOfFloat1 = g31.Jd0(Math.max(8, (int)(m * 1.8F)));  arrayOfFloat1[k] = f2; arrayOfFloat1[k + 1] = f3; arrayOfFloat1[k + 2] = f4; arrayOfFloat1[k + 3] = f5; int k; g31.NB0 = (k = g31.NB0) + 4; }  if (this
/* 10 */       .BK0) { f2 = this.iG0.x; f3 = 1.0F - this.iG0.y; G3 g31;
/* 11 */       float[] arrayOfFloat1 = (g31 = this.ax0).By0; int m;
/* 12 */       if ((m = this.ax0.NB0) + 1 >= arrayOfFloat1.length) arrayOfFloat1 = g31.Jd0(Math.max(8, (int)(m * 1.75F)));  arrayOfFloat1[k] = f2; arrayOfFloat1[k + 1] = f3; int k; g31.NB0 = (k = g31.NB0) + 2; }  if (this
/* 13 */       .tO) { float f = this.ii.x; f2 = this.ii.y; G3 g31;
/* 14 */       float[] arrayOfFloat1 = (g31 = this.ax0).By0;
/* 15 */       if ((i = this.ax0.NB0) + 1 >= arrayOfFloat1.length) arrayOfFloat1 = g31.Jd0(Math.max(8, (int)(i * 1.75F)));  arrayOfFloat1[k] = f; arrayOfFloat1[k + 1] = f2; int k; g31.NB0 = (k = g31.NB0) + 2; }
/*    */      }
/*    */ 
/*    */   
/*    */   public eo Zo0 = new eo(Float.NaN, 0.0F, 0.0F);
/*    */   public NC0 iG0 = new NC0(Float.NaN, 0.0F);
/*    */   public Color Qq0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   public NC0 ii = new NC0();
/*    */   public boolean K70 = false;
/*    */   public boolean BK0 = false;
/*    */   public boolean w6 = false;
/*    */   public boolean tO = false;
/*    */   public G3 ax0 = new G3();
/*    */   public int ud0; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */