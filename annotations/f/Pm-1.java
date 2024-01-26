/* 1 */ package f;public final class Pm extends Kl0 { public int cw0; public boolean[] lv; public final void sM() { if ((this
/* 2 */       .cw0 = this.Ws.getInt()) > 0) { int i; byte b; for (this
/*   */ 
/*   */         
/* 5 */         .oK = Xv0.tE(this.Ws.get(), false), this.lv = new boolean[i = R00()], this.UA0 = new int[i], b = 0; b < i; ) { boolean bool; this.UA0[b] = this
/* 6 */           .Ws.getInt();
/* 7 */         boolean[] arrayOfBoolean = this.lv; if (R00() == 1) { bool = true; } else { bool = false; }  arrayOfBoolean[b] = bool; b++; }  }  }
/* 8 */   public int[] UA0; public Xv0 oK; public Pm(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { lU lU1, lU2; ro ro = r8(); Xv0 xv0 = this.oK; int[] arrayOfInt = this.UA0; boolean[] arrayOfBoolean = this.lv; pA pA = ((R8)ro).YG0.MH0; int i; if ((i = this.cw0) <= 0 || arrayOfBoolean == null) { if ((lU1 = pA.La0) != null) {
/* 9 */         ra0(); pA.La0 = null;
/*   */       } 
/*   */       return; }
/*   */     
/*   */     lU lU3;
/*   */     if ((lU3 = pA.La0) == null) {
/*   */       this(i, (Xv0)this, arrayOfInt, arrayOfBoolean);
/*   */       pA.La0 = new lU();
/*   */       pA.J8(lU2);
/*   */       pA.La0.uh0(400, 175);
/*   */       pA.La0.mM();
/*   */       pA.La0.js0(et.Wi0);
/*   */     } else {
/*   */       lU2.Af(lU3);
/*   */       (lU1 = ((pA)lU2).La0).getClass();
/*   */       byte b = 0;
/*   */       while (b < arrayOfBoolean.length) {
/*   */         ge0 ge0 = this.SX[b];
/*   */         ge0.TG0.Fx0(arrayOfBoolean[b]);
/*   */         b++;
/*   */       } 
/*   */     }  }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */