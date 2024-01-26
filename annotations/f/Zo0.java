/*  1 */ package f;public final class Zo0 extends a10 { public aq0 ED; public boolean GS; public boolean av0; public j40[] GM; public Zo0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramByteBuffer, paramc4); } public final void sM() { boolean bool; this
/*  2 */       .ED = aq0.BQ(this.Ws.get()); byte b;
/*  3 */     if (((b = this.Ws.get()) & 0x1) != 0) { bool = true; } else { bool = false; }  this
/*  4 */       .GS = bool; if ((b & 0x4) != 0) { b = 1; } else { b = 0; }  j40[] arrayOfJ40; for (this.av0 = b, this.GM = new j40[R00()], b = 0; b < (arrayOfJ40 = this.GM).length; )
/*  5 */     { j40 j401; this(vy0()); arrayOfJ40[b] = j401;
/*  6 */       b++; }  } public final void Cx() { j40[] arrayOfJ40; ro ro = r8(); int i; if ((i = this.ED.ordinal()) != 0) { if (i != 1) { if (i != 3) { if (i != 4) { if (i == 9) { if (this.GS) { if (this.av0) { ro.Pi[9] = null; } else { Rb0 rb0; this(); ro.getClass(); ro.Jy0(this.Nul, this); byte b; for (i = (arrayOfJ40 = this.GM).length, b = 0; b < i; ) { j40 j401 = this[b]; ro.s40(aq0.S80).xC0(j401); b++; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */                   
/* 18 */                   ro.tb0(); }  } else { return; }  } else { throw new RuntimeException(super.ED.toString()); }  } else if (((Zo0)super).GS) { if (((Zo0)super).av0) { ro.Pi[4] = null; } else { Eo0 eo0; this(); ro.getClass(); ro.Jy0(this.Nul, this); byte b; for (i = (arrayOfJ40 = ((Zo0)super).GM).length, b = 0; b < i; ) { j40 j401 = this[b]; ro.s40(aq0.A80).xC0(j401); b++; }  ro.tb0(); }  } else { return; }  ro.s40(aq0.LI).Ix0(); } else { if (((Zo0)super).GS) { zL0 zL0; this(); ro.getClass(); ro.Jy0(zL0.Nul, zL0); }  byte b; for (i = (arrayOfJ40 = ((Zo0)super).GM).length, b = 0; b < i; ) { j40 j401 = this[b]; ro.s40(aq0.ss).xC0(j401); b++; }  return; }  } else { if (((Zo0)super).GS) { wn wn; this(); ro.getClass(); ro.Jy0(wn.Nul, wn); }  byte b; for (i = (arrayOfJ40 = ((Zo0)super).GM).length, b = 0; b < i; ) { j40 j401 = this[b]; ro.s40(aq0.LI).xC0(j401); b++; }  }  } else { if (((Zo0)super).GS) { Cg0 cg0; this(0); ro.getClass(); ro
/*    */           
/* 20 */           .Jy0(cg0.Nul, cg0); }
/* 21 */        byte b; for (i = (arrayOfJ40 = ((Zo0)super).GM).length, b = 0; b < i; ) { j40 j401 = this[b]; ro.s40(aq0.XJ0).xC0(j401); b++; }
/*    */       
/*    */       return; }
/*    */     
/*    */     ro.tb0(); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Zo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */