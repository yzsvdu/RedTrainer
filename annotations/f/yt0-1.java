/*  1 */ package f;public final class yt0 extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { if (paramhm02 == null || paramhm02.XW() == 0) return;  byte[] arrayOfByte; if ((arrayOfByte = this.wc).length == hR.h40.length) { byte b; byte b1 = arrayOfByte[0]; int j = arrayOfByte.length; paramBoolean3 = false; while (true) { if (paramBoolean3 < j) { if (arrayOfByte[paramBoolean3] != b1) { boolean bool = false; break; }  paramBoolean3++; continue; }  b = 1; break; }  if (b)
/*  2 */       { i70 i70; if ((b = this.wc[0]) == 0) return;  if (b > 0) { if (b != 1) { if (b != 2) {
/*    */               
/*  4 */               k = paramkf.AD.ex(200446, paramhm02);
/*    */             } else {
/*  6 */               k = paramkf.AD.ex(200443, paramhm02);
/*    */             }  }
/*  8 */           else { k = paramkf.AD.ex(200440, paramhm02); }  } else if (b != -2) { if (b != -1) {
/*    */             
/* 10 */             k = paramkf.AD.ex(200455, paramhm02);
/*    */           } else {
/* 12 */             k = paramkf.AD.ex(200449, paramhm02);
/*    */           }  }
/* 14 */         else { k = paramkf.AD.ex(200452, paramhm02); }  paramkf.cr(Ml0.Go(k, paramhm02.fA())); this(paramkf, paramhm01, paramhm02, null, b, true); paramkf
/* 15 */           .YP.add(this); int k;
/* 16 */         for (i = (arrayOfHR1 = this.pT).length, k = 0; k < i; ) { paramhm02.aJ(this[k], b); paramkf.oD(paramhm02).Eh(); k++; }  return; }  }  this(); hR[] arrayOfHR1; int i; HashMap<Object, Object> hashMap; hR[] arrayOfHR2; for (paramBoolean2 = false; paramBoolean2 < (arrayOfHR2 = ((yt0)super).pT).length; ) { hR hR1 = arrayOfHR2[paramBoolean2]; ((List<hR>)hashMap.computeIfAbsent(Byte.valueOf(((yt0)super).wc[paramBoolean2]), yt0::Bm0)).add(hR1); paramBoolean2++; }  for (Iterator<Map.Entry> iterator = hashMap.entrySet().iterator(); iterator.hasNext(); ) { i70 i70; Map.Entry<?, List> entry; List<hR> list; if ((list = (entry = iterator.next()).getValue()).size() > 1) { str = Ml0.sB(list.size() - 2 + 200458, (String[])list.stream().map(hR::toString).toArray(yt0::Vh)); } else { str = ((hR)list.get(0)).toString(); }  byte b = ((Byte)entry.getKey()).byteValue(); if (((yt0)super).fk0 > 0) { if (b != 0) { if (b != 1) { if (b != 2) {
/*    */               
/* 18 */               str = Ml0.sB(paramkf.AD.ex(200470, paramhm02), new String[] { paramhm02.fA(), str });
/*    */             } else {
/* 20 */               str = Ml0.sB(paramkf.AD.ex(200467, paramhm02), new String[] { paramhm02.fA(), str });
/*    */             }  }
/* 22 */           else { str = Ml0.sB(paramkf.AD.ex(200464, paramhm02), new String[] { paramhm02.fA(), str }); }
/*    */            }
/* 24 */         else { str = Ml0.sB(paramkf.AD.ex(200482, paramhm02), new String[] { paramhm02.fA(), str }); }  } else if (b != -2) { if (b != -1) { if (b != 0) {
/*    */             
/* 26 */             str = Ml0.sB(paramkf.AD.ex(200479, paramhm02), new String[] { paramhm02.fA(), str });
/*    */           } else {
/* 28 */             str = Ml0.sB(paramkf.AD.ex(200485, paramhm02), new String[] { paramhm02.fA(), str });
/*    */           }  }
/* 30 */         else { str = Ml0.sB(paramkf.AD.ex(200473, paramhm02), new String[] { paramhm02.fA(), str }); }
/*    */          }
/* 32 */       else { str = Ml0.sB(paramkf.AD.ex(200476, paramhm02), new String[] { paramhm02.fA(), str }); }  String str = cS.JF(48, str); if (b == 0) { paramkf.Kq(str); continue; }  paramkf.cr(str); this(paramkf, i, paramhm02, null, b, true); paramkf
/* 33 */         .YP.add(i70);
/* 34 */       for (Iterator<hR> iterator1 = list.iterator(); iterator1.hasNext(); ) { paramhm02.aJ(iterator1.next(), b); paramkf.oD(paramhm02).Eh(); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final hR[] pT;
/*    */   public byte fk0;
/*    */   public byte[] wc;
/*    */   
/*    */   public yt0(hR[] paramArrayOfhR, byte paramByte, byte[] paramArrayOfbyte) {
/*    */     if (!py.Gw0(null, (Object[])paramArrayOfhR)) {
/*    */       this.pT = paramArrayOfhR;
/*    */       this.fk0 = paramByte;
/*    */       this.wc = paramArrayOfbyte;
/*    */       return;
/*    */     } 
/*    */     throw null;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return -14;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yt0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */