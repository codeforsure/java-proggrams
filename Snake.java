public class Snake {

    LinkedList<Cell> snakePartList = new LinkedList<>();
    Cell head;

    public Snake(Cell initPos) {
        head = initPos;
        snakePartList.add(head);
    }

    public void grow() {
        snakePartList.add(head);
    }

    public void move(Cell nextCell) {
        Cell tail = snakePartList.removeLast();
        tail.type = Cell.CELL_TYPE_EMPTY;

        head = nextCell;
        snakePartList.addFirst(head);
    }

    public boolean checkCrash(Cell nextCell) {
        for (Cell cell : snakePartList) {
            if (cell == nextCell) {
                return true;
            }
        }

        return false;
    }
}
