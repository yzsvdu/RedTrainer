/*  1 */ package f;public final class P1 { public final void h80(hZ paramhZ) { this(); ArrayList<s40> arrayList; h9 h9; fQ fQ; ArrayList<hZ> arrayList1; (new fQ()).tu0((Object[])new String[] { h1.Vh, h1.Pq, h1.h0, h1.yD0, h1.Re0 }, 0, 5);
/*  2 */     Arrays.<RD0>stream(paramhZ.XX("_import")).map(P1::Bc).forEach(fQ::zn); this(); if (!h1.Pq.isEmpty()) { String str = h1.Pq; km.iE0.getClass(); arrayList1
/*    */         
/*  4 */         .add(UB0.vj0.lPT1(str)); }  if (!h1.Vh.isEmpty()) { String str = h1.Vh; km.iE0.getClass(); arrayList1
/*    */         
/*  6 */         .add(UB0.vj0.lPT1(str)); }  if (!h1.h0.isEmpty()) { String str = h1.h0; km.iE0.getClass(); arrayList1
/*    */         
/*  8 */         .add(UB0.vj0.lPT1(str)); }  if (!h1.yD0.isEmpty()) { String str = h1.yD0; km.iE0.getClass(); arrayList1
/*    */         
/* 10 */         .add(UB0.vj0.lPT1(str)); }  if (!h1.Re0.isEmpty()) { String str = h1.Re0; km.iE0.getClass(); arrayList1
/*    */         
/* 12 */         .add(UB0.vj0.lPT1(str)); }  if (q00.Dz) { km.iE0.getClass(); km.iE0.getClass(); } else { if (!paramhZ.L0()) paramhZ.iz0();  if (paramhZ.L0() && paramhZ.Qg0()) arrayList1.addAll((Collection)Arrays.asList(paramhZ.pn()));  }  int i = arrayList1.size(); arrayList1.removeIf(Objects::isNull); Uh0
/*    */       
/* 14 */       .info(B40.df("Rom potential count ").append(arrayList1.size()).append(" (").append(i - arrayList1.size()).append(")").toString()); for (Iterator<hZ> iterator = arrayList1.iterator(); iterator.hasNext(); ) { RD0 rD0; if ((rD0 = iterator.next()) == null || !rD0.L0() || rD0.Qg0() || rD0.bo() == null || rD0
/* 15 */         .ml.getName()
/* 16 */         .equals("importing.tmp")) continue;  ik ik1; (ik1 = Uh0)
/*    */ 
/*    */         
/* 19 */         .info(B40.df("Possible rom ").append(rD0.ml.getName()).append(" (size: ").append(rD0.tN() / 1048576L).append(" MB) ").append(rD0.getClass()).toString()); if (this.UG0 == null || this.UI0 == null) try { s40 s402; this(rD0); if ((new s40()).in() == 0) { if (this.UG0 == null && s402
/* 20 */               .wJ != null) { ik1
/*    */ 
/*    */                 
/* 23 */                 .info("Loaded " + s402.coM7 + " v1." + s402.H5 + " as gba rom."); this.UG0 = s402; }  continue; }  if (s402.in() == 1 && this.UI0 == null) { ik1
/*    */               
/* 25 */               .info("Loaded " + s402.coM7 + " v1." + s402.H5 + " as extended gba rom."); this.UI0 = s402; }
/*    */ 
/*    */ 
/*    */           
/*    */           continue; }
/* 30 */         catch (Np np) {  } catch (IOException iOException) { Uh0.warn(B40.df("Could not load ").append(rD0.rw()).append(" as a gba rom because: ").append(iOException.getMessage()).toString(), iOException); km.mI0.getClass(); if (Nn0(iOException)) { km.VH.Qs0 = Ml0.la(81, "Fatal OutOfMemoryError.\n\nPlease restart the application and try again.\nIf this persists please raise the memory allocation.\nPlease visit https://pokemmo.com/oom for more information."); this.Mv0 = true; return; }  } catch (Exception exception) { Uh0.warn(B40.df("Could not load ").append(rD0.rw()).append(" as a gba rom because: ").append(exception.getMessage()).toString(), exception); }   if (rD0
/* 31 */         .tN() > 2048L) try { ml ml; this(rD0); if (this.AN == null && Arrays.<String>asList(Wo.Bc).contains(ml.UI))
/* 32 */           { Wo wo1; this(rD0);
/* 33 */             this.AN = wo1; }  if (this.yE == null && Arrays.<String>asList(BE.Vt).contains(ml.UI))
/* 34 */           { BE bE1; this(rD0);
/* 35 */             this.yE = bE1; }  if (this.MT == null && Arrays.<String>asList(gD.o9).contains(ml.UI)) {
/* 36 */             gD gD2; this(rD0);
/* 37 */             this.MT = gD2;
/*    */           }
/*    */            }
/* 40 */         catch (Np np) {  } catch (Exception exception) { Uh0.warn(B40.df("Could not load ").append(rD0.rw()).append(" as a nds rom because: ").append(exception.getMessage()).toString(), exception); km.mI0.getClass(); if (Nn0(exception)) { km.VH.Qs0 = Ml0.la(81, "Fatal OutOfMemoryError.\n\nPlease restart the application and try again.\nIf this persists please raise the memory allocation.\nPlease visit https://pokemmo.com/oom for more information."); this.Mv0 = true; return; }  }   }  if (this
/* 41 */       .AN == null) { this.Mv0 = true; return; }
/* 42 */      this(); s40 s401; if ((s401 = this.UG0) != null) arrayList.add(s401);  if ((s401 = this.UI0) != null) arrayList.add(s401);  this.vo = arrayList.<s40>toArray(new s40[0]); this(); Wo wo; if ((wo = this.AN) != null) arrayList.add(wo);  gD gD1; if ((gD1 = this.MT) != null) arrayList.add(gD1);  BE bE; if ((bE = this.yE) != null) arrayList.add(bE);  this.W40 = arrayList.<HI>toArray(new HI[0]); this(); s40[] arrayOfS40; int j, k; for (j = (arrayOfS40 = this.vo).length, k = 0; k < j; ) { if (h9
/* 43 */         .nw(arrayOfS40[k].in()) >= 0) h9.xt0(h9.ma);  k++; }
/* 44 */      HI[] arrayOfHI; for (j = (arrayOfHI = this.W40).length, k = 0; k < j; ) { if (h9
/* 45 */         .nw(arrayOfHI[k].bO()) >= 0) h9.xt0(h9.ma);  k++; }
/*    */      byte[] arrayOfByte1, arrayOfByte2, arrayOfByte3; int m;
/* 47 */     for (arrayOfByte1 = new byte[h9.ir0], arrayOfByte2 = h9.Sx0, k = (arrayOfByte3 = h9.JO).length, m = 0; k-- > 0;) { if (arrayOfByte3[k] == 1) { int n = m + 1; arrayOfByte1[m] = arrayOfByte2[k]; m = n; }  }  this
/* 48 */       .q20 = arrayOfByte1; }
/*    */ 
/*    */   
/*    */   public static final ik Uh0 = C00.gd(P1.class);
/*    */   public s40 UG0 = null;
/*    */   public s40 UI0 = null;
/*    */   public s40[] vo = new s40[0];
/*    */   public HI[] W40 = new HI[0];
/*    */   public BE yE = null;
/*    */   public gD MT = null;
/*    */   public Wo AN = null;
/*    */   public boolean Mv0 = false;
/*    */   public byte[] q20 = new byte[0];
/*    */   
/*    */   public static boolean Nn0(Exception paramException) {
/*    */     while (paramException != null) {
/*    */       if (OutOfMemoryError.class.isInstance(paramException))
/*    */         return true; 
/*    */       if ("Map failed".equalsIgnoreCase(paramException.getMessage()))
/*    */         return true; 
/*    */       Throwable throwable = paramException.getCause();
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean s2(byte paramByte) {
/*    */     if (paramByte == 10)
/*    */       return true; 
/*    */     s40 s401;
/*    */     if ((s401 = this.UG0) != null && s401.in() == paramByte)
/*    */       return true; 
/*    */     if ((s401 = this.UI0) != null && s401.in() == paramByte)
/*    */       return true; 
/*    */     Wo wo;
/*    */     if ((wo = this.AN) != null) {
/*    */       wo.getClass();
/*    */       if (2 == paramByte)
/*    */         return true; 
/*    */     } 
/*    */     gD gD1;
/*    */     if ((gD1 = this.MT) != null) {
/*    */       gD1.getClass();
/*    */       if (3 == paramByte)
/*    */         return true; 
/*    */     } 
/*    */     BE bE;
/*    */     if ((bE = this.yE) != null) {
/*    */       getClass();
/*    */       if (4 == paramByte)
/*    */         return true; 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final s40 Sa(byte paramByte) {
/*    */     s40 s401;
/*    */     return ((s401 = this.UG0) != null && s401.in() == paramByte) ? this.UG0 : (((s401 = this.UI0) != null && s401.in() == paramByte) ? this.UI0 : null);
/*    */   }
/*    */   
/*    */   public final HI LpT7(byte paramByte) {
/*    */     Wo wo;
/*    */     if ((wo = this.AN) != null) {
/*    */       wo.getClass();
/*    */       if (2 == paramByte)
/*    */         return this.AN; 
/*    */     } 
/*    */     gD gD1;
/*    */     if ((gD1 = this.MT) != null) {
/*    */       gD1.getClass();
/*    */       if (3 == paramByte)
/*    */         return this.MT; 
/*    */     } 
/*    */     BE bE;
/*    */     if ((bE = this.yE) != null) {
/*    */       bE.getClass();
/*    */       if (4 == paramByte)
/*    */         return this.yE; 
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final s40[] YL() {
/*    */     return this.vo;
/*    */   }
/*    */   
/*    */   public final HI[] i8() {
/*    */     return this.W40;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/P1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */