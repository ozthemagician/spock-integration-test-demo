package spockitdemo

import com.ozmic.spockitdemo.SpockItDemoApplication
import com.ozmic.spockitdemo.domain.Movie
import com.ozmic.spockitdemo.repository.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.genesis.Gen
import spock.genesis.generators.Generator
import spock.lang.Specification

@SpringBootTest(classes = SpockItDemoApplication)
class SpockItDemoApplicationIT extends Specification {

    @Autowired
    MovieRepository movieRepository

    def "movie should be saved into database"() {

        when: "A movie is created"
        def movieSaved = movieRepository.save(movie)

        then: "Check the movie saved into database"
        def foundMovie = movieRepository.findById(movieSaved.getId()).get()
        println("Found movie $foundMovie.title")
        foundMovie.title == movieSaved.title
        foundMovie.id == movieSaved.id

        cleanup:
        movieRepository.delete(foundMovie)

        where:
        movie << getMovie().take(10)
    }

    Generator getMovie() {
        return Gen.type(Movie, id: Gen.long, title: Gen.string(20))
    }
}
