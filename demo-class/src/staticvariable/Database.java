package staticvariable;

import javax.xml.crypto.Data;

public class Database {

  private static String[] strings = new String[0]; // strings is Class Data

  //instance (final vs non-final)
  // int number; -> Setter
  // final int number = 3; -> No Setter

  // final vs static final
  // 1. "final" is still instance variable, the object can call it by "this"
  // 2. "static final" is contant

  // NO static and NO final (instance variable)
  // static
  // final (instance variable)
  // static final

  private final int hours_per_day = 24; // Constant instance variable

  private static final int MINUTES_PER_HOUR = 60; // Constant (MINUTES_PER_HOUR is Class Data)

  public static void add(String str) { // add 方法是一個公開的方法, 用於向strings陣列中新增字串
    String[] newArr = new String[strings.length + 1]; //創建一個新array陣列:newArr，因為要新增一個字串長度比原陣列strings多1 (.length + 1)
    for (int i = 0; i < strings.length; i++) { //for loop將原陣列 strings 中所有元素逐一複製到新陣列 newArr中 -> 保留已有的字串，以便在新增字串之後還能夠繼續存取它們
      newArr[i] = strings[i]; // 複製到新陣列 newArr[i]
    }
    newArr[newArr.length - 1] = str; // 將要新增的字串"str" 賦值給新陣列 newArr 的最後一個位置 -> newArr[newArr.length - 1]
    strings = newArr; //將新陣列 newArr 賦值給原陣列 strings，這樣就完成了對 strings 的更新，使其指向新的陣列
  }

  public static String get(int index) { // 整數參數 index，代表要獲取的字串在陣列中的索引位置 [0, 1, 2, 3, 4, 5] 
    if (index < 0 || index > strings.length - 1) //index 小於0或大於陣列的最大索引值 strings.length - 1(last [i]) 
      return null; // 表示該索引超出了有效範圍 不在陣列的合法索引範圍內 會返回 null
    return strings[index]; // 如果if( )有效 則通過 strings[index] 獲取 strings 陣列中對應索引位置的字串
  }

  public static boolean isIndexValid(int index) {
    return index >= 0 && index < strings.length; // index >= 0 確保索引值大於等於0，即不小於0。 index < strings.length 確保索引值小於 strings 陣列的長度，即不大於陣列的最大索引值
  } // 如果這兩個條件為true , return true

  public static boolean remove(int index) {
    if (!isIndexValid(index)) // 如果不在 strings 陣列的有效範圍內
      return false; // 則直接返回 false，表示無法執行移除操作。
    String[] arr = new String[strings.length - 1]; // 如果true,會創建一個新的字串陣列 arr，長度比原陣列 strings 少1。因為我們要移除一個字串，所以新陣列的長度需要比原陣列少1。
    int j = 0;
    for (int i = 0; i < strings.length; i++) { //接下來，使用一個迴圈遍歷 strings 陣列中的每個元素
      if (index == i) // 當迴圈變數 i 與要移除的索引值 index 相等時
        continue; // 使用 continue 跳過loop , 即跳過要移除的字串
      arr[j++] = strings[i];//否則，將 strings[i] 的值賦值給新陣列 arr[j]，並將 j 的值增加1。
    }
    strings = arr; // 將新陣列 arr 賦值給原陣列 strings，這樣就完成對 strings 的更新，使其指向新的陣列
    return true; // 方法返回 true 表示成功執行了移除操作
  }

  public String read(int index) {
    return strings[index]; // 如果想read arr[i]為2的元素，可以這樣調用該方法：read(2)。
  }

  public static void main(String[] args) {
    // We do not need to create Database object in order to operate static variable
    Database.add("hello");
    System.out.println(Database.get(0)); // hello
    System.out.println(Database.get(1)); // null

    Database d1 = new Database();
    Database d2 = new Database();

    System.out.println(d1.read(0)); // hello
    Database.add("world"); // ["hello", "world"]
    Database.remove(0); // ["world"]
    System.out.println(Database.get(0)); // world
  }

}
