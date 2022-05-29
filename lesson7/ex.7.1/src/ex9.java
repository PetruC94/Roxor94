

class ex9 {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        //write your code here
        for (char i = 'A'; i <= 'Z'; i++) {
            builder.append(i).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);

        System.out.println(builder);//prints A B C D E ...
    }

}