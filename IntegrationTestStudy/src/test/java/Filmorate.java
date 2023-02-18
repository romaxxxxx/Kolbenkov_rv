import RequestFilm.Java11HttpFilm;
import model.RequestToDBCreateFilm;
import model.RequestToDBUpdateFilm;
import model.ResponseDBCreateFilm;
import model.ResponseDBGetFilmErrorText;
import org.testng.annotations.Test;
import io.qameta.allure.*;

import static org.testng.Assert.assertEquals;

@Epic("Intagration Tests Filmorate")

public class Filmorate {

    @Test(priority = 0, description = "Создать фильм")
    @Severity(SeverityLevel.BLOCKER)
    public void CreateFilm() throws Exception {
        ResponseDBCreateFilm response;
        Java11HttpFilm obj = new Java11HttpFilm();
        RequestToDBCreateFilm body = new RequestToDBCreateFilm("Страшилла в деревне"
                , "Баба бегает и всех мочит", "1967-03-25", 50);
        response = obj.sendPost(body.toString());
        assertEquals(response.getName(), "Страшилла в деревне");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, description = "Обновить 1й фильм")
    public void UpdateFilm() throws Exception {
        ResponseDBCreateFilm response;
        Java11HttpFilm obj = new Java11HttpFilm();
        RequestToDBUpdateFilm body = new RequestToDBUpdateFilm(1, "Страшилла в деревне дураков"
                , "1967-03-26", "1967-03-25", 45, "норм");
        response = obj.sendPut(body.toString());
        assertEquals(response.getName(), "Страшилла в деревне дураков");
    }

    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2, description = "Получить 1й фильм (Код 200)")
    public void GetFirstFilmCode200() throws Exception {
        int response;
        Java11HttpFilm obj = new Java11HttpFilm();
        response = obj.sendGet();
        assertEquals(response, 200);
    }

    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 3, description = "Текст ошибки при получении 9999го фильма")
    public void Get999FilmTextError() throws Exception {
        ResponseDBGetFilmErrorText response;
        Java11HttpFilm obj = new Java11HttpFilm();
        response = obj.sendGet9999Film();
        assertEquals(response.getError(), "Возникла ошибка поиска пользователя: \"Фильма с таким id нет!\".");
    }
}