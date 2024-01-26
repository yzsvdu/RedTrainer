/* 1 */ package f;public final class xk0 { public final void gc(int paramInt1, int paramInt2, s40 params40) { Lu0[] arrayOfLu0; int i; byte b; for (i = (arrayOfLu0 = this.Pf0).length, b = 0; b < i; ) { Lu0 lu0; if (paramInt1 == (lu0 = this[b]).YJ0 && params40.in() == lu0.bz && lu0.su0 == 0) { params40.pr().position(paramInt2 + lu0.uV); int j; if (!pN.pk0(j = params40.pr().getInt())) { System.out
/*   */ 
/*   */ 
/*   */             
/* 5 */             .println(B40.df("Error @ ").append(B40.df("0x").append(Integer.toHexString(paramInt2 + lu0.uV).toUpperCase()).toString()).toString()); } else { lu0.su0 = pN.tx0(j); }  }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static xk0 Sj0 = new xk0();
/*   */   public final Lu0[] Pf0;
/*   */   
/*   */   public xk0() {
/*   */     ArrayList<Lu0> arrayList;
/*   */     Lu0 lu02;
/*   */     Lu0 lu01;
/*   */     this();
/*   */     this((byte)0, 0, 5, 508, 4, -141);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)0, 0, 8, 464, 18, -61);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)0, 0, 8, 416, 48, -101);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)0, 45, 4, 976, 8, -53);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)0, 28, 2, 880, 7, -33);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)0, 57, 4, 896, 8, -33);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)0, 7, 5, 744, 8, -53);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)1, 0, 4, 508, 4, 203);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)1, 0, 8, 432, 30, 243);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)1, 0, 8, 464, 10, 283);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     this((byte)1, 0, 4, 496, 6, 323);
/*   */     (new ArrayList<>()).add(lu02);
/*   */     for (byte b2 = 0; b2 < 8; b2++) {
/*   */       int i = b2 * 4 + 640;
/*   */       arrayList.add((new Lu0((byte)1, 2, 8, i, 4, 2003)).b3(b2));
/*   */     } 
/*   */     this((byte)1, 2, 2, 960, 4, 2043);
/*   */     arrayList.add(lu01);
/*   */     this((byte)1, 3, 4, 682, 6, 2175);
/*   */     arrayList.add(lu01);
/*   */     this((byte)1, 4, 4, 736, 4, 2251);
/*   */     arrayList.add(lu01);
/*   */     byte b1;
/*   */     for (b1 = 0; b1 < 16; b1++) {
/*   */       int i = b1 * 4 + 608;
/*   */       arrayList.add((new Lu0((byte)1, 5, 16, i, 4, 1735)).b3(b1));
/*   */     } 
/*   */     arrayList.add(new Lu0((byte)1, 6, 4, 800, 4, 1479));
/*   */     arrayList.add(new Lu0((byte)1, 6, 4, 672, 4, 1999));
/*   */     arrayList.add((new Lu0((byte)1, 6, 4, 804, 4, 1479)).b3(2));
/*   */     for (b1 = 0; b1 < 8; b1++) {
/*   */       int i = b1 * 4 + 736;
/*   */       arrayList.add((new Lu0((byte)1, 11, 8, i, 4, 1755)).b3(b1));
/*   */     } 
/*   */     arrayList.add(new Lu0((byte)1, 12, 4, 976, 30, 1275));
/*   */     arrayList.add(new Lu0((byte)1, 12, 8, 1008, 8, 1355));
/*   */     arrayList.add(new Lu0((byte)1, 13, 8, 752, 96, 2375));
/*   */     arrayList.add(new Lu0((byte)1, 14, 4, 730, 6, 1779));
/*   */     arrayList.add(new Lu0((byte)1, 15, 4, 730, 6, 1735));
/*   */     arrayList.add(new Lu0((byte)1, 16, 2, 496, 4, 2911));
/*   */     arrayList.add(new Lu0((byte)1, 30, 2, 1008, 9, 2007));
/*   */     arrayList.add(new Lu0((byte)1, 44, 4, 1008, 4, 1135));
/*   */     arrayList.add(new Lu0((byte)1, 46, 3, 1008, 12, 1999));
/*   */     arrayList.add(new Lu0((byte)1, 46, 3, 976, 20, 2007));
/*   */     arrayList.add(new Lu0((byte)1, 51, 2, 656, 16, 2011));
/*   */     arrayList.add(new Lu0((byte)1, 58, 2, 992, 4, 2007));
/*   */     arrayList.add(new Lu0((byte)1, 58, 4, 1016, 1, 1967));
/*   */     arrayList.add(new Lu0((byte)1, 65, 3, 663, 8, 2047));
/*   */     arrayList.add(new Lu0((byte)1, 65, 3, 647, 8, 2091));
/*   */     this.Pf0 = arrayList.<Lu0>toArray(new Lu0[0]);
/*   */   }
/*   */   
/*   */   public static xk0 cOM2() {
/*   */     return Sj0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */