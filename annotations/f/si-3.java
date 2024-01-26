/* 1 */ package f;public final class si extends Kl0 { public int ca; public byte c5; public byte iq; public si(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { this
/* 2 */       .ca = this.Ws.getInt();
/*   */     
/* 4 */     this.c5 = this.Ws.get();
/*   */     
/* 6 */     this.iq = this.Ws.get(); } public final void Cx() { hm0 hm0; Gp0 gp0; if ((gp0 = km.MR) != null && (hm0 = gp0.fa(this.ca)) != null) { byte b2 = this.c5, b3 = this.iq; arrayOfByte[b2] = b3; hm0.Hj0[b2] = b3; short[] arrayOfShort; byte[] arrayOfByte; if (((arrayOfByte = hm0.Bm0) != null) ? true : (((arrayOfShort = hm0.iz) != null && arrayOfShort[b2] > 0))) return;  }  hm0 = null; j40 j40; aq0[] arrayOfAq0; int i; byte b1; Uc0 uc0; aq0 aq0; for (i = (arrayOfAq0 = aq0.SL0).length, b1 = 0, aq0 = arrayOfAq0[b1]; b1 < i && ((uc0 = r8().s40(aq0)) == null || (j40 = uc0.de0(this.ca)) == null); b1++); if (j40 == null) return;  Q90 q90 = j40.Zs; q90.getClass(); byte b = (byte)nx0.Uw0(this.iq, 0, 100); q90.rI0[this.c5] = b; r8().W0(j40); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/si.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */