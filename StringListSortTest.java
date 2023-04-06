import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    ArrayList<String> imput;
    ArrayList<String> expected;
    ArrayList<String> actual;
    @Test
    public void testSelectionSort() {
        imput = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        expected = new ArrayList<>(Arrays.asList( "is", "mountain", "the","there"));
        StringListSort.selectionSort(imput);
        actual = imput;
        assertEquals(expected, actual);

    }
}
