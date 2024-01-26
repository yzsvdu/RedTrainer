package com.badlogic.gdx.backends.lwjgl3.angle;

import f.JU;
import f.Ui;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.UUID;
import java.util.zip.CRC32;
import java.util.zip.ZipFile;

public class ANGLELoader {
  public static boolean isWindows = System.getProperty("os.name").contains("Windows");
  
  public static boolean isLinux = System.getProperty("os.name").contains("Linux");
  
  public static boolean isMac = System.getProperty("os.name").contains("Mac");
  
  public static boolean isARM = false;
  
  public static boolean is64Bit = false;
  
  private static final Random random = new Random();
  
  private static File egl;
  
  private static File gles;
  
  private static File lastWorkingDir;
  
  public static void closeQuietly(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } finally {} 
  }
  
  public static String randomUUID() {
    long l1 = random.nextLong();
    long l2 = random.nextLong();
    return (new UUID(l1, l2)).toString();
  }
  
  public static String crc(InputStream paramInputStream) {
    if (paramInputStream != null) {
      CRC32 cRC32;
      this();
      byte[] arrayOfByte = new byte[4096];
      try {
      
      } catch (Exception exception) {
      
      } finally {
        closeQuietly(paramInputStream);
      } 
      closeQuietly(paramInputStream);
      return Long.toString(cRC32.getValue(), 16);
    } 
    throw new IllegalArgumentException("input cannot be null.");
  }
  
  private static File extractFile(ZipFile paramZipFile, String paramString, File paramFile) {
    try {
      if (paramFile.getParentFile().exists() || paramFile.getParentFile().mkdirs()) {
        FileOutputStream fileOutputStream;
        byte[] arrayOfByte = null;
        InputStream inputStream = null;
        if (paramFile.exists())
          return paramFile; 
        try {
          FileOutputStream fileOutputStream1;
          this(paramFile);
          try {
            inputStream = paramZipFile.getInputStream(paramZipFile.getEntry(paramString));
            arrayOfByte = new byte[4096];
            while (true) {
              int i;
              if ((i = inputStream.read(arrayOfByte)) == -1)
                return paramFile; 
              fileOutputStream1.write(arrayOfByte, 0, i);
            } 
          } finally {
            paramFile = null;
          } 
        } finally {}
        closeQuietly(fileOutputStream);
        closeQuietly(inputStream);
        throw paramFile;
      } 
      throw new JU("Couldn't create ANGLE native library output directory " + paramFile.getParentFile().getAbsolutePath());
    } finally {
      paramZipFile = null;
    } 
  }
  
  private static File getExtractedFile(String paramString1, String paramString2) {
    this(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("java.io.tmpdir") + "/" + System.getProperty("user.name"), paramString2);
    File file1;
    File file2;
    if (canWrite(new File()))
      return file1; 
    try {
      File file;
      if ((file = File.createTempFile(paramString1, null)).delete()) {
        File file3;
        this(file, paramString2);
        if (canWrite(new File()))
          return file3; 
      } 
    } catch (IOException iOException) {}
    this(System.getProperty("user.home") + "/.libgdx/" + System.getProperty("user.home"), paramString2);
    if (canWrite(new File()))
      return file2; 
    this(".temp/" + paramString1, paramString2);
    return canWrite(new File()) ? file2 : ((System.getenv("APP_SANDBOX_CONTAINER_ID") != null) ? file1 : null);
  }
  
  private static boolean canWrite(File paramFile) {
    File file = paramFile.getParentFile();
    if (paramFile.exists()) {
      if (!paramFile.canWrite() || !canExecute(paramFile))
        return false; 
      this(file, randomUUID().toString());
    } else {
      file.mkdirs();
      if (!file.isDirectory())
        return false; 
    } 
    try {
      (new FileOutputStream(paramFile)).close();
      return true;
    } finally {
      null;
      paramFile.delete();
    } 
  }
  
  private static boolean canExecute(File paramFile) {
    try {
      Method method;
      if (((Boolean)(method = File.class.getMethod("canExecute", new Class[0])).invoke(paramFile, new Object[0])).booleanValue())
        return true; 
      Class<boolean> clazz;
      File.class.getMethod("setExecutable", new Class[] { clazz = boolean.class, clazz }).invoke(paramFile, new Object[] { Boolean.TRUE, Boolean.FALSE });
      return ((Boolean)method.invoke(paramFile, new Object[0])).booleanValue();
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static boolean isCompatible() {
    boolean bool;
    return ((bool = isWindows) && !is64Bit) ? false : ((bool && !isARM) ? true : (isMac));
  }
  
  public static boolean isInstalled() {
    String str;
    if (isWindows) {
      if (is64Bit) {
        str = "windows64";
      } else {
        str = "windows32";
      } 
    } else if (isLinux) {
      str = "linux64";
    } else {
      if (isMac) {
        if (isARM) {
          str = "macosxarm64";
        } else {
          str = "macosx64";
        } 
        return (new File("lib/native/angle/" + str + ".zip")).exists();
      } 
      return false;
    } 
    return (new File("lib/native/angle/" + str + ".zip")).exists();
  }
  
  public static void load() {
    boolean bool1;
    boolean bool2;
    if ((!(bool1 = isARM) || isMac) && ((bool2 = isWindows) || isLinux || isMac)) {
      ZipFile zipFile;
      String str2 = null;
      String str3 = null;
      if (bool2) {
        if (is64Bit) {
          str2 = "windows64";
        } else {
          str2 = "windows32";
        } 
        str3 = ".dll";
      } 
      if (isLinux) {
        str2 = "linux64";
        str3 = ".so";
      } 
      if (isMac) {
        if (bool1) {
          String str = "macosxarm64";
          str2 = str;
        } else {
          String str = "macosx64";
          str2 = str;
        } 
        str3 = ".dylib";
      } 
      String str1 = null;
      try {
        ZipFile zipFile1;
        this("lib/native/angle/" + str2 + ".zip");
        try {
          str1 = str2 + "/libEGL" + str2;
          str2 = str2 + "/libGLESv2" + str2;
          egl = getExtractedFile(crc((new ZipFile()).getInputStream((zipFile1 = new ZipFile()).getEntry(str1))) + crc((new ZipFile()).getInputStream((zipFile1 = new ZipFile()).getEntry(str1))), (new File(str1)).getName());
          gles = getExtractedFile(crc((new ZipFile()).getInputStream((zipFile1 = new ZipFile()).getEntry(str1))) + crc((new ZipFile()).getInputStream((zipFile1 = new ZipFile()).getEntry(str1))), (new File(str2)).getName());
          if (!isMac) {
            extractFile(zipFile1, str1, egl);
            System.load(egl.getAbsolutePath());
            extractFile(zipFile1, str2, gles);
            System.load(gles.getAbsolutePath());
          } else {
            lastWorkingDir = new File(".");
            extractFile(zipFile1, str1, new File(lastWorkingDir, egl.getName()));
            extractFile(zipFile1, str2, new File(lastWorkingDir, gles.getName()));
          } 
          return;
        } catch (IOException iOException) {
          zipFile = zipFile1;
        } finally {}
        throw new JU("Missing natives zip");
      } catch (IOException iOException) {
        throw new JU("Missing natives zip");
      } finally {
        Ui.JC0(zipFile);
      } 
    } 
    throw new JU("ANGLE is only supported on x86/x86_64 Windows, x64 Linux, and x64/arm64 macOS.");
  }
  
  public static void postGlfwInit() {
    (new File(lastWorkingDir, egl.getName())).delete();
    (new File(lastWorkingDir, gles.getName())).delete();
  }
  
  static {
    if (System.getProperty("os.arch").startsWith("arm") || System.getProperty("os.arch").startsWith("aarch64")) {
    
    } else {
    
    } 
  }
  
  static {
    if (System.getProperty("os.arch").contains("64") || System.getProperty("os.arch").startsWith("armv8")) {
    
    } else {
    
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/backends/lwjgl3/angle/ANGLELoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */