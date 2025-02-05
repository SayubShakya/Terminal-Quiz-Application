import game.Menuable;
import game.impl.GameableQuizImpl;
import repository.impl.QuizRepositoryFileImpl;
import repository.impl.ScoreRepositoryFileImpl;
import util.converter.impl.JavaObjectWriterUtilQuestionJacksonImplFileJackson;
import util.converter.impl.JavaObjectWriterUtilScoreJacksonImplFileJackson;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws InterruptedException {
        startGame(
                new GameableQuizImpl(
                        new QuizRepositoryFileImpl(
                                new JavaObjectWriterUtilQuestionJacksonImplFileJackson()
                        ),
                        new ScoreRepositoryFileImpl(
                                new JavaObjectWriterUtilScoreJacksonImplFileJackson()
                        )
                )
        );

    }

    public static void startGame(Menuable menuable) {
        menuable.menu();
    }

}