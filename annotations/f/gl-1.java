/* 1 */ package f;public final class gl extends Wv0 { public final void Ki(int paramInt) { fA0 fA01; super.Ki(paramInt); JW[] arrayOfJW; if ((arrayOfJW = JW.ED0).length <= paramInt) return;  JW jW1 = arrayOfJW[paramInt]; JW jW2; if ((jW2 = this.T30) == jW1) { if ((fA01 = this.V10.xs0()) != null) { if (this.V10 != fA01) { this.V10 = fA01;
/* 2 */           wp(); Sj(); }  }
/* 3 */       else { throw new NullPointerException("order"); }  } else { if (fA01 != null) { if (jW2 != fA01) { this
/* 4 */             .T30 = (JW)fA01;
/* 5 */           wp(); Sj(); }  return; }
/* 6 */        throw new NullPointerException("column"); }
/*   */      }
/*   */ 
/*   */   
/*   */   public JW T30;
/*   */   public fA0 V10;
/*   */   public uW hi0;
/*   */   public ArrayList Lpt8;
/*   */   
/*   */   public gl() {
/*   */     uW uW1;
/*   */     Ve ve;
/*   */     uL uL;
/*   */     this.T30 = JW.HT;
/*   */     this.V10 = fA0.pz;
/*   */     this.Lpt8 = new ArrayList();
/*   */     this();
/*   */     this.hi0 = new uW();
/*   */     jA(this);
/*   */     this();
/*   */     ek(Un.class, this);
/*   */     this();
/*   */     ek(Q20.class, this);
/*   */     Xu("/dex-move-table");
/*   */     Gb0(true);
/*   */     zs0();
/*   */     Pb0(0);
/*   */     wp();
/*   */   }
/*   */   
/*   */   public final void Sj() {
/*   */     this(this.Lpt8);
/*   */     ArrayList<?> arrayList;
/*   */     Collections.sort(arrayList = new ArrayList(), this.T30.x9);
/*   */     if (this.V10 == fA0.tk)
/*   */       Collections.reverse(arrayList); 
/*   */     J80[] arrayOfJ801 = arrayList.<J80>toArray(new J80[0]);
/*   */     uW uW1;
/*   */     J80[] arrayOfJ802;
/*   */     if ((arrayOfJ802 = (uW1 = this.hi0).lC0).length > 0)
/*   */       in0(arrayOfJ802.length); 
/*   */     this.lC0 = arrayOfJ801;
/*   */     i2(arrayOfJ801.length);
/*   */   }
/*   */   
/*   */   public final void wp() {
/*   */     int i = this.T30.ordinal();
/*   */     df0(i, this.V10);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */