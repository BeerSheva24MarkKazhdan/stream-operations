package telran.stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class StreamTasksTest {
    @Test
    void shuffleTest(){
        int[] arr = {1,2,3,4,5,6};
        int[] targetArray = StreamTasks.shuffle(arr);
        assertTrue(Arrays.equals(IntStream.of(arr).sorted().toArray(), IntStream.of(targetArray).sorted().toArray()));//Checking that elements from origin array are the same in shuffled array
        assertFalse(Arrays.equals(arr, targetArray));//Checking that shuffled array is definetely shuffled
        }

    
    }

