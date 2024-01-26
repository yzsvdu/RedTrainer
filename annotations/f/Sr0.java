/*  1 */ package f;public final class Sr0 extends yp0 { public final void wL() { WD wD; if (this.DL > 0 && (wD = yk0.cw().mP(this.DL)) != null && this.lN == null) { hm0[] arrayOfHm0; hm0 hm01; hm0 hm02; byte b1; byte b2; if ((b1 = this.lU) >= 0 && (b2 = this.G4) >= 0)
/*    */       
/*  3 */       { hm01 = km.MR.cl[b1][b2]; } else { hm01 = null; }  byte b3; if ((b2 = this.ct0) >= 0 && (b3 = this.bv0) >= 0)
/*    */       
/*    */       { 
/*  6 */         hm02 = km.MR.cl[b2][b3]; } else { hm02 = null; }  if (b2 == -2) { if (rJ == null) { mA mA = mA.uZ; (rJ = new hm0((byte)1, (byte)0, 0, (short)0, (byte)1, "", (byte)0, (byte)1, (byte)0, (short)0, (byte)0, mA, (short)1, (short)1, (byte)0, (byte)0)).DS(false); }
/*  7 */          (hm02 = rJ).if
/*  8 */           .ec = 100;
/*  9 */         (hm02 = rJ).if.hv = 10; }  switch (wD
/* 10 */         .DD) { default: b2 = 0; break;case 4: case 5: case 6: case 8: b2 = 1; break; }  if (b2 != 0)
/*    */       
/* 12 */       { Gp0 gp0 = km.MR;
/*    */         
/* 14 */         arrayOfHm0 = gp0.cl[this.ct0];
/* 15 */         o5.getClass();
/*    */         O5 o5;
/* 17 */         (o5 = O5.AU).xa(hm01, wD.HA).iP(arrayOfHm0);
/* 18 */         this.lN = (o5 = O5.AU).xa(hm01, wD.HA); }
/* 19 */       else { O5.AU
/* 20 */           .getClass();
/*    */         wb wb2;
/* 22 */         (wb2 = O5.AU.xa(hm01, ((WD)arrayOfHm0).HA)).SK(hm02);
/* 23 */         this.lN = wb2; }  }  short s; if (this.lN == null && (s = this.DL) > 0) { Gp.error(Ml0.Go(5033, Integer.toString(s))); km.u4.Pq(Ml0.Go(5034, Integer.toString(this.DL))); }  wb wb1; if (!this.Od && (wb1 = this.lN) != null) { try { if (this.Pe) {  } else {  }  wb1.O3(); } catch (Exception exception) { Gp.error(Ml0.Go(5033, Integer.toString(this.DL)), exception); km.u4.Pq(Ml0.Go(5034, Integer.toString(this.DL))); this.lN = null; }  this.Od = true; }
/* 24 */      km.wI0.K7
/*    */       
/* 26 */       .u4 = this.lN; }
/*    */ 
/*    */   
/*    */   public static final ik Gp = C00.gd(Sr0.class);
/*    */   public static hm0 rJ = null;
/*    */   public byte lU;
/*    */   public byte G4;
/*    */   public byte ct0;
/*    */   public byte bv0;
/*    */   public short DL;
/*    */   public wb lN;
/*    */   public boolean Od = false;
/*    */   public boolean Pe;
/*    */   
/*    */   public Sr0(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, short paramShort, boolean paramBoolean) {
/*    */     this.lU = paramByte1;
/*    */     this.G4 = paramByte2;
/*    */     this.ct0 = paramByte3;
/*    */     this.bv0 = paramByte4;
/*    */     this.DL = paramShort;
/*    */     this.Pe = paramBoolean;
/*    */   }
/*    */   
/*    */   public final boolean Ie() {
/*    */     wb wb1;
/*    */     return ((wb1 = this.lN) == null || cw());
/*    */   }
/*    */   
/*    */   public final int zE() {
/*    */     return 3;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */