package final_difficult;

import processing.core.PApplet;


public class FinalExamDifficultCorrectAnswer extends PApplet {

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
            case "n":
                newColor();
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
            case "p":
                previousColor(); // ONLY FOR COLOR.
                break;
            case "o":
                setOriginalHeartCells(); // Original Heart Position and Color
                break;
            default:
                break;
        }
    }

    public void moveUp(){
        // TODO: write your code here.
        //  You should never use "new Cell()". Therefore, at each position of the cells,
        //  the cell object won't change and maintains the same reference from the beginning
        //  to the end of the program. P.S. all Cell objects are instantiated by createCell().

    }

    public void moveDown(){
        // TODO: write your code here.
        //  You should never use "new Cell()". Therefore, at each position of the cells,
        //  the cell object won't change and maintains the same reference from the beginning
        //  to the end of the program. P.S. all Cell objects are instantiated by createCell().

    }

    public void moveLeft(){
        // TODO: write your code here.
        //  You should never use "new Cell()". Therefore, at each position of the cells,
        //  the cell object won't change and maintains the same reference from the beginning
        //  to the end of the program. P.S. all Cell objects are instantiated by createCell().

    }

    public void moveRight(){
        // TODO: write your code here.
        //  You should never use "new Cell()". Therefore, at each position of the cells,
        //  the cell object won't change and maintains the same reference from the beginning
        //  to the end of the program. P.S. all Cell objects are instantiated by createCell().

    }

    public void previousColor(){
        // TODO: write your code here.
        //  You could add extra members & function to this class.
        //  You could also ADDING code to existing functions,
        //  such as to: nextColor(), clear(), setOriginalHeartCells(), etc..

    }

    public void newColor() {
        heartColor = new int[]{ (int) random(255), (int)random(255), (int)random(255)};
    }


    public void settings() {
        size(widthCell * cols, heightCell * rows);
        createCells();
        clear();
        setOriginalHeartCells();
    }

    public void draw() {
        background(0);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                display(cells[i][j]);
            }
        }
    }

    public void setOriginalHeartCells(){
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
        String[] processingArgs = {"LOVE IS JUST A GAME. PLAY IT WELL."};
        FinalExamDifficultCorrectAnswer finalExamDifficultCorrectAnswer = new FinalExamDifficultCorrectAnswer();
        PApplet.runSketch(processingArgs, finalExamDifficultCorrectAnswer);
    }

}