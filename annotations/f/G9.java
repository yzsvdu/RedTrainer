/*  1 */ package f;public class G9 extends Qv0 { public void zf(j40 paramj40) { this.t70 = paramj40; if (paramj40 == null) { Ax(null); this.z4 = null; zn();
/*  2 */       this.OR
/*  3 */         .TS
/*  4 */         .H(); this.mG0
/*  5 */         .TS
/*  6 */         .H(); this.pQ
/*  7 */         .TS
/*  8 */         .H();
/*    */ 
/*    */       
/* 11 */       hm.Fz0(this.TG0.oh0); return; }  if (paramj40
/* 12 */       .Zs
/* 13 */       .tm0()) { this.OR
/* 14 */         .TS
/*    */ 
/*    */         
/* 17 */         .Pn(new pe0[] { interface.ZZ().yI0(paramj40.Zs.Gf()) }); } else { this.OR
/* 18 */         .TS
/* 19 */         .H(); }
/* 20 */      if (paramj40.Zs
/* 21 */       .wH.length > 
/* 22 */       0) { this.mG0
/* 23 */         .TS
/*    */ 
/*    */         
/* 26 */         .Pn(new pe0[] { (interface.ZZ()).oX }); } else { this.mG0
/* 27 */         .TS
/* 28 */         .H(); }  if (paramj40
/* 29 */       .Zs
/* 30 */       .iL()) { this.pQ
/* 31 */         .TS
/*    */ 
/*    */         
/* 34 */         .Pn(new pe0[] { (interface.ZZ()).n30 }); } else { this.pQ
/* 35 */         .TS
/* 36 */         .H(); }
/* 37 */      VA vA; int i = (vA = this.OR).Kd;
/* 38 */     int j = this.OR.er0; short s; byte b; VA[] arrayOfVA;
/* 39 */     for (arrayOfVA[0] = vA, arrayOfVA[1] = this.mG0, (arrayOfVA = new VA[b = 3])[2] = this.pQ, s = 0; s < b; ) { if (s != 0)
/*    */       { int k; VA vA1;
/* 41 */         if (!(vA1 = arrayOfVA[s - 1]).TS.AX() && vA1
/* 42 */           .dP)
/* 43 */           i = vA1.xY - 2 + i; 
/* 44 */         if ((vA1 = arrayOfVA[s]) == this.pQ) { k = j + 1; } else { k = j; }  vA1
/* 45 */           .ME(i, k); }  s++; }
/*    */ 
/*    */     
/* 48 */     s = paramj40.Zs.Vf0(); i = paramj40.s5();
/*    */     
/* 50 */     Ax(um0.Kt0.lb(s, paramj40.Zs.da(), i)[0]);
/* 51 */     if (this.A90 == 1) { this
/*    */         
/* 53 */         .z4 = paramj40.m(); zn(); } else { this
/*    */         
/* 55 */         .z4 = rG0.Zs0(paramj40, this.XC0, this.XC0 ^ true, this.XC0 ^ true); zn();
/* 56 */       if (!this.XC0) this
/* 57 */           .Az0 = "tooltip-markup";  }  this
/* 58 */       .jl = 200;
/*    */ 
/*    */     
/* 61 */     hm.Fz0(this.TG0.oh0); }
/*    */ 
/*    */   
/*    */   public j40 t70;
/*    */   public boolean XC0 = true;
/*    */   public VA pQ;
/*    */   
/*    */   public G9() {
/*    */     this((short)-1);
/*    */   }
/*    */   
/*    */   public G9(short paramShort) {
/*    */     super(km.u4.s40(aq0.ne0), paramShort, false);
/*    */     if (km.XU()) {
/*    */       AL(100, 100);
/*    */       zY().zT(14, 4);
/*    */       zY().Ii0(2.0F);
/*    */     } else {
/*    */       AL(48, 48);
/*    */       zY().zT(6, 5);
/*    */     } 
/*    */     if (km.XU()) {
/*    */       VA vA;
/*    */       this(this, 32, 32);
/*    */       this.pQ = new VA();
/*    */       vA.ZH0().Ii0(2.0F);
/*    */       this.OR.ZH0().Ii0(2.0F);
/*    */       this.OR.Cu0(32, 32);
/*    */       this.mG0.ZH0().Ii0(2.0F);
/*    */       this.mG0.Cu0(32, 32);
/*    */     } else {
/*    */       VA vA;
/*    */       this(this, 16, 16);
/*    */       this.pQ = vA;
/*    */     } 
/*    */     J8(this.pQ);
/*    */   }
/*    */   
/*    */   public final void Gq(short paramShort, boolean paramBoolean, byte paramByte) {
/*    */     gs0(paramByte, paramBoolean, paramShort);
/*    */   }
/*    */   
/*    */   public final void gs0(byte paramByte1, byte paramByte2, short paramShort) {
/*    */     String str;
/*    */     zf(null);
/*    */     if ((paramByte2 & 0x9) != 0) {
/*    */       boolean bool2;
/*    */       rH rH = this.OR.TS;
/*    */       pe0[] arrayOfPe0 = new pe0[1];
/*    */       boolean bool1 = false;
/*    */       interface interface = interface.ZZ();
/*    */       if ((paramByte2 & 0x8) != 0) {
/*    */         bool2 = true;
/*    */       } else {
/*    */         bool2 = false;
/*    */       } 
/*    */       arrayOfPe0[bool1] = interface.yI0(bool2);
/*    */       rH.Pn(arrayOfPe0);
/*    */     } else {
/*    */       this.OR.TS.H();
/*    */     } 
/*    */     if ((paramByte2 & 0x2) != 0) {
/*    */       this.pQ.TS.Pn(new pe0[] { (interface.ZZ()).n30 });
/*    */     } else {
/*    */       this.pQ.TS.H();
/*    */     } 
/*    */     if ((paramByte2 & 0x4) != 0) {
/*    */       paramByte2 = 1;
/*    */     } else {
/*    */       paramByte2 = 0;
/*    */     } 
/*    */     VA vA;
/*    */     int i = (vA = this.OR).Kd;
/*    */     int j = this.OR.er0;
/*    */     byte b1, b2;
/*    */     VA[] arrayOfVA;
/*    */     for (arrayOfVA[0] = vA, arrayOfVA[1] = this.mG0, (arrayOfVA = new VA[b2 = 3])[2] = this.pQ, b1 = 0; b1 < b2; ) {
/*    */       if (b1 != 0) {
/*    */         int k;
/*    */         VA vA1;
/*    */         if (!(vA1 = arrayOfVA[b1 - 1]).TS.AX() && vA1.dP)
/*    */           i += 14; 
/*    */         if ((vA1 = arrayOfVA[b1]) == this.pQ) {
/*    */           k = j + 1;
/*    */         } else {
/*    */           k = j;
/*    */         } 
/*    */         vA1.ME(i, k);
/*    */       } 
/*    */       b1++;
/*    */     } 
/*    */     Ax(um0.Kt0.lb(um0.HZ((byte)0, paramShort), paramByte2, (byte)0)[0]);
/*    */     UD0 uD0;
/*    */     if ((uD0 = On.v30().lpT3(paramShort)) == null) {
/*    */       str = "";
/*    */     } else {
/*    */       str = uD0.o60(false) + "\n" + Ml0.OH0(1840) + " " + str;
/*    */     } 
/*    */     this.z4 = str;
/*    */     zn();
/*    */     this.jl = 200;
/*    */     hm.Fz0(this.TG0.oh0);
/*    */   }
/*    */   
/*    */   public void d40() {
/*    */     super.d40();
/*    */     this.OR.ME(this.Kd + 1, this.er0 + 1);
/*    */   }
/*    */   
/*    */   public final j40 public() {
/*    */     return this.t70;
/*    */   }
/*    */   
/*    */   public final void dC0() {
/*    */     this.XC0 = false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */