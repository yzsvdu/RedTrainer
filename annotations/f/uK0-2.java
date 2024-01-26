/* 1 */ package f;public final class uK0 extends k7 { public static void BH0() { km.f70 = new uK0(); } public final void iJ0(String paramString1, String paramString2, LP paramLP, Runnable paramRunnable, boolean paramBoolean) { this("PokeMMO"); JFrame jFrame; byte b; (new JFrame()).setUndecorated(true); (new JFrame()).setVisible(true); (new JFrame()).setLocationRelativeTo(null); switch (paramLP.ordinal()) { default: b = -1; break;case 3: b = 3; break;case 2: b = 2; break;case 1: b = 1; break;case 0: b = 0; break; }
/* 2 */      JOptionPane.showMessageDialog(this, paramString2, paramString1, b); dispose(); if (paramRunnable != null) paramRunnable.run();  } public final void lpt3(String paramString1, String paramString2, LP paramLP, Runnable paramRunnable1, Runnable paramRunnable2, boolean paramBoolean) { this("PokeMMO"); JFrame jFrame; byte b; (new JFrame()).setUndecorated(true); (new JFrame()).setVisible(true); (new JFrame()).setLocationRelativeTo(null); switch (paramLP.ordinal()) { default: b = -1; break;case 3: b = 3; break;case 2: b = 2; break;case 1: b = 1; break;case 0: b = 0; break; }  int i; if ((i = JOptionPane.showConfirmDialog(this, paramString2, paramString1, 0, b)) == 0 && paramRunnable1 != null) paramRunnable1.run();  if (i == 1 && paramRunnable2 != null) paramRunnable2.run();  dispose(); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uK0.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */