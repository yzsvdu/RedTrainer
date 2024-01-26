/*  1 */ package f;public final class x20 implements Ca { public final void x9() { Iterator iterator; int i, j; if ((i = this.xN) == (j = this.Yp0)) return;  this.m50.mh.on0(this.lL); this.lL.uu(4.0F); eo1
/*  2 */       .y = f2;
/*  3 */     eo1
/*  4 */       .y = f2; float[] arrayOfFloat; eo eo1; int k; float f1, f2; if (((f1 = (arrayOfFloat = this.ed)[k = j + 2]) > arrayOfFloat[i + 2]) ? ((f2 = UB0.M60.Qy * 10.0F + (eo1 = this.lL).y) >= f1) : ((f2 = (eo1 = this.lL).y - UB0.M60.Qy * 10.0F) <= f1)) eo1.y = f1;  ko0 ko01; eo eo2; if ((ko01 = this.b6) != null && (f1 = ko01.my) < 2.75F && this.bi0 == 5 && (eo2 = this.lL).y < -36.8F) { eo2.y = -36.8F; if (f1 == 0.0F) { ko01.sa0.k = 2.5F; ko01.sa0
/*  5 */           .rd(0, false, null); }
/*  6 */        this.b6
/*    */         
/*  8 */         .my = this.b6.my + UB0.M60.Qy; }  if (nx0.JC0(this.lL.y, this.ed[k])) { if (this.Ch0) { this.m50.k = 1.0F; this.m50
/*  9 */           .rd(j, false, null); }  this
/* 10 */         .xN = j; ArrayList arrayList; if ((arrayList = this.zw0) != null) { for (iterator = arrayList.iterator(); iterator.hasNext(); ) { ((tc)iterator.next())
/* 11 */             .pm
/* 12 */             .getClass();
/* 13 */           eo eo3 = eo.Zero; ((tc)iterator.next()).pm.KC(null, false, eo3);
/* 14 */           ((tc)iterator.next()).HW
/*    */             
/* 16 */             .Qf0 = this.qv[j];
/* 17 */           ((tc)iterator.next()).HW.lT = null; }  this
/* 18 */           .zw0 = null; }  km.pm0.bL((byte)2, (short)1747); } else if (this.zw0 == null)
/* 19 */     { ArrayList<tc> arrayList; this(); byte b; int m; Iterator<tc> iterator2; int n, i1, i2; for (k = (int)(ko0.UK[m = this.bi0][0] - 1.0F), n = (int)ko0.UK[m = this.bi0][1], i1 = k + 4, i2 = n + 2, b = ko0.rn[m][iterator], iterator2 = km.a3.iterator(); iterator2.hasNext(); )
/*    */       { tc tc; G5 g5; short s;
/* 21 */         if ((s = (g5 = (tc = iterator2.next()).HW).mm) < k || s > i1 || (
/* 22 */           s = g5.Yu0) < n || s > i2 || g5
/* 23 */           .Qf0 != b) continue;  arrayList
/* 24 */           .add(tc); }  Jo jo; vh0 vh0; if ((vh0 = km.a3) != null && (
/* 25 */         jo = vh0.Ct) != null) arrayList
/* 26 */           .add(jo);  Iterator<tc> iterator1; for (this
/* 27 */         .zw0 = arrayList, iterator1 = arrayList.iterator(); iterator1.hasNext(); ) {
/*    */         
/* 29 */         lpt1 lpt11 = this.m50; ((tc)iterator1.next()).pm.getClass();
/* 30 */         ((tc)iterator1.next()).pm.KC(lpt11, true, eo.Zero);
/* 31 */       }  km.u4
/* 32 */         .hB0 = this; }
/* 33 */      this.m50.mh.b8(this.lL.uu(0.25F)); this.m50.C50(); }
/*    */ 
/*    */   
/*    */   public int bi0;
/*    */   public float[] ed;
/*    */   public byte[] qv;
/*    */   public boolean YK;
/*    */   public int Yp0;
/*    */   public int xN;
/*    */   public lpt1 m50;
/*    */   public boolean Ch0;
/*    */   public ArrayList zw0;
/*    */   public final me H30;
/*    */   public final ko0 b6;
/*    */   public eo lL;
/*    */   
/*    */   public x20(me paramme, int paramInt1, float[] paramArrayOffloat, byte[] paramArrayOfbyte, int paramInt2, boolean paramBoolean) {
/*    */     this(paramme, Ve0.Dj(bool), paramInt1, paramArrayOffloat, paramArrayOfbyte, paramInt2, paramBoolean);
/*    */   }
/*    */   
/*    */   public x20(me paramme, lpt1 paramlpt1, int paramInt1, float[] paramArrayOffloat, byte[] paramArrayOfbyte, int paramInt2, boolean paramBoolean) {
/*    */     float f4;
/*    */     this.Ch0 = true;
/*    */     this.zw0 = null;
/*    */     this.lL = new eo();
/*    */     this.H30 = paramme;
/*    */     if (paramme instanceof ko0) {
/*    */       paramme = paramme;
/*    */     } else {
/*    */       paramme = null;
/*    */     } 
/*    */     this.b6 = (ko0)paramme;
/*    */     this.bi0 = paramInt1;
/*    */     this.ed = paramArrayOffloat;
/*    */     this.qv = paramArrayOfbyte;
/*    */     this.Yp0 = paramInt2;
/*    */     this.xN = paramInt2;
/*    */     this.YK = paramBoolean;
/*    */     paramlpt1.gM();
/*    */     Matrix4 matrix4 = paramlpt1.mh;
/*    */     float f1 = paramArrayOffloat[0] * 0.25F;
/*    */     if (paramBoolean) {
/*    */       f3 = 0.375F;
/*    */     } else {
/*    */       f3 = 0.0F;
/*    */     } 
/*    */     f1 += f3;
/*    */     float f2 = paramArrayOffloat[paramInt2 + 2] * 0.25F;
/*    */     float f3 = paramArrayOffloat[1] * 0.25F;
/*    */     if (paramBoolean) {
/*    */       f4 = 0.375F;
/*    */     } else {
/*    */       f4 = 0.0F;
/*    */     } 
/*    */     matrix4.bb0(f1, f2, f3 + f4);
/*    */     paramlpt1.k = 1.0E8F;
/*    */     paramlpt1.j10(UB0.M60.Sh0(), null);
/*    */     paramlpt1.ml0(paramInt2, false);
/*    */     this.m50 = paramlpt1;
/*    */   }
/*    */   
/*    */   public final void yk(int paramInt) {
/*    */     this.Yp0 = paramInt;
/*    */     this.xN = paramInt;
/*    */     eo1.x = arrayOfFloat[0];
/*    */     eo1.y = arrayOfFloat[paramInt + 2];
/*    */     eo eo1;
/*    */     float[] arrayOfFloat;
/*    */     (eo1 = this.lL).z = (arrayOfFloat = this.ed)[1];
/*    */     this.lL.uu(0.25F);
/*    */     if (this.YK) {
/*    */       this.lL.x += 0.375F;
/*    */       this.lL.z += 0.375F;
/*    */     } 
/*    */     if (this.Ch0) {
/*    */       this.m50.k = 1.0E8F;
/*    */       this.m50.rd(this.Yp0, false, null);
/*    */     } 
/*    */     this.m50.mh.b8(this.lL);
/*    */     ko0 ko01;
/*    */     if ((ko01 = this.b6) != null && ko01.my < 1.0F && this.bi0 == 5 && paramInt == 1) {
/*    */       ko01.my = 10000.0F;
/*    */       ko01.sa0.k = 1.0E8F;
/*    */       ko01.sa0.rd(0, false, null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean vQ(boolean paramBoolean, int paramInt) {
/*    */     vh0 vh0;
/*    */     return ((vh0 = km.a3) == null || vh0.Jr0() == null || km.a3.Jr0().Xg0() != this.H30.h20()) ? false : ((this.xN != this.Yp0));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/x20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */