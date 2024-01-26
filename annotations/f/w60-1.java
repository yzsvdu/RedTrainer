/*    */ package f;
/*  2 */ public final class w60 extends Wr implements r60 { public byte CoM3; public ja0 a90; public int gL; public byte com3; public final void LM(throws paramthrows) { int i = this.fr0.RS();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  8 */     i = this.fr0.e3();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     ME(JO.Se0(this.fr0.qF(), this.xY, 2, i), (this.fr0.Hy() - this.HC) / 4 + i);
/* 14 */     DZ(); }
/*    */   public int C3; public int oQ; public dQ[] Aw0; public w60(int paramInt, byte paramByte) { dQ dQ1; this.gL = -1; this.com3 = -1; Xu("base-frame-padded"); Lo(Of.b20().On0((short)5621).getName()); EP(1); this.CoM3 = paramByte; this.a90 = jV.mg.w(paramInt); this.C3 = 0; for (paramInt = 0; paramInt < 4 && this.a90.Wr0(paramInt) >= 0; paramInt++) this.C3++;  paramInt = (int)(km.wI0.dG() * 0.75D / 4.0D); if (km.XU()) paramInt = km.wI0.dG() / 4;  this.oQ = paramInt / 128; String str = ""; paramByte = 0; if (km.a3.wQ() != null) { str = km.a3.wQ().m(); paramByte = km.a3.wQ().lPt7(); }  this.Aw0 = new dQ[this.C3]; int j; for (byte b = 0; b < (j = this.C3); b = (byte)(b + 1)) { vF0 vF01; vF0 vF02; this(0, 0); byte b1 = this.a90.rq0(b); int m; if ((m = Zk0.yE(L70.Oj0().Er0())) != 2) { if (m == 3 || m == 4) b1 += 2;  } else { b1++; }  jV jV; vF01.ZH0().qt(new U70[] { (jV = jV.mg).L4(b1) }); vF01.ZH0().Ii0(this.oQ); int k; vF01.ZH0().zT((k = b * 128) * this.oQ + 2, 0); J8(vF01); this(0, 0); (new vF0()).ZH0().qt(new U70[] { jV.MW(this.a90.COM3(b, paramByte)) }); (new vF0()).ZH0().Ii0(this.oQ); (new vF0()).ZH0().zT(k * this.oQ + 2, 0); if (this.a90.Wr0(b) == 0 || this.a90.Wr0(b) == 5) vF02.ZH0().FB0(pRn.BLACK);  J8(vF02); this(this.a90.A2(b, str)); this.Aw0[b] = dQ1; this.Aw0[b].C70(et.Wi0); J8(this.Aw0[b]); }  int i = dQ1 * 128; i = i * this.oQ + 3; uh0(i, this.oQ * 192 + 2); i = this.C3 * 128; i = i * this.oQ + 3; Tm(i, this.oQ * 192 + 2); } public final void DZ() { this.gL = i; int i; ja0 ja02; byte[] arrayOfByte; if ((i = this.gL + 1) >= (arrayOfByte = (ja02 = this.a90).b).length) { pA.Dg0.jf0(this); km.u4.lx0(this.CoM3, (byte)0); return; }  String str2 = ""; vh0 vh0; Jo jo; if ((vh0 = km.a3) != null && (jo = vh0.Ct) != null) str2 = jo.ED0;  byte b1 = 2; F40 f40 = F40.ef0; int k = ja02.Gu + 191; if (i < 0 || i >= arrayOfByte.length) i = 0;  i = arrayOfByte[i]; String[] arrayOfString; (arrayOfString = new String[1])[0] = str2; String str1 = Ml0.tG(b1, f40, k, i, arrayOfString); ja0 ja01 = this.a90; int j; if ((j = this.gL) < 0 || j >= ja01.b.length)
/* 16 */       j = 0;  this.com3 = ja01.JK0[j]; str1 = str1.trim(); Aq aq = Aq.ur; this(this); lX lX; byte b = -2; km.kH0.getClass(); km.kH0
/* 17 */       .wV(new zB0(str1, aq, b, lX)); }
/*    */ 
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     int i;
/*    */     hO hO;
/*    */     if (km.XU() && B8.Pg(i = paramoa0.cz0) && i == 5 && (hO = km.kH0.tc()) != null)
/*    */       hO.RW(h1.nUL); 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     hO hO = km.kH0.tc();
/*    */     int i = RS();
/*    */     int j = this.com3 * 128;
/*    */     i = j * this.oQ + i;
/*    */     i = this.oQ * 64 + i;
/*    */     j = e3();
/*    */     j = this.oQ * 45 + j;
/*    */     km.kH0.getClass();
/*    */     Qz0.aX(hO, i, j);
/*    */     if (this.com3 != -1 && hO != null && p3())
/*    */       VA0.c90(hO); 
/*    */     super.V90(paramthrows);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     for (int i = 0; i < this.C3; ) {
/*    */       this.Aw0[i].C70(et.Wi0);
/*    */       this.Aw0[i].Tm(this.oQ * 128, 20);
/*    */       i = RS() + 2;
/*    */       this.Aw0[i].ME(i * 128 * this.oQ + i, e3() + 10);
/*    */       i = (byte)(i + 1);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/w60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */