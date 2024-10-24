
package q2;

import java.util.ArrayList;

public class Matrix {
    public class Cell {
        private final int row;
        private final int column;
        private final String description;

        public Cell(int row, int column, String description) {
            this.row = row;
            this.column = column;
            this.description = description;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Cell(" + "row=" + row + ", column=" + column + ", description='" + description + "')";
        }
    }

    private int numOfRows;
    private int numOfColumns;
    private String[][] grid;

    public Matrix(int numRows, int numColumns) {
        this.numOfRows = numRows;
        this.numOfColumns = numColumns;
        grid = new String[numRows][numColumns]; // Initialize grid with null values
    }

    public void set(int row, int column, String description) {
        if (row >= 0 && row < numOfRows && column >= 0 && column < numOfColumns) {
            grid[row][column] = description;
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index.");
        }
    }

    public String get(int row, int column) {
        if (row >= 0 && row < numOfRows && column >= 0 && column < numOfColumns) {
            return grid[row][column];
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index.");
        }
    }

    public ArrayList<Cell>describedPositionOfCells() {
        ArrayList<Cell> describedPositionOfCellsdCells = new ArrayList<>();
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfColumns; col++) {
                if (grid[row][col] != null) {
                    describedPositionOfCellsdCells.add(new Cell(row, col, grid[row][col]));
                }
            }
        }
        return describedPositionOfCellsdCells;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,2);
        matrix.set(0, 0, "Top-left corner");
        matrix.set(1, 1, "Center");

        System.out.println("Cell (0, 0): " + matrix.get(0, 0));
        ArrayList<Cell>getCells=matrix.describedPositionOfCells();
        ArrayList<Cell> describeCells = matrix.describedPositionOfCells();
        System.out.println("DescribedPositionOfCells: ");
        for (Cell cell : matrix.describedPositionOfCells())
            System.out.println(cell);
    }
}






