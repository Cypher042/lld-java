package tictactoe;
import entities.*;
import enums.GameState;
public class Game {
    Board board;
    Player[] players;
    int n;
    int cpi;
    GameState gs;

    public Game(int n,Player p1,Player p2){
        this.n=n;
        this.board= new Board(3);
        this.players= new Player[]{p1,p2};
        this.gs=GameState.STARTED;
        this.cpi=0;
    }

    public void maeMove(int x,int y){

        if(this.gs != GameState.IN_PROGRESS){
            System.out.println("Game nhi chal rha");
            return;
        }

        if(!board.isEmpty(x,y)){
            throw new Error("inuo");
        }

        board.grid[x][y].setValue(players[cpi].getSymbol());

        if(board.isWinner(x,y)){
            System.out.println(players[cpi].getName() + "wonnn!!!! :>");
            this.gs = GameState.ENDED;
        }z


    }
    




}
