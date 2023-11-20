public class Main {
    // String Dönüşümü
    // Reference value tiplerin ilk harfi Büyük
    //Reference value kendine ait methodları var
    //Primitive tiplerin sadece değerleri var.
    //Referans value başlangıç değeri null,primitive tip default değerleri var.
    //void varsa return etmez.

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1222));
        System.out.println(isPerfectNumber(5));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int number) {
        //Absolute number
        number = Math.abs(number);
        //Number to string
        String stringValue = String.valueOf(number);
        //String to charArray
        char[] basamaklar = stringValue.toCharArray();
        //Reverse loop to get reversed String
        String reversedValue = "";
        for (int i = basamaklar.length - 1; i >= 0; i--) {
            reversedValue += basamaklar[i];
        }
        //string.equals(reverse)
        return stringValue.equals(reversedValue);


    }

    public static boolean isPerfectNumber(int number) {
        //gaurding
        if (number < 0) {
            return false;
        }

        //total başlangıç değeri 0 olarak tanımlanır.
        int total = 0;
        //1'den sayiya kadar döngü yapılır.
        for (int i = 1; i < number / 2; i++) {
            //bizimsayı/sayi mode 0 mı?
            if (number % i == 0) {
                //0 kalanı veren sayilar totalde toplanır.
                total += i;
            }

        }

        //total=number mi ?
        return total == number;
    }

    public static String numberToWords(int sayi) {
        //integer to String
        String strSayi = String.valueOf(sayi);
        //Stringten char arrayi oluştur.
        char[] charsStrSayi = strSayi.toCharArray();
        //rakamların text değerlerini veren array tanımla
        String[] rakamlar = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        // string result oluştur.
        String sonuc = "";
        //loop yap
        for (char charStrSayi : charsStrSayi) {
            System.out.println(charStrSayi);
            //rakama karşılık gelen testi sonuca ekle
            sonuc += rakamlar[Integer.parseInt(String.valueOf(charStrSayi))];
        }


        //return sonuc
        return sonuc.trim();
    }
}