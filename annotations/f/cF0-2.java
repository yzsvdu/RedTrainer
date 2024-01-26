/*  1 */ package f;public final class cF0 implements Runnable { public final void run() { zD0 zD01; MM mM; if ((mM = (zD01 = this.yF0).qk)
/*  2 */       .Wk0 >= 1) { mM = null; nV nV; if (mM
/*  3 */         .AC && (
/*    */ 
/*    */ 
/*    */         
/*  7 */         nV = nV.Y4((byte)(this.L00.Wa0.go - 1))) == null) { km.u4.Pq(Ml0.OH0(5618)); } else { byte b = -1; if (this.qk
/*  8 */           .YB0 && (
/*    */ 
/*    */           
/* 11 */           b = (byte)(this.ro.Wa0.go - 1)) < 0)
/* 12 */         { km.u4.Pq(Ml0.OH0(5623)); } else { Lw lw; this(); if (this.qk
/* 13 */             .com5 > 0) { byte b2 = 0; while (b2 < 
/* 14 */               this.qk
/* 15 */               .com5)
/*    */             { WD wD;
/*    */               
/*    */               short s;
/* 19 */               if ((wD = this.o20[(this.Gy[b2]).Wa0.go]) != null && (
/* 20 */                 s = wD.HA) >= 1 && 
/* 21 */                 !lw.Fb(s)) lw
/*    */                   
/* 23 */                   .Ye0(wD.HA);  b2++; }  }  byte b1; if (lw
/* 24 */             .ir0 != (
/*    */             
/* 26 */             b1 = this.qk.com5))
/* 27 */           { km.u4.Pq(Ml0.Go(5619, Integer.toString(b1))); } else { Fm fm; this(); if (this.qk
/* 28 */               .ZA > 0)
/* 29 */             { hR[] arrayOfHR; int i; byte b3; for (i = (arrayOfHR = hR.Tt0).length, b3 = 0; b3 < i; )
/* 30 */               { hR hR; if (!(hR = arrayOfHR[b3]).NT && 
/*    */ 
/*    */                   
/* 33 */                   (this.Ug[hR.It0])
/* 34 */                   .TG0
/* 35 */                   .nm0()) fm
/*    */ 
/*    */ 
/*    */ 
/*    */                     
/* 40 */                     .ej((byte)(this.Vj0[hR.It0]).T8, hR);  b3++; }  }  byte b2; if (fm
/* 41 */               .ir0 != (
/*    */               
/* 43 */               b2 = this.qk.ZA))
/* 44 */             { km.u4.Pq(Ml0.Go(5620, Integer.toString(b2))); } else { Vg0 vg0 = new Vg0(); short[] arrayOfShort = lw.YH();
/*    */               
/* 46 */               hR[] arrayOfHR = new hR[fm.ir0]; Object[] arrayOfObject2; int k;
/* 47 */               for (int j = (arrayOfObject2 = fm.QG0).length; j-- > 0;) { if ((object = arrayOfObject2[j]) != zb0.IM && object != zb0.ET) { int n = k + 1; arrayOfHR[k] = (hR)object; k = n; }  }
/* 48 */                arrayOfHR = arrayOfHR; Object[] arrayOfObject1; byte[] arrayOfByte1, arrayOfByte2;
/*    */               int m;
/* 50 */               for (arrayOfByte1 = new byte[fm.ir0], arrayOfObject1 = fm.QG0, k = (arrayOfByte2 = fm.pC0).length, m = 0; k-- > 0;) { if ((object = arrayOfObject1[k]) != zb0.IM && object != zb0.ET) { int n = m + 1; arrayOfByte1[m] = arrayOfByte2[k]; m = n; }  }
/* 51 */                this(nV, b, arrayOfShort, arrayOfHR, arrayOfByte1);
/* 52 */               int i = this.Ok.bz0;
/* 53 */               b = this.Ok.Ly;
/*    */ 
/*    */               
/* 56 */               short s = this.ZF.dA0.w6;
/* 57 */               km.u4.mS(i, b, vg0, s, (byte)0);
/* 58 */               ra0(); }
/*    */              }
/*    */            }
/*    */          }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public cF0(zD0 paramzD0) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */