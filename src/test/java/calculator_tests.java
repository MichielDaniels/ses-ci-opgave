import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.*;

public class calculator_tests {

    @Test
    public void rekenmachine_plus(){
        // 1. Arrange
        var calc = new calculator();
        // 2. Act
        var resultaat = calc.rekenmachine(4, 1, "plus");
        // 3. Assert
        assertEquals(resultaat, 5);
    }

    @Test
    public void rekenmachine_min(){
        // 1. Arrange
        var calc = new calculator();
        // 2. Act
        var resultaat = calc.rekenmachine(4, 1, "min");
        // 3. Assert
        assertEquals(resultaat, 3);
    }

    @Test
    public void rekenmachine_maal(){
        // 1. Arrange
        var calc = new calculator();
        // 2. Act
        var resultaat = calc.rekenmachine(4, 2, "maal");
        // 3. Assert
        assertEquals(resultaat, 8);
    }

    @Test
    public void rekenmachine_delen(){
        // 1. Arrange
        var calc = new calculator();
        // 2. Act
        var resultaat = calc.rekenmachine(4, 2, "delen");
        // 3. Assert
        assertEquals(resultaat, 2);
    }

}
