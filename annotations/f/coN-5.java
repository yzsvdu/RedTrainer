/* 1 */ package f;public final class coN extends Kl0 { public byte jh; public short Yb; public final void sM() { this
/* 2 */       .jh = this.Ws.get();
/*   */     
/* 4 */     this.Yb = this.Ws.getShort();
/*   */     
/* 6 */     this.aa0 = this.Ws.getShort(); if (this.jh == 0) this
/*   */         
/* 8 */         .aC0 = this.Ws.getShort();  } public short aC0; public short aa0; public coN(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { Ut0 ut0; (ut0 = km.a3.Im0).getClass(); for (Iterator iterator = (new mt(ut0)).iterator(); ((DA0)iterator).hasNext();) { if (kI = (KI)((iF0)iterator).AUX() instanceof Cy && ((Cy)(kI = kI)).br0.F70 == this.Yb) { if (this.jh == 1) { ((Cy)kI).zp = this.aa0; ((Cy)kI).IY = true; continue; }  short s1 = this.aC0, s2 = this.aa0;
/* 9 */         ((Cy)kI).Jb0.st(s1, s2); ((Cy)kI).IY = true; }
/*   */        }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/coN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */