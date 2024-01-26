package com.pokeemu.client;

import com.badlogic.gdx.backends.lwjgl3.angle.ANGLELoader;
import f.Bz;
import f.C00;
import f.G20;
import f.Gw0;
import f.Kl;
import f.Kz;
import f.Oj;
import f.Pa0;
import f.VD0;
import f.Yj;
import f.Zv;
import f.af;
import f.ba;
import f.bk;
import f.eE;
import f.fN;
import f.fQ;
import f.fa;
import f.fl0;
import f.fu0;
import f.h1;
import f.ik;
import f.jn;
import f.km;
import f.nZ;
import f.oY;
import f.q00;
import f.qh0;
import f.r9;
import f.rE0;
import f.uK0;
import f.v10;
import f.yG;
import java.io.File;
import java.io.FileInputStream;
import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Properties;
import org.lwjgl.glfw.GLFW;

public class Client {
  public static ik ML;
  
  public static void main(String[] paramArrayOfString) {
    boolean bool;
    try {
      String str1;
      if ((str1 = (new File(Client.class.getProtectionDomain().getCodeSource().getLocation().toURI())).getPath()).contains("!/") || str1.contains("!\\")) {
        uK0.BH0();
        km.f70.dB("Please reinstall the client to a path which does not contain special characters. (No '!')", (Runnable)new bk());
      } 
    } catch (URISyntaxException uRISyntaxException) {}
    yG yG = yG.lK();
    if (q00.Sk && !q00.return && !q00.No) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!yG.H2() || bool) {
      uK0.BH0();
      km.f70.dB("OS Error, your OS is not supported. (OS: " + System.getProperty("os.name") + ", " + System.getProperty("os.arch") + ")", (Runnable)new Gw0());
      return;
    } 
    String str;
    (str = Locale.getDefault().stripExtensions().getLanguage()).getClass();
    byte b = -1;
    switch (Locale.getDefault().stripExtensions().getLanguage().hashCode()) {
      case 108641:
        if (!str.equals("mzn"))
          break; 
      case 107421:
        if (!str.equals("lrc"))
          break; 
      case 98554:
        if (!str.equals("ckb"))
          break; 
      case 3749:
        if (!str.equals("uz"))
          break; 
      case 3741:
        if (!str.equals("ur"))
          break; 
      case 3700:
        if (!str.equals("th"))
          break; 
      case 3665:
        if (!str.equals("sd"))
          break; 
      case 3587:
        if (!str.equals("ps"))
          break; 
      case 3569:
        if (!str.equals("pa"))
          break; 
      case 3511:
        if (!str.equals("ne"))
          break; 
      case 3500:
        if (!str.equals("my"))
          break; 
      case 3493:
        if (!str.equals("mr"))
          break; 
      case 3432:
        if (!str.equals("ks"))
          break; 
      case 3358:
        if (!str.equals("ig"))
          break; 
      case 3259:
        if (!str.equals("fa"))
          break; 
      case 3222:
        if (!str.equals("dz"))
          break; 
      case 3148:
        if (!str.equals("bn"))
          break; 
      case 3122:
        if (!str.equals("as"))
          break; 
      case 3121:
        if (!str.equals("ar"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
        try {
          Locale.setDefault(new Locale("en", "US"));
        } catch (Exception exception) {}
        break;
    } 
    try {
      fa fa;
      Oj oj;
      qh0.Nz();
      long l = System.currentTimeMillis();
      ML = C00.gd(Client.class);
      nZ.L70();
      nZ.tf0();
      ML.info("Initialized logger in " + System.currentTimeMillis() - l + " ms");
      Bz.yo0();
      int j = paramArrayOfString.length;
      for (b = 0; b < j; b++) {
        String str2;
        if ((str2 = paramArrayOfString[b]).startsWith("--theme=")) {
          h1.MW = str2 = str2.split("=")[1];
          km.ZC0 = "android".equalsIgnoreCase(str2);
          h1.Td();
        } else if (str2.startsWith("--config=")) {
          fQ fQ;
          str2 = str2.split("=")[1];
          this(Properties.class);
          try {
            File file;
            this(str2);
            (new Properties()).load(new FileInputStream(file));
            (new fQ()).Com3(new Properties());
            Bz.Tj((Properties[])(new fQ()).toArray());
          } catch (Exception exception) {
            exception.printStackTrace();
            Bz.Tj((Properties[])fQ.toArray());
          } finally {}
        } else {
          String[] arrayOfString;
          if (exception.startsWith("--resolution=") && (arrayOfString = exception.split("=")[1].split("x")).length > 1)
            try {
              int k = Integer.parseInt(arrayOfString[0]);
              h1.tR = k;
              h1.wd0 = Integer.parseInt(arrayOfString[1]);
            } catch (Exception exception1) {} 
        } 
      } 
      if (Bz.h80)
        System.setProperty("javax.accessibility.assistive_technologies", "com.pokeemu.client.AccessibilityStub"); 
      try {
        System.setProperty("http.agent", "Mozilla/5.0 (PokeMMO; Client r" + Pa0.vH0 + "; " + yG.UH0() + ")");
      } catch (Exception exception) {}
      if (yG == yG.HD0) {
        (new fu0()).setDaemon(true);
        (new fu0()).start();
      } else if (yG == yG.A1) {
        String str2;
        if ((str2 = System.getenv("POKEMMO_MACOS_LAUNCHER_VER")) != null)
          ML.info("PokeMMO macOS Launcher Version: " + str2); 
        if (h1.c20 != 0)
          h1.c20 = 0; 
        if (h1.qL && !q00.No) {
          ML.info("macOS low power gfx options enabled");
          GLFW.glfwInitHint(143363, 1);
        } else {
          GLFW.glfwInitHint(143363, 0);
        } 
        GLFW.glfwWindowHintString(143362, "PokeMMO");
      } 
      ik ik1 = ML;
      int i = Pa0.vH0;
      if (Pa0.UH0) {
        str1 = " (From File)";
      } else {
        str1 = "";
      } 
      ik1.info("Starting PokeMMO Client. Client revision: " + i + str1);
      ML.info("https://pokemmo.com");
      fl0.m70();
      try {
        StringBuilder stringBuilder;
        this();
        for (String str1 : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
          if (stringBuilder.length() > 0)
            stringBuilder.append(' '); 
          stringBuilder.append(str1);
        } 
        fl0.CA0(stringBuilder.toString());
      } catch (Exception exception) {
        ML.info("Total System Ram: ERROR READING");
      } 
      Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new rE0());
      this();e
      km.VH = new Yj();
      km.Gj = new af();
      km.iE0 = new r9();
      km.pm0 = new VD0();
      if (!km.iE0.Ba())
        return; 
      this();
      fa.jg0(h1.Vu0);
      if (h1.a50() == Kz.rL0)
        if (ANGLELoader.isInstalled()) {
          fa.Lp0(fN.xb0);
        } else {
          h1.m7();
        }  
      fa.Sd(h1.dB0);
      fa.T1(h1.AC0);
      fa.ww(h1.ru0);
      fa.MP();
      fa.F0(eE.kk0 * 2);
      byte b1;
      if ((b1 = h1.c20) != 0)
        if (b1 != 1) {
          if (b1 != 2) {
            fa.Se(new oY(oj));
            fa.wE0();
            fa.rj(G20.iD, new String[] { "data/icons/128x128.png", "data/icons/32x32.png", "data/icons/16x16.png" });
          } 
        } else {
          Zv[] arrayOfZv;
          ba ba = null;
          jn[] arrayOfJn;
          h1.PJ0 pJ0;
          if ((arrayOfJn = fa.Dp()).length > 1 && (pJ0 = h1.Tu()) != null) {
            int n = arrayOfJn.length;
            for (byte b2 = 0; b2 < n; b2++) {
              jn jn;
              if ((jn = arrayOfJn[b2]).Vz0.equals(pJ0.Ys) && jn.TT == pJ0.Je && jn.YH == pJ0.LpT7)
                ba = (ba)jn; 
            } 
          } 
          int k = h1.tR;
          int m = h1.wd0;
          if (ba != null) {
            arrayOfZv = fa.SE0((jn)ba);
          } else {
            arrayOfZv = fa.dq0();
          } 
          Zv zv;
          if ((zv = v10.Ss(k, m, arrayOfZv)) != null)
            fa.Z7(zv); 
          fa.Se(new oY(oj));
          fa.wE0();
          fa.rj(G20.iD, new String[] { "data/icons/128x128.png", "data/icons/32x32.png", "data/icons/16x16.png" });
        }  
      if (h1.XO >= 0 && h1.da0 >= 0)
        fa.Q00(h1.XO, h1.da0); 
      if (h1.c20 != 2) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      fa.wY(b1);
      fa.YF0(h1.tR, h1.wd0);
      fa.b80(h1.IE0);
      fa.Se(new oY(oj));
      fa.wE0();
      fa.rj(G20.iD, new String[] { "data/icons/128x128.png", "data/icons/32x32.png", "data/icons/16x16.png" });
    } catch (Exception exception) {
      Kl kl;
      uK0.BH0();
      this();
      km.f70.dB("Unable to setup client. Please verify the installed path does not contain special characters.\n\nPlease post on the forums to get assistance.", (Runnable)kl);
      return;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/pokeemu/client/Client.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */