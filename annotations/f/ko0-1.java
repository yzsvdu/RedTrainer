/* 1 */ package f;public final class ko0 extends me { public final void dispose() { super.dispose(); vh0 vh0; if ((vh0 = km.a3) == null) return;  Jo jo; if ((jo = this.Ct) != null) { this
/* 2 */         .pm
/* 3 */         .getClass();
/* 4 */       eo eo = eo.Zero; this.pm.KC(null, false, this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final float[][] UK;
/*   */   public static final byte[][] rn;
/*   */   public static int[] hC0 = new int[] { 0, 1, 0, 1, 1, 0, 1 };
/*   */   public x20[] Jt0 = new x20[7];
/*   */   public lpt1 sa0;
/*   */   public float my = 0.0F;
/*   */   
/*   */   public ko0(pI parampI) {
/*   */     super(parampI);
/*   */     byte b = 0;
/*   */     float[][] arrayOfFloat = UK;
/*   */     while (b < 7) {
/*   */       x20 x201;
/*   */       byte[] arrayOfByte = rn[b];
/*   */       int i = hC0[b];
/*   */       this(this, b, arrayOfFloat[b], arrayOfByte, i, true);
/*   */       kc((new x20()).m50);
/*   */       this.Jt0[b] = x201;
/*   */       LpT5(b);
/*   */       b++;
/*   */     } 
/*   */     Ve0.Mw().getClass();
/*   */     lpt1 lpt11 = Ve0.RY();
/*   */     this.mh.bb0(3.875F, -9.9375F, 6.0F);
/*   */     kc(this.sa0);
/*   */   }
/*   */   
/*   */   public final void Ic0(float paramFloat) {
/*   */     for (byte b = 0; b < 7; b++)
/*   */       this.Jt0[b].x9(); 
/*   */     super.Ic0(paramFloat);
/*   */   }
/*   */   
/*   */   public final void Ad0(short[] paramArrayOfshort) {
/*   */     x20 x201;
/*   */     int i;
/*   */     if (paramArrayOfshort.length < 1)
/*   */       return; 
/*   */     switch (paramArrayOfshort[0]) {
/*   */       default:
/*   */         return;
/*   */       case 402:
/*   */         if (paramArrayOfshort.length < 2)
/*   */           return; 
/*   */         this.Jt0[6].yk(paramArrayOfshort[1]);
/*   */         x201 = this.Jt0[6];
/*   */         if (paramArrayOfshort[1] == 1) {
/*   */           bool2 = false;
/*   */         } else {
/*   */           bool2 = true;
/*   */         } 
/*   */         this.Yp0 = bool2;
/*   */       case 401:
/*   */         if (bool2.length < 7)
/*   */           return; 
/*   */         i = 0;
/*   */         while (i < 6)
/*   */           ((ko0)super).Jt0[i].yk(bool2[++i]); 
/*   */       case 400:
/*   */         break;
/*   */     } 
/*   */     if (bool2.length < 3)
/*   */       return; 
/*   */     boolean bool1 = bool2[1];
/*   */     boolean bool2 = bool2[2];
/*   */     (((ko0)super).Jt0[bool1]).Yp0 = bool2;
/*   */   }
/*   */   
/*   */   public final void LpT5(int paramInt) {
/*   */     for (byte b = 0; b < 2; ) {
/*   */       byte[] arrayOfByte;
/*   */       if ((arrayOfByte = rn[paramInt])[0] != arrayOfByte[1]) {
/*   */         pq pq;
/*   */         byte b1 = arrayOfByte[b];
/*   */         this(this.Jt0[paramInt], b);
/*   */         int i, j;
/*   */         byte b2;
/*   */         for (i = (int)(UK[paramInt][0] - 1.0F), j = (int)UK[paramInt][1], b2 = 0; b2 < 5; ) {
/*   */           for (byte b3 = 0; b3 < 3; ) {
/*   */             int k = b2 + i;
/*   */             ((il)this.im0.v50(k, b3 + j, b1)).gl = pq;
/*   */             b3++;
/*   */           } 
/*   */           b2++;
/*   */         } 
/*   */       } 
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   static {
/*   */     float[] arrayOfFloat;
/*   */     (arrayOfFloat = new float[4])[0] = 19.0F;
/*   */     (new float[4])[1] = 24.0F;
/*   */     (new float[4])[2] = 50.0F;
/*   */     (new float[4])[3] = 40.0F;
/*   */     (new float[7][])[0] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[4])[0] = 19.0F;
/*   */     (new float[4])[1] = 20.0F;
/*   */     (new float[4])[2] = 50.0F;
/*   */     (new float[4])[3] = 40.0F;
/*   */     (new float[7][])[1] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[4])[0] = 9.0F;
/*   */     (new float[4])[1] = 24.0F;
/*   */     (new float[4])[2] = 40.0F;
/*   */     (new float[4])[3] = 30.0F;
/*   */     (new float[7][])[2] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[4])[0] = 14.0F;
/*   */     (new float[4])[1] = 24.0F;
/*   */     (new float[4])[2] = 40.0F;
/*   */     (new float[4])[3] = 30.0F;
/*   */     (new float[7][])[3] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[4])[0] = 9.0F;
/*   */     (new float[4])[1] = 20.0F;
/*   */     (new float[4])[2] = 50.0F;
/*   */     (new float[4])[3] = 30.0F;
/*   */     (new float[7][])[4] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[4])[0] = 14.0F;
/*   */     (new float[4])[1] = 20.0F;
/*   */     (new float[4])[2] = 50.0F;
/*   */     (new float[4])[3] = -59.0F;
/*   */     (new float[7][])[5] = arrayOfFloat;
/*   */     (arrayOfFloat = new float[4])[0] = 14.0F;
/*   */     (new float[4])[1] = 24.0F;
/*   */     (new float[4])[2] = 70.0F;
/*   */     (new float[4])[3] = 50.0F;
/*   */     UK = new float[][] { null, null, null, null, null, null, arrayOfFloat };
/*   */     byte[] arrayOfByte;
/*   */     (arrayOfByte = new byte[2])[0] = 3;
/*   */     (new byte[2])[1] = 2;
/*   */     (new byte[7][])[0] = arrayOfByte;
/*   */     (arrayOfByte = new byte[2])[0] = 3;
/*   */     (new byte[2])[1] = 2;
/*   */     (new byte[7][])[1] = arrayOfByte;
/*   */     (arrayOfByte = new byte[2])[0] = 2;
/*   */     (new byte[2])[1] = 1;
/*   */     (new byte[7][])[2] = arrayOfByte;
/*   */     (arrayOfByte = new byte[2])[0] = 2;
/*   */     (new byte[2])[1] = 1;
/*   */     (new byte[7][])[3] = arrayOfByte;
/*   */     (arrayOfByte = new byte[2])[0] = 3;
/*   */     (new byte[2])[1] = 1;
/*   */     (new byte[7][])[4] = arrayOfByte;
/*   */     (arrayOfByte = new byte[2])[0] = 3;
/*   */     (new byte[2])[1] = 0;
/*   */     (new byte[7][])[5] = arrayOfByte;
/*   */     (arrayOfByte = new byte[2])[0] = 3;
/*   */     (new byte[2])[1] = 3;
/*   */     rn = new byte[][] { null, null, null, null, null, null, arrayOfByte };
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ko0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */