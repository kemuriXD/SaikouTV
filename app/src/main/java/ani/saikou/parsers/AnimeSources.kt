package ani.saikou.parsers

import ani.saikou.Lazier
import ani.saikou.lazyList
import ani.saikou.parsers.anime.*

object AnimeSources : WatchSources() {
    override val list: List<Lazier<BaseParser>> = lazyList(
        ::NineAnime,
        ::Gogo,
        ::Zoro,
        ::Tenshi,
        ::AllAnime,
        ::AnimeKisa,
        ::Monoschinos,
        ::Animefenix

    )
    override val names: List<String> = listOf(
        "9Anime",
        "Gogo",
        "Zoro",
        "Tenshi",
        "AllAnime",
        "AnimeKisa",
        "Monoschinos",
        "Animefenix"
    )
}

object HAnimeSources : WatchSources() {

    override val list: List<Lazier<BaseParser>> = lazyList(
        ::Haho,
        ::HentaiFF,
        ::NineAnime,
        ::Gogo,
        ::Zoro,
        ::Tenshi,
        ::AllAnime,
        ::AnimeKisa,
        ::Monoschinos,
        ::Animefenix
    )

    override val names: List<String> = listOf(
        "Haho",
        "HentaiFF",
        "9Anime",
        "Gogo",
        "Zoro",
        "Tenshi",
        "AllAnime",
        "AnimeKisa",
        "Monoschinos",
        "Animefenix"
    )
}