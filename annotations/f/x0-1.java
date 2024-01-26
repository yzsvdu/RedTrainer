/* 1 */ package f;public final class x0 extends Kl0 { public static ByteArrayOutputStream wa0; public byte f60; public byte QE0; public int de; public boolean mv0; public byte[] Ig0; public x0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { boolean bool; if ((this
/* 2 */       .f60 = this.Ws.get()) == 2) return;  this
/*   */       
/* 4 */       .QE0 = this.Ws.get(); this.de = R00();
/* 5 */     if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  this
/* 6 */       .mv0 = bool; this.Ig0 = ee0(Gc0()); } public final void Cx() { if (this.f60 == 2) { if ((pA2 = ((R8)r8()).YG0.MH0) != null) Z20();  return; }  if (((x0)super).de == 0) wa0 = new ByteArrayOutputStream();  ByteArrayOutputStream byteArrayOutputStream; if ((byteArrayOutputStream = wa0) == null) return;  try { byteArrayOutputStream.write(((x0)super).Ig0); } catch (IOException iOException) { null.printStackTrace(); }  if (!((x0)super).mv0) return;  byte[] arrayOfByte = wa0.toByteArray(); wa0 = null; this(this, 0, this.length); pA pA2; ZH zH; ro ro = r8(); byte b = ((x0)super).QE0; pA pA1; if ((pA1 = ((R8)this).YG0.MH0) != null)
/* 7 */       mv0(zH, b);  }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/x0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */