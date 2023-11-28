package leet;

// A simple definition for a DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }


    public static void main(String[] args) {
        // The actual code for creating an Array to hold DVD's.
        DVD[] dvdCollection = new DVD[15];
        DVD movie1 = new DVD("sholay" , 1987 , "Sanjay Dutt");
        dvdCollection[0]=movie1;
        System.out.println(dvdCollection[0].name);
        System.out.println(movie1.toString());

    }
}
