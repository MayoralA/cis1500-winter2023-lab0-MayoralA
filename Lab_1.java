public class Lab_1 {
    public static void main(String[] args) {
        double totalcreditsrequired = 62;
        double creditscompleted = 34;
        double creditsremaining = totalcreditsrequired - creditscompleted;
        double creditspersemester = 4;
        double semestersremaining = Math.ceil(creditsremaining / creditspersemester);
        System.out.println("Angel you have " + semestersremaining + " semester left");

    }
}
