/*  1 */ package f;public class JS extends GS implements Np0 { public void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { if (paramhm02.XW() > this.cOM9) { xP xP; char c = 'դ'; if (paramb60 != null) if (paramb60
/*  2 */           .Fc0((short)32)) { c = 'գ'; } else if (paramb60.Fc0((short)16)) { c = 'ե'; }
/*  3 */           this((byte)2, c);
/*  4 */       paramkf.YP
/*  5 */         .add(xP); }
/*  6 */     else if (!QI((byte)8) && paramhm02
/*  7 */       .XW() != this
/*  8 */       .cOM9 && paramBoolean3)
/*    */     { xP xP;
/* 10 */       this((byte)2, (short)1391);
/* 11 */       paramkf.YP
/* 12 */         .add(xP);
/* 13 */       F40 f40 = F40.ef0; paramShort = 14;
/*    */       
/* 15 */       int i = paramkf.AD.ex(3, paramhm02); String[] arrayOfString2; (arrayOfString2 = new String[1])[0] = paramhm02.fA();
/*    */       
/* 17 */       byte b = 14; paramShort = 387; String[] arrayOfString1; (arrayOfString1 = new String[1])[0] = paramhm02.fA();
/*    */       
/* 19 */       paramkf.Kq((paramhm02.XW() < 1) ? Ml0.tG((byte)2, f40, paramShort, i, arrayOfString2) : Ml0.tG((byte)2, F40.ef0, b, paramShort, arrayOfString1)); }  paramhm02
/*    */       
/* 21 */       .tx(this.cOM9); this(this, paramhm02, paramkf.oD(paramhm02), paramBoolean1, paramBoolean2); zH zH;
/* 22 */     paramkf.YP.add(zH); }
/*    */ 
/*    */   
/*    */   public final short cOM9;
/*    */   
/*    */   public JS(short paramShort) {
/*    */     this.cOM9 = paramShort;
/*    */   }
/*    */   
/*    */   public byte YG0() {
/*    */     return 0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */