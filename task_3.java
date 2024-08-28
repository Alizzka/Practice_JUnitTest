import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    // Конструктор, который инициализирует поля
    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    // Метод для предоставления тестовых данных
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                { 19, true },  // Возраст больше 18 лет, ожидается true
                { 17, false }, // Возраст меньше 18 лет, ожидается false
                { 18, true },  // Возраст ровно 18 лет, ожидается true
                { 21, true }   // Возраст больше 18 лет, ожидается true (для проверки в разных странах)
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Ожидалось, что результат проверки для возраста " + age + " будет " + result, result, isAdult);
    }
}