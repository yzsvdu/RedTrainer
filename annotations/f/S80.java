/* 1 */ package f;public final class S80 extends sK { public hR IL; public final boolean fy(Q90 paramQ90, UD0 paramUD0) { boolean bool; hR hR1; byte b; if ((hR1 = this.IL) != null && paramQ90 != null && (((b = this.ak) != 5) ? ((b != 6) ? ((b != 17) ? (b == 18 && paramQ90.Uu0(hR1) <= this.PN) : (paramQ90.Uu0(hR1) >= this.PN)) : (paramQ90.Hc(hR1) <= this.PN)) : (paramQ90.Hc(hR1) >= this.PN))) { bool = true; } else { bool = false; }  return bool; } public short PN; public S80(byte paramByte, hR paramhR, short paramShort) { super(paramByte); this.IL = paramhR; this.PN = paramShort; } public final int a7() { return this.PN; } public final void K10(ByteBuffer paramByteBuffer) { byte b; paramByteBuffer.put(this.ak); hR hR1; if ((hR1 = this.IL) == null) { b = 0; } else { b = b.dL; }  paramByteBuffer
/* 2 */       .put(b); paramByteBuffer.putShort(this.PN); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */