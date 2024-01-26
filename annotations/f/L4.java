/* 1 */ package f;public final class L4 extends Kl0 { public short[] Zb0; public final void sM() { byte b; byte b1; for (this
/* 2 */       .Zb0 = new short[b = this.Ws.get()], this.coN = new int[b], b1 = 0; b1 < b; ) { this.Zb0[b1] = this
/* 3 */         .Ws.getShort();
/* 4 */       this.coN[b1] = this
/* 5 */         .Ws.getInt();
/* 6 */       b1++; }  } public int[] coN; public L4(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { short[] arrayOfShort = this.Zb0; int[] arrayOfInt = this.coN; km.u4.I6 = this; km.u4.uv0 = arrayOfInt; js.vu0.MH0.WH.kX(this, arrayOfInt); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/L4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */