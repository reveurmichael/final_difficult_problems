package final_difficult;

import processing.core.PApplet;


class Cell {
    // You should not modify the Cell class.

    public float x, y;   // x,y location
    public float w, h;   // width and height

    public boolean isInHeart = false;

    // Cell Constructor
    public Cell(float _x, float _y, float _w, float _h) {
        x = _x;
        y = _y;
        w = _w;
        h = _h;
    }
}

public class FinalExamDifficult extends PApplet {

    public Cell[][] cells;
    public int[] heartColor = new int[]{255, 0, 0}; // Initially set to RED

    // Number of columns and rows in the grid
    public int cols = 21;
    public int rows = 21;

    // Width and height of each cell in the grid
    public int widthCell = 40;
    public int heightCell = 40;

    public void keyPressed() {
        switch (String.valueOf(key).toLowerCase()){
            case "c":
                changeHeartColor();
                break;
            case "w":
                moveUp();
                break;
            case "s":
                moveDown();
                break;
            case "a":
                moveLeft();
                break;
            case "d":
                moveRight();
                break;
            case "u":
                undo();
                break;
            case "x":
                clear();
                break;
            case "o":
                setHeartCells();
                break;
            default:
                break;
        }
    }

    public void moveUp(){
        // TODO: write your code here.

    }

    public void moveDown(){
        // TODO: write your code here.

    }

    public void moveLeft(){
        // TODO: write your code here.

    }

    public void moveRight(){
        // TODO: write your code here.

    }

    public void undo(){
        // TODO: write your code here.
        //  You could add extra members & function to this class.
        //  You could also ADDING code to existing functions, such as to: clear(), setHeartCells(), etc..

    }

    public void changeHeartColor() {
        heartColor = new int[]{ (int) random(255), (int)random(255), (int)random(255)};
    }


    public void settings() {
        size(widthCell * cols, heightCell * rows);
        createCells();
        clear();
        setHeartCells();
    }

    public void draw() {
        background(0);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                display(cells[i][j]);
            }
        }
    }

    public void setHeartCells(){
        clear();
        heartColor = new int[]{255, 0, 0};

        final int N = 3;
        final int jOffset = 6;
        final int iOffset = 4;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i <= 4 * N; i++) {
                double d1 = Math.sqrt(Math.pow(j - N, 2)
                        + Math.pow(i - N, 2));
                double d2 = Math.sqrt(Math.pow(j - N, 2)
                        + Math.pow(i - 3 * N, 2));
                if (d1 < N + 0.5 || d2 < N + 0.5) {
                    cells[i + iOffset][j + jOffset].isInHeart = true;
                }
            }
        }
        for (int j = N; j < 3 * N; j++) {
            for (int i = 0; i < 4 * N + 1 - 2 * (j - N + 1); i++) {
                cells[i + iOffset + j - N + 1][j + jOffset].isInHeart = true;
            }
        }
    }

    public void createCells(){
        cells = new Cell[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                // Initialize each Cell object
                cells[i][j] = new Cell(i * widthCell,j * heightCell,
                        widthCell, heightCell);
            }
        }
    }

    public void clear(){
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j].isInHeart = false;
            }
        }
    }

    public void display(Cell cell){
        stroke(255);
        if(cell.isInHeart)
            fill(heartColor[0], heartColor[1], heartColor[2]); // Cell in RED
        else
            fill(200, 200, 200); // Cell in GREY
        rect(cell.x, cell.y, cell.w, cell.h);
    }

    public static void main(String[] args) {
        String[] processingArgs = {"GAME OF LOVE."};
        FinalExamDifficult finalExamDifficult = new FinalExamDifficult();
        PApplet.runSketch(processingArgs, finalExamDifficult);
    }

}
