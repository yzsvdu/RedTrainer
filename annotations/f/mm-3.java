/*  1 */ package f;public final class mm extends Fy0 implements NK0 { public static final Ll CF = Ll.F10("dragActive"); public j4 vr0; public boolean mw; public Y d90; public mm(wg0 paramwg0, ck paramck, Y paramY, short paramShort) { super(str, b1, b2); byte b1, b2; Xu("inventory-button"); s6("x" + paramShort); this
/*    */       
/*  3 */       .db0 = new I(new Ja0(this));
/*  4 */     this.As
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*  9 */       .qt(new U70[] { wm0.y0.HR(paramY.Bp0, false) });
/* 10 */     this.As
/* 11 */       .zT(0, 3); if (km.XU()) { this
/* 12 */         .As
/* 13 */         .tL(48, 48); } else { this
/* 14 */         .As
/* 15 */         .tL(24, 24); }  this
/* 16 */       .Xw = et.kL0;
/* 17 */     if (km.XU()) { s6(paramShort + "x " + paramY.JG0()); this.un0 = 400; this.ST = 60; Xg0(400, 60); et et; C70(et = et.c5); this
/* 18 */         .Xw = et; }  this
/*    */ 
/*    */       
/* 21 */       .d90 = paramY; tW(new yL0(this, paramck, paramY, paramwg0)); } public final boolean i2(oa0 paramoa0) { if (B8.Pg(paramoa0.cz0)) js.vu0.KE();  if (km.XU()) {  } else { j4 j41; if (paramoa0.Cz0()) { if (this.mw) { if (paramoa0.Ud()) { j4 j42; if ((j42 = this.vr0) != null) NuL.I6(j42.da, this, paramoa0);  this.mw = false; this.O.gf0(CF, false); } else if ((j41 = this.vr0) != null) { this.da.Tx(paramoa0); }  } else if (paramoa0.Ua) { ((mm)super).mw = true; ((JG0)this).O.gf0(CF, true); j4 j42; if ((j42 = ((mm)super).vr0) != null) { pRn pRn; NuL nuL; (nuL = j42.da).getClass(); xJ0 xJ0 = pA.Dg0.WH; if (super.pRn() != null && (super.pRn())
/* 22 */               .Bp0
/* 23 */               .default(false) == dv.wS) { pRn = NuL.fL0; SE0[] arrayOfSE0; int i;
/*    */               byte b;
/* 25 */               for (i = (arrayOfSE0 = xJ0.sN).length, b = 0; b < i; ) { SE0 sE0; if ((sE0 = arrayOfSE0[b])
/* 26 */                   .db0 == null)
/*    */                 { I i1; Ja0 ja0;
/* 28 */                   this(sE0); this(ja0, pRn.WHITE);
/* 29 */                   sE0.db0 = i1; }  sE0
/* 30 */                   .db0
/* 31 */                   .sz(pRn, 100); b++; }  } else { boolean bool = true; SE0[] arrayOfSE0; int i;
/*    */               byte b;
/* 33 */               for (i = (arrayOfSE0 = ((xJ0)pRn).sN).length, b = 0; b < i; ) { (arrayOfSE0[b])
/* 34 */                   .O
/* 35 */                   .gf0(JG0.e30, bool); b++; }  }  nuL
/* 36 */               .kv0 = (NK0)this; nuL.Tx(paramoa0); }  }
/* 37 */         else { int i; int j; if (B8.Pg(i = paramoa0.cz0) && ((
/* 38 */             j = paramoa0.vl) == 0 || j == 1) && i == 4)
/*    */           {
/*    */             
/* 41 */             hm.Fz0(((Un)this).TG0.oh0); }  }
/* 42 */          return super.i2(paramoa0); }  }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   static {
/*    */     Ll.F10("dropOk");
/*    */     Ll.F10("dropBlocked");
/*    */   }
/*    */   
/*    */   public final void Tm0(Y paramY) {
/*    */     this.d90 = paramY;
/*    */     this.As.qt(new U70[] { wm0.y0.HR(paramY.Bp0, false) });
/*    */   }
/*    */   
/*    */   public final Y pRn() {
/*    */     return this.d90;
/*    */   }
/*    */   
/*    */   public final boolean fC() {
/*    */     return km.XU() ^ true;
/*    */   }
/*    */   
/*    */   public final void Ve(throws paramthrows, int paramInt1, int paramInt2, int paramInt3) {
/*    */     if (!km.XU())
/*    */       this.As.sG0(paramInt1, paramInt2); 
/*    */   }
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     if (!this.mw)
/*    */       super.R60(paramthrows); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */