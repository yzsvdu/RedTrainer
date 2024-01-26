/* 1 */ package f;public final class N1 extends Wr { public N1(h2 paramh2, fH0 paramfH0, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, String paramString1, long paramLong, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, ph0[] paramArrayOfph0) { kG kG; Jv0 jv0; K6 k6; Ip ip; String str; this.Ex0 = new ArrayList(); this.kA0 = new ArrayList(); this(); EP(1); Xu("adminframe"); Lo("Player Inspect"); TG0(new n2(this, paramh2)); this.Ex0.add("Player Name"); this.kA0.add(paramfH0.Nt0()); this.Ex0.add("Online"); ArrayList<String> arrayList = this.kA0; if (paramByte1 == 0) { str = "OFFLINE"; } else if (paramByte1 == 2) { str = "DISCONNECTED"; } else { str = "ONLINE"; }  arrayList.add(str); this.Ex0.add("Object Id"); this.kA0.add(Integer.valueOf(paramfH0.fV())); this.Ex0.add("Account Id"); this.kA0.add(Integer.valueOf(paramfH0.eC())); this.Ex0.add("Account Name"); this.kA0.add(paramString5); if (km.u4.Zm() > 5) { this.Ex0.add("Money"); this.kA0.add(Integer.valueOf(paramfH0.rK0())); this.Ex0.add("Coins"); this.kA0.add(Short.valueOf(paramfH0.Wn())); this.Ex0.add("Battle Points"); this.kA0.add(Integer.valueOf(paramfH0.Gi0())); }  this.Ex0.add("Safari Steps"); this.kA0.add(Short.valueOf(paramfH0.yU())); int i = this.Ex0.size(); this.Ex0.add("Location"); this.kA0.add(paramfH0.dQ() + "." + paramfH0.Xc() + " " + paramfH0.wt() + " " + paramfH0.ss0()); if (paramByte1 > 0) { this.Ex0.add("Channel:"); this.kA0
/* 2 */         .add(B40.df("Ch. ").append(paramByte4 + 1).toString()); }  if (km.u4.Zm() > 5) { this.Ex0.size(); this.Ex0.add("Last Online MAC"); this.kA0.add(LF.QA(paramfH0.Sc())); }  if (paramByte1 > 0) { if (km.u4.Zm() > 5) { this.Ex0.add("Bot Detection Ratio"); this.kA0.add(Byte.valueOf(paramByte2)); this.Ex0.add("Bot Zero Ratio"); this.kA0.add(Byte.valueOf(paramByte3)); }  this.Ex0.add("IP Address"); this.kA0.add(paramString1); if (km.u4.Zm() > 5) { this.Ex0.add("MAC Address"); this.kA0.add(LF.QA(paramLong)); }  this.Ex0.add("Client Revision"); this.kA0.add(Integer.valueOf(paramInt)); if (km.u4.Zm() > 5) { this.Ex0.add("OS"); this.kA0.add(paramString2); this.Ex0.add("OS Version"); this.kA0.add(paramString3); this.Ex0.add("OpenGL Vendor"); this.kA0.add(paramString4); }  }  this("Account ACP"); arrayOfUn[3] = un; Un un; (un = new Un()).tW(new h8(paramfH0)); this("Teleport"); Un[] arrayOfUn; (arrayOfUn = new Un[this.Ex0.size()])[i] = un; if (paramByte1 > 0) { this(paramfH0); un.tW(kG); } else { pC0 pC0; this(paramfH0); kG.tW(pC0); }  this.aJ = new Vf0(this, arrayOfUn); (this.dm = new Wv0(this.aJ)).Xu("/table"); this(); this.dm.ek(Un.class, jv0); this.dm.Gb0(true); this.dm.zs0(); this.eA0 = new rS(this.dm); ip.rK0(ip.mE0().cOM8(new U90[] { ip.vo0(new JG0[] { this.eA0 }) })); ip.WN(ip.d7().cOM8(new U90[] { ip.AUX(new JG0[] { this.eA0 }) })); this(); vq0.WS(ip, "Informations"); this(paramfH0); this.iy0 = new K6(); Vq0 vq0; (vq0 = new Vq0()).WS(k6, "Notes"); J8(new Vq0()); UB0.Kg0.fN(new U9(this, paramArrayOfph0)); }
/*   */ 
/*   */   
/*   */   public Vf0 aJ;
/*   */   public Wv0 dm;
/*   */   public rS eA0;
/*   */   public ArrayList Ex0;
/*   */   public ArrayList kA0;
/*   */   public K6 iy0;
/*   */   
/*   */   public final void d40() {
/*   */     mM();
/*   */     uh0(840, 400);
/*   */     super.d40();
/*   */   }
/*   */   
/*   */   public final boolean p3() {
/*   */     return this.iy0.p3() ? true : super.p3();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/N1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */