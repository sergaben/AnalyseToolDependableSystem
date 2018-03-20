public class aClass{
void initialiseBoard(String[][] board, char sampleGame) {
    int rankNo;
    int fileNo;
    if (sampleGame == 'Y') {
      for (rankNo = 1; rankNo <= BOARD_DIMENSION; rankNo++) {
        for (fileNo = 1; fileNo <= BOARD_DIMENSION; fileNo++) {
          board[rankNo][fileNo] = "  ";
        }
      }
      board[1][2] = "BG"; //loads peices on default 
      board[1][4] = "BS";
      board[1][8] = "WG";
      board[2][1] = "WR";
      board[3][1] = "WS";
      board[3][2] = "BE";
      board[3][8] = "BE";
      board[6][8] = "BR";
    } else {
      for (rankNo = 1; rankNo <= BOARD_DIMENSION; rankNo++) {
        for (fileNo = 1; fileNo <= BOARD_DIMENSION; fileNo++) {
          if (rankNo == 2) {
            board[rankNo][fileNo] = "BR";
          } else {
            if (rankNo == 7) {
              board[rankNo][fileNo] = "WR";
            } else {
              if ((rankNo == 1) || (rankNo == 8)) {
                if (rankNo == 1) {
                  board[rankNo][fileNo] = "B";
                }
                if (rankNo == 8) {
                  board[rankNo][fileNo] = "W";
                }
                switch (fileNo) {
                  case 1:
                  case 8:
                    board[rankNo][fileNo] = board[rankNo][fileNo] + "G";
                    break;
                  case 2:
                  case 7:
                    board[rankNo][fileNo] = board[rankNo][fileNo] + "E";
                    break;
                  case 3:
                  case 6:
                    board[rankNo][fileNo] = board[rankNo][fileNo] + "N";
                    break;
                  case 4:
                    board[rankNo][fileNo] = board[rankNo][fileNo] + "M";
                    break;
                  case 5:
                    board[rankNo][fileNo] = board[rankNo][fileNo] + "S";
                    break;
                }
              } else {
                board[rankNo][fileNo] = "  ";
              }
            }
          }
        }
      }
    }
  }
}