@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        // Создаем объект класса Program
        Program program = new Program();

        // Вызов метода checkIsAdult с возрастом 19 лет
        boolean isAdult = program.checkIsAdult(19);

        // Проверяем, что метод возвращает true для возраста 19 лет
        assertEquals("Ожидалось, что метод вернёт true для возраста 19 лет, так как возраст больше 18", true, isAdult);
        }