/*  1 */ package f;public final class NQ extends Kl0 { public byte Vz0; public int GG; public short rw; public byte l7; public short o10; public byte TV; public byte r90; public short za; public short Qj; public int Ud; public m9 KR; public short E4; public short O80; public mA[] lb0 = mA.qv0; public NQ(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { this
/*  2 */       .Vz0 = b; byte b; if (((b = this.Ws.get()) | 0x1) == b) this
/*    */         
/*  4 */         .GG = this.Ws.getInt();  if (((b = this.Vz0) | 0x2) == b) { this
/*    */         
/*  6 */         .rw = this.Ws.getShort();
/*    */       
/*  8 */       this.l7 = this.Ws.get(); }  if (((b = this.Vz0) | 0x4) == b) this
/*    */         
/* 10 */         .o10 = this.Ws.getShort();  if (((b = this.Vz0) | 0x8) == b) { this
/*    */         
/* 12 */         .TV = this.Ws.get();
/*    */       
/* 14 */       this.r90 = this.Ws.get(); }  if (((b = this.Vz0) | 0x10) == b) { this
/*    */         
/* 16 */         .za = this.Ws.getShort();
/*    */       
/* 18 */       this.Qj = this.Ws.getShort(); }  if (((b = this.Vz0) | 0x20) == b) this
/*    */         
/* 20 */         .Ud = this.Ws.getInt();  if (((b = this.Vz0) | 0x40) == b && (
/*    */       
/* 22 */       this.KR = m9.a8(this.Ws.get())) != m9.Bt0) { this
/*    */         
/* 24 */         .E4 = this.Ws.getShort();
/*    */       
/* 26 */       this.O80 = this.Ws.getShort(); }  if (((b = this.Vz0) | Byte.MIN_VALUE) == b) { mA[] arrayOfMA; for (this
/*    */         
/* 28 */         .lb0 = new mA[this.Ws.get()], b = 0; b < (arrayOfMA = this.lb0).length; ) { arrayOfMA[b] = 
/*    */           
/* 30 */           mA.qq(this.Ws.get()); b++; }  }  } public final void Cx() { fH0 fH0; if ((fH0 = (r8()).Lz) == null) return;  short s = 0; byte b4; if (((b4 = this.Vz0) | 0x1) == b4) { fH0.Ii = this.GG; s = 1; }  short s1 = this.rw; byte b5 = this.l7; (r8()).Lz.vv0 = s1; (r8()).Lz.wj = b5; kf kf; Wl wl; if ((b4 | 0x2) == b4 && (wl = km.wI0.K7) != null && (kf = wl.LW) != null) kf.X00();  byte b3; if (((b3 = this.Vz0) | 0x4) == b3) { if ((s = this.o10) > 9999) s = 9999;  fH0.aY = s; s = 1; }  fH0.m4 = this.TV; fH0.wm0 = this.r90; R8 r82; pA pA2; if ((b3 | 0x8) == b3 && (pA2 = (r82 = (R8)r8()).YG0.MH0) != null && pA2.dk0 != null) { boolean bool1 = false; UB0.Kg0.fN(new NP(pA2, bool1)); boolean bool2 = true; pA pA; (pA = r82.YG0.MH0).getClass(); UB0.Kg0.fN(new NP(pA, bool2)); }  byte b2; if (((b2 = this.Vz0) | 0x10) == b2) { short s2 = this.za, s3 = this.Qj; fH0.rH0 = s2; fH0.f6 = s3; }  if ((b2 | 0x20) == b2) { fH0.NC0 = this.Ud; s = 1; }  if ((b2 | 0x40) == b2)
/* 31 */     { m9 m91 = this.KR; short s2 = this.E4, s3 = this.O80;
/* 32 */       fH0.YN = m91; fH0.fa0 = s2; fH0.Cr = s3; }  R8 r81; pA pA1; if (s != 0 && (
/*    */ 
/*    */       
/* 35 */       pA1 = (r81 = (R8)r8()).YG0.MH0) != null) {
/* 36 */       N0 n0; if ((n0 = pA1.Rz0) != null) n0
/* 37 */           .update(); 
/*    */       hI0 hI0;
/* 39 */       if ((hI0 = r81.YG0.MH0.hG) != null) hI0
/* 40 */           .Di(); 
/*    */       YC yC;
/* 42 */       if ((yC = r81.YG0.MH0.dS) != null) yC
/* 43 */           .DS(); 
/* 44 */     }  byte b1; if (((b1 = this.Vz0) | Byte.MIN_VALUE) == b1) { Object object; mA[] arrayOfMA = this.lb0; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */