package stringss;
public class stringbuild {
    public static void main(String[] arg){
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" and hey");

        System.out.println(sb);
        sb.insert(5 , " mello");
        System.out.println(sb);

        sb.replace(6 , 11 , "trello");
        System.out.println(sb);

        sb.delete( 6 , 12);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

    }
}
