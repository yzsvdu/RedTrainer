/*  1 */ package f;public final class RD { public final void C90(int paramInt, Fo0[] paramArrayOfFo0) { byteBuffer.position(paramInt + 6); short s = byteBuffer.getShort(); ByteBuffer byteBuffer; (byteBuffer = this.qA.GA0()).position(paramInt); this(); HashMap<Object, Object> hashMap; S s2; byte b; label39: for (b = 0; b < s; ) { this(); vC.rs0 = byteBuffer.getInt(); vC.Td = byteBuffer.getShort(); byteBuffer.getShort(); int i = byteBuffer.position(); byteBuffer.position(paramInt + vC.rs0); VC vC; short s3 = (vC = new VC()).Td; byte[] arrayOfByte = new byte[127]; while (true) { String str; byte b1; if ((b1 = byteBuffer.get()) == 0) { hashMap.put(Integer.valueOf(b), vC); byteBuffer.position(i); b++; continue label39; }  b1 = (byte)(b1 & Byte.MAX_VALUE); byteBuffer.get(arrayOfByte, 0, b1); this(arrayOfByte, 0, b1); if (((b1 & 0x80) == 0)) { T7 t7; HI hI1 = this.qA; int j = (paramArrayOfFo0[s3]).GH0, k = (paramArrayOfFo0[s3]).Dm; this(hI1, str, j, k, s3); s3 = (short)(s3 + 1); vC.Ab0.eo0
/*  2 */             .add(t7); continue; }
/*  3 */          this(); s4.B1 = str; S s4; (s4 = new S()).Dz = byteBuffer.getShort() & 0xFFFF; vC.Ab0.v9.add(s4); }  }  S s1; ArrayList<S> arrayList = (s1 = dt(hashMap, 0, "", "")).v9; HI hI = this.qA;
/*  4 */     this(); for ((new S()).B1 = "ftc", (new S()).Dz = 61440, b = 0; b < 2; ) { Do0[] arrayOfDo0; if (b == 0)
/*    */       
/*  6 */       { arrayOfDo0 = hI.qa0.Og0; }
/*    */       else
/*  8 */       { arrayOfDo0 = hI.qa0.dF0; }  int i; byte b1; for (i = arrayOfDo0.length, b1 = 0; b1 < i; ) { String str2; Do0 do0 = arrayOfDo0[b1]; TF tF = new TF();
/*  9 */         StringBuilder stringBuilder = B40.df("overlay"); if (b == 0)
/* 10 */         { str2 = "9"; } else { str2 = "7"; }
/* 11 */          String str1 = N.Gl0(stringBuilder.append(str2).append("_"), do0.sZ, ".bin");
/* 12 */         int j = (paramArrayOfFo0[do0.c20]).GH0, k = (paramArrayOfFo0[do0.c20]).Dm; short s3 = (short)do0.c20; this(hI, str1, j, k, s3); do0.UG = tF;
/* 13 */         s2.eo0.add(tF); b1++; }  b++; }
/* 14 */      XR(s2, "/");
/* 15 */     arrayList.add(s2); F8(s1); }
/*    */ 
/*    */   
/*    */   public final HI qA;
/*    */   public HashMap o = new HashMap<>();
/*    */   public HashMap Rh = new HashMap<>();
/*    */   
/*    */   public RD(HI paramHI) {
/*    */     this.qA = paramHI;
/*    */     Fo0[] arrayOfFo0 = oD0((paramHI.l3()).LB0, (paramHI.l3()).RK);
/*    */     C90((paramHI.l3()).dg0, this);
/*    */   }
/*    */   
/*    */   public final T7 B8(String paramString) {
/*    */     return (T7)this.Rh.get(paramString);
/*    */   }
/*    */   
/*    */   public final Fo0[] oD0(int paramInt1, int paramInt2) {
/*    */     int i;
/*    */     Fo0[] arrayOfFo0 = new Fo0[i = paramInt2 / 8];
/*    */     ByteBuffer byteBuffer;
/*    */     (byteBuffer = this.qA.GA0()).position(paramInt1);
/*    */     for (paramInt1 = 0; paramInt1 < i; paramInt1++) {
/*    */       this();
/*    */       arrayOfFo0[paramInt1] = fo0;
/*    */       Fo0 fo0;
/*    */       (fo0 = new Fo0()).GH0 = byteBuffer.getInt();
/*    */       (arrayOfFo0[paramInt1]).Dm = byteBuffer.getInt() - (arrayOfFo0[paramInt1]).GH0;
/*    */     } 
/*    */     return arrayOfFo0;
/*    */   }
/*    */   
/*    */   public final void F8(S paramS) {
/*    */     if (paramS != null) {
/*    */       Iterator<S> iterator;
/*    */       if (this.o.put(Integer.valueOf(paramS.Dz & 0xFFFF), paramS) == null) {
/*    */         ArrayList arrayList;
/*    */         if ((arrayList = paramS.v9) != null)
/*    */           for (iterator = arrayList.iterator(); iterator.hasNext(); F8(iterator.next())); 
/*    */       } else {
/*    */         throw new RuntimeException(B40.df("replacing ").append(iterator.Dz).toString());
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final S dt(HashMap paramHashMap, int paramInt, String paramString1, String paramString2) {
/*    */     VC vC = (VC)paramHashMap.get(Integer.valueOf(paramInt & 0xFFF));
/*    */     this();
/*    */     s.B1 = paramString1;
/*    */     s.Dz = (short)paramInt;
/*    */     S s;
/*    */     (s = new S()).eo0 = vC.Ab0.eo0;
/*    */     String str = De0.AT(paramString2, paramString1, "/");
/*    */     for (S s1 : vC.Ab0.v9) {
/*    */       int i = s1.Dz;
/*    */       s.v9.add(dt(paramHashMap, i, s1.B1, str));
/*    */     } 
/*    */     Iterator<T7> iterator = s.eo0.iterator();
/*    */     while (iterator.hasNext()) {
/*    */       T7 t7;
/*    */       String str1 = B40.df(str).append(t7.JP).toString();
/*    */       this.Rh.put(str1, t7);
/*    */     } 
/*    */     return s;
/*    */   }
/*    */   
/*    */   public final void XR(S paramS, String paramString) {
/*    */     paramString = UQ.Vr0(B40.df(paramString), paramS.B1, "/");
/*    */     for (Iterator<S> iterator1 = paramS.v9.iterator(); iterator1.hasNext(); XR(iterator1.next(), paramString));
/*    */     for (Iterator<T7> iterator = paramS.iterator(); iterator.hasNext(); ) {
/*    */       T7 t7;
/*    */       String str = B40.df(paramString).append(t7.JP).toString();
/*    */       this.Rh.put(str, t7);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */