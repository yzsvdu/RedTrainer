/*  1 */ package f;public final class tl0 extends Fp { public static final Ll gn = Ll.F10("fade"); public int Hc0; public final void wI0(boolean paramBoolean) { super.wI0(paramBoolean); this.O
/*  2 */       .Ym0(gn); } public final String TI() { return "tooltipwindow"; } public final void Xw(nY paramnY) { super.Xw(paramnY); this.Hc0 = ((q80)paramnY).Km(0, "fadeInTime"); } public final void V90(throws paramthrows) { C7 c7; int i; int j; if ((i = this.O.Fj0(gn)) < (j = this.Hc0)) { float f1 = i / j;
/*    */       
/*  4 */       float f2 = 1.0F, f3 = 1.0F, f4 = 1.0F; tw tw; C7 c71;
/*  5 */       if ((c71 = (tw = (tw)paramthrows.IB0).Ma)
/*  6 */         .JJ == null)
/*  7 */       { C7 c72; this(c71); c71.JJ = c72; }  c71.prn *= f2; c71.cu0 *= f3; c71.ew0 *= f4; c71.JS *= f1; tw
/*  8 */         .Ma = c71.JJ; 
/*  9 */       try { super.V90(paramthrows); }
/*    */       finally
/*    */       
/* 12 */       { ((tw)paramthrows.IB0)
/* 13 */           .w1(); }  } else { super.V90(paramthrows); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */