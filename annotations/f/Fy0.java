/*  1 */ package f;public class Fy0 extends Un { public void d40() { int i; int j; if ((i = this.ST) > 0 && (j = this.un0) > 0) { uh0(j, i); i = this.un0; RI(i, this.ST); i = this.un0; Tm(i, this.ST); }  if (this.Xw != null) { mM(); if (this.HC < this
/*  2 */         .As
/*  3 */         .cA()) this
/*  4 */           .As
/*    */           
/*  6 */           .tL((int)(this.HC * 1.25D), (int)(this.HC * 1.25D));
/*    */       
/*  8 */       i = this.As.e00();
/*    */       
/* 10 */       j = this.As.e00(); int k; if ((k = this.Xw.ordinal()) != 0) { if (k != 2) { if (k == 3)
/*    */           
/*    */           { 
/*    */ 
/*    */             
/* 15 */             i = (this.xY - i) * et1.aN / 2;
/*    */             
/*    */             et et1;
/*    */             
/* 19 */             this.As.zT(i, (et1 = this.Xw).T2(this.HC, j) + this.X20); }  }
/* 20 */         else { rH rH1 = this.As;
/* 21 */           et et1 = this.Xw;
/*    */ 
/*    */ 
/*    */           
/* 25 */           i = (this.xY - i) * et1.aN / 2 - this.EA;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 31 */           rH1
/*    */             
/* 33 */             .zT(i, et1.T2(this.HC, j)); }  } else { rH rH1 = this.As; et et1 = this.Xw; i = (this.xY - i) * et1.aN / 2 + this.px; rH1.zT(i, et1.T2(this.HC, j)); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public int un0;
/*    */   public int ST;
/*    */   public et Xw;
/*    */   public rH As;
/*    */   public boolean pz;
/*    */   public boolean en;
/*    */   
/*    */   public Fy0() {
/*    */     this("", 0, 0);
/*    */   }
/*    */   
/*    */   public Fy0(String paramString) {
/*    */     this(paramString, 0, 0);
/*    */   }
/*    */   
/*    */   public Fy0(int paramInt1, int paramInt2) {
/*    */     this("", paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public Fy0(String paramString, int paramInt1, int paramInt2) {
/*    */     super(paramString);
/*    */     rH rH1;
/*    */     this.un0 = 0;
/*    */     this.ST = 0;
/*    */     this(this);
/*    */     this.As = rH1;
/*    */     this.en = true;
/*    */     if (paramInt2 > 0 && paramInt1 > 0) {
/*    */       uh0(paramInt1, paramInt2);
/*    */       RI(paramInt1, paramInt2);
/*    */       Tm(paramInt1, paramInt2);
/*    */     } 
/*    */     this.un0 = paramInt1;
/*    */     this.ST = paramInt2;
/*    */     Xu("button");
/*    */   }
/*    */   
/*    */   public Fy0(String paramString, et paramet) {
/*    */     super(paramString);
/*    */     rH rH1;
/*    */     this.un0 = 0;
/*    */     this.ST = 0;
/*    */     this(this);
/*    */     this.As = rH1;
/*    */     this.en = true;
/*    */     this.Xw = paramet;
/*    */     Xu("button");
/*    */   }
/*    */   
/*    */   public final rH zY() {
/*    */     return this.As;
/*    */   }
/*    */   
/*    */   public final void EX(nY paramnY) {
/*    */     if (this.ST > 0 && this.un0 > 0)
/*    */       return; 
/*    */     super.EX(paramnY);
/*    */   }
/*    */   
/*    */   public final void TE(nY paramnY) {
/*    */     super.TE(paramnY);
/*    */   }
/*    */   
/*    */   public final void hC0(nY paramnY) {
/*    */     if (this.ST > 0 && this.un0 > 0)
/*    */       return; 
/*    */     super.hC0(paramnY);
/*    */   }
/*    */   
/*    */   public final int AW() {
/*    */     int i;
/*    */     return (this.ST > 0 && (i = this.un0) > 0) ? i : super.AW();
/*    */   }
/*    */   
/*    */   public final int HY() {
/*    */     int i;
/*    */     return ((i = this.ST) > 0 && this.un0 > 0) ? i : super.HY();
/*    */   }
/*    */   
/*    */   public final void AL(int paramInt1, int paramInt2) {
/*    */     this.un0 = paramInt1;
/*    */     this.ST = paramInt2;
/*    */   }
/*    */   
/*    */   public final int com4(boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Xw : Lf/et;
/*    */     //   4: dup
/*    */     //   5: astore_2
/*    */     //   6: ifnull -> 87
/*    */     //   9: aload_2
/*    */     //   10: invokevirtual ordinal : ()I
/*    */     //   13: dup
/*    */     //   14: istore_2
/*    */     //   15: ifeq -> 58
/*    */     //   18: iload_2
/*    */     //   19: iconst_2
/*    */     //   20: if_icmpeq -> 26
/*    */     //   23: goto -> 87
/*    */     //   26: aload_0
/*    */     //   27: getfield d0 : Lf/et;
/*    */     //   30: getfield tk0 : Lf/Mo;
/*    */     //   33: getstatic f/Mo.lu : Lf/Mo;
/*    */     //   36: if_acmpne -> 87
/*    */     //   39: aload_0
/*    */     //   40: iload_1
/*    */     //   41: invokespecial com4 : (Z)I
/*    */     //   44: aload_0
/*    */     //   45: getfield As : Lf/rH;
/*    */     //   48: invokevirtual e00 : ()I
/*    */     //   51: isub
/*    */     //   52: aload_0
/*    */     //   53: getfield EA : S
/*    */     //   56: isub
/*    */     //   57: ireturn
/*    */     //   58: aload_0
/*    */     //   59: getfield d0 : Lf/et;
/*    */     //   62: getfield tk0 : Lf/Mo;
/*    */     //   65: getstatic f/Mo.Jb0 : Lf/Mo;
/*    */     //   68: if_acmpne -> 87
/*    */     //   71: aload_0
/*    */     //   72: dup
/*    */     //   73: iload_1
/*    */     //   74: invokespecial com4 : (Z)I
/*    */     //   77: istore_0
/*    */     //   78: getfield As : Lf/rH;
/*    */     //   81: invokevirtual e00 : ()I
/*    */     //   84: iload_0
/*    */     //   85: iadd
/*    */     //   86: ireturn
/*    */     //   87: aload_0
/*    */     //   88: iload_1
/*    */     //   89: invokespecial com4 : (Z)I
/*    */     //   92: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 27
/*    */     //   #2	-> 30
/*    */     //   #3	-> 33
/*    */     //   #4	-> 45
/*    */     //   #5	-> 48
/*    */     //   #6	-> 53
/*    */     //   #7	-> 59
/*    */     //   #8	-> 62
/*    */     //   #9	-> 65
/*    */     //   #10	-> 78
/*    */     //   #11	-> 81
/*    */   }
/*    */   
/*    */   public void yV(throws paramthrows) {
/*    */     super.yV(paramthrows);
/*    */     if (this.pz && this.en)
/*    */       this.As.Iq(); 
/*    */   }
/*    */   
/*    */   public void R60(throws paramthrows) {
/*    */     super.R60(paramthrows);
/*    */     if (!this.pz && this.en)
/*    */       this.As.Iq(); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */