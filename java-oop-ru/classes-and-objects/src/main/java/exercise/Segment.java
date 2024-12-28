package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;
    private Point midPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        int midX = (beginPoint.getX() + endPoint.getX()) / 2;
        int midY = (beginPoint.getY() + endPoint.getY()) / 2;
        midPoint = new Point(midX, midY);
        return midPoint;
    }
}
// END
