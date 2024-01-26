/*  1 */ package f;public abstract class JA0 extends Q20 { public final void r1(int paramInt1, int paramInt2) { gx(); this.K9 = new Un("<<"); this.eY = new Un(">>"); this.K9.tW(() -> Vt0(paramInt - 1)); this.eY.tW(() -> Vt0(paramInt + 1)); Un un2 = this.K9; si(un2, Ub()); int i; byte b1, b2; int j, k;
/*  2 */     for (i = (int)Math.ceil(paramInt2 / this.sw), b1 = 1, b2 = 1, k = paramInt1, j = paramInt1; b1 < this.pI0; ) { int m; if ((m = j + 1) <= i) { b2++; j = m; }  if (k - 1 >= 0) { k--; b2++; }  if (b2 == b1) break;  b1 = b2; }  if (paramInt1 > 0) { this.K9.sk0(true); } else { this.K9.sk0(false); }  if (this.z70 && i < this.pI0) for (b1 = 0; b1 < Math.round((this.pI0 - i) / 2.0F); )
/*    */       { Un un;
/*  4 */         this(XD0.SD0("", b1)); (new Un()).wI0(false);
/*  5 */         si(un, Ub()); b1++; }   while (k < j)
/*    */     
/*    */     { 
/*  8 */       this(B40.df("").append(++k).toString()); Un un; (un = new Un()).tW(() -> Vt0(paramInt)); if (k == paramInt1) un.sk0(false); 
/*  9 */       si(un, Ub()); }  if (this
/* 10 */       .z70 && i < this.pI0) for (b1 = 0; b1 < (this.pI0 - i) / 2; ) {
/*    */         Un un;
/* 12 */         this(XD0.SD0("", b1)); (new Un()).wI0(false);
/* 13 */         si(un, Ub()); b1++;
/* 14 */       }   Un un1 = this.eY;
/* 15 */     si(un1, Ub()); if (paramInt1 >= i - 1) { this
/* 16 */         .eY.sk0(false); } else { this.eY.sk0(true); }
/*    */      }
/*    */ 
/*    */   
/*    */   public int pI0;
/*    */   public int sw;
/*    */   public boolean z70;
/*    */   public Un K9;
/*    */   public Un eY;
/*    */   
/*    */   public JA0(int paramInt1, int paramInt2) {
/*    */     this(paramInt1, paramInt2, false);
/*    */   }
/*    */   
/*    */   public JA0(int paramInt1, int paramInt2, boolean paramBoolean) {
/*    */     super(1);
/*    */     this.pI0 = paramInt2;
/*    */     this.sw = paramInt1;
/*    */     this.z70 = paramBoolean;
/*    */     Xu("pager");
/*    */   }
/*    */   
/*    */   public abstract void Vt0(int paramInt); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */