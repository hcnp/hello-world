import java.io.*;

class FileWrite {
  public static void main(String args[]) {
    File file = new File("test-file.txt");

    StringBuilder builder = new StringBuilder();

    buildArgs(builder, args);

    // Print args
    System.out.println(builder.toString());

    writeFile(file, builder.toString());
  }

  static void buildArgs(StringBuilder builder, String[] args) {
    for (String arg : args) {
      builder.append(arg);
    }
  }

  static void writeFile(File file, String output) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

      writer.append(output);

      writer.flush();
      writer.close();
    }
    catch (IOException ioException) {
      System.err.println("ERROR: " + ioException);
    }
  }
}
