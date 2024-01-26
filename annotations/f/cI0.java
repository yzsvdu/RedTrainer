/*    */ package f;
/*  2 */ public final class cI0 extends Kl0 { public mK eL0; public int bF; public cI0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { if ((this.eL0 = mK.bh(this.Ws.get())) == mK.t5) this
/*    */         
/*  4 */         .bF = this.Ws.getInt();  } public final void Cx() { ro ro = r8(); int i = this.bF; (ro = ro).getClass(); mK mK1; int j; if ((j = (mK1 = this.eL0).ordinal()) != 0 && j != 9) { pA pA; B80 b80; if ((b80 = (pA = ((R8)ro).YG0.MH0).KI0) != null) { b80.ra0(); pA.KI0 = null; }
/*    */        }
/*    */     else
/*    */     { B80 b801; pA pA; B80 b802;
/*  8 */       if ((b802 = (pA = ((R8)ro).YG0.MH0).KI0) == null)
/*  9 */       { this(); pA.KI0 = new B80(); pA.J8(b801); pA.KI0.mM(); pA.KI0.QJ0(et.F30, 0, -50); } else { b801.Af(b802); }
/*    */        }
/* 11 */      ((R8)ro).YG0
/* 12 */       .Pu(-1, this); String str;
/* 13 */     ro.oD(str = Ml0.Go(mK1.Yo, i + ""), ZY.ih); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */