package telran.stream;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamTasks {
public static int[] shuffle(int[] arr){
    
    int[] targetArray = new int[arr.length];
    int[] index = new Random().ints(0, arr.length).distinct().limit(arr.length).toArray();
    IntStream.range(0, arr.length).forEach(i -> targetArray[i] = arr[index[i]]);

return targetArray;
}
}
