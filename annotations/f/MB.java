/* 1 */ package f;public final class MB extends Kl0 { public int Sz0; public byte mr0; public MB(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { this
/* 2 */       .Sz0 = this.Ws.getInt();
/*   */     
/* 4 */     this.mr0 = this.Ws.get(); } public final void Cx() { yM[] arrayOfYM; int i; byte b; for (i = (arrayOfYM = yM.tZ).length, b = 0; b < i; ) { yM yM = arrayOfYM[b]; zr0 zr0; Y y; if ((zr0 = r8().gN(yM)) != null && (y = zr0.u60(this.Sz0)) != null) y.Lh.Nj = this.mr0;  b++; }  r8().ow(); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */