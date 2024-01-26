/*  1 */ package f;public final class wW extends O0 { public int I6 = 0; public wW(BH paramBH) { super((short)0, 0, (short)0, (short)0, true); if (km.XU()) { this.gc = 25; this.x80 = 25; E20(); } else { this.gc = 12; this.x80 = 6; }  Xu("item-slot"); } public final void LPt2(byte paramByte, short paramShort1, short paramShort2) { this.I6 = 0; super.LPt2(paramByte, paramShort1, paramShort2); } public final void Tm0(Y paramY) { if (paramY != null) { LPT3 lPT3; if ((lPT3 = paramY.Bp0) == null)
/*  2 */         return;  nH0 nH01; if (!lPT3.lF0() || 
/*  3 */         (nH01 = paramY.Lh)
/*  4 */         .p1 == 1446)
/*    */       
/*    */       { 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 27 */         km.u4.Pq(Ml0.OH0(8555));
/* 28 */         if ((f7 = this.h5.gh) != null)
/* 29 */           tp0();  return; }  short s1 = nH01.Sf0; nH0 nH02; short s2, s3; if ((s3 = (nH02 = ((wW)super).h5.kF0.Lh).p1) == 1028 && s1 > (s2 = nH02.Sf0)) { s1 = s2; } else if (s3 == 1029) { s1 = (short)Math.min(s1, 9999); }  if (s1 > 9999) s1 = 9999;  if (s1 > 1) { JR jR; AD0 aD0; if ((aD0 = (AD0)vC0.Bv0(js.vu0, AD0.class)) != null) { VA0.c90(aD0); if ((f7 = ((wW)super).h5.gh) != null) tp0();  return; }  String str = Ml0.Go(8554, Ml0.OH0(lPT3.Iu)); this((wW)this, paramY); this(str, s1, jR, this); js.vu0.si(aD0, js.vu0.Ub()); } else { short s = paramY.Lh.p1; super.LPt2(paramY.Lh.Nj, s, s1); ((wW)super).I6 = paramY.Lh.Wy; }  } else { super
/* 30 */         .LPt2((byte)0, (short)0, (short)0); ((wW)super).I6 = 0; }
/* 31 */      F7 f7; if ((f7 = ((wW)super).h5.gh) != null)
/* 32 */       tp0();  }
/*    */ 
/*    */   
/*    */   public final void EX(nY paramnY) {
/*    */     d40();
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (km.XU()) {
/*    */       uh0(100, 100);
/*    */       RI(100, 100);
/*    */       Tm(100, 100);
/*    */     } else {
/*    */       uh0(48, 48);
/*    */       RI(48, 48);
/*    */       Tm(48, 48);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */