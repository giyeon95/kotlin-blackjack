package blackjack.domain

enum class Number(
    val desc: String,
    vararg val values: Int
) {
    ACE("A", 1, 11),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    JACK("J", 10),
    KING("K", 10),
    QUEEN("Q", 10)
}
