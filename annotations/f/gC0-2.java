/* 1 */ package f;public final class gC0 extends me { public final void Ad0(short[] paramArrayOfshort) { if (paramArrayOfshort.length < 1) return;  if (paramArrayOfshort[0] == 4705) { short s1 = paramArrayOfshort[2], s2 = paramArrayOfshort[3]; float f1 = s1, f2 = s2; NC0 nC01; (nC01 = this.mo0)
/* 2 */         .x = f1;
/* 3 */       this.mo0.y = f2; za za1;
/* 4 */       (za1 = this.G6[paramArrayOfshort[1]]).prn = f1 = ((this.Fs = paramArrayOfshort[4]) * -90); (this.G6[paramArrayOfshort[1]]).s8 = f1; nC02.getClass(); nC02
/* 5 */         .x = this.x; NC0 nC02; (nC02 = (this.G6[paramArrayOfshort[1]]).DY).y = this.y;
/* 6 */       this.G6[paramArrayOfshort[1]].n(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final short[][] xr;
/*   */   public static final short[][] Mo0;
/*   */   public static final short[][] hE;
/*   */   public static final short[][] nt;
/*   */   public za[] G6;
/*   */   
/*   */   public gC0(hB0 paramhB0) {
/*   */     super(paramhB0);
/*   */     pH pH;
/*   */     this.G6 = new za[3];
/*   */     za[] arrayOfZa;
/*   */     for (byte b = 0; b < (arrayOfZa = this.G6).length; b = (byte)(b + 1)) {
/*   */       za za1;
/*   */       this(this, b);
/*   */       arrayOfZa[b] = za1;
/*   */     } 
/*   */     this(this);
/*   */     int i = paramhB0.ev0();
/*   */     i = paramhB0.m00() * i;
/*   */     int j = paramhB0.jI0();
/*   */     j = paramhB0.uK0() * j;
/*   */     short s;
/*   */     for (s = 0; s < i; s = (short)(s + 1)) {
/*   */       short s1;
/*   */       for (s1 = 0; s1 < j; s1 = (short)(s1 + 1)) {
/*   */         xr0 xr0;
/*   */         if ((xr0 = paramhB0.G1(s, s1)).OB0() == 44)
/*   */           xr0.wu0(pH); 
/*   */       } 
/*   */     } 
/*   */   }
/*   */   
/*   */   static {
/*   */     short[] arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = -2;
/*   */     (new short[2])[1] = -3;
/*   */     (new short[8][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 2;
/*   */     (new short[2])[1] = -3;
/*   */     (new short[8][])[1] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = -3;
/*   */     (new short[2])[1] = -2;
/*   */     (new short[8][])[2] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 3;
/*   */     (new short[2])[1] = -2;
/*   */     (new short[8][])[3] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = -3;
/*   */     (new short[2])[1] = 4;
/*   */     (new short[8][])[4] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 3;
/*   */     (new short[2])[1] = 4;
/*   */     (new short[8][])[5] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = -2;
/*   */     (new short[2])[1] = 5;
/*   */     (new short[8][])[6] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 2;
/*   */     (new short[2])[1] = 5;
/*   */     xr = new short[][] { null, null, null, null, null, null, null, arrayOfShort };
/*   */     (arrayOfShort = new short[2])[0] = -2;
/*   */     (new short[2])[1] = -3;
/*   */     (new short[8][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 1;
/*   */     (new short[2])[1] = -3;
/*   */     (new short[8][])[1] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = -3;
/*   */     (new short[2])[1] = -2;
/*   */     (new short[8][])[2] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 2;
/*   */     (new short[2])[1] = -2;
/*   */     (new short[8][])[3] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = -3;
/*   */     (new short[2])[1] = 5;
/*   */     (new short[8][])[4] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 2;
/*   */     (new short[2])[1] = 5;
/*   */     (new short[8][])[5] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = -2;
/*   */     (new short[2])[1] = 6;
/*   */     (new short[8][])[6] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 1;
/*   */     (new short[2])[1] = 6;
/*   */     Mo0 = new short[][] { null, null, null, null, null, null, null, arrayOfShort };
/*   */     (arrayOfShort = new short[2])[0] = -2;
/*   */     (new short[2])[1] = -2;
/*   */     (new short[2][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 2;
/*   */     (new short[2])[1] = 4;
/*   */     hE = new short[][] { null, arrayOfShort };
/*   */     (arrayOfShort = new short[2])[0] = -2;
/*   */     (new short[2])[1] = -2;
/*   */     (new short[2][])[0] = arrayOfShort;
/*   */     (arrayOfShort = new short[2])[0] = 1;
/*   */     (new short[2])[1] = 5;
/*   */     nt = new short[][] { null, arrayOfShort };
/*   */   }
/*   */   
/*   */   public final void Ic0(float paramFloat) {
/*   */     za[] arrayOfZa;
/*   */     int i = (arrayOfZa = this.G6).length;
/*   */     for (byte b = 0; b < i; b++)
/*   */       arrayOfZa[b].n(); 
/*   */     super.Ic0(paramFloat);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */