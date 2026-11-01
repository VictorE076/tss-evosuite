
package ro.tss;

public class MeetingRoomScheduler {

    public boolean overlaps(int start1, int end1,
                            int start2, int end2) {

        if (!isValidInterval(start1, end1) ||
                !isValidInterval(start2, end2)) {
            throw new IllegalArgumentException("Invalid interval");
        }

        if (end1 <= start2) {
            return false;
        }

        if (end2 <= start1) {
            return false;
        }

        return true;
    }

    private boolean isValidInterval(int start, int end) {
        return start >= 0 && end <= 1440 && start < end;
    }

}
