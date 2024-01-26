/*  1 */ package f;public final class s extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { char c5; String str4; char c4; String str3; char c3; String str2; char c2; String str1; char c1; F40 f404; String str9; F40 f403; String str8; F40 f402; String str7; F40 f401; String str6; byte b; int i; String arrayOfString[], str5 = "";
/*    */     QZ qZ;
/*  3 */     if ((qZ = paramkf.AD.wB(this.Lpt5)) != null) str5 = qZ.dy();  String str10 = ""; switch (this
/*  4 */       .cM)
/*    */     { case 17:
/*  6 */         c5 = '~';
/*    */       case 16:
/*  8 */         c5 = '|';
/*    */       case 15:
/* 10 */         c5 = '';
/*    */       case 14:
/* 12 */         c5 = '';
/*    */       case 13:
/* 14 */         c5 = '';
/*    */       case 12:
/* 16 */         c5 = '';case 11: if (paramhm02 != null)
/* 17 */           str4 = paramhm02.fA();  f404 = F40.ef0; b = 14;
/*    */         
/* 19 */         i = paramkf.AD.ex(800, paramhm02); (arrayOfString = new String[1])[0] = str4;
/* 20 */         str9 = Ml0.lz((byte)2, f404, b, i, arrayOfString); break;
/*    */       case 10:
/* 22 */         c4 = '¢';case 9: if (paramhm02 != null)
/* 23 */           str3 = paramhm02.fA();  f403 = F40.ef0; b = 14;
/*    */         
/* 25 */         i = paramkf.AD.ex(797, paramhm02); (arrayOfString = new String[1])[0] = str3;
/* 26 */         str8 = Ml0.lz((byte)2, f403, b, i, arrayOfString); break;
/*    */       case 8:
/* 28 */         c3 = ' ';
/*    */       case 7:
/* 30 */         c3 = '';
/*    */       case 6:
/* 32 */         c3 = '';case 5: if (paramhm02 != null)
/* 33 */           str2 = paramhm02.fA();  f402 = F40.ef0; b = 14;
/*    */         
/* 35 */         i = paramkf.AD.ex(842, paramhm02); (arrayOfString = new String[1])[0] = str2;
/* 36 */         str7 = Ml0.lz((byte)2, f402, b, i, arrayOfString); break;
/*    */       case 4:
/* 38 */         c2 = '';
/*    */       case 3:
/* 40 */         c2 = '';case 2: if (paramhm02 != null)
/* 41 */           str1 = paramhm02.fA();  f401 = F40.ef0; b = 14;
/*    */         
/* 43 */         i = paramkf.AD.ex(839, paramhm02); (arrayOfString = new String[1])[0] = str1;
/* 44 */         str6 = Ml0.lz((byte)2, f401, b, i, arrayOfString); break;
/*    */       case 1:
/* 46 */         c1 = '';
/*    */       case 0:
/* 48 */         c1 = '';
/*    */         
/* 50 */         str6 = Ml0.Qf0(F40.ef0, 15, paramkf.AD.iD(c1, this.Lpt5)); break; }  if (this.L0) { LV lV; paramkf.cr(str6); byte b1;
/* 51 */       if ((b1 = this.cM) != 0) { if (b1 != 3) { if (b1 != 6) { if (b1 != 8) { if (b1 != 10) { if (b1 != 12) { if (b1 != 14) { if (b1 != 16) {
/*    */                       return;
/*    */                     }
/* 54 */                     this((byte)0, O5.AU.xa(paramhm02, (short)115)); }
/*    */                   
/*    */                   else
/*    */                   
/* 58 */                   { this((byte)0, O5.AU.xa(paramhm02, (short)113)); }
/*    */                    }
/* 60 */                 else { this((byte)0, O5.AU.xa(paramhm02, (short)381)); }
/*    */                  }
/* 62 */               else { this((byte)0, O5.AU.xa(paramhm02, (short)501)); }
/*    */                }
/* 64 */             else { this((byte)0, O5.AU.xa(paramhm02, (short)469)); }
/*    */              }
/* 66 */           else { this((byte)0, O5.AU.xa(paramhm02, (short)366)); }
/*    */            }
/* 68 */         else { this((byte)0, O5.AU.xa(paramhm02, (short)54)); }
/*    */          }
/* 70 */       else { this((byte)0, O5.AU.xa(paramhm02, (short)219)); }  paramkf.YP.add(this); } else { paramkf.Kq(str6); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final byte Lpt5;
/*    */   public final byte cM;
/*    */   public final boolean L0;
/*    */   
/*    */   public s(byte paramByte1, byte paramByte2, boolean paramBoolean) {
/*    */     this.Lpt5 = paramByte1;
/*    */     this.cM = paramByte2;
/*    */     this.L0 = paramBoolean;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return 28;
/*    */   }
/*    */   
/*    */   public final boolean Lt() {
/*    */     return this.L0 ? true : super.Lt();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */