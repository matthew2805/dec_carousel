import java.util.Stack;

public class CarouselRun {
    private Stack<Integer> carousel;
    private int curr = 0;
    public CarouselRun (Stack<Integer> carousel) {
        this.carousel = carousel;
    }
    public int next() {
        int next;
        int size = this.carousel.size();
        if (this.carousel.isEmpty()) next = -1;
        else {
            if (this.curr == size) this.curr = 0;
            next = this.carousel.get(this.curr);
            this.carousel.set(this.curr, next - 1);
            if(this.carousel.get(this.curr) == 0) this.carousel.remove(this.curr);
            else curr++;
        }
        return next;
    }

    public boolean isFinished() {
        return this.carousel.isEmpty();
    }

}
