/* 1 */ package f;public final class DF0 extends me { public final void Ad0(short[] paramArrayOfshort) { if (paramArrayOfshort.length < 1) return;  short s; if ((s = paramArrayOfshort[0]) != 442) { if (s == 443) { this.tg.yk(0); this.tg.Yp0 = 1; }  } else { if (paramArrayOfshort.length < 5) return;  int i; for (s = 0, i = 0; i < 4; ) { int j; if (paramArrayOfshort[j = i + 1] != 0) { this.EJ0[i].rd(1, true, null); s++; } else { this
/* 2 */             .EJ0[i]
/* 3 */             .rd(2, true, null); }  i = j; }  if (s >= 4) { this
/* 4 */           .hr
/* 5 */           .rd(0, true, null);
/* 6 */         this.b2
/* 7 */           .rd(0, true, null); }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final float[] Dz0 = new float[] { 32.0F, 42.0F, 0.0F, -10.0F };
/*   */   public static final byte[] Q6 = new byte[] { 0, 0 };
/*   */   public lpt1 hr;
/*   */   public lpt1 b2;
/*   */   public lpt1[] EJ0 = new lpt1[4];
/*   */   public x20 tg;
/*   */   
/*   */   public DF0(pI parampI) {
/*   */     super(parampI);
/*   */     Ve0.Mw().getClass();
/*   */     lpt1 lpt11 = Ve0.CoM5();
/*   */     float[] arrayOfFloat1 = Dz0;
/*   */     byte[] arrayOfByte = Q6;
/*   */     (this.tg = new x20(this, lpt11, 0, arrayOfFloat1, arrayOfByte, 0, false)).Ch0 = false;
/*   */     kc((new x20(this, lpt11, 0, arrayOfFloat1, arrayOfByte, 0, false)).m50);
/*   */     Ve0.Mw().getClass();
/*   */     this.b2 = lpt11 = Ve0.nw0();
/*   */     lpt11.mh.bb0(8.0F, 0.0F, 10.5F);
/*   */     kc(this.b2);
/*   */     (arrayOfFloat1 = new float[2])[0] = 26.0F;
/*   */     (new float[2])[1] = 44.0F;
/*   */     float[][] arrayOfFloat;
/*   */     (arrayOfFloat = new float[4][])[0] = arrayOfFloat1;
/*   */     (arrayOfFloat1 = new float[2])[0] = 26.0F;
/*   */     (new float[2])[1] = 37.0F;
/*   */     (new float[4][])[1] = arrayOfFloat1;
/*   */     (arrayOfFloat1 = new float[2])[0] = 34.0F;
/*   */     (new float[2])[1] = 44.0F;
/*   */     (new float[4][])[2] = arrayOfFloat1;
/*   */     (arrayOfFloat1 = new float[2])[0] = 34.0F;
/*   */     (new float[2])[1] = 37.0F;
/*   */     (new float[4][])[3] = arrayOfFloat1;
/*   */     for (byte b = 0; b < 4; b++) {
/*   */       Ve0.Mw().getClass();
/*   */       this.EJ0[b] = Ve0.ig();
/*   */       float f1 = arrayOfFloat[b][0] * 0.25F;
/*   */       float f2 = arrayOfFloat[b][1] * 0.25F;
/*   */       (this.EJ0[b]).mh.bb0(f1, 0.0F, f2);
/*   */       this.EJ0[b].ml0(2, true);
/*   */       kc(this.EJ0[b]);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void Ic0(float paramFloat) {
/*   */     super.Ic0(paramFloat);
/*   */     this.tg.x9();
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     super.dispose();
/*   */     vh0 vh0;
/*   */     if ((vh0 = km.a3) == null)
/*   */       return; 
/*   */     Jo jo;
/*   */     if ((jo = this.Ct) != null) {
/*   */       this.pm.getClass();
/*   */       eo eo = eo.Zero;
/*   */       this.pm.KC(null, false, this);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */