/*  1 */ package f;public final class dl0 extends Kl0 { public byte[] jb0; public int[] COm7; public final void sM() { int i; byte b; for (this.jb0 = new byte[i = R00()], this.COm7 = new int[i], this.tm0 = new short[i], b = 0; b < i; ) { this.jb0[b] = this.Ws.get(); this
/*  2 */         .COm7[b] = this
/*  3 */         .Ws.getInt();
/*  4 */       this.tm0[b] = this
/*  5 */         .Ws.getShort();
/*  6 */       b++; }  } public short[] tm0; public dl0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { byte[] arrayOfByte; for (byte b = 0; b < (arrayOfByte = this.jb0).length; ) { LPT5 lPT5 = LPT5.tD0; iq iq; if ((iq = (iq)lPT5.EJ0.Ha0(arrayOfByte[b])) != null) { short s = this.tm0[b]; iq.Vz = this.COm7[b]; iq.MW = s; }  b++; }
/*    */      ak ak;
/*  8 */     (ak = LPT5.tD0.EJ0)
/*  9 */       .getClass();
/*    */     
/* 11 */     for (Iterator iterator = (new Ux(ak)).iterator(); ((DA0)iterator).hasNext(); ) {
/* 12 */       iq iq; byte b1 = (iq = (iq)((D70)iterator).Zp()).YB0;
/*    */       byte[] arrayOfByte1;
/* 14 */       int i = (arrayOfByte1 = this.jb0).length; byte b2 = 0; while (true) { if (b2 < i) { if (arrayOfByte1[b2] == b1) { b1 = 1; break; }  b2++; continue; }  b1 = 0; break; }  if (b1 == 0) { iq
/* 15 */           .Vz = 0; iq.MW = 0; }
/*    */     
/*    */     }  je je; pA pA;
/* 18 */     if ((pA = ((R8)r8()).YG0.MH0) != null && (
/* 19 */       je = this.G0) != null)
/* 20 */       update();  }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */