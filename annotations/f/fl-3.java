/*  1 */ package f;public final class fl extends O0 { public Dn0 y60; public JG0 J1; public JG0 l0; public Un[] eM; public int Yn0; public fl(Dn0 paramDn0, Un[] paramArrayOfUn) { super((short)0, 0, (short)0, (short)0, true); OC oC; this.Yn0 = 0; this.y60 = paramDn0; this.J1 = null; this.l0 = null; this.eM = paramArrayOfUn; this.gc = 8; this.x80 = 6; Xu("item-slot"); this(this); bm0(oC); } public final void LPt2(byte paramByte, short paramShort1, short paramShort2) { this.Yn0 = 0; JG0 jG0; if ((jG0 = this.J1) != null) jG0.wI0(true);  js.vu0
/*  2 */       .KE(); super.LPt2(paramByte, paramShort1, paramShort2); } public final void Tm0(Y paramY) { if (paramY != null) { LPT3 lPT3; if ((lPT3 = paramY.Bp0) == null) return;  wc wc; if ((wc = lPT3.c3) == null || 
/*  3 */         !wc.XF0())
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
/* 21 */         km.u4.Pq(Ml0.OH0(8503)); return; }  JG0 jG0; if ((jG0 = this.l0) != null) { jG0.wI0(false); wI0(false); }  short s2 = paramY.Lh.p1; LPt2(paramY.Lh.Nj, s2, (short)1); nH0 nH0; this.Yn0 = (nH0 = paramY.Lh).Wy; short s1 = paramY.Bp0.c3.Lk; byte b = nH0.Nj; this.y60.X7(b, paramY.Bp0.c3.Hl0, s1); Un[] arrayOfUn; if ((arrayOfUn = this.eM) != null && arrayOfUn.length > 0) for (byte b1 = 0; b1 < '丠'; ) { Un un; if ((un = (Un)xi0.k9((Object[])this.eM)).kN) { hm.Fz0(un.TG0.oh0); break; }  b1++; }   } else { LPt2((byte)0, (short)0, (short)0); this.Yn0 = 0; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void EX(nY paramnY) {
/*    */     super.EX(paramnY);
/*    */     int i = Math.max(42, AW());
/*    */     uh0(i, Math.max(42, HY()));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */