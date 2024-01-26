/*    */ package f;public final class f5 extends SI0 { public final void p4(kf paramkf) { fh0 fh0; String str1; j40 j40; Gp0 gp0; sF0 sF01; String str2; DH dH; F40 f40; byte b2; String[] arrayOfString; aq0 aq0; byte b1; hm0 hm0;
/*    */     byte b;
/*  3 */     for (b1 = (Of.eH.On0(this.il)).KU, hm0 = null, b = 0; b < 
/*  4 */       km.MR.wI(Gp0.Sr0(this.XZ)) && (hm0 = km.MR.N0(Gp0.Sr0(this.XZ), b)) == null;) b = (byte)(b + 1);  switch (this.mU) { default: return;case 4: b2 = this.mU; this(hm0, b1, b2); paramkf.t80(dH); str1 = ""; if (hm0 != null) str1 = hm0.I9();  f40 = F40.ef0; (arrayOfString = new String[1])[0] = str1; paramkf
/*    */           
/*  6 */           .Kq(Ml0.lz((byte)2, f40, 15, 65, arrayOfString));
/*  7 */         gp0 = paramkf.AD;
/*  8 */         if (hm0 != null && gp0
/*  9 */           .sH
/* 10 */           .qI0(hm0.Jx()))
/* 11 */         { String[] arrayOfString1; (arrayOfString1 = new String[1])[0] = str1;
/*    */           
/* 13 */           paramkf.Kq(Ml0.lz((byte)2, f40, 15, 66, arrayOfString1)); }  if ((sF01 = this.Gh)
/* 14 */           .bh0 == (
/* 15 */           aq0 = aq0.XJ0)) {
/*    */ 
/*    */           
/* 18 */           str2 = km.u4.y80.Kg((byte)(sF01.rM / 60)); String[] arrayOfString1; (arrayOfString1 = new String[2])[0] = str1; (new String[2])[1] = str2;
/*    */           
/* 20 */           paramkf.Kq(Ml0.lz((byte)2, f40, 234, 176, arrayOfString1));
/*    */         } 
/* 22 */         if (!paramkf.AD.sQ()) { str1 = null; if (this.Gh
/* 23 */             .bh0 == aq0)
/*    */           {
/*    */             
/* 26 */             j40 = km.u4.s40(aq0).ky(this.Gh.rM); }  if (j40 != null) if (km.XU())
/*    */             
/* 28 */             { this(j40);
/* 29 */               paramkf.AD.Oq0
/* 30 */                 .add(this); } else { paramkf
/* 31 */                 .YP
/* 32 */                 .add(new Lt0(j40)); }   } case 0: case 1: case 2: case 3: paramkf.t80(new DH((hm0)str2, j40, ((f5)super).mU)); paramkf.Kq(Ml0.Qf0(F40.ef0, 15, ((f5)super).mU + 61));case -1: paramkf.Kq(Ml0.Qf0(F40.ef0, 15, 67));case -2: paramkf.Kq(Ml0.Qf0(F40.ef0, 17, 45));case -3: paramkf.Kq(Ml0.OH0(6907));case -5: paramkf.Kq(Ml0.Qf0(F40.ef0, 15, 196));case -6: paramkf.Kq(Ml0.Qf0(F40.ef0, 17, 44));case -7: case -4: paramkf.Kq(Ml0.Qf0(F40.ef0, 17, 47));case -8: paramkf.Kq(Ml0.OH0(16803000));case -9: break; }  paramkf.Kq(Ml0.Qf0(F40.ef0, 17, 51)); }
/*    */ 
/*    */   
/*    */   public final byte XZ;
/*    */   public final short il;
/*    */   public final byte mU;
/*    */   public final sF0 Gh;
/*    */   
/*    */   public f5(byte paramByte1, short paramShort, byte paramByte2, sF0 paramsF0) {
/*    */     this.XZ = paramByte1;
/*    */     this.il = paramShort;
/*    */     this.mU = paramByte2;
/*    */     this.Gh = paramsF0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */