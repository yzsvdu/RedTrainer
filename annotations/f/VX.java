/* 1 */ package f;public final class VX extends Kl0 { public int ll; public boolean[] u5; public final void sM() { for (byte b = this.Ws.get(), 
/* 2 */       b = 0; b < this.ll; ) { boolean bool; boolean[] arrayOfBoolean = this.u5; if (R00() == 1) { bool = true; } else { bool = false; }  arrayOfBoolean[b] = bool; this.u6[b] = Gc0(); b++; }  } public int[] u6; public VX(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { Gp0 gp0; if ((gp0 = km.MR) != null) { if (gp0.gt == null) { byte b1; Fs[] arrayOfFs; for (gp0.gt = new Fs[gp0.ta0.length], b1 = 0; b1 < (arrayOfFs = gp0.gt).length; ) { Fs fs; this(); arrayOfFs[b1] = fs; byte b2 = (byte)(b1 + 1); }  }  byte b = 0; while (b < this
/* 3 */         .ll) {
/* 4 */         Fs fs, arrayOfFs[]; if ((arrayOfFs = km.MR.gt) == null) { arrayOfFs = null; }
/* 5 */         else { fs = arrayOfFs[b]; }
/* 6 */          int i = this.u6[b]; fs
/* 7 */           .DP = bool;
/* 8 */         fs.jt0 = i; boolean bool; if (bool = this.u5[b]) { fs.zz = (int)(System.currentTimeMillis() / 1000L); fs.js0 = fs.yy0() - 1; } else { fs.js0 = -1; }  b = (byte)(b + 1);
/*   */       }  }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/VX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */