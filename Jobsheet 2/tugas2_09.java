public class tugas2_09 {

    int x, y, height , width;

    public tugas2_09(int i, int j, int k, int l) {
        x = i;
        y = j;
        height = k;
        width = l;
        }
        void moveLeft(){
        if (x > 0 || x < width) {
            x--; 
        }
    
    }
    void moveRight(){
        if (x > 0 || x < width) {
            x++; 
        }
    }
        void moveUp(){
        if (y > 0 || x < height) {
            y--; 
         }
    }
    void moveDown(){
        if (y > 0 || x < height) {
            y++; 
        }
    }

    void printPosition(){
        System.out.println("Posisi Dragon (x, y) (" + x + ", " + y + 
    ")");
         if (x == 0 || y == 0) {
            detectCollision(x, y);
        }
    }
    void detectCollision(int x, int y){
        System.out.println("Game Over ");
    }
}
