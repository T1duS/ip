import opus.ToDo;
import opus.Task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TaskTest {


    @Test
    public void testMarkAsDone() {
        Task task = new ToDo("test task");
        task.markAsDone();
        assertEquals("[T][X] test task", task.toString());
    }
}
