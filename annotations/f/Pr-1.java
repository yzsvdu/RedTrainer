/* 1 */ package f;public final class Pr extends Wr { public boolean Zu0; public boolean ty0; public Pr() { Ip ip1, ip2; this.Zu0 = false; this.ty0 = false; this(); this(); this(); EP(1); Xu("adminframe"); Lo("Shu's GUI Debugger"); TG0(this::ra0); ip2.rK0(ip2.mE0()); ip2.WN(ip2.d7()); this(); vq0.WS(ip1, "Main GUI"); vq0.WS(ip2, "HUD GUI"); Vq0 vq0; (vq0 = new Vq0()).WS(ip3, "Animations"); ip1.rK0(ip1.mE0()); ip1.WN(ip1.d7()); Ip ip3; (new Ip()).rK0((ip3 = new Ip()).mE0()); (new Ip()).WN((new Ip()).d7()); this(); arrayList1.add(le0("Breeding", Pr::wf)); arrayList1.add(le0("Mail", Pr::TD0)); arrayList1.add(le0("Trade", Pr::Ys)); arrayList1.add(le0("Secret Base", Pr::VD)); arrayList1.add(le0("Name Change", Pr::cc0)); arrayList1.add(le0("GameCorner", Pr::Jc)); arrayList1.add(le0("Flip", Pr::XO)); arrayList1.add(le0("Battle Request", Pr::Zi)); arrayList1.add(le0("Friend Request", Pr::V10)); arrayList1.add(le0("Guild Invite", Pr::zL)); arrayList1.add(le0("Trade Request", Pr::yY)); arrayList1.add(le0("Link Request", Pr::eI)); ArrayList<Un> arrayList1; (arrayList1 = new ArrayList<>()).add(le0("Trade Request", Pr::Vk0)); this(); arrayList2.add(le0("PM BOX", Pr::Os0)); arrayList2.add(le0("Confirmation Widget", this::i5)); arrayList2.add(le0("ROM GUI", Pr::UL0)); arrayList2.add(le0("Loading Message", this::vv)); arrayList2.add(le0("Base Exit Widget", this::dg)); arrayList2.add(le0("Character Creation", Pr::coM1)); arrayList2.add(le0("Character Remodel", Pr::Gy)); arrayList2.add(le0("Move Re-Learner", Pr::g00)); arrayList2.add(le0("Ruins Puzzle", Pr::e)); arrayList2.add(le0("Ruins Phrase", Pr::SS)); arrayList2.add(le0("Slots", Pr::be0)); ArrayList<Un> arrayList2; (arrayList2 = new ArrayList<>()).add(le0("Logout", Pr::G3)); this(); arrayList3.add(le0("Hatching", Pr::xP)); arrayList3.add(le0("Evolution", Pr::EC)); arrayList3.add(le0("Starter - 10th Anniversary", Pr::cC)); arrayList3.add(le0("Starter - " + Mk0.zd((byte)3), Pr::E1)); arrayList3.add(le0("Starter - " + Mk0.zd((byte)4), Pr::Tm0)); arrayList3.add(le0("Starter - " + Mk0.zd((byte)2), Pr::oa)); arrayList3.add(le0("Hall of Fame - Unova", Pr::Zx)); ArrayList<Un> arrayList3; (arrayList3 = new ArrayList<>()).add(le0("HM", Pr::oW)); byte b1; int[] arrayOfInt; byte b2; for ((arrayOfInt = new int[b1 = 5])[0] = 6, (new int[b1 = 5])[1] = 20, (new int[b1 = 5])[2] = 45, (new int[b1 = 5])[3] = 50, (new int[b1 = 5])[4] = 51, b2 = 0; b2 < b1; ) { String str = XD0.SD0("Screen Anim - ", arrayOfInt[b2]); arrayList3
/* 2 */         .add(le0(str, arrayOfInt[b2]::dQ)); b2++; }  Ho(ip1, arrayList2); Ho(ip2, arrayList1); Ho(ip3, arrayList3); J8(vq0); } public final Un le0(String paramString, Runnable paramRunnable) { (new Fy0(paramString, 200, 28)).tW(paramRunnable); return new Fy0(paramString, 200, 28); } public static void Zx() { this((byte)2); k3 k3; km.wI0.i2.addFirst(k3); } public static void EC() { short s; j40 j40; ArrayList<?> arrayList; if ((arrayList = (j40 = km.u4.s40(aq0.LI).ky((short)0)).VP.WI)
/* 3 */       .isEmpty()) { s = 1; }
/* 4 */     else { s = ((Vx0)s.get(0)).uf0; }  j40
/* 5 */       .cY = s;
/* 6 */     km.wI0.bB(j40, true); } public static void Ho(Ip paramIp, ArrayList paramArrayList) { this(paramIp); cr0 cr0; g0 g0; this(paramIp); U90 u901 = paramIp.Xz0; U90 u902 = paramIp.o30; int i = 0; for (Un un : paramArrayList) { if (i) cr0.Aq(5);  cr0.Ya(un); g0.Ya(un); if (++i == 3) { i = 0; u901.ee0(cr0); u902.ee0(g0).Aq(5); this(paramIp);
/* 7 */         this(paramIp); }  }  u901
/* 8 */       .ee0(cr0); u902.ee0(g0).Aq(10); }
/*   */ 
/*   */   
/*   */   public static void G3() {
/*   */     js.vu0.Gl();
/*   */   }
/*   */   
/*   */   public static void be0() {
/*   */     pA.Dg0.sW(true);
/*   */   }
/*   */   
/*   */   public static void SS() {
/*   */     pA.Dg0.J8(new UW((byte)0, (short)0));
/*   */   }
/*   */   
/*   */   public static void e() {
/*   */     pA.Dg0.J8(new Vf((byte)0, (short)0));
/*   */   }
/*   */   
/*   */   public static void g00() {
/*   */     Px0 px0 = Px0.Ty;
/*   */     j40 j40 = km.u4.s40(aq0.LI).ky((short)0);
/*   */     pA.Dg0.zj0(new short[] { 1, 2, 3, 4 }, px0, (byte)-1, j40);
/*   */   }
/*   */   
/*   */   public static void Gy() {
/*   */     js.vu0.h4(0, true, true, true, false, false);
/*   */   }
/*   */   
/*   */   public static void coM1() {
/*   */     js.vu0.h4(0, true, true, false, true, false);
/*   */   }
/*   */   
/*   */   private void dg() {
/*   */     int i = this.ty0 ^ true;
/*   */     pA pA;
/*   */     (pA = pA.Dg0).getClass();
/*   */     UB0.Kg0.fN(new yD0(pA, i));
/*   */   }
/*   */   
/*   */   private void vv() {
/*   */     int i = this.Zu0 ^ true;
/*   */     js.vu0.So0(i);
/*   */   }
/*   */   
/*   */   public static void UL0() {
/*   */     js.vu0.YF();
/*   */   }
/*   */   
/*   */   private void i5() {
/*   */     js.vu0.uh(new h70("Test confirmation", Pr::tb0, this));
/*   */   }
/*   */   
/*   */   public static void tb0() {
/*   */     js.vu0.Pu(-1, "Works!");
/*   */   }
/*   */   
/*   */   public static void Os0() {
/*   */     pA.Dg0.Yv0(B40.df("Test").append(xi0.qX(100)).toString());
/*   */   }
/*   */   
/*   */   public static void Vk0() {
/*   */     byte b = -1;
/*   */     String str = "DebugPlayer";
/*   */     pA pA;
/*   */     (pA = pA.Dg0).getClass();
/*   */     UB0.Kg0.fN(new Xp(pA, b, str));
/*   */   }
/*   */   
/*   */   public static void eI() {
/*   */     byte b = -1;
/*   */     String str = "DebugPlayer";
/*   */     pA pA;
/*   */     (pA = pA.Dg0).getClass();
/*   */     UB0.Kg0.fN(new gs(pA, b, str));
/*   */   }
/*   */   
/*   */   public static void yY() {
/*   */     byte b = -1;
/*   */     String str = "DebugPlayer";
/*   */     pA pA;
/*   */     (pA = pA.Dg0).getClass();
/*   */     UB0.Kg0.fN(new Xp(pA, b, str));
/*   */   }
/*   */   
/*   */   public static void zL() {
/*   */     byte b = -1;
/*   */     String str1 = "DebugPlayer", str2 = "DebugGuild";
/*   */     pA pA;
/*   */     (pA = pA.Dg0).getClass();
/*   */     UB0.Kg0.fN(new BT(pA, b, str1, str2));
/*   */   }
/*   */   
/*   */   public static void V10() {
/*   */     byte b = -1;
/*   */     String str = "DebugPlayer";
/*   */     pA pA;
/*   */     (pA = pA.Dg0).getClass();
/*   */     UB0.Kg0.fN(new fn0(pA, b, str));
/*   */   }
/*   */   
/*   */   public static void Zi() {
/*   */     ky ky = ky.DL0;
/*   */     pA.Dg0.f50((byte)-1, "DebugPlayer", 6, 50, 50, (byte)0, ky, false, true, true, (byte)5, (byte)0, (byte)0);
/*   */   }
/*   */   
/*   */   public static void XO() {
/*   */     this(0);
/*   */     COm3 cOm3;
/*   */     js.vu0.si(cOm3, js.vu0.Ub());
/*   */   }
/*   */   
/*   */   public static void Jc() {
/*   */     pA.Dg0.sW(true);
/*   */   }
/*   */   
/*   */   public static void cc0() {
/*   */     char c = 'ϩ';
/*   */     boolean bool = true;
/*   */     pA pA;
/*   */     if ((pA = pA.Dg0).SM != null) {
/*   */       pA.Sc();
/*   */     } else {
/*   */       ld0 ld0;
/*   */       this(pA, bool, c);
/*   */       pA.SM = ld0;
/*   */       pA.J8(ld0);
/*   */     } 
/*   */   }
/*   */   
/*   */   public static void VD() {
/*   */     pA.Dg0.dj0(true, Tl0.Ec);
/*   */   }
/*   */   
/*   */   public static void Ys() {
/*   */     pA.Dg0.mp(new P4((byte)0, "DEBUG", true, true));
/*   */   }
/*   */   
/*   */   public static void TD0() {
/*   */     pA.Dg0.BI0(null, true, false);
/*   */   }
/*   */   
/*   */   public static void wf() {
/*   */     boolean bool = false;
/*   */     pA pA;
/*   */     GV gV2;
/*   */     if ((gV2 = (pA = pA.Dg0).cl) != null) {
/*   */       gV2.ra0();
/*   */       pA.cl = null;
/*   */     } 
/*   */     this(bool);
/*   */     GV gV1;
/*   */     pA.cl = gV1;
/*   */     pA.J8(gV1);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */