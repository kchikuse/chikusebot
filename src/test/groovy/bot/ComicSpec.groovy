package bot

import bot.models.Photo
import bot.services.*

class ComicSpec extends Spec {

    Comic commit

    def setup() {
        commit = new Comic(url: prop('bot.url.commitstrip'))
    }

    def 'Get the correct data from the commitstrip website'() {
        when:
        Photo strip = commit.strip

        then:
        strip.contentUrl == null
        strip.caption == "All the same | CommitStrip"
        strip.imageUrl == "https://www.commitstrip.com/wp-content/uploads/2017/01/Strip-Régulateur-de-vitesse-english650-final2.jpg"
    }
}
