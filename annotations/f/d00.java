/*  1 */ package f;public final class d00 { public static final ik mo0 = C00.gd(d00.class); public static final ik fj = C00.R4("mod"); public static final d00 Je = new d00(); public final void EZ() { hZ hZ1 = UB0.vj0.N0("data/mods/"); this(); fQ fQ; hZ hZ2 = UB0.vj0.aP("data/resources.zip"); if (!km.ER() && hZ2.L0()) { fQ.Com3(hZ2); } else { fQ.Com3(UB0.vj0.aP("data/resources/")); }  boolean bool2; Hc0 hc02; for (bool2 = true, hc02 = fQ.r30(); hc02.hasNext(); Tq0((RD0)hc02.next(), bool2));
/*  2 */     if (!hZ1.L0()) hZ1.iz0();  if (!hZ1.L0()) return;  fQ.clear(); RD0[] arrayOfRD02; int j; byte b; for (j = (arrayOfRD02 = hZ1.XX(".lock")).length, b = 0; b < j; ) { arrayOfRD02[b].rB0(arrayOfRD02[b].k6()).La0(); arrayOfRD02[b].La0(); b++; }
/*  3 */      RD0[] arrayOfRD01; int i = (arrayOfRD01 = hZ1.pn()).length; fQ.tu0((Object[])arrayOfRD01, 0, i); boolean bool1 = false;
/*  4 */     for (Hc0 hc01 = fQ.r30(); hc01.hasNext(); Tq0((RD0)hc01.next(), bool1)); }
/*    */   public ArrayList nr0; public ArrayList ZJ; public d00() { ArrayList arrayList; this(); this.nr0 = this; this(); this.ZJ = this; } public final boolean Tq0(RD0 paramRD0, boolean paramBoolean) { String str; if (!(str = paramRD0.ml.getName().toLowerCase(Locale.ENGLISH)).endsWith(".zip") && !str.endsWith(".mod") && !paramRD0.Qg0())
/*  6 */       return false;  mo0.info(B40.df("Possible mod ").append(paramRD0.ml.getName()).toString()); fj
/*    */ 
/*    */       
/*  9 */       .info(B40.df("Possible mod ").append(paramRD0.ml.getName()).toString()); this(paramRD0, paramBoolean); bx0 bx0; try { if ((new bx0())
/* 10 */         .a80.Qg0()) { bx0.qe = bx0.a80; bx0.Mc0 = new cb(bx0.a80.rw() + File.pathSeparator); } else { ZipFile zipFile; this(bx0.a80.bo()); bx0.G20 = new ZipFile(); bx0.qe = new NUl(zipFile, ""); bx0.Mc0 = new pZ(bx0.G20); }  if ((paramRD0 = bx0.qe.f0("info.xml")).L0() && bx0
/* 11 */         .g00(paramRD0.Yc()))
/* 12 */       { if ((paramRD0 = bx0.qe.f0("icon.png")).L0()) { U70 u70; dv0 dv0; EK0 eK0; this(paramRD0); this(dv0); this(eK0); bx0.Gz0 = u70; }  if (bx0.XH0) bx0.jA = true;  }  } catch (IOException iOException) { bx0.aK
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 17 */         .error(B40.df("Error loading mod ").append(bx0.a80.ml.getName()).toString(), iOException); bx0.fX
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 22 */         .error(B40.df("Error loading mod ").append(bx0.a80.ml.getName()).toString(), iOException); }  if (bx0
/* 23 */       .jA)
/* 24 */     { mo0
/*    */ 
/*    */         
/* 27 */         .info(B40.df("Loaded available mod '").append(bx0.aj).append("'").toString()); fj
/*    */ 
/*    */         
/* 30 */         .info(B40.df("Loaded available mod '").append(bx0.aj).append("'").toString()); this.nr0.add(bx0); return true; }  return false; }
/*    */ 
/*    */   
/*    */   public final void Hg() {
/*    */     ArrayList<bx0> arrayList;
/*    */     Iterator<bx0> iterator;
/*    */     for (arrayList = h1.ls0(), iterator = this.nr0.iterator(); iterator.hasNext(); ) {
/*    */       bx0 bx0;
/*    */       if ((bx0 = iterator.next()).YE) {
/*    */         bx0.Iu0();
/*    */         continue;
/*    */       } 
/*    */       if (!arrayList.contains(bx0.a80.ml.getName()))
/*    */         fj.info(bx0.a80.ml.getName() + " is disabled, skipping."); 
/*    */     } 
/*    */     this.ZJ.clear();
/*    */     for (iterator = arrayList.iterator(); iterator.hasNext();) {
/*    */       for (str = (String)iterator.next(), iterator1 = this.nr0.iterator(); iterator1.hasNext();) {
/*    */         if ((bx0 = iterator1.next()).a80.ml.getName().equals(str) && arrayList.contains(bx0.a80.ml.getName())) {
/*    */           this.ZJ.add(bx0);
/*    */           mo0.info(bx0.a80.ml.getName() + " is enabled, applying.");
/*    */           fj.info(bx0.a80.ml.getName() + " is enabled, applying.");
/*    */           bx0.Iu0();
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/d00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */