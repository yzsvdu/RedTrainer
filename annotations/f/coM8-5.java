/* 1 */ package f;public final class coM8 extends JG0 { public final void V90(throws paramthrows) { super.V90(paramthrows); if (this.H3 != this.pw)
/* 2 */     { int j; int k; for (long l = zm0.u20; this
/* 3 */         .Bl + 250L < l && (j = this.H3) != (k = this.pw); ) { if ((j > k) ? ((j = this.Mh0) > 0) : ((j = this.AJ) > 0)) km.pm0.bL(this.vk0, j);  j = this.pw; if (this.H3 > j) { k = 1; } else { k = -1; }  this.pw = j + k; this.Bl += 250L; }  }  int i = 0; while (true) { int j; if (i < (
/* 4 */         j = this.pw) || (i < this.fi0 && j >= 0)) { byte b = 0; int k = i * 16; if (i > 7) { k -= 128; b = 16; }  if (i >= j) { this.di0.zT(k, b); this.di0.Iq(); } else { this.Hr.zT(k, b); this.Hr.Iq(); }  i++; continue; }  for (i = 0 - j, j = 0; j < i; ) { byte b = 0; int k = j * 16; if (j > 6) { k -= 112; b = 16; }  this.LV.zT(k, b); this.LV.Iq(); j++; }
/*   */       
/*   */       return; }
/*   */      }
/*   */ 
/*   */   
/*   */   public int pw = 0;
/*   */   public int H3 = 0;
/*   */   public long Bl = 0L;
/*   */   public int fi0 = 0;
/*   */   public rH Hr = new rH(this);
/*   */   public rH LV = new rH(this);
/*   */   public rH di0 = new rH(this);
/*   */   public byte vk0 = 0;
/*   */   public short Mh0 = 0;
/*   */   public short AJ = 0;
/*   */   
/*   */   public coM8() {
/*   */     this(0);
/*   */   }
/*   */   
/*   */   public coM8(int paramInt) {
/*   */     this.fi0 = paramInt;
/*   */     a80 a80;
/*   */     this.Hr.sm(new zh0[] { (a80 = a80.Oz0).z7(1) });
/*   */     this.LV.sm(new zh0[] { z7(3) });
/*   */     this.di0.sm(new zh0[] { z7(4) });
/*   */     this.Hr.tL(16, 16);
/*   */     this.LV.tL(16, 16);
/*   */     this.di0.tL(16, 16);
/*   */   }
/*   */   
/*   */   public final coM8 Ml0(short paramShort1, short paramShort2) {
/*   */     this.vk0 = 1;
/*   */     this.Mh0 = paramShort1;
/*   */     this.AJ = paramShort2;
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/coM8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */