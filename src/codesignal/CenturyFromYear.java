package codesignal;

public class CenturyFromYear {

    public static void main(String[] args) {
        System.out.println(new CenturyFromYear().centuryFromYear(170));

    }

    int centuryFromYear(int year) {
        return (int) Math.ceil(year / 100.00);
    }

}
