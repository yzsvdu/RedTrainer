/* 1 */ package f;public final class Ob extends Kl0 { public byte Ax; public final void sM() { boolean bool; this
/* 2 */       .Ax = (byte)(this.Ws.get() & Byte.MAX_VALUE); if ((this.Ws.get() & 0x80) != 0) { bool = true; } else { bool = false; }  this.Ru0 = bool; } public boolean Ru0; public Ob(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { Gp0 gp0; if ((gp0 = km.MR) != null) { byte b = this.Ax; boolean bool = this.Ru0; gp0.py0[b] = bool; gp0.tr0[b] = null;
/* 3 */       gp0.Zu = false; gp0.z9 = 0;
/* 4 */       gp0.hl0 = false; }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */