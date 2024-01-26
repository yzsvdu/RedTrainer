/*  1 */ package f;public final class cr extends Fy0 { public static final Ll Tq = Ll.F10("dragActive"); public final boolean i2(oa0 paramoa0) { tR tR1; byte b; if (paramoa0.Cz0()) { if (this.q30) { if (paramoa0.Ud()) { this.q30 = false; this.O
/*  2 */             .gf0(Tq, false); }  } else if (paramoa0
/*  3 */         .Ua) { this
/*  4 */           .q30 = true;
/*  5 */         this.O
/*  6 */           .gf0(Tq, true); }  if (paramoa0
/*  7 */         .cz0 == 4)
/*  8 */       { j40 j40; int i; if ((i = paramoa0.vl) == 1)
/*  9 */         { tR1 = this.lpt2; i = this.mG0; j40[] arrayOfJ40; byte[] arrayOfByte; if (this
/* 10 */             .yv != 2 && i >= 0 && i < (
/* 11 */             arrayOfByte = this.B80).length && (i = arrayOfByte[i]) >= 0 && i < (arrayOfJ40 = this.y40).length && (j40 = arrayOfJ40[i]) != null) UB0.Kg0.fN(new kx0(this, j40));  } else if (j40 == null)
/* 12 */         { tR1 = ((cr)super).lpt2; b = ((cr)super).mG0; if ((this
/* 13 */             .rb & 0x8) != 0) { byte b1 = 0; byte b2 = 0; while (b2 < this
/* 14 */               .Mn0) { if (b2 != b && this.B80[b2] != b2) b1++;  b2 = (byte)(b2 + 1); }  if (b1 > 0)
/* 15 */             { js.vu0
/*    */                 
/* 17 */                 .Pu(-1, Ml0.OH0(6039));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */               
/* 24 */               return true; }  }  this.WR[b] = null; this.B80[b] = -1; (this.mM[b]).As.H(); (this.mM[b]).z4 = null; this.mM[b].zn(); (this.mM[b]).As.vU = true; Ye0(); }  }  return true; }
/* 25 */      return super.i2(b); }
/*    */ 
/*    */   
/*    */   public final tR lpt2;
/*    */   public boolean q30;
/*    */   public byte mG0;
/*    */   public dQ is0;
/*    */   
/*    */   public cr(tR paramtR, byte paramByte) {
/*    */     super("", 48, 48);
/*    */     zY().zT(6, 6);
/*    */     Xu("pc-slot");
/*    */     this.lpt2 = paramtR;
/*    */     this.mG0 = paramByte;
/*    */     (this.is0 = new dQ("")).Xu("label-dark");
/*    */     Pb0(100);
/*    */     J8(this.is0);
/*    */   }
/*    */   
/*    */   static {
/*    */     Ll.F10("dropOk");
/*    */     Ll.F10("dropBlocked");
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     if (!this.q30)
/*    */       super.R60(paramthrows); 
/*    */   }
/*    */   
/*    */   public final void Ve(throws paramthrows, int paramInt1, int paramInt2, int paramInt3) {
/*    */     this.As.sG0(paramInt1, paramInt2);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */