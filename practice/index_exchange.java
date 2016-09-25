package practice;

public class index_exchange {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // example input: "34 - 239 - - 3 - 237 "
    // example input: " 1"
    // example input: ""
    // example input: "ssh"
    String inputString = " 004- 1 - 3-3  2 990 ";

    if (inputString.length() == 0 || inputString == null)
      System.out.println("No input string");
    String outputString = processer(inputString);

    System.out.print(outputString);
  }

  private static String processer(String inputString) {
    String result = "";
    String allNumber = "";
    for (char i : inputString.toCharArray()) {
      if (i >= '0' && i <= '9')
        allNumber += i;
    }

    int len = allNumber.length();
    if (len % 3 == 1)
      result = doubleSplit(allNumber);
    else
      result = normalSplit(allNumber);

    return result;
  }

  private static String normalSplit(String allNumber) {
    String result = "";
    for (int i = 0; i < allNumber.length(); i++) {
      if (i != 0 & (i + 1) % 3 == 1)
        result += "-";
      result += allNumber.charAt(i);
    }
    return result;
  }

  private static String doubleSplit(String allNumber) {
    int len = allNumber.length();
    String result = "";
    if (allNumber.length() == 1)
      return allNumber;
    result = normalSplit(allNumber.substring(0, len - 4));
    result += "-";
    result += allNumber.substring(len - 4, len - 2);
    result += "-";
    result += allNumber.substring(len - 2);
    if (result.startsWith("-"))
      result = result.replace("--", "-").substring(1);
    System.out.println(result);
    return result;
  }


}
