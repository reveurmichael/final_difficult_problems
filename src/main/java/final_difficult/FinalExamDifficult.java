package final_difficult;

import processing.core.PApplet;

public class FinalExamDifficult extends PApplet {
    // A Cell object
    class Cell {
        float x, y;   // x,y location
        float w, h;   // width and height

        boolean isInHeart = false;

        // Cell Constructor
        Cell(float _x, float _y, float _w, float _h) {
            x = _x;
            y = _y;
            w = _w;
            h = _h;
        }

        void display() {
            stroke(255);
            if(isInHeart)
                fill(heartColor[0], heartColor[1], heartColor[2]); // Cell in RED
            else
                fill(200, 200, 200); // Cell in GREY
            rect(x, y, w, h);
        }
    }

    Cell[][] cells;
    int[] heartColor = {255, 0, 0}; // Initially set to RED

    // Number of columns and rows in the grid
    int cols = 21;
    int rows = 21;

    // Width and height of each cell in the grid
    int widthCell = 40;
    int heightCell = 40;

    public void changeHeartColor() {
        heartColor = new int[]{ (int) random(255), (int)random(255), (int)random(255)};
    }

    public void keyPressed() {
        switch (String.valueOf(key).toLowerCase()){
            case "c":
                changeHeartColor();
                break;
            default:
                break;
        }
    }

    public void settings() {
        size(widthCell * cols, heightCell * rows);
        cells = new Cell[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                // Initialize each Cell object
                cells[i][j] = new Cell(i * widthCell,j * heightCell,
                        widthCell, heightCell);
            }
        }
        setHeartCells();
    }

    public void setHeartCells(){
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

    public void draw() {
        background(0);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j].display();
            }
        }
    }

    public static void main(String[] args) {
        String[] processingArgs = {"FinalExamDifficult"};
        FinalExamDifficult finalExamDifficult = new FinalExamDifficult();
        PApplet.runSketch(processingArgs, finalExamDifficult);
    }

}
