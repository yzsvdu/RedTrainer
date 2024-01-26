/* 1 */ package f;public final class f40 extends Wv0 { public final void Ki(int paramInt) { fA0 fA01; super.Ki(paramInt); QR[] arrayOfQR; if ((arrayOfQR = QR.Dy0).length <= paramInt) return;  QR qR1 = arrayOfQR[paramInt]; QR qR2; if ((qR2 = this.Wm0) == qR1) { if ((fA01 = this.LX.xs0()) != null) { if (this.LX != fA01) { this.LX = fA01;
/* 2 */           Mf0(); LpT4(); }  }
/* 3 */       else { throw new NullPointerException("order"); }  } else { if (fA01 != null) { if (qR2 != fA01) { this
/* 4 */             .Wm0 = (QR)fA01;
/* 5 */           Mf0(); LpT4(); }  return; }
/* 6 */        throw new NullPointerException("column"); }
/*   */      }
/*   */ 
/*   */   
/*   */   public QR Wm0;
/*   */   public fA0 LX;
/*   */   public YB vZ;
/*   */   public Collection LD0;
/*   */   
/*   */   public f40(cd0 paramcd0) {
/*   */     YB yB;
/*   */     Ve ve;
/*   */     this.Wm0 = QR.xz0;
/*   */     this.LX = fA0.pz;
/*   */     this(paramcd0);
/*   */     this.vZ = new YB();
/*   */     jA(this);
/*   */     this();
/*   */     ek(Un.class, this);
/*   */     Xu("/wardrobe-purchase-table");
/*   */     Gb0(true);
/*   */     zs0();
/*   */     Pb0(0);
/*   */     Mf0();
/*   */   }
/*   */   
/*   */   public final void LpT4() {
/*   */     this();
/*   */     ArrayList<wc> arrayList;
/*   */     for (Iterator<wc> iterator = this.LD0.iterator(); iterator.hasNext(); arrayList.add(iterator.next()));
/*   */     Collections.sort(arrayList, this.Wm0.Xg);
/*   */     if (this.LX == fA0.tk)
/*   */       Collections.reverse(arrayList); 
/*   */     wc[] arrayOfWc1 = arrayList.<wc>toArray(new wc[0]);
/*   */     YB yB;
/*   */     wc[] arrayOfWc2;
/*   */     if ((arrayOfWc2 = (yB = this.vZ).ye0).length > 0)
/*   */       in0(arrayOfWc2.length); 
/*   */     this.ye0 = arrayOfWc1;
/*   */     i2(arrayOfWc1.length);
/*   */   }
/*   */   
/*   */   public final void Mf0() {
/*   */     int i = this.Wm0.ordinal();
/*   */     df0(i, this.LX);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f40.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */