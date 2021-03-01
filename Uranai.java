public class Uranai {
  public static void main(String [] args){
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    //名前の入力
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    //年齢の入力
    String ageString = new java.util.Scanner(System.in).nextLine();
    //年齢を数字に変換
    int age = Integer.parseInt(ageString);
    //0~3までの乱数を発生
    int fortune = new java.util.Random().nextInt(4);
    //int fortuneの結果に+1をして結果を「1~4」にする
    fortune++;
    System.out.println("占いの結果が出ました!");
    System.out.println(age + "歳の"+ name + "さんの運勢番号は" + fortune + "です");
    System.out.println("1:大吉 2:中吉 3:吉 4:凶");
  }
}
