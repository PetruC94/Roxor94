import java.util.*;

//Tict tac Toe
public class TicTacToe_part2 {
    static ArrayList<Integer>Playerpositions=new ArrayList<>();
    static ArrayList<Integer>cpuPositions=new ArrayList<>();
    public static void main(String[] args) {
// Chenarul jocullui
        char[][] gameBoard = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                {'|', ' ', '1',' ', '2',' ', '3', ' ', ' ', '|'},
                {'|', ' ', '4', ' ', '5', ' ', '6', ' ',' ','|'},
                {'|', ' ', '7', ' ', '8', ' ', '9', ' ',' ','|'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',}};

        Scanner sc=new Scanner( System.in );
        // while
        while (true) {
            System.out.println( "Scrie o cifra de la 1-9: " );
                int Playerpos = sc.nextInt();
                    while (!(!Playerpositions.contains( Playerpos ) || !cpuPositions.contains( cpuPositions ))) {
                        System.out.println( "Imposible! Enter a corect Position" );
                        Playerpos = sc.nextInt();
                    }
                    PlacePiece( gameBoard,Playerpos,"player" );
                    String result= ChecWinner();
            if (result.length()>0){
                System.out.println(result);
                break;
            }

                Random random=new Random();
                     int cpupos=random.nextInt(9)+1;
                while (Playerpositions.contains( cpupos ) || cpuPositions.contains( cpupos )) {

                    cpupos=random.nextInt(9)+1;

                }
            PlacePiece( gameBoard,cpupos,"cpu" );
            PrintgameBoard( gameBoard );
            result= ChecWinner();
            if (result.length()>0){
                System.out.println(result);
                break;
            }
            System.out.println(result);
        }

    }
    public static void PrintgameBoard(char[][] gameBoard){
        for (char[] row : gameBoard) {
            for (char c:row){
                System.out.print (c);
            }
            System.out.println();
        }
    }
    public static void PlacePiece(char[][] gameBoard,int pos,String User){
        char symbol=' ';
        if (User.equals( "player" )){
            symbol='X';
            Playerpositions.add( pos );
        } else if (User.equals( "cpu" )) {
            symbol='O';
            cpuPositions.add( pos );
        }

        switch (pos) {
            case 1 -> gameBoard[1][2] = symbol;
            case 2 -> gameBoard[1][4] = symbol;
            case 3 -> gameBoard[1][6] = symbol;
            case 4 -> gameBoard[2][2] = symbol;
            case 5 -> gameBoard[2][4] = symbol;
            case 6 -> gameBoard[2][6] = symbol;
            case 7 -> gameBoard[3][2] = symbol;
            case 8 -> gameBoard[3][4] = symbol;
            case 9 -> gameBoard[3][6] = symbol;
            default -> {
            }
        }

    }
    public static String ChecWinner(){
        List topRow= Arrays.asList( 1,2,3 );
        List midRow= Arrays.asList( 4,5,6 );
        List botRow= Arrays.asList( 7,8,9 );
        List leftCol= Arrays.asList( 1,4,7 );
        List midCol= Arrays.asList( 2,5,8 );
        List rightCol= Arrays.asList( 3,6,9 );
        List cross1= Arrays.asList( 1,5,9 );
        List cross2= Arrays.asList( 7,5,3 );
        List<List>Winning=new ArrayList<List>();
            Winning.add( topRow );
            Winning.add( midRow );
            Winning.add( botRow );
            Winning.add( leftCol );
            Winning.add( midCol );
            Winning.add( rightCol );
            Winning.add( cross1);
            Winning.add( cross2 );
            for (List l:Winning){
            if (Playerpositions.containsAll(l ) ){
                return "Player Wins!\uD83E\uDD19";
            } else if (cpuPositions.containsAll( l )) {
                return "Bot Wins!\uD83E\uDD16";
             }else if(Playerpositions.size()+cpuPositions.size()==9){
                return "Draw!\uD83D\uDC4A";
                }
            }
        return "";
    }
}

