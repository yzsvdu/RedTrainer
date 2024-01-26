/* 1 */ package f;public final class Nb0 extends Kl0 { public int zw0; public LPT1[] PO; public ZY lpT9 = ZY.ih; public boolean Nf = false; public Nb0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { this
/* 2 */       .zw0 = this.Ws.getInt(); byte b; byte b1;
/*   */     LPT1[] arrayOfLPT1;
/* 4 */     for (this.PO = new LPT1[(b = this.Ws.get()) & 0x3F], b1 = 0; b1 < (arrayOfLPT1 = this.PO).length; ) { arrayOfLPT1[b1] = Ac(); b1++; }  if ((b & 0x40) != 0) { b1 = 1; } else { b1 = 0; }  this.Nf = b1; if ((b & 0x80) != 0) this
/*   */ 
/*   */         
/* 7 */         .lpT9 = (ZY)ZY.MX.Ha0(this.Ws.get());  } public final void Cx() { ue0 ue0; String str1; int i = this.zw0; LPT1[] arrayOfLPT1 = this.PO; String str2; if ((str2 = (String)Ml0.nW.Z6(i)) == null) { str1 = XD0.SD0("STRING_", i); } else { str1 = Ml0.Lj(Ml0.CoM2(str2, arrayOfLPT1)); }  Gp0 gp0; if (this.Nf && (gp0 = km.MR) != null) { this(str1); gp0.W.add(this); return; }  if (((Nb0)super).lpT9 == ZY.ih && km.MR == null) { r8().Pq(str1); } else { r8().Sg(new Mv0(((Nb0)super).lpT9, 0, "", null, (byte)0, str1)); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */