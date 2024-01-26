/* 1 */ package f;public final class Lm0 extends Kl0 { public byte iv0; public boolean FT; public short yo; public final void sM() { this
/* 2 */       .iv0 = this.Ws.get(); if (R00() == 1) { b = 1; } else { b = 0; }  this.FT = b; this
/*   */       
/* 4 */       .yo = this.Ws.getShort(); byte b;
/*   */     qa0[] arrayOfQa0;
/* 6 */     for (this.iW = this.Ws.getInt(), this.s80 = new qa0[R00()], b = 0; b < (arrayOfQa0 = this.s80).length; ) { arrayOfQa0[b] = OH(); b++; }  } public int iW; public qa0[] s80; public Lm0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { ro ro = r8(); byte b = this.iv0; boolean bool = this.FT; short s = this.yo; int i = this.iW; qa0[] arrayOfQa0 = this.s80; this.Ey.r1(s, i); pA pA; ep ep; if ((pA = ((R8)this).YG0.MH0) != null && (ep = this.aV) != null && this.Xu0[bool] == b && arrayOfQa0 != null) if (bool) { this.gE.Yi(arrayOfQa0); } else { this.Yf.Yi(arrayOfQa0); }
/*   */         }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */