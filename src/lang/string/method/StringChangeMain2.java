package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaaces = "       Java Programming  ";

        System.out.println("소문자로 변환: " + strWithSpaaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaaces.toUpperCase());

        System.out.println("공백 제거(trim): '" +strWithSpaaces.trim() + "'");
        System.out.println("공백 제거(strip): '" +strWithSpaaces.strip() + "'"); //Java11부터
        System.out.println("앞 공백 제거(strip): '" + strWithSpaaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWithSpaaces.stripTrailing() + "'");
    }
}
