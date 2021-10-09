public class SnakeAndLadderUC5 {

    public static void main(String args[])
    {
        int player1Position = 0;
        int dice1 = (int) Math.floor(Math.random() * 10) % 7;
        System.out.println("dice number for 1st player is:" + dice1);
        int options = (int) Math.floor(Math.random() * 10) % 3;
//        System.out.println(options);
        int noPlay = 0;
        int ladder = 1;
        int snake = 2;

        if (player1Position < 100 && player1Position >=0) {

            if (options == ladder) {
                System.out.println("Here the option is ladder");
                player1Position += dice1;
                if(player1Position > 100)
                {
                    player1Position -=dice1;
                }
                System.out.println("So the player position is" + player1Position);
            } else if (options == snake) {
                System.out.println("Here the option is snake");
                player1Position -= dice1;
                if (player1Position < 0) {
                    player1Position = 0;
                }
                System.out.println("So the player position is" + player1Position);
            } else {
                System.out.println("Here the option is of no play");
                System.out.println("So the player position is" + player1Position);
            }
        }
    }

}
