package oops;

public class strin {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.capacity());   // gives 16 as a buffer space if no string is added. and if string hello is aded gives 21.
        System.out.println(sb.length());
        System.out.println(sb.append(" world"));  //hello world
        String str = sb.toString(); // to convert string buffer to string 
        System.out.println(str);

        sb.deleteCharAt(2);
        System.out.println(sb);    // gives helo world

        sb.insert(2, "new");
        System.out.println(sb);   //henewlo world
    }
}

//stringbuffer is thread safe and stringbuider is not
