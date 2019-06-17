public class DueDateTask extends Time {
    public void DueDateTask() {
        int startDate = 0;
        int endDate = 0;
        int currentData = getCurrentTime();

        int dueDate = ((currentData - startDate) / (endDate - startDate));
    }
}
